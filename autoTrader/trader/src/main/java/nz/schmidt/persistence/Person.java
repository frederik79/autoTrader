package nz.schmidt.persistence;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON", schema = "mysqlschema")

public class Person 
{
	@Id
	@Column(name = "PERSON_ID")
	private String personId;

	@Column(name = "PERSON_NAME")
	private String personName;

	@Embedded
	PersonalData personalData;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "ADDRESS_ID")
	private Address address;

	public String getPersonId() 
	{
		return personId;
	}

	public void setPersonId(String personId) 
	{
		this.personId = personId;
	}

	public String getPersonName() 
	{
		return personName;
	}

	public void setPersonName(String personName) 
	{
		this.personName = personName;
	}

	public void setPersonalData(PersonalData personalData2) 
	{
		personalData = personalData2;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
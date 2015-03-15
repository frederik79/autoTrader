package nz.schmidt.persistence;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PersonalData
{
 public PersonalData(String website, String email, String id) 
 {
	this.website = website;
		// TODO Auto-generated constructor stub
	this.email = email;
	yahooId = id;
}

@Column(name = "p_website")
 private String website;

 @Column(name = "p_email")
 private String email;

 @Column(name = "p_yahoo_id")
 private String yahooId;

 //Constructors and getters/ setters ommitted

}
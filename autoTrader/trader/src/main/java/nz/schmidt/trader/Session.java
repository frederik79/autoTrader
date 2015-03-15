package nz.schmidt.trader;

public class Session {

	private String _accountID;

	public Session(String accountID) 
	{
		this._accountID = accountID;
	}

	public String get_accountID() {
		return _accountID;
	}

	public void set_accountID(String _accountID) {
		this._accountID = _accountID;
	}
}
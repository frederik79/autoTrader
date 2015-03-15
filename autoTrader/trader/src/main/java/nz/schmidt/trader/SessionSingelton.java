package nz.schmidt.trader;

public enum SessionSingelton 
{
	INSTANCE;
	private Session credentials;
	
	public void login(Session s)
	{
		s = credentials;
	}
	
	public void logout()
	{
	}
}

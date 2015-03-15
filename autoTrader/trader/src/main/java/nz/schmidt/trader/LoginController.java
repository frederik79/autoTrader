package nz.schmidt.trader;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController 
{
	
	@RequestMapping("/login")
	public void login(@RequestParam(value="accountID", defaultValue="") String accountID)
	{
		new Session(accountID);
	}
}

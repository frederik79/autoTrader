package nz.schmidt.trader;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TradeRangeController 
{
	    @RequestMapping("/traderange")
	    public TradeRange getTradeRange()
	    {
	        return new TradeRange("USD/JPY", 0.3, 0.5);
	    }
}
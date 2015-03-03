package nz.schmidt.trader;


public class TradeRange 
{
	private String _instrument = "";
	private double _lowerLevel = 0.0;
	private double _upperLevel = 0.0;
	
	public TradeRange(String instrument,  double lowerLevel, double upperLevel) 
	{
		_instrument = instrument;
		_upperLevel = upperLevel;
		_lowerLevel = lowerLevel;
	}

	public String getInstrument() {
		return _instrument;
	}

	public void setInstrument(String instrument) {
		this._instrument = instrument;
	}

	public double getLowerRange() {
		return _lowerLevel;
	}

	public void setLowerRange(double lowerRange) {
		this._lowerLevel = lowerRange;
	}

	public double getUpperRange() {
		return _upperLevel;
	}

	public void setUpperRange(double upperRange) {
		this._upperLevel = upperRange;
	}
}

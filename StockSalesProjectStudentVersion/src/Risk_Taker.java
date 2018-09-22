
public class Risk_Taker implements StockInvestor{

	int NumberOfStocks = 1;
	
	public Risk_Taker() {
		
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				//What two other methods should be called here?
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
	}
	
	/**
	 * Follow the specified by for basic information.
	 * Raise the number of stocks until the Stock Price = 5,
	 * at which the number of stocks should plateau.
	 * The number of stocks should start at 1.
	 */
	@Override
	public void strategy() {
		//Code here!
	}

	@Override
	public void sendInformation() {
		//Code here!
	}
	
}

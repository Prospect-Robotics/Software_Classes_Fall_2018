
public class Cautious implements StockInvestor{

	int NumberOfStocks = 1;
	
	public Cautious() {
		
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
	 * The number of stocks should start at 0, but do not change the original definition
	 * on line 4.
	 */
	@Override
	public void strategy() {
	}

	@Override
	public void sendInformation() {
	}
	
}

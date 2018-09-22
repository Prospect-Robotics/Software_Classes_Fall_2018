
public class Observer implements StockInvestor{
	
	int NumberOfStocks = 2;
	
	public Observer() {
		
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
	interface NumericTest {
		boolean computeTest(int n);
	}
	
	@Override
	public void strategy() {
		//Code here!
	}

	@Override
	public void sendInformation() {
		//Code here!
	}

}

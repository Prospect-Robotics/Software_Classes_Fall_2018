
public class Observer implements StockInvestor{
	
	int NumberOfStocks = 2;
	
	public Observer() {
		
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				strategy();
				sendInformation();
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
		
		NumericTest isEven = (n) -> (n % 2) == 0;
		if(isEven.computeTest(database.StockPrice) && NumberOfStocks > 0) {
			NumberOfStocks--;
		}else if(NumberOfStocks < 10){
			NumberOfStocks++;
		}
	}

	@Override
	public void sendInformation() {
		//database.AddDataPoint("Observer", NumberOfStocks);
	}

}

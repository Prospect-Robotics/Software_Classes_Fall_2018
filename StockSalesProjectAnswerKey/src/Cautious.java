
public class Cautious implements StockInvestor{

	int NumberOfStocks = 1;
	
	public Cautious() {
		
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
	
	@Override
	public void strategy() {
		if(NumberOfStocks < 10) {
			if(database.StockPrice < 3) {
				NumberOfStocks++;
			}
		}if(NumberOfStocks > 0) {
			if(database.StockPrice > 3) {
				NumberOfStocks--;
			}
		}
	}

	@Override
	public void sendInformation() {
		database.AddDataPoint("Cautious",NumberOfStocks);
	}
	
}

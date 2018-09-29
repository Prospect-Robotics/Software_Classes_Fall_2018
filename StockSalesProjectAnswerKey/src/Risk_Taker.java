
public class Risk_Taker implements StockInvestor{

	int NumberOfStocks = 1;
	
	public Risk_Taker() {
		
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
			if(database.StockPrice < 5) {
				NumberOfStocks++;
			}
		}if(NumberOfStocks > 0) {
			if(database.StockPrice > 5) {
				NumberOfStocks--;
			}
		}
	}

	@Override
	public void sendInformation() {
		database.AddDataPoint("Risk_Taker",NumberOfStocks);
	}
	
}

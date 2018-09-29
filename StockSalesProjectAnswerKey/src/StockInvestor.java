
public interface StockInvestor extends Runnable{
	DNT_Messenger database = DNT_Messenger.getInstance();
	
	public void strategy();
	
	public void sendInformation();
	
}
/**
 * This is an interface for what? Notice that it extends Runnable.
 */
public interface StockInvestor extends Runnable {
	//DNT_Messenger must be instanced. Make a DNT_Messenger called database.
	
	
	/**
	 * Start by setting the stock price to fall by one if the number of stocks
	 * is greater than 0 and rise by one if the number of stocks is less than 10
	 * 
	 * For:
	 * 
	 * Cautious: Raise the number of stocks until the Stock Price = 3,
	 * at which the number of stocks should plateau.
	 * 
	 * Observer: If the Stock Price is Even, lower the number
	 * of stocks by one. Set NumberOfStocks to 2.
	 * 
	 * Risk_Taker: Raise the number of stocks until the Stock Price = 5,
	 * at which the number of stocks should plateau.
	 * Set NumberOfStocks to 1.
	 */
	public void strategy();
	
	/**
	 * Take a look at the DNT_Messenger class and figure out what will add to the graph and how to add it.
	 */
	public void sendInformation();
	
}
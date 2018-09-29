import java.util.Map;

public class StockSalesProject {
	//DONT CHANGE THESE, however you may access them using new code.
	int Risk_Taker = 5, Cautious = 5, Average = 5;
	//Start Here
	public void begin() {
		Thread o = new Thread(new Observer());
		o.start();
		Thread c = new Thread(new Cautious());
		c.start();
		Thread r = new Thread(new Risk_Taker());
		r.start();
	}
	
}

import java.util.ArrayList;

public class DNT_Messenger {

	public PointList Risk_Taker = new PointList();
	public PointList Cautious = new PointList();
	public PointList Observer = new PointList();
	
	public PointList[] points = {Risk_Taker, Cautious, Observer};
	
	public int StockPrice = 5;
	
	private static DNT_Messenger instance = null;
	
	class PointList{
		ArrayList<Integer> listingPoints = new ArrayList();
		PointList(){
			
		}
		public ArrayList<Integer> get() {
			return listingPoints;
		}
		public void add(int num) {
			listingPoints.add(num);

			System.out.println(listingPoints);
		}
	}
	public void AddDataPoint(String name, int num) {
		switch (name) {
			case "Risk_Taker": Risk_Taker.add(num);
			break;
			case "Cautious": Cautious.add(num);
			break;
			case "Observer": Observer.add(num);
			break;
		}
	}
	
	public static DNT_Messenger getInstance(){
	    if(instance==null){
	       instance = new DNT_Messenger();
	      }
	      return instance;
	  }
}

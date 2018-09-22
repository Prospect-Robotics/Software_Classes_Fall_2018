import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DNT_Messenger {
	
	public Map<String, PointList> points = new HashMap();
	
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
		}
	}
	public void AddDataPoint(String name, int num) {
		if(points.containsKey(name)) {
			points.get(name).add(num);
		}
		
	}
	
	public void AddList(String name) {
		points.put(name, new PointList());
	}
	
	public synchronized static DNT_Messenger getInstance(){
		if(instance==null){
		   instance = new DNT_Messenger();
		}
	   return instance;
	}
}

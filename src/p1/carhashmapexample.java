package p1;

import java.util.HashMap;
import java.util.Map;

class car {
	
	int id, modelyear;
	String companyname;
	
	public car (int id, String companyname, int modelyear)
	
	{
		this.id = id;
		this.companyname = companyname;
		this.modelyear = modelyear;
				
	}
	
	public class carhashmapexample{
		
	
	public void main(String[] args) {
		
		HashMap<Integer, car> map = new HashMap<Integer, car>();

		car c1 = new car(1, "honda", 2019);
		car c2 = new car(2, "toyota", 2019);
		car c3 = new car(3, "nisan", 2017);
		
		map.put(1, c1);
		map.put(2, c2);
		map.put(3, c3);
		
		
		for(Map.Entry<Integer, car> q : map.entrySet())
		{
			int key = q.getKey();
			car c = q.getValue();
			
			System.out.println(key +"detail");
			System.out.println(c.id+""+ c.companyname+ ""+ c.modelyear);
			
		}
		
	}

}

}


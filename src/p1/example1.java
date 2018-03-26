package p1;

import java.util.HashMap;
import java.util.Map;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap< Integer, String>();
		
		hm.put(101, "Akash");
		hm.put(109, "arpit");
		hm.put(103, "Aarti");
		
		for(Map.Entry<Integer, String> a :hm.entrySet())
		{
		System.out.println(a.getKey()+ " : " +a.getValue());
	}

}
	}


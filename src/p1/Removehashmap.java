package p1;

import java.util.HashMap;

public class Removehashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "abcd");
		map.put(2, "aqwsede");
		map.put(3, "wosendesne");
		
		System.out.println("all data in hashmap" + map);
		
		map.remove(2);
		
		System.out.println("value after removed " + map);

	}

}

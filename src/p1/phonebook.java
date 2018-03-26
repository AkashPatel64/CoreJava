package p1;

import java.util.HashMap;
import java.util.Map;

public class phonebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> Phonebook = new HashMap<String, String>();
		
		Phonebook.put("akash", "1234567890");
		Phonebook.put("Nirav", "1232312222");
		Phonebook.put("sagar", "1111111111");
		
		for(Map.Entry<String, String> b : Phonebook.entrySet())
			
		{
			System.out.println(b.getKey() + " : " + b.getValue());
		}
		
	}

}

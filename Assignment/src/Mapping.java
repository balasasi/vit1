import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class Mapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map=new HashMap<String,String>();
		//Creating HashMap
		map.put("IND","India"); //put elements in Map
		map.put("MYS","Malaysia");
		map.put("LUX","Luxembourg");
		map.put("PHL","Philippines");
		
		System.out.println("Iterating Hashmap...");
		System.out.println("************************");
		
		// for(Map.Entry m : map.entrySet())
		
		for(Map.Entry<String,String>m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("Update the elements: ");
		System.out.println("*************************");
		
		map.remove("LUX","Luxembourg");
		
		//map.replace(3, "ESP-Spain");
		
		map.put("ESP","Spain");
		for(Map.Entry<String,String> m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		Set<String>Keys=map.keySet();
		for(String K:Keys)
		{
			System.out.println("Key:"+K);
		}
		Collection<String> values=map.values();
		for(String v : values)
		{
			System.out.println("Value:"+v);
		}
		map.forEach((k,v)-> {
			System.out.println("Key:"+k+",Value:"+v);
		});
		
		}
	}


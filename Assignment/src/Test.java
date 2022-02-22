
public class Test {
public void display(int index,String[] cities)
{
	String city=null;
	try
	{
		city=cities[index];
		System.out.println("Value of city is :"+city);
	}
	catch(ArrayIndexOutOfBoundsException ae) {
		System.out.println("Sorry!..index not available.");
		try {
			System.out.println(city.toUpperCase());
		}
		catch(ArithmeticException e) {
			System.out.println("Sorry..arithmatic exception");
		}
		finally {
			System.out.println("Try next time...");
		}
	}
	catch (NullPointerException ne) {
		System.out.println("Sorry!..No data available at this position.");
	}
	catch(Exception e) {
		System.out.println("Sorry!..Exception occured");
	}
	finally {
		System.out.println("Well done...");
	}
}

public static void main(String[] args) {
	String[] cities=new String[4];
	cities[0] = "Chennai";
	cities[1] = "Delhi";
	cities[2] = "Bangalore";
	Test testObj = new Test();
	testObj.display(2, cities);
	System.out.println("****************");
	testObj.display(4, cities);		
	}	
}



public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valueofone=20;
		int valueoftwo=2;
		int valueofthree=15;
		int valueoffour=0;
		try
	 {
		
		System.out.println("First Question:" +valueofone/valueoftwo);
		System.out.println("Second Question:" +valueofthree/valueoffour);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Divisior should not be zero");
	}
}
}



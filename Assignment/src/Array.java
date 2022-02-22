
public class Array {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	int b=0;
	int[] numarray= {3,6,9,12,15,18,21,24,27,30,32,33};
	{
		for(int i=0; i<numarray.length; i++)
		{
			if((numarray[i]%3)==0)
				b++;
		}
		System.out.println("Divisible of 3:"+b);
	}
	}
}

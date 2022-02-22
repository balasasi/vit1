
public class Overloading {
public int sum(int a,int b)
{
	return(a+b);
}
public double sum(int a,double b)
{
	return(a+b);
}
public double sum(int a,double b,double c)
{
	return(a+b+c);

}
//main method
public static void main(String args[])
{
	Overloading addition=new Overloading();
	System.out.println(addition.sum(10,20));
	System.out.println(addition.sum(10,12.5));
	System.out.println(addition.sum(24,17.25,9));	
}
}

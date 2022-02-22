import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner size1=new Scanner(System.in);
		
		System.out.println("enter the size number:");
		int size=size1.nextInt();
		
		switch(size)
		{
		case 36:
			System.out.println("Small Size");
		break;
		
		case 38:
			System.out.println("Medium Size");
		break;
		
		case 40:
			System.out.println("Large Size");
		break;
		
		case 42:
			System.out.println("Extra-Large Size");
		break;
		
		default:
			System.out.println("Size Chart Invalid.");
		break;
		}
		System.out.println("size: "+size);
		
		size1.close();
	}
}

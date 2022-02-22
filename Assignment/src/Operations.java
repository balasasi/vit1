
public class Operations {
	public static void main(String args[]) {
		String Str1=new String("Variable names must define the exact explanation of its content. Use short enough and long enough names in each scope of code"
);
		if(Str1.length()>0) {
		System.out.println("String Length is: "+Str1.length());
		
		String[] t = Str1.split("names must define the exact explanation of its content. Use short enough and long enough names in each scope of code");
		
		String[] strArray= Str1.split(" ");
	
		String wordToCheck="names";
		
		int wordCount=0;
		
		for(String value : strArray) {
			if(value.equals(wordToCheck))
			{
				wordCount=wordCount+1;
			}
		}
		System.out.println("word occurences:"+wordCount);
		
		for(String a:t)
		{
			System.out.println(a.toUpperCase());	
		}
		}
	}
}


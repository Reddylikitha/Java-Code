public class ex16 {
    public static void main (String[] args) throws java.lang.Exception
	{
		String a = "WORKATTECH";
		int b = a.length();
		for(int i=0;i<b;i=i+2){
			char c = a.charAt(i);
			char d = a.charAt(i+1);
			System.out.print(c);
			System.out.print(d);
		    System.out.println();
			
		}
	}
}

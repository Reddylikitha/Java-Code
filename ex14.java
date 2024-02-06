import java.util.Scanner;

public class ex14 {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int b = sc.nextInt();
		
		int c = 2020-b;
		System.out.println("Happy Birthday "+ a +"! Your current age is "+ c);
	}
}

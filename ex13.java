import java.util.Scanner;

public class ex13 {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int b = sc.nextInt();
		System.out.println("Hello "+ a +"! Next year, you will be "+ (b+1) +" years old");
	}
}

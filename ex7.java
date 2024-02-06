import java.util.Scanner;

public class ex7 {
    	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double volume = 3.14*a*a*b;
		double lit = volume/1000;
		double cost = lit*40;
		System.out.printf("%.2f%n",cost);
	}
}

import java.util.Scanner;

public class ex5 {
    	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double interest = (a*b*c)/100;
		System.out.printf("%.6f%n",interest);
	}
}

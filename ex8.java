import java.util.Scanner;

public class ex8 {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		 double[] n = new double[10];
		double sum = 0.0;
		// your code goes here
		for(int i=0;i<10;i++){
			n[i] = sc.nextFloat();
			sum = sum +n[i];
		}
		double average = sum/10;
		System.out.printf("%.6f%n",average);
	}
}

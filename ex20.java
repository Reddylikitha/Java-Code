import java.util.Scanner;

public class ex20 {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=s;i++){
			int a = sc.nextInt();
			sum = sum+a;
			
			
		}
		double per=((sum*100)/(s*80));
	
		 System.out.printf("%.2f%%%n",per);
	}
}

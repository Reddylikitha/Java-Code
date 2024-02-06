import java.util.Scanner;

public class ex12 {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int a  =  sc.nextInt();
		int d = 0;
		while(a>0){
			int b = a%10;
			d = d*10+b;
			a=a/10;
			
		}
		System.out.println(d);
	}
}

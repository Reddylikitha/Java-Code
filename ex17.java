import java.util.Scanner;

public class ex17 {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=1;i<=t;i++){
			int a = sc.nextInt();
			System.out.println(Math.pow(a, 2));
		}
	}
}

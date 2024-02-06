import java.util.Scanner;

public class ex19 {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=1;i<=t;i++){
			int a = sc.nextInt();
			for(int j=1;j<=a;j++){
				if(j%3 != 0){
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}
}

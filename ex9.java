import java.util.Scanner;

public class ex9 {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=1;i<=a;i++){
			int b = sc.nextInt();
			if(b%2 == 0){
				System.out.println("EVEN");
			}else{
				System.out.println("ODD");
			}
		}
	}
}

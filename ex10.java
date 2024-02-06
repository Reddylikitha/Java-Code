import java.util.Scanner;

public class ex10 {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=1;i<=a;i++){
			int b = sc.nextInt();
			if(b%6 == 0){
				System.out.println("True");
				
			}else{
				System.out.println("False");
			}
		}
	}
}

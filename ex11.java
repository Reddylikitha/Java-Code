import java.util.Scanner;

public class ex11 {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=1;i<=a;i++){
			int b= sc.nextInt();
			if(b > 7){
				System.out.println("UP");
			}else if(b == 7){
				System.out.println("EQUAL");
			}else{
				System.out.println("DOWN");
			}
		}
	}
}

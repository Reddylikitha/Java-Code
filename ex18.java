import java.util.Scanner;

public class ex18 {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
        String[] words = a.split("\\s+");

        // Print the individual words
       
       int b = words.length;
		System.out.println(b);
		
	}
}

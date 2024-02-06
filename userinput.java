import java.util.Scanner;

/**
 * userinput
 */
public class userinput {

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String a = sc.nextLine();
    //     System.out.println("Hello "+a);
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        if("Alice".equals(a) || "Bob".equals(a)){
            System.out.println("Hello "+a);
        }else{
            System.out.println("Hello Alice and Bob");
        }
        
    }
}
import java.util.Scanner;

public class passingmarks {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your english marks");
        int english=sc.nextInt();
         System.out.println("Enter your hindi marks");
        int hindi=sc.nextInt();
         System.out.println("Enter your Mathematics marks");
        int maths=sc.nextInt();
         System.out.println("Enter your science marks");
        int science=sc.nextInt();
        if (english<33 | hindi <33 | maths<33 |science<33){
            System.out.println("failed");
        }
        else {
            System.out.println("passed");
        }


    }
}

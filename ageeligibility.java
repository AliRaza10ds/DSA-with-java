import java.util.Scanner;

public class ageeligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=sc.nextInt();
        if (age<18){
            System.out.println("you are not eligible for vote");
        }
        else {
            System.out.println("you are eligible for voting");
        }
    }
}

import java.util.Scanner;

public class divisibleby5and11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        if((number%5==0)&&(number%11==0)){
            System.out.println("The number is divisible by both(5 and 11)");  
              }
              else{
                System.out.println("The number is not divisible by both(5 and 11)");
              }
              sc.close();
    }
    
}

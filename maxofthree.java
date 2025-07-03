import java.util.Scanner;

public class maxofthree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int first=sc.nextInt();
        System.out.println("Enter second number");
        int second=sc.nextInt();
        System.out.println("Enter third number");
        int third=sc.nextInt();
        if((first>second) &&(first>third)){
            System.out.println("The maximum is" +first);
        }
        else if((first>second)&&(first<third)){
            System.out.println("The maximum is:" +third);
        }
        else{
            System.out.println("The maximum is:"+second);
        }
        sc.close();
    }
    
}

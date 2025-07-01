import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the year");
    int year=sc.nextInt();
    if (year==0 | year<0) {
        System.out.println("Please enter the valid year");
    }
    else if(year %4==0){
        System.out.println("the year is a leap year");
    }
    else{
        System.out.println("the year is not a leap year");
    }

    }
}

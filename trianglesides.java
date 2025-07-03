import java.util.Scanner;

public class trianglesides {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("check triangle using");
        System.out.println("press 1 for side");
        System.out.println("press 2 for angle");
        System.out.println("Enter Your choice");
        int choice =sc.nextInt();
        if(choice==1){
        System.out.println("Enter the value of side A");
        float a=sc.nextFloat();
        System.out.println("Enter the value of side B");
        float b=sc.nextFloat();
        System.out.println("Enter the value of side C");
        float c=sc.nextFloat();
        if((a+b>c) && (b+c>a) && (c+a>b)) {
            System.out.println("The sides are forming a valid triangle");
        }
        else{
            System.out.println("The sides are not forming a valid triangle");
        }

    }
    else if (choice==2){
        System.out.println("Enter the value of angle A");
        float A=sc.nextFloat();
        System.out.println("Enter the value of angle B");
        float B=sc.nextFloat();
        System.out.println("Enter the value of angle C");
        float C=sc.nextFloat();
        if(A+B+C==180){
            System.out.println("The angles are forming a valid triangle");
        }
        else{
            System.out.println("The angles are not forming a valid triangle");
        }
    }
    else{
        System.out.println("Invalid choice,,please enter a valid choice");
    }
    sc.close();
    }
}

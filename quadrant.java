import java.util.Scanner;

public class quadrant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of X");
        int x=sc.nextInt();
        System.out.println("ENter the value of Y");
        int y=sc.nextInt();
        if((x==0) &&(y==0)){
            System.out.println("The point lie on origin");
        }
        else if((x>0)&&(y>0)){
            System.out.println("The point ("+ x +","+ y +")lie in first quadrant");

        }
        else if((x<0)&&(y>0)) {
            System.out.println("The point lie in second quadrant");
        }
        else if ((x>0) &&(y<0)) {
            System.out.println("The point lie in third quadrant");
        }
        else {
            System.out.println("The point lie in fourth quadrant");
        }
        sc.close();
    }
    
}

import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the length of Rectangle: ");
        double length=scanner.nextDouble();
        System.out.print("Enter the breadth of Rectangle: ");
        double breadth=scanner.nextDouble();
        double area=length*breadth;
        System.out.println("Area of Rectangle is: "+area);
        scanner.close();
    }
}

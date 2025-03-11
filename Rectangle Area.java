import java.util.Scanner;

public class RectangleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = scanner.nextDouble();

        System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        Rectangle rect = new Rectangle();
        rect.length = length;
        rect.width = width;

        rect.displayDetails();
    }
}

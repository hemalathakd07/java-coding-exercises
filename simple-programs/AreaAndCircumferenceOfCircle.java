import java.util.Scanner;

public class AreaAndCircumferenceOfCircle {

    static void area(double radius){
        final double PI=3.14;
        double area=PI*radius*radius;
        System.out.println("Area of the circle is "+area);
    }
    static void circumference(double radius){
        final double PI=3.14;
        double circumference=2*PI*radius;
        System.out.println("Circumference of the circle is "+circumference);
    }

    public static void main(String[] args) {
        System.out.println("Enter radius value:");
        Scanner scanner=new Scanner(System.in);
        double radius=scanner.nextDouble();
        area(radius);
        circumference(radius);
    }
}

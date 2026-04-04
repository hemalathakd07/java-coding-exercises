import java.util.Scanner;

public class TrafficLightSimulation {
    static String TrafficSignal(String lightColor){
        return switch(lightColor){
            case "red"-> {
                System.out.println("Traffic light is "+lightColor);
                yield "Stop";
            }

            case "green"->{
                System.out.println("Traffic light is "+lightColor);
                yield "Go";
            }
            case "yellow"->{
                System.out.println("Traffic light is "+lightColor);
                yield "Slow down";
            }
            default->"Invalid input";
        };
    }
    public static void main(String[] args) {
        System.out.println("Enter traffic signal color:");
        Scanner scanner=new Scanner(System.in);
        String color=scanner.nextLine().toLowerCase();
        String result=TrafficSignal(color);
        System.out.println(result);
        scanner.close();
    }
}

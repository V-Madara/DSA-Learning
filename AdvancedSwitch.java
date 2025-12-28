import java.util.Scanner;

public class AdvancedSwitch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a Fruit: ");
        // String str = sc.nextLine();

        // switch (str){
        //     case "Mango" -> System.out.println("King of Fruits!");
        //     case "Apple" -> System.out.println("Sweet red Fruit!");
        //     case "Grapes" -> System.out.println("Small Fruit!");
        //     case "Banana" -> System.out.println("Big Fruit!");
        //     default -> System.out.println("Invalid Input!");
        // }

        // int day = sc.nextInt();
        // switch (day) {
        //     case 1:
        //     case 2:
        //     case 3:
        //     case 4:
        //     case 5:
        //         System.out.println("Weekdays");
        //         break;
        //     case 6:
        //     case 7:
        //         System.out.println("Weekends");
        //         break;
        //     default:
        //     System.out.println("Invalid Day");
        // }

        int day = sc.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays");
                break;
            case 6:
            case 7:
                System.out.println("Weekends");
                break;
            default:
            System.out.println("Invalid Day");
        }
        
    }
}
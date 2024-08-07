import java.util.Scanner;
public class Days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a day: ");
        String day = scanner.nextLine();

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            System.out.println("Ufff,it's a weekday");
        } else {
            
            System.out.println("Yayyy,its a weekend");
        }
        
    }
}
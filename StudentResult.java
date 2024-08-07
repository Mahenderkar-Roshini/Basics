import java.util.Scanner;
public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number: ");
        int number = scanner.nextInt();
        if (number < 35){
            System.out.println("fail");
        } else if (number == 35) {
            System.out.println("pass");
        } else if (number < 70) {
            System.out.println("Third Class");
        } else if (number < 85){
            System.out.println("Second Class");
        }
        else{
            System.out.println("First Class");
        }

    }
   
}
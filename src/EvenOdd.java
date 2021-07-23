import java.sql.SQLOutput;
import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the number");
        int num1 = scanner.nextInt();

        if(num1%2==0){


            System.out.println("This is the even number");
        }
        else
            System.out.println("This is the odd number");





    }
}

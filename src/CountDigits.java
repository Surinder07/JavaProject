import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        int count =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = scanner.nextInt();

        while(num1>0)
        {
            num1 = num1/10;
            count++;
        }
        System.out.println("Number of digits : "+count);
    }
}

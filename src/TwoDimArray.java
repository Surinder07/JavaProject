import java.util.Scanner;

public class TwoDimArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        System.out.println("Enter the elements in the array");


        int arr[][] = new int[rows][columns];

        for(int i = 0;i< rows;i++) {

            for(int j = 0; j<columns;j++){

                arr[i][j]= scanner.nextInt();
            }


        }


    }
}

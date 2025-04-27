import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows :");
        int row = sc.nextInt();
        System.out.print("Enter number of cols :");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        System.out.print("Enter elements in array :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // display array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
        System.out.println();
        }
        sc.close();
    }
    
}

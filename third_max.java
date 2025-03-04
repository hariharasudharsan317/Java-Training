// find the third max number in 2d array

import java.util.*;

public class third_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row ");
        int row = sc.nextInt();
        System.out.println("Enter the col ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the Matrix value :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        int[] a = new int[row * col];
        int in = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[in] = arr[i][j];
                in++;
            }
        }
        Arrays.sort(a);
        if(a[0] == a[in-3]) System.out.println("no");
        else System.out.println("the third max number is :"+ a[in-3]);

    }
}


Enter the row 
3
Enter the col 
3
Enter the Matrix value :
1 2 3
4 9 45
123 376 1888

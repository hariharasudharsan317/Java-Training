import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
       String s =" Sudharsan    hara hari";
       String [] t = s.split("\\s+");
       StringBuilder m = new StringBuilder();
       for (int i= t.length-1; i>=0;i--){
        m.append(t[i]);
        if(i!=0) m.append(" ");
       } 
       System.out.println(m.toString());
    }
}
    







/*import java.util.*;

public class Solution {
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
                int count =0;
            for (int i=0; i<in ;i++){
                if(abundant(a[i])){
                    count++;
            }
        }
        if(count%2==0) System.out.println("yes");
        else System.out.println("no");
        
    }
    static boolean abundant(int n) {

        int add = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                add += i;
            }
        }
        return add > n;
    }
}

Enter the row 
2
Enter the col 
2
Enter the Matrix value :
12 12
12 12
yes














import java.util.*;

public class Solution {
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

for (int i=0; i< row; i++){
    for (int j=0; j<col; j++){
        arr[j][i] = arr[i][j];
    }
}
System.out.println("Sorted array : ");
for (int i = 0; i < row; i++) {
    for (int j = 0; j < col; j++) {
        System.out.print(arr[j][i] + " ");
    }
    System.out.println();
}

    }
}


Enter the row 
3
Enter the col 
3
Enter the Matrix value :
5 4 7
1 8 3
9 6 2
transpose array : 
5 4 7
4 8 3
7 3 2







import java.util.*;

public class Solution {
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
        in = 0;
        int[][] arr1 = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr1[i][j] = a[in];
                in++;
            }
        }
        System.out.println("Sorted array : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }

}
    
Enter the row 
3
Enter the col 
3
Enter the Matrix value :
1 2 4
5 8 3
9 7 6
Sorted array : 
1 2 3
4 5 6
7 8 9
*/

/*
 * import java.util.*;
 * 
 * public class Solution {
 * public static void main(String[] args) {
 * int n;
 * int ans =0;
 * int sqr ;
 * for (int i=1; i<=100; i++){
 * n= i*i;
 * 
 * while (sqr != 0){
 * 
 * int N=n%10;
 * ans+=N;
 * sqr /=10;
 * }
 * System.out.println(i);
 * }
 * }}
 *
 * 
 * 
 * class Main {
 * public static void main(String[] args) {
 * int n=5;
 * int i,j;
 * 
 * for( i=1; i<=n; i++){
 * for (j=1; j<=(n-i-1)*2-1; j++){
 * System.out.print((j%2==0)?0:1);
 * }
 * System.out.println();
 * }
 * 
 * 
 * }
 * }
 * 
 * 
 * 
 * import java.util.*;
 * import java.io.*;
 * 
 * public class Solution{
 * public static void main(int size, int k,int[][] arr){
 * {
 * // temporary array of size M
 * int temp[]=new int[size];
 * 
 * // within the size of matrix
 * k = k % size;
 * 
 * for (int i = 0; i < size; i++)
 * {
 * 
 * // copy first M-k elements
 * // to temporary array
 * for (int t = 0; t < size - k; t++)
 * temp[t] = arr[i][t];
 * 
 * // copy the elements from k
 * // to end to starting
 * for (int j = size - k; j < size; j++)
 * arr[i][j - size + k] = arr[i][j];
 * 
 * // copy elements from
 * // temporary array to end
 * for (int j = k; j < size; j++)
 * arr[i][j] = temp[j - k];
 * }
 * twodim();
 * }
 * 
 * }
 * static void twodim(){
 * int size=3;
 * int k=1;
 * int[][] arr = new int[size][size];
 * for (int i=0; i<size;i++){
 * for (int j=0;j<size; j++){
 * arr[i][j]=k;
 * k++;
 * }}
 * 
 * for (int i=0; i<size; i++){
 * for (int j=0; j<size; j++){
 * System.out.print(arr[i][j]+"  ");
 * }
 * System.out.println();
 * 
 * }
 * 
 * 
 * 
 * }}
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * /*
 * public class Main {
 * public static void main(String[] args) {
 * String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
 * for(int i=0;i<=cars.length-1;i++)
 * 
 * System.out.println(cars[i]);
 * }
 * }
 */
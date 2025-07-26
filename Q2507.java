
import java.util.Scanner;


// the desired output
// For Example:
// Input:
// aaaabbbccdefaa
// Output:
// a4b3c2d1e1f1a2

// class Q2507{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         String str = s.nextLine();
        
//         StringBuilder str2 = new StringBuilder();
//         char ch = str.charAt(0);
//         int count = 1;

//         for(int i = 1; i < str.length(); i++){
//             char ch2 = str.charAt(i);
//             if(ch == ch2){
//                 count++;
//             }
//             else{
//                   str2.append(ch).append(count); //to upload the value to the str2 string
//                   ch = ch2;
//                   count = 1;
//             }
//         }
//         str2.append(ch).append(count);
//         System.out.println(str2.toString());
//     }
// }

// 2.An image is representing m*n matrix of integers, where each integer represents a pixel value.Write an algorithm to rotate an
// image by 90 degree left or right according to the value of §ag variable. If r=the §ag value is 0, then rotate to the left and if §ag
// value is 1 , then rotate to the right
// Case 1: 
// Flag = 1 
// Input: 
// 2 3 1 
// 4 6 3 
// 5 4 2 
// Output: 5 4 2 
// 4 6 3 
// 2 3 1 
// Case 2: 
// Flag = 0 
// Input: 
// 2 1 
// 3 4 
// Output: 
// 4 1 
// 3 2

// import java.util.Scanner;

// public class Q2507 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input dimensions
//         System.out.print("Enter rows: ");
//         int rows = sc.nextInt();
//         System.out.print("Enter cols: ");
//         int cols = sc.nextInt();

//         // Input matrix
//         int[][] matrix = new int[rows][cols];
//         System.out.println("Enter matrix elements:");
//         for (int i = 0; i < rows; i++)
//             for (int j = 0; j < cols; j++)
//                 matrix[i][j] = sc.nextInt();

//         // Input flag
//         System.out.print("Enter flag (0 for left, 1 for right): ");
//         int flag = sc.nextInt();

//         int[][] rotated;

//         if (flag == 1) {
//             rotated = rotateRight(matrix);
//         } else {
//             rotated = rotateLeft(matrix);
//         }

//         // Output rotated matrix
//         System.out.println("Rotated Matrix:");
//         for (int[] row : rotated) {
//             for (int val : row)
//                 System.out.print(val + " ");
//             System.out.println();
//         }
//     }

//     // Rotate 90 degrees clockwise
//     static int[][] rotateRight(int[][] mat) {
//         int m = mat.length, n = mat[0].length;
//         int[][] result = new int[n][m];

//         for (int i = 0; i < m; i++)
//             for (int j = 0; j < n; j++)
//                 result[j][m - 1 - i] = mat[i][j];

//         return result;
//     }

//     // Rotate 90 degrees counter-clockwise
//     static int[][] rotateLeft(int[][] mat) {
//         int m = mat.length, n = mat[0].length;
//         int[][] result = new int[n][m];

//         for (int i = 0; i < m; i++)
//             for (int j = 0; j < n; j++)
//                 result[n - 1 - j][i] = mat[i][j];

//         return result;
//     }
// }


// 3.The company has transmitted its data to the target server successfully. Now, on the new server, the transmitted binary data has to be stored in a user-readable format. As a developer, you have been assigned the task of converting the received binary data to user readable decimal data
// Write an algorithm to convert the given data to the decimal format.

// Input
// The input consists of an integer data, representing the binary form of the data
// received.

// Output
// Print an integer representing the decimal form of the received data.

// Example
// Input:
// 1001111001
// Output
// 633

// import java.util.Scanner;

// public class Q2507 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input binary data as a String (to preserve leading zeros)
//         String binaryStr = sc.nextLine();

//         // Convert binary string to decimal
//         int decimalValue = Integer.parseInt(binaryStr, 2);

//         // Output the result
//         System.out.println(decimalValue);
//     }
// }


// import java.util.*;

// public class Q2507 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String binary = sc.nextLine();
//         int decimal = 0;

//         for (int i = 0; i < binary.length(); i++) {
//             char bit = binary.charAt(binary.length() - 1 - i);
//             if (bit == '1') {
//                 decimal += Math.pow(2, i);
//             }
//         }
//         System.out.println(decimal);
//     }
// }

// 5.A company wishes to encode its data is in the form of a string and is
// case sensitive. They wish to encode the data with respect to a specific
// character. They wish to count the number of times the character
// reoccurs in the given data so that they can encode the data accordingly.
// Write an algorithm to find the count of the specific character in the
// given data.
// Input
// The first line of the input consists of a string data representing the data
// to be encoded.
// The next line of the input consists of a character coder representing the
// character to be counted in the data.
// Output
// Print an integer representing the count of the specific character.
// Example
// Input:
// haveagoodday
// a
// Output:
// 3

class Q2507{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char tag = s.nextLine().charAt(0);
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == tag){
                count++;
            }
        }
        System.out.println(count);
    }   
} 

import java.util.Scanner;

// Problem:
// You are given two strings S and T of the same length N. Your task is to convert the string S into T by doing some operations. In an operation, you can delete the first character of the string S and append any character at the end of the string. You are required to determine the minimum number of operations to convert S into T.

// Input format

// First line: Single integer N denoting the length of the strings
// Second line: String S
// Third line: String T
// Output format
// Print a single integer that represents the answer to the question.

// Constraints
// 1≤N≤103

// Both strings consist of only lowercase alphabets.

// Sample Input
// 7
// aaxaabc
// aabcaax
// Sample Output
// 3
 
// Time Limit: 1
// Memory Limit: 256
// Source Limit:
// Explanation
// After the 1st operation S=axaabca
// After the 2nd operation S=xaabcaa
// After the 3rd operation S=aabcaax
// After 3rd operation S and T becomes same.


// public class Test2607 {
//         public static void main(String[] args) {
//             Scanner s = new Scanner(System.in);
//             int n = s.nextInt();
//             String S = s.next();
//             String T = s.next();
//             int count = n;

//             for(int k = 0; k <= n; k++){
//                 boolean match = true;

//                 for(int i = 0 ; i < n - k; i++){
//                     if(S.charAt(k + i) != T.charAt(i)){
//                        match = false;
//                        break;
//                     }
//                 }
//                 if(match){
//                     count = k;
//                     break;
//                 }
//             }
//             System.err.println(count);
//         }    
// }

// class Test2607{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);

//         int n = s.nextInt();
//         String S = s.next();
//         String T = s.next();

//         int count = n;

//         for(int i = 0; i <= n; i++){
//             String suff = S.substring(i);
//             String preff = T.substring(0, n - i);

//             if(suff.equals(preff)){
//                 count = i;
//                 break;
//             }
//         }
//         System.out.println(count);
//     }
// }

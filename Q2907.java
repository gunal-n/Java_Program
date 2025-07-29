// 1. Strings
// Remove palindrome words
// The string should contain only the words that are not palindromes
// Sample Input 1
// Malayalam is my mother tongue
// Sample Output 1
// Is my mother tongue  

// import java.util.*;

// public class Q2907 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         String sentence = input.nextLine(); 
//         String[] words = sentence.split(" ");
//         String result = "";

//         for (String word : words) {
//             String lower = word.toLowerCase();
//             String reverse = new StringBuilder(lower).reverse().toString();
//             if (!lower.equals(reverse)) {
//                 result += word + " ";
//             }
//         }
//         System.out.println(result.trim());
//     }
// }


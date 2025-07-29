
import java.util.Scanner;

// 1. Strings
// Remove palindrome words
// The string should contain only the words that are not palindromes
// Sample Input 1
// Malayalam is my mother tongue
// Sample Output 1
// Is my mother tongue
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


// 3.Locker Problem
// There is a school with 100 students, and correspondingly 100 lockers, all of which start off closed. The first student opens every locker. The second student closes every other locker, starting with the second (2, 4, 6 etc). The third student changes the state of every third locker starting with the third (3,6,9, etc). The fourth would change the status of lockers numbered 4,8,12 etc.,. That is, if the locker is open, it is closed, and if it is closed, it is opened. This continues until all 100 students have passed along the lockers. After the 100th student is done, which lockers are open and which are closed?
//             [Note: program should work for any number of students/lockers]
// Sample Input 1
// 100
// Sample Output 1
// open = 10
// close = 90

// class Q2907 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         int openCount = 0;
//         for (int i = 1; i * i <= n; i++) {
//             openCount++; 
//         }
//         int closedCount = n - openCount;
//         System.out.println( "open = "+openCount);
//         System.out.println("close = "+closedCount);
//     }
// }

// 2.Number Crunching
// New Number System
// Form a number system with only 3 and 4. Find the nth number of the number system.
// Eg.) The numbers are: 3, 4, 33, 34, 43, 44, 333, 334, 343, 344, 433, 434, 443, 444, 3333, 3334, 3343, 3344, 3433, 3434, 3443, 3444 ….
// Constraints
// 1<=N<=10000000
// Sample Input 1
// 10
// Sample Output 1
// 344
// Sample Input 2
// 6743
// Sample Output 2
// 434334344333

class Q2907{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
    }
}

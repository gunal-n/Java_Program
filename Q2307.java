// Problem 1
// Arpasland has surrounded by attackers. A truck enters the city. The driver claims the load is food and medicine from Iranians. Ali is one of the soldiers in Arpasland. He doubts about the truck, maybe it's from the siege. He knows that a tag is valid if the sum of every two consecutive digits of it is even and its letter is not a vowel. Determine if the tag of the truck is valid or not.
// We consider the letters "A","E","I","O","U","Y" to be vowels for this problem.
// Input Format
// The first line contains a string of length 9. The format is "DDXDDD-DD", where D stands for a digit (non zero) and X is an uppercase english letter.
// Output Format
// Print "valid" (without quotes) if the tag is valid, print "invalid" otherwise (without quotes)
// Sample Input
// 12X345-67
// Sample Output
// invalid
// Time Limit: 1
// Memory Limit: 256
// Source Limit:
// Explanation
//The tag is invalid because the sum of first and second digit of it is odd (also the sum of 4'th and 5'th, 5'th and 6'th and 8'th and 9'th are odd).

// public class Q2307 {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String tag = scanner.nextLine();
//         System.out.println(isValid(tag));
//         scanner.close();
//     }

//     public static String isValid(String tag) {
//         // Vowel check for position 2 (index 2)
//         char letter = tag.charAt(2);
//         if (isVowel(letter)) {
//             return "invalid";
//         }

//         // Check digit pairs for even sum
//         int[][] positions = {
//             {0, 1},
//             {3, 4},
//             {4, 5},
//             {7, 8}
//         };

//         for (int[] pair : positions) {
//             int digit1 = Character.getNumericValue(tag.charAt(pair[0]));
//             int digit2 = Character.getNumericValue(tag.charAt(pair[1]));

//             if ((digit1 + digit2) % 2 != 0) {
//                 return "invalid";
//             }
//         }

//         return "valid";
//     }

//     // Function to check vowels
//     public static boolean isVowel(char c) {
//         return "AEIOUY".indexOf(c) != -1;
//     }
// }

// import java.util.*;

// public class Q2307{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();

//         if ("AEIOUY".contains("" + s.charAt(2))) {
//             System.out.println("invalid");
//         }


//         else if (((s.charAt(0) - '0') + (s.charAt(1) - '0')) % 2 != 0 ||
//             ((s.charAt(3) - '0') + (s.charAt(4) - '0')) % 2 != 0 ||
//             ((s.charAt(4) - '0') + (s.charAt(5) - '0')) % 2 != 0 ||
//             ((s.charAt(7) - '0') + (s.charAt(8) - '0')) % 2 != 0) {
//             System.out.println("invalid");
//         }
        
//         else{
//                 System.out.println("valid");
//         }
//     }
// }



// Problem 4
// Alice, an aspiring cryptographer, recently discovered an ancient scroll containing a sequence of mysterious numbers. According to a legend, these numbers hold the key to unlocking a hidden treasure buried centuries ago by an enigmatic mathematician. However, deciphering the scroll requires identifying specific pairs of numbers that follow an ancient numerical pattern.
// Alice is given an array of integers nums. She wants to determine how many pairs (i,j) exist such that:
// •	0≤i<j<nums.length
// •	The sum of digits of nums[i] is equal to the sum of digits of nums[j].
// She believes that the correct count of these pairs will reveal a crucial clue needed to decode the next part of the scroll. Your task is to help Alice compute this number so she can continue her quest.
// Task
// Return the number of special pairs to assist Alice in uncovering the hidden secret.
// Function description
// Complete the function solve() provided in the editor. This function takes the following two parameters and returns the required answer:
// •	N: Represents the number of elements in the array
// •	nums: A list of N integers
// Input format
// •	The first line contains a single integer N(size of the array).
// •	The second line contains N space-separated integers representing the array nums.
// Output format
// For each test case, print the required answer on a new line.
// Constraints
// •	2≤N≤5∗105
// •	1≤nums[i]≤109
// Sample Input
// 4
// 51 71 17 42
// Sample Output
// 2
// Time Limit: 5
// Memory Limit: 256
// Source Limit:
// Explanation
// Given
// N = 4, nums = [51, 71, 17, 42]
// Approach:
// •	51 → Sum of digits = 6
// •	71 → Sum of digits = 8
// •	17 → Sum of digits = 8
// •	42 → Sum of digits = 6
// Valid pairs:
// •	(1,4) → 51 & 42 (sum = 6)
// •	(2,3) → 71 & 17 (sum = 8)
// Total = 2


// class Q2307{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int n = s.nextInt();
//         int[] arr = new int[n];
//         int[] add = new int[82]; 
//         int count = 0;
//         for(int i = 0; i < n; i++){
//            arr[i] = s.nextInt();
//            int sum = 0;
            
//         //this to split the number
//            while(arr[i] > 0){
//             sum += arr[i] % 10;
//             arr[i] /= 10;
//            }
            
//             count += add[sum];
//             add[sum]++; 
//         }
//         System.out.println(count);
//     }
// }

// import java.util.*;

// class Q2307 {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int n = s.nextInt();
//         int[] freq = new int[82];  // Max digit sum for numbers up to 10^9 is 81
//         int count = 0;

//         for (int i = 0; i < n; i++) {
//             int num = s.nextInt();
//             int sum = 0;

//             // Calculate sum of digits
//             while (num > 0) {
//                 sum += num % 10;
//                 num /= 10;
//             }

//             // For every number already seen with same digit sum, we can form a new pair
//             count += freq[sum];
//             freq[sum]++;
//         }

//         System.out.println(count);
//     }
// }
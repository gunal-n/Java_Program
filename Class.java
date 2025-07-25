// 1.	Inversion count in Array 
// Inversion Count for an array indicates – how far (or close) the array is from being sorted. If the array is already sorted, then the inversion count is 0, but if the array is sorted in reverse order, the inversion count is the maximum. 
// Given an array arr[]. The task is to find the inversion count of arr[]. Where two elements arr[i] and arr[j] form an inversion if a[i] > a[j] and i < j.
// Examples: 
// Input: arr[] = {8, 4, 2, 1}
// Output: 6
// Explanation: Given array has six inversions: (8, 4), (4, 2), (8, 2), (8, 1), (4, 1), (2, 1).

// Input: arr[] = {1, 20, 6, 4, 5}
// Output: 5
// Explanation: Given array has five inversions: (20, 6), (20, 4), (20, 5), (6, 4), (6, 5). 

// class Class{
//     public static void main(String[] args) {
//         int[] arr = {8,4,2,1};
//         int n = arr.length;
//         int count = 0;
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < n - 1 - i; j++){
//                 if(arr[j] > arr[j + 1]){
//                 int temp = arr[j];
//                 arr[j] = arr[j + 1];
//                 arr[j + 1] = temp;
//                 count += 1;
//                 }
//             }
//         }
//         System.out.println(count);
//     }
// }

// 2.	Sort an array according to the order defined by another array
// Given two arrays A1[] and A2[], sort A1 in such a way that the relative order among the elements will be same as those are in A2. For the elements not present in A2, append them at last in sorted order. 
// Example: 
// Input: A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8}
//            A2[] = {2, 1, 8, 3}
// Output: A1[] = {2, 2, 1, 1, 8, 8, 3, 5, 6, 7, 9}
// Input: A1[] = {4, 5, 1, 1, 3, 2}
//            A2[] = {3, 1}
// Output: A1[] = {3, 1, 1, 2, 4, 5}

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;

// public class Class {
//     public static void main(String[] args) {
//         // Sample input like A1 and A2
//         ArrayList<Integer> A1 = new ArrayList<>(Arrays.asList(2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8));
//         ArrayList<Integer> A2 = new ArrayList<>(Arrays.asList(2, 1, 8, 3));

//         ArrayList<Integer> result = new ArrayList<>();

//         // Step 1: Add elements from A1 that are present in A2, in the order of A2
//         for (int n : A2) {
//             while (A1.contains(n)) {
//                 result.add(n);
//                 A1.remove((Integer) n); // Remove by value, not index
//             }
//         }

//         // Step 2: Sort remaining elements and add to result
//         Collections.sort(A1);  // A1 now contains only leftover elements
//         result.addAll(A1);

//         // Final Output
//         System.out.println("Sorted A1 according to A2: " + result);
//     }
// }

// 3.	Check if it is possible to sort an array with conditional swapping of adjacent allowed
// We are given an unsorted array of integers in the range from 0 to n-1. We are allowed to swap adjacent elements in array many number of times but only if the absolute difference between these element is 1. Check if it is possible to sort the array.If yes then print “yes” else “no”. 
// Examples: 
// Input : arr[] = {1, 0, 3, 2}
// Output : yes
// Explanation:- We can swap arr[0] and arr[1].
// Again we swap arr[2] and arr[3]. 
// Final arr[] = {0, 1, 2, 3}.
// Input : arr[] = {2, 1, 0}
// Output : no

// class Class{
//     public static void main(String[] args) {
//         int[] arr = {2,1,0};
//         boolean check = false;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i] > arr[j]){
//                     if(arr[i]-arr[j] == 1){
//                         int temp = arr[i];
//                         arr[i] = arr[j];
//                         arr[j] = temp;
//                         check = true;
//                         break;
//                         }
//                     }
//                     else{
//                         check = false;
//                         break;
//                     }
//             }
//         }
//         if(check) System.out.println("Yes");
//         else System.out.println("No");
//     }
// }

// 4.	Sort an array of 0s, 1s and 2s | Dutch National Flag problem
// Given an array A[] consisting of only 0s, 1s, and 2s. The task is to write a function that sorts the given array. The functions should put all 0s first, then all 1s and all 2s in last.
// This problem is also the same as the famous “Dutch National Flag problem”. The problem was proposed by Edsger Dijkstra. The problem is as follows:
// Given N balls of colour red, white or blue arranged in a line in random order. You have to arrange all the balls such that the balls with the same colours are adjacent with the order of the balls, with the order of the colours being red, white and blue (i.e., all red coloured balls come first then the white coloured balls and then the blue coloured balls). 
// Examples:
// Input: {0, 1, 2, 0, 1, 2}
// Output: {0, 0, 1, 1, 2, 2}
// Input: {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
// Output: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}

// class Class{
//     public static void main(String[] args) {
//         int[] arr = {0,1,2,0,1,2};
//         int n = arr.length;
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < n - 1 - i; j++){
//                 if(arr[j] > arr[j + 1]){
//                 int temp = arr[j];
//                 arr[j] = arr[j + 1];
//                 arr[j + 1] = temp;
//                 }
//             }
//         }
//         for(int num : arr){
//             System.out.print(" "+num);
//         }
     
//         // TO make the output as {1,2,3,4}
//         // System.out.print("Output: {");
//         // for (int i = 0; i < n; i++) {
//         //     System.out.print(arr[i]);
//         //     if (i != n - 1) {
//         //         System.out.print(", ");
//         //     }
//         // }
//         // System.out.println("}");
//     }
// }

// 5.	Sort an array in wave form
// Given an unsorted array of integers, sort the array into a wave array. An array arr[0..n-1] is sorted in wave form if:
// arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= …..

// Examples:
// Input:  arr[] = {10, 5, 6, 3, 2, 20, 100, 80}
// Output: arr[] = {10, 5, 6, 2, 20, 3, 100, 80} 
// Explanation: 
// Here you can see {10, 5, 6, 2, 20, 3, 100, 80} first element is larger than the second and the same thing is repeated again and again. large element – small element-large element -small element and so on .it can be small element-larger element – small element-large element -small element too. all you need to maintain is the up-down fashion which represents a wave. there can be multiple answers.

// Input: arr[] = {20, 10, 8, 6, 4, 2}
// Output: arr[] = {20, 8, 10, 4, 6, 2}
// What is a wave array?
// well, you have seen waves right? how do they look? if you will form a graph of them it would be some in some up-down fashion. that is what you have to do here, you are supposed to arrange numbers in such a way that if we will form a graph it will be in an up-down fashion rather than a straight line.

// Wave Array using sorting
// A idea is to use sorting. First sort the input array, then swap all adjacent elements.
// Follow the steps mentioned below to implement the idea:
// Sort the array.
// Traverse the array from index 0 to N-1, and increase the value of the index by 2.
// While traversing the array swap arr[i] with arr[i+1].
// Print the final array.
// # Python function to sort the array arr[0..n-1] in wave form,
// # i.e., arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= arr[5]

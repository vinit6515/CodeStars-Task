/*  
 Given an integer array nums of length n.
Assume arrk to be an array obtained by rotating the array nums by k positions clock-wise (i.e. by
rotating once, the last element will become the first in position). We define the rotation function
F on nums as follows:
F(k) = 0 * arrk[0] + 1 * arrk[1] + ... + (n - 1) * arrk[n - 1].
Print the maximum value of F(0), F(1), ..., F(n-1).
INPUT:
n the number of elements in the array and then the array nums
OUTPUT:
Maximum value of the function F
EXAMPLES:

Input: n=4, nums = [4, 3, 2, 6]
Reasoning:
F(0) = (0 * 4) + (1 * 3) + (2 * 2) + (3 * 6) = 0 + 3 + 4 + 18 = 25
F(1) = (0 * 6) + (1 * 4) + (2 * 3) + (3 * 2) = 0 + 4 + 6 + 6 = 16
F(2) = (0 * 2) + (1 * 6) + (2 * 4) + (3 * 3) = 0 + 6 + 8 + 9 = 23
F(3) = (0 * 3) + (1 * 2) + (2 * 6) + (3 * 4) = 0 + 2 + 12 + 12 = 26
So the maximum value of F(0), F(1), F(2), F(3) is F(3) = 26.
Output: 26
Input: n=3, nums = [7, 3, 4]
Reasoning:
F(0) = (0 * 7) + (1 * 3) + (2 * 4) = 0 + 3 + 8 = 11
F(1) = (0 * 4) + (1 * 7) + (2 * 3) = 0 + 7 + 6 = 13
F(2) = (0 * 3) + (1 * 4) + (2 * 7) = 0 + 4 + 14 = 18
So the maximum value of F(0), F(1), F(2) is F(2) = 18.
Output: 18
Input: n=1, nums = [100]
Reasoning:
F(0) = (0 * 100) = 0
So the maximum value is F(0) = 0.
Output: 0
 */

import java.util.*;

public class Task3 {
    static int max_element_func(int[] arr) {
        int max = arr[0]; // Initialize max with the first element of the array

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger element is found
            }
        }

        return max;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        int arr[] =new int [n];
        int temp[]=new int [n];
        int f[]=new int [n];
        int i=0,j=0,k=0,l=0;
        
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    // Creating a function f(k)
    for(i=0;i<n;i++){
        for (j=0;j<n;j++){
            f[i]=j*arr[j]+f[i];
        }
        //Rotating an element 
    for(k=0;k<n;k++){
        if(k==n-1){
            temp[0]=arr[n-1];
        }
        else{
            temp[k+1]=arr[k];
        }
    
    }
    // We are substitutting back the orignal values
    for(l=0;l<n;l++){
        arr[l]=temp[l];
    }
    

    }
int max_element =max_element_func(f);
System.out.println(max_element);
    
    }
    
    
}

/*Sonia considers a number special if its last digit is 2, 3 or 9. Help her find out how many numbers are
special between two given numbers L and R.
Input format: 2 numbers L and R given L<R

Output format: Print the count of special numbers between R and L (including both R and L)
Example 1:
Input: L = 1, R = 10
Expected Output: 3 (Numbers 2,3,9)
Example 2:
Input: L = 11, R = 33
Expected Output: 8 (Numbers 12 13 19 22 23 29 32 33) */
import java.util.*;
import java.io.*;
class Task1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,j=0,ctr=0;
        int arr[];
        arr=new int [50];
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        for ( i=num1;i<=num2; i++){
            if(i%10==2||i%10==3||i%10==9){
                ctr=ctr+1;
                arr[j]=i;
                j++;
            }
        
        }
        System.out.println(ctr);
       /* for(i=0;i<j;i++){
            System.out.println(arr[i]);
        } */
        
    }
}
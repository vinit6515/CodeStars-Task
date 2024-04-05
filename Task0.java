/*   Given an integer x, find 2 integers a and b such that:
• 1 ≤ a, b ≤ x
• b divides a (a is divisible by b).
• a*b > x
•
a
b
< x
Input format:
The only line contains the integer x (1≤x≤100)
Output format:
You should output two integers a and b, satisfying the given conditions, separated by a space.
If no pair of integers satisfy the conditions above, print "-1" (without quotes).

Examples:
For input 10, the possible solutions are (6,3) and (8,4). You can output any of them.
For input 1, there is no solution so your program should output -1 */

import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i=0,flag=0,a=0,b=0;
        for (a=1;a>0;a++){
            for(b=1;b<=x;b++){
                if(a<=b){
                    break;
                }
                else{
                    if(a%b==0&&a*b>x&&a/b<x){
                        i=i+1;
                        System.out.println("("+a+","+b+")");
                        flag=1;
                        break;
                    }
                }
                if(i!=0){
                    break;
                }
            }

        }
        if(flag==0){
            System.out.println("-1");
        }
    }
    
}

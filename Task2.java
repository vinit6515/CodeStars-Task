/*
 Joseph Cooper, a time traveler lost in time, wants to get back to his daughter Murph Cooper. He is currently on
day N of the week and Murph is on day M of the week. He can either wait for day M to arrive or he can use a
time machine to go back in time and reach day M.
Input format: 2 numbers M and N such that 1≤ N and M ≤ 7
Output format: Print the minimum number of days from current to goal day
Example 1:
Input: 1,7
Expected Output: 1
Reason: If Joseph is on a Monday (i.e., the 1st day) waits for Sunday (i.e., the 7th day), he will have to wait
6 days. On the other hand, if he uses his time machine and travel back in time he will travel back from
Monday and reach Sunday in a 1 day. So, he chooses to time travel and reach Murph in 1 day.
Example 2:
Input: 4,7
Expected Output: 3
Reason: If Joseph is on Thursday and he wants to travel to Sunday, he will have to wait 3 days for Sunday
and if he travels back in time, it will take him 4 days. So, he chooses to wait and reach Murph in 3 days.
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int  a=sc.nextInt();
    int b=sc.nextInt();
    int diff=Math.abs(b-a);
     if(diff<=3){
            System.out.println(diff);
        }
     else{
            System.out.println(7-diff);
        }


    }
    
}

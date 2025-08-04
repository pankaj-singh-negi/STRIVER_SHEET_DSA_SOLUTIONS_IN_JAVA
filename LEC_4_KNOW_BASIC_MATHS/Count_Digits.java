import java.util.Scanner;

class Count_Digits
{
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to count the digits: ");
        int n = sc.nextInt();

        System.out.println("Number of digits in " + n + " is: " + countDigits(n));


    }


     public static int countDigits(int n) {
        // code here
        // return (int) Math.log10(n) +1;

        int count=0;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        return count;
    }

}// Time Complexity: O(d), where d is the number of digits in n
// Space Complexity: O(1), uses constant extra space
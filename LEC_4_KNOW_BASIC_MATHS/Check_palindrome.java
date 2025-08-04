import java.util.Scanner;

class Check_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check palindrome: ");
        int n = sc.nextInt();

        System.out.println("The given number " + n + " is: " + Check_palindrome(n));
       
    }

    public static boolean Check_palindrome(int n){
        int num = n;
        int digit;
        int reverse = 0;
        while(num != 0){
            digit = num%10;
            reverse = reverse*10 + digit;
            num = num/10;
        }
        return reverse==n;
    }
    }

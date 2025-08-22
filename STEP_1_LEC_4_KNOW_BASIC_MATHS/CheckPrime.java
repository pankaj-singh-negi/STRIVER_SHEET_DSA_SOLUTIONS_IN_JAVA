import java.util.Scanner;

public class CheckPrime {
     public static void main(String[] args) {
      

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int n=sc.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
        sc.close();
       

  
}

public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// Time Complexity: O(sqrt(n)), since we check divisibility up to sqrt(n)
// Space Complexity: O(1), uses constant extra space
import java.util.Scanner;

public class GCD_of_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd(a, b));
        sc.close();
    }

    public static int gcd(int a, int b) {
      return b == 0 ? a : gcd(b, a % b);
    }
}


// Time Complexity: O(log(min(a, b))), due to modulo-based Euclidean algorithm
// Space Complexity: O(log(min(a, b))), due to recursion stack
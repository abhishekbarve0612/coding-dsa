import java.util.*;

public class FindGCDAndLCM {

  public static int gcd(int n1, int n2) {
    if (n2 == 0) return n1;
    return gcd(n2, n1 % n2);
  }
  public static void main(String[] args) {
    Scanner takeInput = new Scanner(System.in);
    int num1 = takeInput.nextInt();
    int num2 = takeInput.nextInt();
    takeInput.close();
    System.out.print("GCD: ");
    System.out.println(gcd(num1, num2));
    System.out.print("LCM: ");
    
    int product = num1 * num2;
    System.out.println(product / gcd(num1, num2));
  }
}

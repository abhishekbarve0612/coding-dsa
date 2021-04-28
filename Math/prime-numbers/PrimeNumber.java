/**
 * PrimeNumber
 */

import java.util.*;
public class PrimeNumber {

  public static boolean isPrime(int n) {
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) return false;
    }
    return true;
  }
  public static void primeUsingSieve(boolean sieve[]) {
    for (int i = 2; i < sieve.length; i++) {
      int count = i * i;
      if (count >= sieve.length) break;
      if (sieve[i] == false) continue;
      else sieve[i] = true;
      if (sieve[count] == true) {
        while (count < sieve.length){
          sieve[count] = false;
          count += i;
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner takeInput = new Scanner(System.in);
    int number = takeInput.nextInt();
    System.out.println(isPrime(number));
    boolean sieve[] = new boolean[1001];
    Arrays.fill(sieve, true);
    sieve[1] =false;
    primeUsingSieve(sieve);
    if (number < sieve.length) System.out.println(sieve[number]);
  }
}
import java.util.*;

public class SieveOfEratosthenes {
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
    boolean sieve[] = new boolean[number + 1];
    Arrays.fill(sieve, true);
    sieve[1] =false;
    primeUsingSieve(sieve);
    for (int i = 2; i < sieve.length; i++) {
      if (sieve[i] == true) System.out.print(i + " ");
    }
  }
}

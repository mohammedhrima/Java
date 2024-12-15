import java.util.Scanner;

public class Program {
  public static int it = 0;
  static boolean isPrime(int n) {
    int c = n / 2;
    while(c > 1)
    {
      if(n % c == 0) return false;
      it++;
      c--;
    }
    return true;
  }

  public static void main(String[] args) throws Exception
  {
    try {
      Scanner Input = new Scanner(System.in);

      System.out.print("-> ");
      int n = Integer.parseInt(Input.nextLine());
      if(n < 1) throw new Exception("Input must be > 1");
      else if (isPrime(n)) System.out.printf("is prime (iterations: %d)\n", it);
      else System.out.printf("is not prime (iterations: %d)\n", it);
    } catch(Throwable e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

}
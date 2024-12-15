public class Program {
    public static void main(String[] args)   {
        int n = 479598;
        int res = 0;
        while(n != 0)
        {
            res += n % 10;
            n /= 10;
        }
        System.out.printf("%d", res);
    }
}
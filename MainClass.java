public class MainClass {
    public static boolean IsPrime(long n){
        if (n < 2)
            return false;
        double sqrt = Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++)
            if (n % i == 0)
                return false;
        return true;
    }

}

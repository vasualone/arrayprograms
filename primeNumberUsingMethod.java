import java.util.Scanner;

public class primeNumberUsingMethod {
    public static void main(String[] args) {
        Scanner obj2 = new Scanner(System.in);
        System.out.println("enter a number:");
            int number = obj2.nextInt();
        primeNumberUsingMethod obj = new primeNumberUsingMethod();
         boolean result = obj.isPrime(number);
         System.out.println(result);
    }
     public boolean isPrime(int a) {
         int count = 0;
         for (int i = 1; i <= a; i++) {
             if (a % i == 0) {
                 count++;

             }
         }
             if (count == 2) {
                 System.out.println("given number prime number");
                 return true;
             } else
                 System.out.println("given number not prime number");

         return false;
         }




}

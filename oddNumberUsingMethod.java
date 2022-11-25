import java.util.Scanner;

public class oddNumberUsingMethod {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a number:");
        int number = obj.nextInt();
        oddNumberUsingMethod obj2 = new oddNumberUsingMethod();
        boolean result = obj2.oddNumber(number);
        System.out.println(result);

    }
    public boolean oddNumber(int a){
        if(a % 2 == 1){
            System.out.println("given number odd number");
            return true;
        }
        else
            System.out.println("given number not odd number");

        return false;
    }

}

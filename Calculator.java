public class Calculator {
    public static void main(String[] args) {
        int sum1 = add(2,3);
        System.out.println(sum1);
        int sum3 = mul(2, 3);
        System.out.println(sum3);
        int sum5 = rem(4, 3);
        System.out.println(sum5);
        Calculator obj = new Calculator();
       int sum2= obj.sub(2,3);
        System.out.println(sum2);
        double sum4=obj.div(2,3);
        System.out.println(sum4);
        float sum6=obj.per(3,2);
        System.out.println(sum6);
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public  int sub(int a, int b)
    {

        return a - b;
    }public static int mul(int a, int b)
    {
        return a * b;
    }public  double div(int a, int b)
    {
        return a / b;
    }public  static int rem(int a, int b)
    {

        return a % b;
    }public  float per(int a, int b)
    {

        return (a / b)*100;
    }
}
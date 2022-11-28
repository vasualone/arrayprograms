import java.util.Scanner;

public class RealCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("enter any one of these operator: +, -, *, / ,%");
            char[] validOperations = {'+', '-', '*', '/', '%'};
            String scanner = input.next();
            if(scanner.equals("stop")){
                break;
            }
            int firstNum,secondNum;
            char operationTOBePerformed = scanner.charAt(0);

            if (checkIfCharPresentInGivenArray(scanner.charAt(0), validOperations)) {
                System.out.println("enter operator is valid");
                switch (operationTOBePerformed){
                    case '+':
                        System.out.println("enter first number:");
                        firstNum = input.nextInt();
                        System.out.println("enter first number:");
                        secondNum = input.nextInt();
                        int sum = add(firstNum,secondNum);
                        System.out.println("The sum of two numbers is: "+sum);
                        break;
                        case '-':
                        System.out.println("enter first number:");
                        firstNum = input.nextInt();
                        System.out.println("enter first number:");
                        secondNum = input.nextInt();
                        int sub =sub(firstNum,secondNum);
                        System.out.println("The subtraction of two numbers is: "+sub);
                        break;
                        case '*':
                        System.out.println("enter first number:");
                        firstNum = input.nextInt();
                        System.out.println("enter first number:");
                        secondNum = input.nextInt();
                        int mul = mul(firstNum,secondNum);
                        System.out.println("The multiplication of two numbers is: "+mul);
                        break;
                        case '/':

                        System.out.println("enter first number:");
                        firstNum = input.nextInt();
                        System.out.println("enter first number:");
                        secondNum = input.nextInt();
                        int div = div(firstNum,secondNum);
                        System.out.println("The division of two numbers is: "+div);
                    default:
                        System.out.println("enter first number:");
                        firstNum = input.nextInt();
                        System.out.println("enter first number:");
                        secondNum = input.nextInt();
                        int rem = rem(firstNum,secondNum);
                        System.out.println("The reminder of two numbers is: "+rem);

                }

            } else
                System.out.println("enter operator is not valid");
        }
        }
        public static boolean checkIfCharPresentInGivenArray ( char ch, char[] validOperationArray){
            for (int i = 0; i < validOperationArray.length; i++) {
                if (validOperationArray[i] == ch) {
                    return true;
                }
            }
            return false;

        }
        public static int add(int firstNum,int secondNum){
        return firstNum+secondNum;
        }
        public static int sub(int firstNum,int secondNum){
        return firstNum-secondNum;
    }
        public static int mul(int firstNum,int secondNum){
        return firstNum*secondNum;
    }
        public static int rem(int firstNum,int secondNum) {
            return firstNum / secondNum;
        }
       public static int div(int firstNum,int secondNum){
        return firstNum%secondNum;
    }


}



import java.util.Scanner;

public class arrayRepeatNumbers {
    public static void main(String[] args) {
        int count = 0;
        Scanner obj =new Scanner(System.in);
        System.out.println("enter a number:");
        int num = obj.nextInt();
        int[] repeatArray= {5,3,5,2,5,43,7,77,99,101,9,45,50};
        for(int i = 0; i < repeatArray.length; i++){

          if(num == repeatArray[i]){
              count++;
          }


        }
        System.out.println(count);
    }
}

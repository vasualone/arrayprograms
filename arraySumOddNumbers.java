public class arraySumOddNumbers {
    public static void main(String[] args) {
        int oddTotal = 0;
        int[] arraySumOdd = {2,3,5,4,7,9,8,11,12,13};
        for(int i = 0; i < arraySumOdd.length; i++){
            if(arraySumOdd[i] % 2 ==1){
                oddTotal = oddTotal + arraySumOdd[i];
            }
        }
        System.out.println(oddTotal);
    }
}

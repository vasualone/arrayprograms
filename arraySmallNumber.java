public class arraySmallNumber {
    public static void main(String[] args) {
        int smallNumber[]= {5,3,5,2,5,43,7,77,99,101,9,45,50};
        int smallest = smallNumber[0];
        for(int i = 0; i < smallNumber.length; i++) {
            if (smallNumber[i] < smallest) {
                smallest = smallNumber[i];
            }
        }
            System.out.println(smallest);

    }
}

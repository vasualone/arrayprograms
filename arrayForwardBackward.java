public class arrayForwardBackward {
    public static void main(String[] args) {
        int[] index = {12, 23, 34, 45, 56, 67, 78, 89, 90};

        for (int i = 0; i < index.length; i++) {
            System.out.println(index[i]);

        }

        for (int j = index.length-1; j >= 0; j--) {

            System.out.println(index[j]);

        }
    }

}








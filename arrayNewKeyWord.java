public class arrayNewKeyWord {

    public static void main(String[] args) {

        int[] newArray = new int[7];
        newArray[0] = 1;
        newArray[1] = 2;
        newArray[2] = 3;
        newArray[3] = 4;
        newArray[4] = 5;
        newArray[5] = 6;
        newArray[6] = 7;

        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);

        }
        int j = newArray.length - 1;
        while (j >= 0) {
            System.out.println(newArray[j]);
            j--;
        }

    }

}





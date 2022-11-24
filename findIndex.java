public class findIndex {
    public static void main(String[] args) {
        int searchNumber = 47, count = 0;
        int array[] = {12, 43, 45, 56, 65, 64, 78, 89};
        for (int k = array.length - 1; k >= 0; k--) {
            if (array[k] == searchNumber) {
                count++;
                System.out.println("we found number " + searchNumber + " at location " + k);
            }
        }
        if (count == 0)
            System.out.println("number doesn't exist");


    }
}



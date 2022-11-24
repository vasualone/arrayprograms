public class arrayForWhileLoop {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(array[4]);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);

        }
        int i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }
    }
}

package lesson_fabbi;

public class Lessson01_Fabbi {
    public static void main(String[] args) {

        int[] a = {11, 2, 8, 10, 5, 99, 1, 8, 9, 1, 5, 7};
        int[] output = new int[a.length];
        int j = 0, n = 4;
        for (int i = 0; i < n; i++) {
            output[j] = a[i];
            j++;
            output[j] = a[i + n];
            j++;
            output[j] = a[i + n * 2];
            j++;

        }
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
            //   11 5 9     2 99 1     8 1 5     10 8 7
        }
    }
}

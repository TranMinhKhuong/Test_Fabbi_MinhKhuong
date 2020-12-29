package lesson_fabbi;

public class Lesson03_Fabbi {

    public static void main(String[] args) {

        int[] a = {1, 5, 4, 7, 9, 0, -10, 13, 93, 14, 15};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        int minDistance = a[1] - a[0];
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] - a[i] < minDistance && a[i + 1] - a[i] > 0) {
                minDistance = a[i + 1] - a[i];
            }
            if (minDistance == 1) {
                break;
            }
        }
        int b = 0;
        int[] rs = new int[100];
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] - a[i] == minDistance) {
                b += 2;
                rs[b - 1] = a[i + 1];
                rs[b - 2] = a[i];

            }
        }
        for (int i = 0; i < rs.length; i += 2) {
            if (i != 0 && rs[i] == 0) {
                break;
            }
            System.out.print("(" + rs[i] + "," + rs[i + 1] + ")");
            // (0,1) (4,5) (13,14) (14,15)
        }
    }

}

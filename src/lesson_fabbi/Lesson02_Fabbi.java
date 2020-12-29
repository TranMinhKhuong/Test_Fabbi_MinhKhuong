package lesson_fabbi;

public class Lesson02_Fabbi {

    public static void main(String[] args) {
        int[] a = {0, 100, -4, 8, 143,143, 5, 99, 100};
        int larg = a[0], larg2 = a[0];

        for (int k = 0; k < a.length; k++) {

            if(a[k] > larg){
                larg2 = larg;
                larg = a[k];
            }
        }

        System.out.println(" Total two elements largest in array: " + (larg + larg2));
    }
}

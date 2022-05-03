public class Merge_Sort {
    public static void main(String[] args) {
        int a[] = { 2, 5, 8, 9, 11 };
        int b[] = { 4, 6, 7, 19, 32, 44, 80 };
        int c[] = new int[12];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                k++;
                i++;
            } else {
                c[k] = b[j];
                k++;
                j++;
            }
        }
        while (j < b.length) {
            c[k] = b[j];
            k++;
            j++;
        }
        while (i < a.length) {

            c[k] = a[i];
            k++;
            i++;
        }

        for (k = 0; k < c.length; k++) {
            System.out.print(c[k] + " ");
        }
    }
}

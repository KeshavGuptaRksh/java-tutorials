public class Merging {
    public static void main(String[] args) {
        int a[] = { 2, 5, 3, 67, 89 };
        int b[] = { 4, 76, 12, 9, 32, 4, 8 };
        int c[] = new int[12];
        int i = 0, j = 0, k = 0;
        while (i < a.length) {
            c[k] = a[i];
            k++;
            i++;
        }
        while (j < b.length) {
            c[k] = b[j];
            k++;
            j++;
        }
        for (k = 0; k < c.length; k++) {
            System.out.print(c[k] + " ");
        }
    }
}

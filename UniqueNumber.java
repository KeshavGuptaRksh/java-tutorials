public class UniqueNumber {
    public static void main(String[] args) {
        int num[] = { 1, 1, 2, 2, 3, 3, 6, 7, 7, 7, 8, 99, 99 };
        int unique[] = new int[num.length];
        unique[0] = num[0];
        int i, j = 0, k = 0;
        for (i = 1; i < num.length; i++) {
            if (unique[j] != num[i]) {
                j++;
                unique[j] = num[i];
            }

        }
        for (k = 0; k <= j; k++) {
            System.out.println(unique[k]);
        }

    }

}

//Not Passing Arg Returning Value

public class Type3 {
    int sum() {
        int a = 10;
        int b = 20;
        return a + b;
    }

    public static void main(String[] args) {
        Type3 ob = new Type3();
        int r = ob.sum();
        System.out.println(r);
    }
}
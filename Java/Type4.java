//Passing Arg Returning Value

public class Type4 {
    int sum(int a, int b) {

        return a + b;
    }

    public static void main(String[] args) {
        Type4 ob = new Type4();
        int r = ob.sum(4, 7);
        System.out.println(r);
    }
}
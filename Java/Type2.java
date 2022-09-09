//Passing Arg Not returning Value

public class Type2 {
    void sum(int a, int b) {

        System.out.println((a + b));
    }

    public static void main(String[] args) {

        Type2 ob = new Type2();
        ob.sum(3, 7);
    }
}

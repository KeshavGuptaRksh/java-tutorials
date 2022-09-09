class SuperClass {
    int a;

    SuperClass(int x) {
        a = x;
    }

    void display() {
        System.out.println(a);
    }
}

public class ThisDemo extends SuperClass {
    ThisDemo(int x) {
        super(x);

    }

    public static void main(String[] args) {
        ThisDemo obj = new ThisDemo(5);
        obj.display();
    }
}

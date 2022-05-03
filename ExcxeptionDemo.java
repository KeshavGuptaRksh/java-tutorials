/**
 * ExcxeptionDemo
 */
public class ExcxeptionDemo {

    public static void main(String[] args) {
        try {
            String d = null;
            System.out.println(d.length());
        } catch (Exception e) {
            System.out.println("Null String");

        } finally {
            System.out.println("This is finally block");
        }
    }
}
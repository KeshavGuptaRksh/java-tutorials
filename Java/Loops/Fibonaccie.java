package Loops;

//Program to create fibonacci series
// 0 1 1 2 3 5 ....

public class Fibonaccie {
    public static void main(String[] args) {
        int first = 0, sec = 1, third, i;
        System.out.print(first + " " + sec + " ");
        for (i = 3; i <= 10; i++) {
            third = first + sec;
            System.out.print(third + " ");
            first = sec;
            sec = third;
        }
    }
}

import java.util.Scanner;

public class Shifting {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String txt;
        txt= sc.nextLine();
        Shifting ob = new Shifting();
        ob.checkValidity(txt);
        ob.arrange(txt);
    }
    void checkValidity(String txt) {
        if (txt.endsWith("!") || txt.endsWith("?") || txt.endsWith(".")) {
            System.out.println("Valid text");
        } else {
            System.out.println("Invalid text");
        }
    }
    void arrange(String txt){
        String words[] = txt.split(" ");
        String temp;
        int pos,i;
        char ch;
        for(i=0;i<words.length;i++){
            if(words[i].startsWith("a")||words[i].endsWith("a")){
                pos=i;
                temp=words[pos];
                for(i=pos;i>0;i--){
                    words[i]=words[i-1];
                }
                words[0]=temp;
            }
        }
        for(String w:words)
        System.out.print(w+" ");
    }
}

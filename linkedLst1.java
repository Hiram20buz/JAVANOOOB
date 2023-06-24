import java.util.LinkedList;
import java.util.Scanner;
public class linkedLst1 {
    public static void main(String[ ] args) {
            Scanner scanner = new Scanner(System.in);
        LinkedList<String> words = new LinkedList<String>();
        while(words.size()<5){
            String word = scanner.nextLine();
            words.add(word);
        }

                for (String w : words){
                        if (w.length()>4){
                                System.out.println(w);
                        }
                }
    }
}

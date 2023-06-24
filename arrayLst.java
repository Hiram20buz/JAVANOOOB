import java.util.ArrayList;
import java.util.Scanner;
public class arrayLst {
    public static void main(String[ ] args) {
            Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> evennums = new ArrayList<Integer>();
        int sum = 0;
        while(evennums.size()<3){
            int num = scanner.nextInt();
            evennums.add(num);
            sum += num;
        }

        System.out.print(sum/3);
    }
}

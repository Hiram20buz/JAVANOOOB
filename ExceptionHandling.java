import java.util.Scanner;

public class ExceptionHandling
{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            String[] categories = {"PCs", "Notebooks", "Tablets", "Phones", "Аccessories"};

            try {
                System.out.print(categories[choice]);
            }
        catch(Exception e){
              System.out.print("Wrong Option");
            }
        }
}

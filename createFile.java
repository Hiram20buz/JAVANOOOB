import java.util.Formatter;

public class createFile {
   public static void main(String[ ] args) {
  try {
    Formatter f = new Formatter("test.txt");
  } catch (Exception e) {
      System.out.println("Error");
  }
  }
}

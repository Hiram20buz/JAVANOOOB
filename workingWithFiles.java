import java.io.File;

public class workingWithFiles {
  public static void main(String[ ] args) {
    File x = new File("./data/test.txt");
    if(x.exists()) {
     System.out.println(x.getName() +  "exists!");
    }
    else {
     System.out.println("The file does not exist");
    }
  }
}

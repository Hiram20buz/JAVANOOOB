import java.util.HashMap;
public class hashMap {
  public static void main(String[ ] args) {
    HashMap<String, Integer> points = new HashMap<String, Integer>();
    points.put("Amy", 154);
    points.put("Dave", 42);
    points.put("Rob", 733);
    System.out.println(points.get("Dave"));
  }
}

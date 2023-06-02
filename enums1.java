//javac enums1.java
//java Main
class Main {
    public static void main(String[] args) {
        enums1 player1 = new enums1(Difficulty.EASY);
        enums1 player2 = new enums1(Difficulty.MEDIUM);
        enums1 player3 = new enums1(Difficulty.HARD);
   }
}
enum Difficulty {
    EASY,
    MEDIUM,
    HARD
}
public class enums1{
   
enums1(Difficulty diff){
 switch(diff){
  case EASY:System.out.println("You have 3000 bullets");
  break;
  case MEDIUM:System.out.println("You have 2000 bullets");
  break;
  case HARD:System.out.println("You have 1000 bullets");
  break;
        }
    }
}

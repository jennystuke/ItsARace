import java.util.*; // for Scanner

public class ItsARace {
    public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      introduction(console);
    }
    
    //give the players a thorough understanding of what the game will entail
    public static void introduction(Scanner input) {
      System.out.println("It's a race! You've been selected for the ultimate ");
      System.out.println("roadtrip competition! But you won't find cheetos ");
      System.out.println("and mixtapes here. This roadtrip is a high speed and ");
      System.out.println("dangerous race that will have $1,000,000 at the finish line ");
      System.out.println("for the driver who safely returns in the shortest ");
      System.out.println("amount of time. Where are you headed? Miami. ");
      System.out.println("You will begin this journey at Balboa Park in ");
      System.out.println("San Diego, CA and will drive 2,652 miles to ");
      System.out.println("Bayfront Park in Miami, FL. Once there, you will ");
      System.out.println("be given a red hankerchief. You will then drive back ");
      System.out.println("to Balboa Park where you will discover the fate of ");
      System.out.println("your journey. You will each be given $5,000 up "); 
      System.out.println("front to cover costs of the trip. Use it wisely. ");
      System.out.println("Good luck! ");
      System.out.println();
      System.out.print("Are you up for the challenge? ");
      String answer = input.next().toLowerCase();
      Person p1 = new Person("");
      if(answer.charAt(0) == 'y') {
         System.out.println("So you think you can succeed, do you?");
         System.out.print("What is your name, driver?: ");
         String name = input.next();
         p1.name = name;
         System.out.println("Good luck, " + p1.name); 
      }
      else {
         System.out.println("It's okay, not all of us can be courageous champions.");
      }
    }
}
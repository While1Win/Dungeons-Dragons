import java.util.*;
public class Game {
    //Class properties
    private Character toto;
    private Random dice;
    private Scanner sc;
    private int currentPosition;
    

    //Constructor
    public Game (Character player){
        this.toto = player;
        this.currentPosition = 1;
        this.dice = new Random();
        this.sc = new Scanner(System.in);
    }

    //Getters
    public Character getCharacter(){return toto;}
    public int getCurrentPosition (){return currentPosition;} 

    public int rollDice (){
        int roll = dice.nextInt(6) +1;
        System.out.println("You got " + roll);
        return roll;
    }

    public void startGame (){
        System.out.println("So it begins...");
        System.out.println("Round 1");
        System.out.println("FIGHT !!");
        
        while (currentPosition<64){
            int newRoll = rollDice();
            moveAndVerify(newRoll);    
        }
        System.out.println("Congratulations! You've reached the end of the board.");
        finishGame();
    }

    // Method to change the Current position and verify the boarders
    public void moveAndVerify (int position){
        currentPosition += position;
        if (currentPosition > 64){
            currentPosition = 64;
        }
        System.out.println(toto.getName() +"!! You reached " + currentPosition + "th case");
    }

    public void finishGame (){
        System.out.println("Choose wisely !!");
        System.out.println("1. Quit the game");
        System.out.println("2. Restart the game");
        int choice = sc.nextInt();
        if (choice == 1){
            System.out.println("quiting, see you soon");
        } else if (choice == 2){
            restart();
        } else {
            System.out.println("Wrong Choice !!");
        }

    }

    public void restart(){
        this.currentPosition = 1;
        startGame();
    }




}

import java.util.Scanner;
import java.util.Random;


public class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] guesses ={"peter","programming","computer","science","mutuura","mayai","royco"};
        boolean weArePlaying=true;

        while(weArePlaying){
            System.out.println("Welcome to HangMan Game");
            //random int between guesses.length,from 0 to end of array
            int randomint =random.nextInt(guesses.length);
            //toCharArray converts the selected word to an array of characters eg donuts -> {'d','o','n','u','t','s'}
            char[] randomWordToGuess=guesses[randomint].toCharArray();
            int amountofGuesses = randomWordToGuess.length;//how many times we want the player to guess
            char[] playerGuess= new char[amountofGuesses];//create an empty char array for saving user input

            for(int i=0; i<playerGuess.length;i++){
                playerGuess[i]='_';

            }

            //another loop where guessing takes part


            boolean wordIsGuessed= false;

            int tries =0;
            while(!wordIsGuessed&&tries!=amountofGuesses){
                System.out.print("Current guesses : ");
                printArray(playerGuess);
                System.out.printf("You have %d tries left .\n",amountofGuesses-tries);
                System.out.println("Enter A Single Character");

                char input =scanner.nextLine().charAt(0);//takes first character incase user enters a word
                //if the user enters nothing the game stops
                tries++;

                if(input=='-'){
                    weArePlaying=false;
                    wordIsGuessed=true;
                }else{
                    //user enters a valid character
                    for (int i =0;i<randomWordToGuess.length;i++){
                        if(randomWordToGuess[i]==input){
                            playerGuess[i]=input;
                        }
                    }
                    if(isTheWordGuessed(playerGuess)){
                        wordIsGuessed=true;
                        System.out.println("Congratulations You won");
                    }
                }

            }
                if(!wordIsGuessed){
                    System.out.println("You Ran out of Guesses : /n");
                    System.out.println("Do you want to player another Game? (yes/no)");
                    String anotherGame =scanner.nextLine();
                    if(anotherGame.equals("no")){
                        weArePlaying =false;
                    }
                }

        }
        System.out.println("Game Over Human!!");
    }

    public static void printArray(char[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static boolean isTheWordGuessed(char[] array){
        for (int  i =0; i < array.length;i++){
            if(array[i] == '_')return false;
        }
        return true;
    }
}
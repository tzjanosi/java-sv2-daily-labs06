package day04.hangman;
import java.util.Locale;
import java.util.Scanner;

public class HangmanMain {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new HangmanMain().run();
    }

    private void run() {
        String wordToFind="alma";
        String wordFound=CreateWordFound(wordToFind);
        System.out.println(wordToFind+" -> "+wordFound);
        int chances=8;
        String input;
        String guess;
        do{
            System.out.println(wordFound);
            System.out.println("You still have "+chances+" more chance(s)");
            System.out.println("What is your next guess?");
            input = scanner.nextLine();
            guess=input.toLowerCase();
            wordFound=updateWordFound(wordToFind, wordFound, guess);
            chances--;
        }
        while(chances>0 && !wordToFind.equals(wordFound));

        if(wordToFind.equals(wordFound)){
            System.out.println("You solved it!");
        }
        else{
            System.out.println("Maybe next time ...");
        }


    }

    private String CreateWordFound(String wordToFind) {
        StringBuilder outputSB=new StringBuilder();
        for (int i = 0; i < wordToFind.length(); i++) {
            outputSB.append('_');
        }
        return outputSB.toString();
    }

    private String updateWordFound(String wordToFind, String status, String guess) {
        char[] chars = status.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (wordToFind.charAt(i) == guess.charAt(0)) {
                chars[i] = guess.charAt(0);
            }
        }
        return new String(chars);
    }


}

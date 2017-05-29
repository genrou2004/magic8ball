package magic8ball;

import java.util.Random;
import java.util.Scanner;

public class MagicEightBall {

    public static void main(String[] args) {

        String[] values = {"It is certain",
                "It is decidedly so",
                "Without a doubt",
                "Yes definitely",
                "You may rely on it",
                "As I see it, yes",
                "Most likely",
                "Outlook good",
                "Yes",
                "Signs point to yes",
                "Reply hazy try again",
                "Ask again later",
                "Better not tell you now",
                "Cannot predict now",
                "Concentrate and ask again",
                "Don't count on it",
                "My reply is no",
                 "My sources say no",
                "Outlook not so good",
                "Very doubtful"};
        
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        String answer ="";
        
        do{
         int select = rand.nextInt(values.length); 
        System.out.println("Will I win the lottery tomorrow? ");
        System.out.println(values[select]);
        System.out.println("Do you have another question for the Magic 8-Ball? (y/n)");
        answer = scan.nextLine();
        }while(answer.equalsIgnoreCase("Y"));
    }

}

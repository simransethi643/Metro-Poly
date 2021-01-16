import java.util.Scanner;
import java.util.Random; import java.util.*;
public class MetroPoly {
    public static int puzzle(int balance){
        System.out.println("Oh no, you have 0/negative balance.\nNow, we will give you a chance to win money!");
        Map<String, String> dictionaryName = new HashMap<String, String>();
        dictionaryName.put("Who can travel the world by staying on a corner?",  "Stamp");
        dictionaryName.put("What has to be broken before you use it?",  "Egg");
        dictionaryName.put("What goes up, and never goes down?",  "Age");
        dictionaryName.put("What has many keys but can't open a lock?", "Piano");
        dictionaryName.put("What tastes better than it smells?", "Tongue");
        dictionaryName.put("I am an odd number. Take away a letter and I become even. What number am I?", "Seven");
        dictionaryName.put("Which month has 28 days?", "All of them");
        dictionaryName.put("Which eleven letters word is always spelled incorrectly?", "Incorrectly");
        dictionaryName.put("What kind of tree can you carry in your hands?", "Palm");
        dictionaryName.put("What is something you will never see again?", "Yesterday");
        
        String[] questions = new String[10];
        questions[0] = "Who can travel the world by staying on a corner?";
        questions[1]= "What has to be broken before you use it?";
        questions[2]= "What goes up, and never goes down?";
        questions[3]= "What has many keys but can't open a lock?";
        questions[4] = "What tastes better than it smells?";
        questions[5]= "I am an odd number. Take away a letter and I become even. What number am I?";
        questions[6]= "Which month has 28 days?";
        questions[7]= "Which eleven letters word is always spelled incorrectly?";
        questions[8]= "What kind of tree can you carry in your hands?";
        questions[9]= "What is something you will never see again?";
        
        Random random = new Random();
        int randomInt = random.nextInt(10);
        String value = dictionaryName.get(questions[randomInt]);
        System.out.print(questions[randomInt] + " ");
        Scanner myObj = new Scanner(System.in);
        String answer = myObj.nextLine();
        if (answer.toUpperCase().equals(value.toUpperCase())){
            System.out.println("Good job on getting the answer correct!");
            balance += random.nextInt(501) + 100;
        }
        
        System.out.println("Current balance: $" + balance);
    
        if (balance <= 0) {
            System.out.println("Your luck ran out today!");
            System.out.println("Your balance is still 0 or negative, so you lost the game!");
            System.exit(0);
        }

        return balance;
    }
    
    public static int dice (int balance) {
        System.out.print("Choose a number between 1 to 12: ");
        Scanner myObj = new Scanner(System.in);
        Integer answer = Integer.valueOf(myObj.next());
        Random random = new Random();
        int randomInt = random.nextInt(12) + 1;
            
        if (answer == randomInt) {
            int money_earned = random.nextInt(501) + 100;
            System.out.println ("Congrats!! You earned $" + money_earned);
            balance += money_earned;
        }
        else {
            System.out.println("Jokes on you!! You just lost $200");
            balance -= 200;
        }

        System.out.println("Current balance: $" + balance);
            
        return balance;
    }

    public static void main(String[] args){
        Random random = new Random();
        Scanner myObj = new Scanner(System.in);
        int balance = 2000;
        System.out.println("Your current balance is $2000. You will play this game and earn or loose money as you move forward. If you end up with $0, you'll be kicked out! :)");
        System.out.println("In this game, you are a college graduate, who will start working.");
        System.out.println ("How many hours do you want to work per week?");
        int num_hours = myObj.nextInt();
        System.out.println ("What is your hourly wage?");
        int wage = myObj.nextInt();
        //Calculate salary
        int salary = num_hours * wage * 4;
        System.out.println("Your monthly salary is: $" + salary);
        balance += salary;
        System.out.println("Your current balance is: $" + balance);
        int spending = random.nextInt(balance + 1);
        System.out.println("You spent $" + spending + " this month.");
        balance -= spending;
        System.out.println ("Current balance: $" + balance);
        System.out.println("Now we are going to play a game where you will guess a random number from 1 to 12. \nAfter that we will roll the dice and if your guess matches with the dice you will receive a random amount of money from $100-$600. \nAnd if your guess doesn't match you lose $200! You will have infinite chances to make fortune or lose! Once your balance reaches $5000, you win!");
        
        while (balance > 0) {
            balance = MetroPoly.dice(balance);
            if (balance >= 5000) {
                break;
            }
        }

        if (balance <= 0) {
            balance = MetroPoly.puzzle(balance);
        }

        System.out.println("You won the game with a balance of " + balance + "!");
    }
}

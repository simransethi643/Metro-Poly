import random
import sys

def puzzle(balance):
    print("Ding ding ding! You are about to be homeless!")
    print("Now, we will give you a chance to win money.")

    puzzles = {"Who is always getting bothered by boys?" : "Luna",
            "Who has done 7 hackathons?": "Simran",
            "What goes up, and never goes down?": "Age",
            "Who has great sarcasm?": "Samira",
            "Who is one of the people who goes to GMU here?": "Meghana"}

    key = random.choice(list(puzzles))
    print(key, end = " ")
    answer = input()
    if (answer.capitalize() == puzzles[key].capitalize()):
        print("Good job on getting the answer correct!")
        balance += random.randint(100,600)
        print("Current balance: $" + str(balance))
        return balance
    else:
        print("Your luck ran out today!")
        print("Your balance is still 0 or negative, so you lost the game!")
        sys.exit(0)
            

def dice(balance):
    i=0
    while i<3:
        guess = int(input("Choose a number between 1 to 12:"))
        dice = random.randint(1,12)
        if guess == dice:
            money_earned = random.randint(100,600)
            print("Congrats!! You earned $" +str(money_earned))
            balance +=money_earned
        else:
            print("Jokes on you!! You just lost $200")
            balance -=200
        i+=1
        print("Current balance: $" + str(balance))
        if balance <=0:
            puzzle()
    return balance

# Metro-Poly

# first level/introduction: The player will start game with

# choosing between working or studying
balance = 2000
print("Your current balance is $2000. You will play this game and earn or loose money as you move forward. If you end up with $0, you'll be kicked out! :)")
decision = input("Do you want to work?Y/N ")

if (decision == "Y"):
    num_hours = int(input("How many hours do you want to work per week?"))
    wage = int(input("What is your hourly wage?"))
    #Calculate salary
    salary = num_hours * wage * 4
    print("Your monthly salary is $" +str(salary))
    balance += salary
    print("Your current balance is: $" + str(balance))
    spending = random.randint (1,balance)
    print("You spent $"+str(spending)+ " this month.")
    balance -= spending
    print("Current balance: $" + str(balance))
    print("Now we are going to play a game where you will guess a random number from 1 to 12. \nAfter that we will roll the dice and if your guess matches with the dice you will receive a random amount of money from $100-$600. \nAnd if your guess doesn't match you loose $200 hahahah! You will have 3 chances to make fortune or loose!")
    balance = dice(balance)
    if balance <=0:
        balance = puzzle()
  



# Decide how many hours to spend for college and how many hours of study
# Decide how many hours of work
# Decide how many hours of free time
# Decide how many hours of rest"
# choosing between working or studying
    
# start choosing where to save the money in a bank (have at least two banks)

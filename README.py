import random
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
  print("You spent $"+str(spending)+ " this month")
  balance -= spending
  print("Current balance: $" + str(balance))
#Guess a number from 1-6. We'll roll the dice and if it matches with the player's guess, they get money

# start choosing where to save the money in a bank (have at least two banks)
#bank = input("Choose Bank A or Bank B")


# Decide how many hours to spend for college and how many hours of study
# Decide how many hours of work
# Decide how many hours of free time
# Decide how many hours of rest"
# choosing between working or studying
    
# start choosing where to save the money in a bank (have at least two banks)

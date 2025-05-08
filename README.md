My code is a simple password checker program written in Java. Here's what it does:

Initial Setup:

A hardcoded password, "KhubaibHusain", is defined in the variable password.

The program uses a Scanner object to read user input.

Password Checking Loop:

The program enters a do-while loop, which will repeatedly ask the user for a password until they enter the correct one.

User Input and Validation:

Inside the loop, the program asks the user to enter a password using System.out.print("Enter your password: ");.

It then compares the entered password (pass) with the hardcoded password.

If the entered password is incorrect (doesn't match the predefined one), it prints "Access Denied".

If the entered password is correct, it prints "Access Granted" and exits the loop.

Loop Exit Condition:

The loop will continue to run as long as the entered password is not equal to the correct password (password.equals(pass)).

Once the correct password is entered, the loop ends.

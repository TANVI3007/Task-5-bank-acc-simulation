# Task-5-bank-acc-simulation
## Objective
Simulate a basic bank account system using Java and Object oriented programming
## Features
- Deposit money
- Withdraw money
- View balance
- View full transaction history
- CLI-based interactive system
## Concepts used
- Classes & Objects
- Data encapsulation
- Exception handling
- ArrayList for transaction logs
- User input via scanner
## Explanation
- Account class
Account holders name
Account number
Current balance
A list to store transaction history
- Fields
accountHolder
accountNumber
balance
transaction
- deposit()
If amount is valid, it adds it to balance
Adds a message and details to transaction history
Shows a success message
- withdraw()
If amount is valid and user has enough money it subtracts from balance
Adds a message and details to transaction history
Shows a success message
- viewBalance()
Shows the current balance in the account
- viewTransactionHistory()
Prints each transaction in history list
- BankApp class
Account creation
Menu system
Menu choices

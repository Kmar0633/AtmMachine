# Banking System
## Introduction
This program program simulates the operations of an online Banking system used in banks such as Commonwealth bank by the tellers and admins. 
## Usage
The program will begin with a welcome message and ask you to input a command:
```
Welcome to The Star Bank!
>
```

If the command entered isn't any of the below then the system will output an error message and ask if you want to continue:
```
Welcome to The Star Bank!
> e
ERROR: Command invalid
Do you still want to continue? Y/N 

```

In this program, you enter the following commands in the terminal:

### 1. Deposit

Allows the staff to deposit an amount of money in a customer's account. The system will ask the staff of the customer's BSB, account number and the amount of money to be deposited. The staff should enter integers in the BSB, Account number and numerical values into the amount of money to deposit :
```
> Enter BSB: 1234
> Enter account number: 1234
> Enter amount to deposit: $100

```
If the account or BSB number doesn't exist in the databse then the system will output:
```
ERROR: BSB does not exist
ERROR: Account Number does not exist

```
If the account and BSB number exists, then the system will output:
```
Deposit Successful!

```
### 2. Withdraw 
Allows the staff to withdraw an amount of money from a customer's account. 

The system will ask the staff of the customer's BSB, account number and the amount of money to be withdrawn. The staff should enter integers in the BSB, Account number and numerical values into the amount of money to withdraw:
```
> Enter BSB: 1234
> Enter account number: 1234
> Enter amount to withdraw: $10

```
If the account or BSB number doesn't exist in the databse then the system will output:

```
ERROR: BSB does not exist
ERROR: Account Number does not exist
```

If the account and BSB number exists and the amount of money withdrawn is smaller or equal to the one in the account, then the system will output:

```
Withdrawl Successful!
```

If the amount of money withdrawn is bigger than the amount in the customer's bank account then the system will output:

```
ERROR: Withdrawn Amount is greater than current balance
```


### 3. Add Account
Allows the staff to add a new bank account to the database. 

The banking system asks the staff for the user's bank details so they can input the new user's bank details into the system. The staff should enter the first name and last names of the customers as string representations,  integer values in the BSB, Account number as well as numerical values into the balance:

```
> Enter First Name: Kevin
> Enter Last Name: Marcelino
> Enter BSB: 02321
> Enter Account Number: 12382071
> Enter Balance: $1023
```

### 4. Search Account
Allows the staff to search a customer's bank account in the database.

The banking system asks the staff for the user's account number. The staff should enter the customer's account number to search for it:

```
> Search Account Number: 123
```
If the customer's account number doesnt exist in the database, then the system will output an error message:
```
ERROR: No results found
```

If the customer's account number exists in the database, then the system will output the customer's details and balance:
```
> Search Account Number: 12

First Name: john
Last Name: marco
BSB: 12
Account Number: 12
Balance: $10000.0

```

### 5. Show Accounts- Allows the staff to show all the customers' bank accounts in the database.


```
> show accounts
First Name: k
Last Name: m
BSB: 2
Account Number: 2321
Balance: $300.0

First Name: Kevim
Last Name: Marcelino
BSB: 1234
Account Number: 1234
Balance: $190.0

```
### 6. Delete account
Allows the staff to delete a customer's account in the database.
The banking system asks the staff for the user's account number to be deleted. The staff should enter the customer's account number and confirm with Y (Yes) or N (No) to delete it:
```
> delete account

Delete account number: 1234
Delete Account?: Y
```
If the account exists then the system will output:
```
Account succesfully deleted!
```
### 7. Display menu
Allows the staff to display a menu of all the commands available in the program.
```
> display menu

Add Account     add a new account to the database
Search Account      Search an account in the database
Delete account      Delete an account in the database
Withdraw     Withdraw an amount from a customer
Deposit     Deposit an amount to a customer
Show Accounts Show all the customers' accounts
Quit  Quits the program
```

### 8. Quit
Allows the user to quit the program.
```
>quit
Goodbye!
```

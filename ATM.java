import java.util.Scanner;
import java.util.*;
public class Atm{


public LinkedHashMap<Integer, Account> database = new LinkedHashMap<Integer, Account> ();
public HashMap<Integer, Integer> BsbAccNum = new HashMap<Integer, Integer>();
public Account CurrAcc=null;
public int placeholder=0;


  public void check(Scanner scan){
    System.out.println("Check");
  }

  public void showMessage(Scanner scan){
    System.out.print("Do you still want to continue? Y/N ");
    String message=scan.nextLine();
    if(message.equals("N")){
      System.out.println("Have a nice day!");
      System.exit(0);
    }
  }
  public static void main(String[] args){
    Atm p1=new Atm();
    Account a1=new Account("k","m",2,2321,300);
    p1.BsbAccNum.put(2,2321);
    p1.database.put(2321,a1);
    //Account p2=new Account(f_n,l_n,BSB,account_num);
    Scanner scan=new Scanner(System.in);

    while (true){

      System.out.println("Welcome to The Star Bank!");
      System.out.print("> ");
      String input=scan.nextLine();
      String input1=input.toLowerCase();


      if (input1.equals("display menu")){
        System.out.println();
        System.out.println("Add Account     add a new account to the database");
        System.out.println("Search Account      Search an account in the database");
        System.out.println("Delete account      Delete an account in the database");
        System.out.println("Withdraw     Withdraw an amount from a customer");
        System.out.println("Deposit     Deposit an amount to a customer");
        System.out.println("Transfer    Transfer a customers money to another customer");
        System.out.println("Show Accounts Show all the customers' accounts");
        System.out.println();
        }

      else if(input1.equals("show accounts")){
        for (Integer key : p1.database.keySet()) {

            System.out.println(p1.database.get(key).getBankDetails());
            System.out.println();
          }
        p1.showMessage(scan);

      }
      else if(input1.equals("transfer")){
        System.out.println();
        System.out.print("Enter sender's BSB: ");
          String bsb=scan.nextLine();
          BsbInt=Integer.parseInt(bsb);
        System.out.print("Enter sender's account number: ");
        String AccNum =scan.nextLine();
        int AccNumInt =Integer.parseInt(AccNum);

        System.out.print("Enter amount to transfer: $");
        String DespositAmount=scan.nextLine();
        double DepositAmount1=Double.parseDouble(DespositAmount);



      }
      else if(input1.equals("delete account")){
        try{
            System.out.println();
            System.out.print("Delete account number: ");
            String AccNum=scan.nextLine();
            Integer AccNumb=Integer.parseInt(AccNum);

        if(p1.database.containsKey(AccNumb)==false){
          System.out.println("ERROR: No results found");
          System.out.println();

        }

        else{
            System.out.print("Delete Account?: ");
            String delacc=scan.nextLine();
          if(delacc.equals("Y")){
            for (Integer key : p1.database.keySet())
                      {


      // ...
      if(key.equals(AccNumb)){
        System.out.println();
        p1.database.remove(AccNumb);
        System.out.println("Account succesfully deleted!");
        System.out.println();

                                }
                      }
            }

  }
  }

  catch(NumberFormatException e){
    System.out.println();
    System.out.println("Invalid Input");

  }
  p1.showMessage(scan);
  System.out.println();

      }
      else if(input1.equals("deposit"))
      {

try{
        int BsbInt=0;
          System.out.println();
          System.out.print("Enter BSB: ");

            String bsb=scan.nextLine();

            BsbInt=Integer.parseInt(bsb);


        //  System.out.println("ERROR: Invalid BSB");

          System.out.print("Enter account number: ");
          String AccNum =scan.nextLine();
          int AccNumInt =Integer.parseInt(AccNum);

          System.out.print("Enter amount to deposit: $");
          String DespositAmount=scan.nextLine();
          double DepositAmount1=Double.parseDouble(DespositAmount);




          System.out.println();

          if(p1.BsbAccNum.containsKey(BsbInt)==false){
            System.out.println("ERROR: BSB does not exist");

          }
          if(p1.BsbAccNum.containsValue(AccNumInt)==false){
            System.out.println("ERROR: Account Number does not exist");
          System.out.println();
          }
          else
            {

          for (Integer key : p1.database.keySet())
          {
    if(key==AccNumInt && BsbInt==p1.database.get(key).getBsb())
                  {
      p1.database.get(key).deposit(DepositAmount1);
                    }
          }
            }
            p1.showMessage(scan);
          }

catch (NumberFormatException e){
  System.out.println();
  System.out.println("ERROR: Invalid Input");
  System.out.println();
}
        }


      else if(input1.equals("withdraw")){
      try{
        System.out.println();
        System.out.print("Enter BSB: ");
        String bsb=scan.nextLine();

        int BsbInt=Integer.parseInt(bsb);

        System.out.print("Enter account number: ");
        String AccNum =scan.nextLine();

        int AccNumInt =Integer.parseInt(AccNum);
        System.out.print("Enter amount to withdraw: $");
        String withdrawnAmount=scan.nextLine();
        double withdrawnAmount1=Double.parseDouble(withdrawnAmount);

        System.out.println();
        if(p1.BsbAccNum.containsKey(BsbInt)==false){
          System.out.println("ERROR: BSB does not exist");

        }
        if(p1.BsbAccNum.containsValue(AccNumInt)==false){
          System.out.println("ERROR: Account number does not exist");

        }



        else{
        for (Integer key : p1.database.keySet())
                          {
  // ...
  if(key==AccNumInt && BsbInt==p1.database.get(key).getBsb())
                                  {
    p1.database.get(key).withdraw(withdrawnAmount1);
                                    }

                          }
                }
p1.showMessage(scan);
}
catch(NumberFormatException e){
  System.out.println();
  System.out.println("ERROR: Invalid input");
  System.out.println();
}
      }
else if(input1.equals("transfer")){

}
    else if (input1.equals("search account")){

      try{
          System.out.println();
          System.out.print("Search Account Number: ");
          String AccNum=scan.nextLine();
          Integer AccNumb=Integer.parseInt(AccNum);

      if(p1.database.containsKey(AccNumb)==false){
        System.out.println("ERROR: No results found");
        System.out.println();

      }

      else{
          for (Integer key : p1.database.keySet()) {


    // ...
    if(key.equals(AccNumb))
    {
      System.out.println();
      System.out.println(p1.database.get(key).getBankDetails());
      System.out.println();

                }
}
}
}

catch(NumberFormatException e){
  System.out.println();
  System.out.println("ERROR: Invalid input");

}
p1.showMessage(scan);
System.out.println();

          // Iterator it = p1.database.entrySet().iterator();
          // while (it.hasNext())
          //   {
          //   LinkedHashMap.Entry<Integer, Account> pair = (LinkedHashMap.Entry)it.next();
          //   System.out.println(pair.getKey() + " = " + pair.getValue());
          //   it.remove(); // avoids a ConcurrentModificationException
            //}
}
      else if(input1.equals("add account")){
        try{
          System.out.println();
          System.out.print("Enter First Name: ");
          String f_n=scan.nextLine();

          System.out.print("Enter Last Name: ");
          String l_n=scan.nextLine();



          System.out.print("Enter BSB: ");
          String bsb=scan.nextLine();
          int BsbInt=Integer.parseInt(bsb);
          System.out.print("Enter Account Number: ");
          String AccNum =scan.nextLine();
          int AccNumInt =Integer.parseInt(AccNum);
          System.out.print("Enter Balance: $");
          String balance=scan.nextLine();

          double BalanceDouble=Double.parseDouble(balance);
          System.out.println();

          System.out.print("Are the details above correct? Y/N ");
          String statement=scan.nextLine();
          System.out.println();



         if(statement.equals("Y")){

           if(p1.BsbAccNum.containsValue(AccNumInt)==true)
           {
               System.out.println("ERROR: Account already exists");
               System.out.println();
               }
            else{
           Account p2=new Account(f_n,l_n,BsbInt,AccNumInt,BalanceDouble);
           p1.database.put(AccNumInt,p2);
           p1.BsbAccNum.put(BsbInt,AccNumInt);
                  }
            }


          }
          catch(NumberFormatException e){
          System.out.println();
          System.out.println("ERROR: Invalid input");
          System.out.println();
        }
          //Account p2=new Account(f_n,l_n,BSB,account_num);
          p1.showMessage(scan);
        }
        else{
          System.out.println("ERROR: Command invalid");
          p1.showMessage(scan);
        }


                }
          }
    }

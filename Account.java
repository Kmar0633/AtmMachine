public class Account{
public String first_name;
public String last_name;
public int bsb;
public int account_number;


public Double bal;
public Account(String first_name,String last_name,int bsb,int account_number,double bal){
    this.first_name=first_name;
    this.last_name=last_name;
     this.bsb=bsb;
     this.account_number=account_number;
     this.bal=bal;
   }

public String getFirst_name(){
  return first_name;
  }

  public String getLastName(){
    return last_name;
    }
    public int getBsb(){
      return bsb;
      }
      public int getAccountNumber(){
        return account_number;
        }
      public Double getBalance(){
        return bal;
      }
      public String getBankDetails(){
        String bsbText = Integer.toString(bsb);
        String acc_numText = Integer.toString(account_number);
          String BalanceText = Double.toString(bal);
        return "First Name: "+first_name+"\n"+"Last Name: "+last_name+"\n"+"BSB: "
        +bsbText+"\n"+"Account Number: "+acc_numText+"\n"+"Balance: $"+BalanceText;
      }
      public void deposit(double DespositAmount2){


        if(DespositAmount2<0){
          System.out.println("ERROR: Deposit Amount is less than zero");
        }
        else{
          bal=bal+DespositAmount2;
          System.out.println("Deposit Successful!");
        }
        System.out.println();
      }
      public void withdraw(double withdrawnAmount2){

        if(bal<withdrawnAmount2){
          System.out.println("ERROR: Withdrawn Amount is greater than current balance");
        }
        else if(withdrawnAmount2<0){
          System.out.println("ERROR: Withdrawn Amount is less than zero");
        }
        else{
          bal=bal-withdrawnAmount2;
          System.out.println("Withdrawl Successful");

        }
        System.out.println();
      }
}

// how can we achived Encapsulation in java ? example code
public class HdfcBank
{
private String accountHolder;
private double balance;

public void setAccountHolder(String accountHolder)
{
       this.accountHolder=accountHolder;
}
public String getAccountHolder()
{
    return accountHolder;
}


public void setBalance(double balance)
{
             this.balance=balance;
}

public double getBalance()
{
return balance;
}


public void withdraw(double amt)
{
   if(amt>0 && amt<=balance){
balance-=amt;

System.out.println("---------------------------------------------");
System.out.println("AccountHolder Name :"+accountHolder);

System.out.println("you have debited  :"+amt+"\nyour remaining balance is :"+balance);
System.out.println("---------------------------------------------");

}
}

public void deposite(double amt)
{
   balance+=amt;
System.out.println("---------------------------------------------");
System.out.println("AccountHolder Name :"+accountHolder);

System.out.println("you have created :"+amt+"\ntotal acount balance is: "+balance);
System.out.println("---------------------------------------------");

}



public static void main(String[] args)
{ 

HdfcBank hdfc = new HdfcBank();
hdfc.setAccountHolder("vishal");

hdfc.setBalance(2000);
System.out.println(hdfc.getBalance());
hdfc.withdraw(1500);
hdfc.deposite(500);








}

}
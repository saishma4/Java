public class BharatBank {
    double balance;
    String accountType;
    public BharatBank(double balance, String accountType){
        this.balance=balance;
        this.accountType=accountType;
    }
    public void deposit(double amount)
    {
        this.balance+=amount;

    }
    public void withdraw(double amount){
        this.balance+=this.Interest();
        if(this.balance>amount){
            this.balance-=amount;
        }
        else {
            if(this.accountType.equalsIgnoreCase("current")&& this.balance>0 && amount<=this.balance*1.2){
                this.balance-=amount;
            }
            else {
                System.out.println("No Sufficient Balance");
            }
        }
    }
    public double Interest(){
        if(this.accountType.equalsIgnoreCase("current"))
            return  0;
        else
            return this.balance*0.03*0.25;
    }
    public static void main(String[] args){
        BharatBank gopalAccount = new BharatBank(50000, "Current");
        BharatBank amritaAccount = new BharatBank(100000,"Savings");
        gopalAccount.deposit(10000);
        amritaAccount.withdraw(45000);
        System.out.println(gopalAccount.Interest());
        System.out.println(amritaAccount.Interest());
        gopalAccount.withdraw(70000);
    }

}

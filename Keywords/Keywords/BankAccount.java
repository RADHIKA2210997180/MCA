public class BankAccount {
    static String bankname = "ABC BANK";
    static int totalaccount = 0;
    private String accountholdername;
    private final int accountnumber;
    private double balance;
    BankAccount(int accountnumber , String accountholdername, double balance){
        this.accountnumber = accountnumber;
        this.accountholdername = accountholdername;
        this.balance = balance;
        totalaccount++;
    }
    public void display(){
        System.out.println("Bank Name : "+ bankname);
        System.out.println("- - - - - - - - - - - - - - - -");
        System.out.println("Account Holder Name : "+accountholdername);
        System.out.println("Account number : "+accountnumber);
        System.out.println("Balance : "+balance);
        System.out.println("- - - - - - - - - - - - - - - -");
    }
    public static void noofaccounts(){
        System.out.println("Total Number of Accounts : "+totalaccount);
    }
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(10203040, "Radhika", 50000);
        BankAccount b2 = new BankAccount(1302040, "Sehaj", 40000);
        if(b1 instanceof BankAccount){
            b1.display();
        }
        if(b2 instanceof BankAccount){
            b2.display();
        }
        BankAccount.noofaccounts();
    }
}

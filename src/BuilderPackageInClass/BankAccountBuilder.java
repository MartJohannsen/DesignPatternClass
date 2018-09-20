package BuilderPackageInClass;

/**
 * Created by Martin on 20-09-2018.
 */
public class BankAccountBuilder
{
    private int ID;
    private String ownerName;
    private String accountName;
    private int balance;

    public BankAccountBuilder(int ID)
    {
        this.ID = ID;
    }

    public BankAccountBuilder setID(int ID)
    {
        this.ID = ID;
        return this;
    }

    public BankAccountBuilder setOwnerName(String ownerName)
    {
        this.ownerName = ownerName;
        return this;
    }

    public BankAccountBuilder setAccountName(String accountName)
    {
        this.accountName = accountName;
        return this;
    }

    public BankAccountBuilder setBalance(int balance)
    {
        this.balance = balance;
        return this;
    }

    public BankAccount build(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.setID(this.ID);
        bankAccount.setAccountName(this.accountName);
        bankAccount.setBalance(this.balance);
        bankAccount.setOwnerName(this.ownerName);
        return bankAccount;
    }
}

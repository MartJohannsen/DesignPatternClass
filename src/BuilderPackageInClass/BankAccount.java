package BuilderPackageInClass;

/**
 * Created by Martin on 20-09-2018.
 */
public class BankAccount
{
    private int ID;
    private String ownerName;
    private String accountName;
    private int balance;



    public void setID(int ID)
    {
        this.ID = ID;

    }

    public void setOwnerName(String ownerName)
    {
        this.ownerName = ownerName;

    }

    public void setAccountName(String accountName)
    {
        this.accountName = accountName;

    }

    public void setBalance(int balance)
    {
        this.balance = balance;

    }


    @Override
    public String toString()
    {
        return "BankAccount{" +
                "ID=" + ID +
                ", ownerName='" + ownerName + '\'' +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                '}';
    }
}

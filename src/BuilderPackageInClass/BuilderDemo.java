package BuilderPackageInClass;

/**
 * Created by Martin on 20-09-2018.
 */
public class BuilderDemo
{
    public static void main(String[] args)
    {
        BankAccount bankAccount = new BankAccountBuilder(1)
                .setAccountName("Christians account")
                .setBalance(3500)
                .setOwnerName("Christan")
                .build();

        System.out.println(bankAccount.toString());
    }
}

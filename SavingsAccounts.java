import java.util.Random;

class onlineBanking {

    String accountHolderName;
    String accountStatus;

    Random random = new Random();
    long accountNumber = random.nextLong(1000000000000L);
    int accountBalance;
    int age;

    public void accountDisplay(String accountHolderName,String accountStatus,int accountBalance,int accountNumber) {
        if(age >= 18) {
            System.out.println("accountHolderName = " + accountHolderName);
            System.out.println("accountNumber = " + accountNumber);
            System.out.println("accountStatus = " + accountStatus);
            System.out.println("accountBalance = " + accountBalance);
        }
    }
    public int withdrawMoney(int money) {
        if(accountBalance > withdrawMoney(money));
        return accountBalance = accountBalance - money;
    }
    public int deposit(int money) {
        return accountBalance = accountBalance + money;
    }
    public int transfer(int money) {
        if(accountBalance > transfer(money));
        return  accountBalance = accountBalance - money;

    }

    public static void main(String[] args) {
        onlineBanking object = new onlineBanking();
        System.out.println("Account number : " + object.accountNumber);
    }
}

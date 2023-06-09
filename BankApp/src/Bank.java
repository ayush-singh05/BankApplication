import java.util.UUID;

public class Bank implements BankAccountInterface {

    private String name;
    private String accountNo;
    private double amount;
    private String password;
    private int contact;
    final double intrest = 5.5;

    public Bank() {

    }
    public Bank(String password, String name,double balance) {
        this.password = password;
        this.name = name;
        this.amount = balance;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getIntrest() {
        return intrest;
    }

    @Override
    public String fetchBalance(String password) {
        if(this.password.equals(password)) {
            return "Amount : "+ this.amount;
        }else {
            return "Incorrect Password!";
        }
    }

    @Override
    public String addMoney(double amount) {
        this.amount += amount;
        return Double.toString(amount);
    }

    @Override
    public String withdrawMoney(String password, double amount) {
        if(this.password.equals(password)) {
            if(amount <= this.amount){
                this.amount -= amount;
                return "Money has been withdrawal successfully."+" Remaining Balance : "+ this.amount;
            }else {
                return "Insufficient Balance!";
            }
        }else {
            return "Incorrect Password!";
        }
    }

    @Override
    public String changePassword(String newPassword, String oldPassword) {
        if(this.password.equals(oldPassword)) {
            this.password = newPassword;
            return "Password Update successfully";
        }
        return "Incorrect Password!";
    }

    @Override
    public double calculateInterest(int years) {
        return (this.amount*intrest*years)/100;
    }

    @Override
    public int addContact(int num) {
        return this.contact = num;

    }
}

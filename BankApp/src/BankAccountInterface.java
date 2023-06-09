public interface BankAccountInterface {
    String fetchBalance(String password);
    String addMoney(double amount);
    String withdrawMoney(String password,double amount);
    String changePassword(String newPassword, String oldPassword);
    double calculateInterest(int years);
    int addContact(int num);
}

public class Main {
    public static void main(String[] args) {
          Bank sbi = new Bank("abc123","Ayush Singh",500000);
        System.out.println(sbi.getAccountNo());
        System.out.println(sbi.getName());
        // add money to account
        sbi.addMoney(1000);
        System.out.println(sbi.getAmount());

        System.out.println(sbi.changePassword("abc1234","abc123"));
        System.out.println(sbi.getPassword());



    }
}

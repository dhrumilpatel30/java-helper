package lab4.q4;

public class q4_ans {
    public static void main(String[] args) {
        SavingsAccount sa1=new SavingsAccount();
        sa1.deposit(5000);
        sa1.withdraw(1500);
        sa1.deposit(-1280);
        sa1.withdraw(100000);
        sa1.withdraw(-105);
    }
}

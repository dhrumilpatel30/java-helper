package lab4.q4;

public class SavingsAccount implements Account{
    double available_balance=0;
    @Override
    public void deposit(double amount) {
        try{
            if(amount < 0){
                throw new CustomExceptionforSA("The deposit amount should be positive");
            }
            available_balance+=amount;
        }catch (CustomExceptionforSA ce){
            ce.printStackTrace();
        }
    }

    @Override
    public void withdraw(double amount) {
        try{
            if(amount < 0){
                throw new CustomExceptionforSA("The deposit amount should be positive");
            }
            if(amount > available_balance){
                throw new CustomExceptionforSA("The withdraw amount is more than available balance");
            }
            available_balance-=amount;
        }catch (CustomExceptionforSA ce){
            ce.printStackTrace();
        }
    }
}

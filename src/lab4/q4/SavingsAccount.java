package lab4.q4;

public class SavingsAccount implements Account{
    double available_balance=0;
    @Override
    public void deposite(double amount) {
        try{
            if(amount < 0){
                throw new CustomExceptionforSA("The deposite ammount should be positive");
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
                throw new CustomExceptionforSA("The deposite ammount should be positive");
            }
            available_balance+=amount;
        }catch (CustomExceptionforSA ce){
            ce.printStackTrace();
        }
    }
}

package cput.ac.za;

/**
 * Created by Mandisi on 3/18/2017.
 */
public class Account {
    int accNo;
    int balance;
    String accType;

    public Account(int accNo,int balance, String accType, String contactNo) {
        this.accNo = accNo;
        this.balance = balance;
        this.accType = accType;
    }

    public String MyException(String message){
        return null;
    }

    public int getAccNo() {
        return accNo;
    }

    public int getBalance() {
        return balance;
    }

    public int method1(int balance) throws IllegalArgumentException{
        if (balance<0)
            throw new IllegalArgumentException("value cannot be negative");
        System.out.println("The positive value is " + balance );
        return 0;
    }

    public String getAccType() {
        return accType;
    }
}

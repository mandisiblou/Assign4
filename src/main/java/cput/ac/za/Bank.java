package cput.ac.za;

/**
 * Created by Mandisi on 3/18/2017.
 */
public class Bank {
    int bankId;
    int speedNo;
    int bankCode;
    String name;
    String bankAddress;
    String contactNo;

    public Bank(int bankId,int speedNo,int bankCode,String name, String bankAddress, String contactNo) {
        this.bankId = bankId;
        this.speedNo = speedNo;
        this.bankCode = bankCode;
        this.name = name;
        this.bankAddress = bankAddress;
        this.contactNo = contactNo;
    }

    public int getBankId() {
        return bankId;
    }

    public int getSpeedNo() {
        return speedNo;
    }

    public int getBankCode() {
        return bankCode;
    }

    public String getName() {
        return name;
    }

    public String getbankAddress() {
        return bankAddress;
    }

    public String getcontactNo() {
        return contactNo;
    }
}

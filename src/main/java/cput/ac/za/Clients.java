package cput.ac.za;

/**
 * Created by Mandisi on 3/18/2017.
 */
public class Clients {

    int accNo;
    String lName;
    String fName;
    int yearOfBirth;
    String clientAddress;
    String contactNo;

    public Clients(int accNo,String lName, String fName,int yearOfBirth, String clientAddress, String contactNo) {
        this.accNo = accNo;
        this.lName = lName;
        this.fName = fName;
        this.yearOfBirth = yearOfBirth;
        this.clientAddress = clientAddress;
        this.contactNo = contactNo;
    }

    public int getAccNo() {
        return accNo;
    }

    public String getlName() {
        return lName;
    }

    public String getfName() {
        return fName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getclientAddress() {
        return clientAddress;
    }

    public String getcontactNo() {
        return contactNo;
    }
}

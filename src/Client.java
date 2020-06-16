/**
 * A Client Class to add Clients
 */
public class Client {
    private String name="";
    private String nationalID = "0";
    private String address = " ";
    private String phone = "0" ;
    Account account;

    /**
     * A Client Constructors that sets the name , national id , address , phone and the account
     * @param name the new name
     * @param nationalID the new national id
     * @param address the new address
     * @param phone the new phone number
     * @param account the new account
     */

    public Client(String name, String nationalID ,String address, String phone,Account account) {
        this.name = name;
        this.nationalID = nationalID;
        this.address = address;
        this.phone = phone;
        this.account = account;
    }

    /**
     * A method to set the new name
     * @param name the new name
     */

    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * A method to return the new name
     * @return name
     */
    public String getName()
    {
        return name;
    }
    /**
     * A method to set the new national id
     * @param nationalID the new national id
     */
    public void setNationalID(String nationalID)
    {
        this.nationalID = nationalID;
    }
    /**
     * A method to return the national id
     * @return nationalID
     */
    public String getNationalID()
    {
        return nationalID;
    }
    /**
     * A method to set the new address
     * @param address the new address
     */
    public void setAddress(String address)
    {
        this.address = address;
    }
    /**
     * A method to return the address
     * @return address
     */
    public String getAddress()
    {
        return address;
    }
    /**
     * A method to set the new phone number
     * @param phone the new phone number
     */
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    /**
     * A method to return the phone number
     * @return phone
     */
    public String getPhone()
    {
        return phone;
    }

    /**
     * Overrided mtoString method to return the account number and the balance and client's data
     * @return name , national id , address , phone , account balance and account number
     */
    @Override
    public String toString() {
        System.out.println("***** YOUR INFORMATION IS *****");
        System.out.println("Your Name is : "+getName());
        System.out.println("Your National Id is : "+getNationalID());
        System.out.println("Your Address is : "+getAddress());
        System.out.println("Your Phone Number is : "+getPhone());
        System.out.println("Your Balance is : "+ account.getBalance());
        System.out.println("Your Account Number is  : "+ account.getAccountNumber());

        return super.toString();
    }
}

/**
 * A Commercial Client class extends from client class
 */
class CommercialClient extends Client
{

    private String commercialID;

    /**
     * A constructor to set name , commercial id , address , phone , client account
     * @param name new name
     * @param commercialID new commercial id
     * @param address new address
     * @param phone new phone number
     * @param clientAccount client account
     */
    public CommercialClient(String name ,String commercialID ,String address, String phone, Account clientAccount) {
        super(name, "00000000000000", address, phone, clientAccount);
        this.commercialID = commercialID;
    }


    /**
     * A method to set the new commercial id
     * @param commercialID the new commercial id
     */
    public void setCommercialID(String commercialID)
    {
        this.commercialID = commercialID;
    }

    /**
     * A method to return the commercial id
     * @return commercial id
     */
    public String getCommercialID()
    {
        return commercialID;
    }

    /**
     * overrided toString method to return company data
     * @return
     */
    @Override
    public String toString() {
        return String.format("***** COMPANY INFORMATION IS *****" + "" +
                "\n" + " Name is : "+getName() +
                "\n"+ "\n" +" Commercial Id is : "+ getCommercialID() +
                "\n" + " Address is : " + getAddress() +
                "\n" + " Phone Number is : " + getPhone()+
                "\n"+ " Balance is : " + account.getBalance() +
                "\n" + " Account Number is  : " + account.getAccountNumber());

    }
}


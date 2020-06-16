
import java.util.ArrayList;

/**
 * A Bank class to take a name and phone number and address
 */
public class Bank {

    public Bank(String n, String a, String p) {
        name = n;
        address = a;
        phone = p;
    }

    /**
     * A method to take the name
     * @param n the new person name
     */
    public void setName(String n) {
        name = n;
    }

    /**
     * A method to return the name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * A method to set the new address
     * @param a
     */

    public void setAddress(String a) {
        address = a;
    }

    /**
     * A method to return the address
     * @return address
     */

    public String getAddress() {
        return address;
    }

    /**
     * A method to take the phone number
     * @param p the new phone number
     */

    public void setPhone(String p) {
        phone = p;
    }

    /**
     * A method to return the phone number
     * @return the name
     */

    public String getPhone() {
        return phone;
    }

    /**
     * A method for adding clients
     * @param c
     */
    public void addClient(Client c) {
        clients.add(c);
        accounts.add(c.account);
    }

    /**
     * Overridied toString method
     * @return name and address and phone of the bank
     */
    @Override
    public String toString () {
        return String.format("Name: " + name + "\nAddress: " + address + "\nPhone: " + phone);
    }

    /**
     * A method to display all the clients
     */
    public void displayClients() {
        for(int i = 0; i<clients.size(); i++) {
            System.out.println ("Client #"+ (i+1) + ':' + clients.get(i));
        }


    }

    public ArrayList<Account> accounts = new ArrayList<Account>();
    public ArrayList<Client> clients = new ArrayList<Client>();

    private String name;
    private String address;
    private String phone;
}


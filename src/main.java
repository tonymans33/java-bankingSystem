import java.util.Scanner;

public class main {
    /**
     * The Main method
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Welcome page and setting bank data
         */
        System.out.println ("Welcome to the bank system\nEnter bank name");
        Scanner scan = new Scanner (System.in);
        String name = scan.next();
        System.out.println ("Enter bank address");
        String address = scan.next();
        System.out.println ("Enter bank phone number");
        String phone = scan.next();
        Bank bank = new Bank (name, address, phone);
        int currentAccountNumber = 1;
        while (true) {
            System.out.println ("Please chose one of the following options\n");
            System.out.println ("1- Adding clients\n");
            System.out.println ("2- Transactions\n");
            System.out.println ("3- Print Bank info\n");
            System.out.println ("4- Exit\n");
            int ans1 = scan.nextInt();
            switch (ans1) {
                case 1: {

                    while(true) {
                        System.out.println ("Please chose one of the following options\n");
                        System.out.println ("1- Normal client with normal account\n");
                        System.out.println ("2- Normal client with speical account account\n");
                        System.out.println ("3- Commercial client with normal account\n");
                        System.out.println ("4- Commercial client with Special account\n");
                        System.out.println ("5- Exit\n");
                        int ans2 = scan.nextInt();
                        switch (ans2) {

                            case 1: {
                                System.out.println ("Enter client name");
                                String clientName = scan.next();
                                System.out.println ("Enter client national ID");
                                String clientNationalID = scan.next();
                                System.out.println ("Enter client address");
                                String clientAddress = scan.next();
                                System.out.println ("Enter client phone");
                                String clientPhone = scan.next();
                                Account clientAccount = new Account ();
                                Client client = new Client(clientName, clientNationalID, clientAddress, clientPhone, clientAccount);
                                bank.addClient(client);
                                System.out.println ("Your account has been created successfully");
                                System.out.println ("Your account number is " + currentAccountNumber);
                                currentAccountNumber++;
                                break;
                            }

                            case 2: {
                                System.out.println ("Enter client name");
                                String clientName = scan.next();
                                System.out.println ("Enter client national ID");
                                String clientNationalID = scan.next();
                                System.out.println ("Enter client address");
                                String clientAddress = scan.next();
                                System.out.println ("Enter client phone");
                                String clientPhone = scan.next();
                                specialAccount clientSpecialAccount = new specialAccount ();
                                Client client = new Client(clientName, clientNationalID, clientAddress, clientPhone, clientSpecialAccount);
                                bank.addClient(client);
                                System.out.println ("Your account has been created successfully");
                                System.out.println ("Your account number is " + currentAccountNumber);
                                currentAccountNumber++;
                                break;
                            }

                            case 3: {
                                System.out.println ("Enter client name");
                                String clientName = scan.next();
                                System.out.println ("Enter client commercial ID");
                                String clientCommercialID = scan.next();
                                System.out.println ("Enter client address");
                                String clientAddress = scan.next();
                                System.out.println ("Enter client phone");
                                String clientPhone = scan.next();
                                Account clientAccount = new Account ();
                                Client client = new Client(clientName, clientCommercialID, clientAddress, clientPhone, clientAccount);
                                bank.addClient(client);
                                System.out.println ("Your account has been created successfully");
                                System.out.println ("Your account number is " + currentAccountNumber);
                                currentAccountNumber++;
                                break;
                            }

                            case 4: {
                                System.out.println ("Enter client name");
                                String clientName = scan.next();
                                System.out.println ("Enter client commercial ID");
                                String clientCommercialID = scan.next();
                                System.out.println ("Enter client address");
                                String clientAddress = scan.next();
                                System.out.println ("Enter client phone");
                                String clientPhone = scan.next();
                                specialAccount clientSpecialAccount = new specialAccount ();
                                Client client = new Client(clientName, clientCommercialID, clientAddress, clientPhone, clientSpecialAccount);
                                bank.addClient(client);
                                System.out.println ("Your account has been created successfully");
                                System.out.println ("Your account number is " + currentAccountNumber);
                                currentAccountNumber++;
                                break;
                            }

                            case 5:
                                break;
                        }
                        if(ans2 == 5) {
                            break;
                        }
                    }
                    break;
                }

                case 2: {

                    System.out.println ("Enter account number");
                    int ans3 = scan.nextInt();
                    System.out.println ("1- Withdraw");
                    System.out.println ("2- Deposit");
                    int ans4 = scan.nextInt();
                    switch (ans4) {

                        case 1: {
                            System.out.println ("Enter value");
                            double value = scan.nextInt();
                            bank.accounts.get(ans3-1).withdraw(value);
                            bank.clients.get(ans3-1).account.getBalance();
                            break;
                        }

                        case 2: {
                            System.out.println ("Enter value");
                            double value = scan.nextInt();
                            bank.accounts.get(ans3-1).deposit(value);
                            break;
                        }

                    }
                    break;
                }

                case 3: {
                    System.out.println ("Bank info:\n" + bank);
                    bank.displayClients();
                    break;
                }

                case 4:
                    break;
            }

            if (ans1 == 4) {
                System.out.println ("Terminating");
                break;
            }
        }
    }
}
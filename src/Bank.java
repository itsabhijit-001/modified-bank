import java.util.Scanner;

import Customer.customer;

public class Bank {
    public static void main(String[] args) {
        customer c1=new customer();
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter your name");
        String name=scan.nextLine();

        System.out.println("Enter your user name");
        String user_name=scan.nextLine();

        System.out.println("Enter password ");
        String password=scan.nextLine();

        System.out.println("Enter email id ");
        String email=scan.nextLine();

        System.out.println("Enter your SSN ");
        String ssn=scan.nextLine();

        System.out.println("Enter your address (only city name) ");
        String address=scan.nextLine();

        System.out.println("Enter your age ");
        int age=scan.nextInt();

        System.out.println("Enter your phone number ");
        long phone=scan.nextLong();

        System.out.println("Enter your account balance ");
        float acc_balance=scan.nextFloat();

        c1.signUp(name,user_name,password,ssn,address,email,age,acc_balance,phone);
        
        System.out.println();
        
        System.out.println("Welcome to login page ");
        c1.login();
        System.out.println();
        
        System.out.println("Welcome "+name+" to your bank account");

        String val="yes";
        
        do
        {
            System.out.println("Please choice the option below :");
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Check Balance");
            System.out.println("4. Edit Profile");
            System.out.println("5. Change Password");
            System.out.println("6. Exit");
            int opt=scan.nextInt();
            switch(opt)
            {
                case 1:
                    System.out.println("Enter money to deposit : ");
                    float deposit_ammount=scan.nextFloat();
                    c1.deposit(deposit_ammount);
                    break;
        
                case 2:
                    System.out.println("Enter money to withdraw : ");
                    float withdraw_ammount=scan.nextFloat();
                    c1.withdrawal(withdraw_ammount);
                    break;
        
                case 3:
                    c1.checkBalance();
                    break;
        
                case 4:
                    c1.editProfile();
                    break;
        
                case 5:{
                    System.out.println("Enter password of your choice : ");
                    String changed_password=scan.nextLine();
                    c1.changePassword(changed_password);
                    break;
                }
        
                case 6:
                    break;
        
                default:
                    System.out.println("Ooops !!! Wrong input selected.");
                    System.out.println("Please select some valid input.");
            }
            System.out.println();
            
            System.out.println("Do you want to continue? (type 'yes' or 'no') ");
            val=scan.nextLine();
        }while(val.equals("yes") );
        c1.login();

        scan.close();
        
    }
}

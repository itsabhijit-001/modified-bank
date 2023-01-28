package Customer;

import java.util.Scanner;

public class customer {
    String Name,Username,Password,SSN,Address,Email;
    int Age;
    float Balance;
    long Phone;
    public void signUp(String Name,String Username,String Password,String SSN,String Address,
                        String Email,int Age,float Balance,long Phone) {
        this.Name=Name;
        this.Username=Username;
        this.Password=Password;
        this.SSN=SSN;
        this.Address=Address;
        this.Email=Email;
        this.Age=Age;
        this.Balance=Balance;
        this.Phone=Phone;
        System.out.println("Successfully Signed up.");
        
    }


    
    public boolean validateAge(int age){
        if(age>=18){
            System.out.println("You are eligible to open bank account.");
            return true;

        }
        else{

            System.out.println("Oops!! sorry you are not eligible to open account you are undered age.");
            return false;

        }

     }

    public boolean validateSSN(String ssn){
        if(ssn.length()==9){
            System.out.println("Congratulations!! correct SSN. ");
            return true;
        }
        else{
            System.out.println("Oops wrong SSN please enter any valid SSN");
            return false;
        }
    }



    public void login() {

        Scanner scan2=new Scanner(System.in);
        System.out.println("Enter your user name : ");
        String uName=scan2.nextLine();
        System.out.println("Enter your password");
        String uPassword=scan2.nextLine();
        
        System.out.println();
        
        if(uName.equals(this.Username) && uPassword.equals(this.Password)){
            System.out.println("Successfully logged in !!!");
        }
        else{
            System.out.println("Ooops!! Wrong user name or password. Try again");
            login();

            

        }
        scan2.close();
    }
    public void deposit(float amount) {
        this.Balance+=amount;
        System.out.println("Rs. "+amount+" deposited !!");
    }
    public void withdrawal(float amount) {
        this.Balance-=amount;
        System.out.println("Rs. "+amount+" withdrawn !!");
        
    }

    public void checkBalance() {
        System.out.println("Rs. "+this.Balance+" is available in yours account !!");
        
    }
    public void editProfile() {

        Scanner scan2=new Scanner(System.in);
    
        System.out.println("Please choice the option below which you want to edit :");
        System.out.println("1. Name");
        System.out.println("2. User Name");
        System.out.println("3. SSN");
        System.out.println("4. Address");
        System.out.println("5. Email");
        System.out.println("6. Phone number");
        System.out.println("7. To exit");
        int opt1=scan2.nextInt();
        switch(opt1){
            case 1:
                System.out.println("Enter your changed name : ");
                String new_name=scan2.nextLine();
                System.out.println("your name changed from "+this.Name+" to "+new_name);
                this.Name=new_name;
                break;

            case 2:
                System.out.println("Enter your changed user name : ");
                String new_uName=scan2.nextLine();
                System.out.println("your user name changed from "+this.Name+" to "+new_uName);
                this.Username=new_uName;
                break;

            case 3:
                System.out.println("Enter your changed SSN : ");
                String new_ssn=scan2.nextLine();
                System.out.println("your SSN changed from "+this.SSN+" to "+new_ssn);
                this.SSN=new_ssn;
                break;

            case 4:
                System.out.println("Enter your changed address : ");
                String new_address=scan2.nextLine();
                System.out.println("your address changed from "+this.Address+" to "+new_address);
                this.Address=new_address;
                break;

            case 5:
                System.out.println("Enter your changed email : ");
                String new_email=scan2.nextLine();
                System.out.println("your email changed from "+this.Email+" to "+new_email);
                this.Email=new_email;
                break;

            case 6:
                System.out.println("Enter your changed phone number : ");
                Long new_phone=scan2.nextLong();
                System.out.println("your phone number changed from "+this.Phone+" to "+new_phone);
                this.Phone=new_phone;
                break;

            case 7:
                break;
            default:
                    
                System.out.println("Ooops !!! Wrong input selected.");
                System.out.println("Please select some valid input.");

            
        }
       scan2.close();
    
        System.out.println();
        
    }
    public void changePassword(String password) {
        this.Password=password;
        System.out.println("Password successfully changed.");

        
    }

}

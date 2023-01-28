package Customer;
public class saving extends account{
    public saving(){
        super();
        super.minimumBalance=500;
    }

    @Override

    public void display() {
        
        System.out.println("Yours account Id : "+accountId);
        System.out.println("Description : "+description);
        System.out.println("yours minimum account balance is : "+minimumBalance);
    }
}

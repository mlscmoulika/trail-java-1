import static java.lang.System.out;
import java.util.*;

public class service {
    int request_number;
    String name;
    String AMC;
    String service_type;
    int bill_amount;
    public class inner_class extends service{
        int date;
        int month;
        int year;

        
    public void get()
    {
        Scanner sc=new Scanner(System.in);
        request_number=sc.nextInt();
        name=sc.next();
        System.out.println("AMC Dteails Y or N ");
        AMC=sc.next();
        service_type=sc.next();
        System.out.println("enter the date month and year");
        date=sc.nextInt();
        month=sc.nextInt();
        year=sc.nextInt();

    }
    public void calcbillamt()
    {
        if(AMC=="Y")
        {
            if(service_type.equals("GS"))
            {
                bill_amount=0;
            }
            if(service_type.equals("PR"))
            {
                bill_amount=1000;
            }
        }
        if(AMC=="N")
        {
            if(service_type.equals("GS"))
            {
                bill_amount=500;
            }
            if(service_type.equals("PR"))
            {
                bill_amount=2000;
            }
        }
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Request number"+request_number);
        System.out.println("AMC Details (Y-yes N-no) "+request_number);
        System.out.println("Service Type"+service_type);
        System.out.println("Date as follows: "+date+"/"+month+"/"+year);
        System.out.println("Bill Amount in (INR)"+bill_amount);
    }
    }
    public static void main(String[] args)
    {
        //service ob[]=new service[20];
        inner_class ob[]=new inner_class[20];
        int n;
        System.out.println(" Enter the number of customers: ");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            ob[i]=new inner_class();
            ob[i].get();
        }
        for(int i=0;i<5;i++)
        {
            ob[i].calcbillamt();
        }
        for(int i=0;i<n;i++)
        {
            ob[i].display();
        }
        int user_month;
        user_month =sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(ob[i].month==user_month)
            {
                System.out.println(" Name of the customer "+ob[i].name);
                System.out.println("Request number" +ob[i].request_number);
            }
        }

    }

}

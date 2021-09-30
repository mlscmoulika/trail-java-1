import static java.lang.System.out;
import java.util.*;
public class credit_card{
    int card_no;
    String name;
    double phone_no;
    String exp_date;
    String email_id;
    int card_limit;
    int no_of_card;
    void get_details()
    {
        Scanner sc=new Scanner(System.in);
        card_no=sc.nextInt();
        name=sc.next();
        phone_no=sc.nextDouble();
        System.out.println("Please enter the date in (dd-mm-yyyy) format only");
        exp_date=sc.next();
        email_id=sc.next();
        card_limit=sc.nextInt();
    }
    void print_specific_mob(int number)
    {
        if(phone_no==number)
        {
            System.out.println("The customer name :"+name+" and his card no. :"+card_no);
        }
    }
    void print_expiry_2021()
    {
        //char ch[]=exp_date.toCharArray();
        String year="2021";
        if(exp_date.endsWith(year))
        {
            System.out.println("The customer name :"+name+" and his email id :"+email_id);
        }

    }
    void increase_credit_limit()
    {
        if(no_of_card>3)
        {
            card_limit=card_limit+50000;
        }
        else if(no_of_card>1 && no_of_card<=3)
        {
            card_limit=card_limit+20000;
        }
    }
    void diaplay_all()
    {
        System.out.println("The customer name: "+name);
        System.out.println("The customer card name: "+card_no);
        System.out.println("The customer phone no: "+phone_no);
        System.out.println("The customer email address: "+email_id);
        System.out.println("The customer expiry date: "+exp_date);
        System.out.println("The customer credit card limit: "+card_limit);
    }

    public static void main(String[] args)
    {
        credit_card ob[]=new credit_card[20];
        for(int i=0;i<5;i++)
        {
            ob[i]=new credit_card();
            ob[i].get_details();
        }
        int number;
        Scanner sc= new Scanner(System.in);
        System.out.println("Pls enter the mobile number to check the customer details");
        number=sc.nextInt();
        for(int i=0;i<5;i++)
        {
            ob[i].print_specific_mob(number);
        }
        System.out.println("The 2021 expiries are as follows");
        for(int i=0;i<5;i++)
        {
            ob[i].print_expiry_2021();
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(ob[i].phone_no==ob[j].phone_no)
                {
                    ob[i].no_of_card+=1;
                    ob[j].no_of_card+=1;
                }
            }
        }
        for(int i=0;i<5;i++)
        {
            ob[i].increase_credit_limit();
        }
        for(int i=0;i<5;i++)
        {
            ob[i].diaplay_all();
        }
    }
}
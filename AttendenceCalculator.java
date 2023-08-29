import java.util.Scanner;

public class AttendenceCalculator 
{
    static void AttendenceFromSkipPeriod()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Total periods that are completed");
        int TotPeriods =sc.nextInt();
        System.out.println("Enter Total periods that you are attended");
        int AttendedPeriods = sc.nextInt();
        if(AttendedPeriods >TotPeriods)
        {
            System.out.println("Please check the given values");
        }
        else
        {
            System.out.println("enter no of periods that you are going to absent");
            int AbsentPeriods =sc.nextInt();
            float ans =100*(AttendedPeriods)/(TotPeriods+AbsentPeriods);
            System.out.println("your attendence will go to "+ans+" % if you are absent for "+AbsentPeriods+" periods");
        }

    }
    static void  SkiptoRequiredAttendence()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter Total periods that are completed");
        int TotPeriods =sc.nextInt();
        System.out.println("enter Total periods that you are attended");
        int AttendedPeriods = sc.nextInt();
        if(AttendedPeriods >TotPeriods)
        {
            System.out.println("Please check the given values");
        }
        else
        {
            System.out.println("enter requird attendence percentage");
            int requiredPercentage=sc.nextInt();
            double temp=0;
            for(temp=0;temp>=0;temp++)
            {   
                double a=100*(AttendedPeriods);
                double  b=a/(TotPeriods+temp);
                if(requiredPercentage>=b)
                {
                break;
                }      
            }
        
             System.out.println("You can absent for "+temp+" periods to be at "+requiredPercentage+" percentage");
        }

    }
    static void DaysToGetRequiredPercentage()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter Total periods that are completed");
        int TotPeriods =sc.nextInt();
        System.out.println("enter Total periods that you are attended");
        int AttendedPeriods = sc.nextInt();
        if(AttendedPeriods >TotPeriods)
        {
            System.out.println("Please check the given values");
        }
        else
        {
            System.out.println("enter requird attendence percentage");
            int requiredPercentage=sc.nextInt();
            int temp=0;
            double change=0;
            while(true)
            {
                change=((100*(AttendedPeriods+temp)/(TotPeriods +temp)));
                if(requiredPercentage<=change)
                {
                    System.out.println("you have to attend "+temp+" periods to get "+requiredPercentage+" %");
                    break;
                    
                }    
                temp++;  
            }
            
        
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println();
        System.out.println(" Welcome to Attendence Calculator By Sankar");
        System.out.println();
        System.out.println("1) To know your attendence percentage by giving how many periods you want to absent" );
        System.out.println();
        System.out.println("2)To know how many periods you can absent for getting required attendence percentage");
        System.out.println();
        System.out.println("3)How many days you have to come to get Required percentage");
        System.out.println();
        while(true)
        {
            System.out.println();     
            System.out.println("Enter your Choice");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                AttendenceFromSkipPeriod();
                break;
                case 2:
                SkiptoRequiredAttendence();
                break;
                case 3:
                DaysToGetRequiredPercentage();
                break;
                default:
                System.out.println("enter valid choice");
                break;

          
            }

        }
        
    }
    
}

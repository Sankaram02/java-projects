import java.text.DecimalFormat;
import java.util.Scanner;

public class MidFinalMarks 
{
    static double FinalMarkAns(int a,int b)
    {
       if(b>a)
       {
            int temp=b;
            b=a;
            a=temp;
       }
       return ((a*0.8)+(b*0.2));
    }
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Mid final marks calculator by SANKAR");
        while(true)
        {
            System.out.println();
            System.out.println("Enter MID 1 marks");    
            int mid1 =sc.nextInt();
            System.out.println("Enter MID 2 marks");
            int mid2=sc.nextInt();
            DecimalFormat df  =new DecimalFormat("0.00");
            if((mid1<=30)&&(mid2<=30))
            {
                System.out.println("Final marks for your mid marks "+mid1+" & "+mid2+" is   "+df.format(FinalMarkAns(mid1,mid2)));
            }
            else
            {  
                System.out.println("Enter valid marks");
            }
        }
    }
}

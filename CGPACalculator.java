import java.text.*;
import java.util.Scanner;

public class CGPACalculator 
{
    public static void main(String[] args)
    {   
        Scanner sc= new Scanner(System.in);
        System.out.println(" CGPA Calculator by Sankar ");
        System.out.println();
        double crdsintoGrade=0;
        double TotCredits =0;
        while(true)
        {
            System.out.println("Enter no of 3 credit subjects");
            int cr3 =sc.nextInt();
            int subs[]  = new int[cr3];
            TotCredits=TotCredits+cr3*3;
            for (int i=0;i<cr3;i++)
            {
                 System.out.println("enter the Grade points of "+(i+1)+" sub");
                 subs[i]=sc.nextInt();
                 crdsintoGrade=subs[i]*3+crdsintoGrade;
            }
            System.out.println("Enter no of 1.5 credit subjects (labs)");
            int cr05=sc.nextInt();
            int labs[]  = new int[cr05];
            TotCredits=TotCredits+cr05*1.5;
            for (int i=0;i<cr05;i++)
            {
                 System.out.println("enter the Grade points of "+(i+1)+" lab");
                 labs[i]=sc.nextInt();
                 crdsintoGrade=(labs[i]*1.5)+crdsintoGrade;
            }


            System.out.println("Enter no of special subjects (SOC,CSP etc)");
            int xtra=sc.nextInt();
            int spl[]  = new int[xtra];
            for(int i=0; i<xtra;i++)
            {
                System.out.println("enter the credits of "+(i+1)+" one");
                float cr=sc.nextFloat();
                System.out.println("enter the Grade points of "+(i+1)+" one");
                spl[i]=sc.nextInt();
                TotCredits=TotCredits+cr;
                crdsintoGrade=(spl[i]*cr)+crdsintoGrade;

            }
            DecimalFormat df =new DecimalFormat("0.00");
            System.out.println();
            System.out.println(" CGPA is "+df.format(crdsintoGrade/TotCredits));
            System.out.println();
            System.out.println();
            System.out.println("Re-enter Details ");
        }     
    }
}

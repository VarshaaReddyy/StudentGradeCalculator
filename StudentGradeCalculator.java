import java.util.Scanner;

public class StudentGradeCalculator
{
    public static void main(String args[])
    {
    	Scanner s = new Scanner(System.in);
    	System.out.print("enter no of subjects:");
    	int a =s.nextInt();
        int marks[] = new int[a];
        int i;
        float total=0,avg;
        
		
        
        for(i=0; i<a; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = s.nextInt();
           total = total + marks[i];
        }
        s.close();
        System.out.print("the total marks are: "+total);
        avg = total/a;
        System.out.print("\nthe percentage is: "+avg);
        System.out.print("\nThe student Grade is: ");
        if(avg>=80)
        {
            System.out.print("A");
        }
        else if(avg>=60 && avg<80)
        {
           System.out.print("B");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}
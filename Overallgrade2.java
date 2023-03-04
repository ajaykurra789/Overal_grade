import java.util.*;
class	Overallgrade2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double cugrade=0;
		double cddsum=0;
		double sum1=0;
		double sum2=0;
		System.out.println("Enter upto how many Semesters do you want cgpa: ");
		int m=sc.nextInt();
		for(int i=1; i<=m; i++)
		{
			System.out.println("Enter number of Subjects for " + i + " st Semester: ");
			int n=sc.nextInt();
			System.out.println("Enter grade points and credits for " + i +" st Semester : ");
			double sugrade=0;
			double cdsum=0;
			for(int j=1; j<=n; j++)
			{
				double gradepoints=sc.nextDouble();
				double creditsforgrade=sc.nextDouble();
				sugrade=gradepoints*creditsforgrade+sugrade;
				cdsum=creditsforgrade+cdsum;
			}
			double sem=(sugrade/cdsum);
			System.out.println("The Semester Numerator is: " + sugrade);
			System.out.println("The Semester Denominator is: " + cdsum);
			System.out.println("The " + i + " st Semester overall marks is: " + sem);
			sum1=sum1+sugrade;
			sum2=sum2+cdsum;
		}
		System.out.println("The Total grade value is: " + sum1);
		System.out.println("The Credit value is: " + sum2);
		double cgpa=(sum1/sum2);
		System.out.println("The Total Cgpa for " + m + " Semesters is: " + cgpa);		
	}
}

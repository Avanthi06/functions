
import java.util.Scanner;

public class InsurFun {

	public static void main(String[] args) {
		

		String sex,ms;
		int age;

		System.out.println ("Enter age, sex, marital status:");

		Scanner s = new Scanner(System.in);
	       age= s.nextInt();
	       sex=s.next();
	      ms=s.next();
	      find(sex,ms,age);
	}
	public static void find(String sex,String ms,int age)
	      {
		if (ms=="M")

		System.out.println ("The driver is insured");
		else
		{
		if (sex=="M")

		{
		if (age>30)
		System.out.println ("Driver is insured");

		else
		System.out.println ("Driver is not insured");
		}
		else
		{

		if (age>25)
		System.out.println ("Driver is insured");
		else
		System.out.println("Driver is not insured");

		}
		
		}
		}

	}






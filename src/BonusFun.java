
import java.util.Scanner;

public class BonusFun {

	public static void main(String[] args) {
		
			
			int cur_year;
		     int year_joining;
			int year_of_ser ;
	
			System.out.println("Enter Current Year:" );
			 Scanner s= new Scanner(System.in);
		      cur_year = s.nextInt();
             System.out.println("Enter Year of Joining :" );
			  year_joining=s.nextInt();
                 
               find(cur_year,year_joining);
		}
         public static void find(int cur_year,int year_joining)
         {
         int year_of_ser ;int bonus;
         year_of_ser= cur_year-year_joining;
         System.out.println("years of service:"+year_of_ser);
			if (year_of_ser > 3)
			{
				bonus = 2500 ;
				System.out.println("bonus = 2500");
			}
			else {
			System.out.println("no bonus");
			}
		}

	}





import java.util.*;
class Electricitybill
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int current,previous,units;
		float e_bill;

		System.out.println("enter the current and previous meter reading");
		current=sc.nextInt();
		previous=sc.nextInt();

		units=current-previous;

		if(units>=0 && units<100)
			e_bill=units*0.8f;
		else if(units>=100 && units<200)
			e_bill=80+(units-100)*1.2f;
		else if(units>=200 && units<300)
			e_bill=200+(units-200)*1.5f;
		else
			e_bill=350+(units-300)*1.8f;

		System.out.println("electricity bill="+e_bill);

		
	}
}
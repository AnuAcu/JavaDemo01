
public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//marks of student
	/*	int marks = 26;
		
		if (marks>60)
		
			System.out.println("MArks is first class");
		
		else if (marks>=50 && marks<=60)
			System.out.println("MArks is second class");
		
		else
			System.out.println("MArks is  fail");
	*/
		
		int month =Integer.parseInt(args[0]);
		
		if (month==12||(month>=1 && month<=2))
			
		{
			System.out.println("Season selected is Winter");
	
			// DEC ,jan,feb
		}
		
		else if (month>2 && month<=5)
		{
			System.out.println("Season selected is Summer");
			// Mar to may
		}
		else if (month>5 && month<=8)
		{
			System.out.println("Season selected is Spring");
			// jun to aug
		}
		else if (month>8 && month<=12)
		{
			System.out.println("Season selected is Autum");
			// sep to dec
		}
		else  
		{
			System.out.println("Season selected is Invalid");
		}
		}
	}



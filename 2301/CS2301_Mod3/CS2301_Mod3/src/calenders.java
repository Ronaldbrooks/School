
public class calenders {
	public static void main(String[] args)
	{
		    System.out.println("  Sun Mon Tue Wed Thu Fri Sat");    
		    System.out.println("------------------------------");
	for (int i = 1; i <=4; i++)	{ 
		System.out.print("");
	for( int day = 1; day <= 7; day++) {
		System.out.printf("%4d", i * day); 
	}	
	}
		
}
}

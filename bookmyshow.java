class bookmyshow
{
	int movId=5;
	String movName="KGF-2";
	String releaseDate="14/04/2022";
	String vacancy="houseFull";
	static
	{
	System.out.println("--------------------------------Welcome to Forum cinimas--------------------------");
	}
	static
	{
	System.out.println("--------------------------------Please check the movie Relesed--------------------------");
	}
	static
	{
	System.out.println("--------------------------------***kgf2***--------------------------");
	}	
	static
	{
	System.out.println("--------------------------------****Enjoy*****--------------------------");
	}
	public void m1()
	{
		System.out.println("The movie relesed is "+movName);
		System.out.println("The movie relesed date "+releaseDate);
	}
	public static void m2()
	{ 
		bookmyshow bmw2=new bookmyshow();
		System.out.println("The show is "+bmw2.vacancy);
	}
	public static void main(String[] args)
	{
	bookmyshow bmw=new bookmyshow();
	
	System.out.println("--------------------------------Welcome to book my show----------");
	System.out.println("--------------------------------Rigister----------------");
	System.out.println("--------------------------------login-----------------");
	System.out.println("--------------------------------plase check your movie ticket id---------::"+bmw.movId);
	bmw.m1();
	m2();
	}
}
	
class account
{
	int accNo;
	String accName;
	int accBal;
	int accDeb;
	static
	{
		System.out.println("Welcome bharath bank");
	}
	static
	{
		System.out.println("Saving Bank");
	}
	public static void BankDetails()
	{	
	account a1=new account();
	System.out.println("account no is "+a1.accNo);
	System.out.println("account name is "+a1.accName);
	System.out.println("account balance is "+a1.accBal);
	System.out.println("account debit is  "+a1.accDeb);
	}
	public  void BankDetails2()
	{
	System.out.println("account no is "+accNo);
	System.out.println("account name is "+accName);
	System.out.println("account balance is "+accBal);
	System.out.println("account debit is  "+accDeb);
		
	}
	public static void main(String[] args)
	{
	account a=new account();
	a.accNo=233272764;
	a.accName="sudeep";
	a.accBal=10000000;
	a.accDeb=1000000;
	System.out.println("account no is "+a.accNo);
	System.out.println("account name is "+a.accName);
	System.out.println("account balance is "+a.accBal);
	System.out.println("account debit is  "+a.accDeb);
        a.BankDetails();
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	a.BankDetails2();
	}
}

	
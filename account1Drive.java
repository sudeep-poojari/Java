class account1Drive
{
	public static void main(String[] args)
	{
		account1 s=new account1();
		System.out.println("The bank name is"+s.getName());
		System.out.println("The bank account no is is"+s.getAcc());
		System.out.println("The bank ifsc is"+s.getIfsc());
		System.out.println("The bank balance is"+s.getAccbal());
		System.out.println("The bank name is"+s.getDebamt());
		System.out.println("=======================");
		s.setName("lathesh");
		s.setAcc(122222);
		s.setIfsc("tu78");
		s.setAccbal(122220);
		s.setDebamt(3000);
		System.out.println("The bank name is"+s.getName());
		System.out.println("The bank account no is is"+s.getAcc());
		System.out.println("The bank ifsc is"+s.getIfsc());
		System.out.println("The bank balance is"+s.getAccbal());
		System.out.println("The bank name is"+s.getDebamt());
	
	}
}
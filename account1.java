class account1
{
	private String bankname="andhra bank";
	private int accontno=12010101;
	private String ifsccode="ubin099";
	private int accountbalance=800000;
	private int debitedamount=20000;
	public void setName(String bankname)
	{
	this.bankname=bankname;
	}
	public String getName()
	{
		return bankname;
	}
	public void setAcc(int accontno)
	{
		this.accontno=accontno;
	}
	public int getAcc()
	{
		return accontno;
	} 
	public void setIfsc(String ifsccode)
	{
		this.ifsccode=ifsccode;
	}
	public String getIfsc()
	{
		return ifsccode;
	}
	public void setAccbal(int accountbalance)
	{
		this.accountbalance=accountbalance;
	}
	public int getAccbal()
	{
		return accountbalance;
	}
	public void setDebamt(int debitedamount)
	{
		this.debitedamount=debitedamount;
	}
	public int getDebamt()
	{
		return debitedamount;
	}
}
       
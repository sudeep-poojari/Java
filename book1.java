class book1
{
	String bname;
	int id;
	String btitle;
	String aname;
	book1()
	{
	
	}
	book1(String bname)
	{
	this.bname=bname;
	}
	book1(String bname,int id)
	{
	this(bname);
	this.id=id;
	}
	book1(String bname,int id,String btitle)
	{
	this(bname,id);
	this.btitle=btitle;
	}
	book1(String bname,int id,String btitle,String aname)
	{
	this(bname,id,btitle);
	this.aname=aname;
	}
	public void bookDet()
	{
		System.out.println("The book name is-----------------"+bname);
		System.out.println("The book id is-------------------"+id);
		System.out.println("The book title is----------------"+btitle);
		System.out.println("The book author name is----------"+aname);
	}
	public static void main(String[] args)
	{
		System.out.println("---------Welcome to Library-----------");
		book1 b1=new book1("mary",12,"dramatic","farooq");
		book1 b2=new book1("mary",12,"dramatic");
		book1 b3=new book1("mary",12);
		book1 b4=new book1("mary");
		book1 b5=new book1();
		b1.bookDet();
		b2.bookDet();
		b3.bookDet();
		b4.bookDet();
		b5.bookDet();
	}
}

		








	
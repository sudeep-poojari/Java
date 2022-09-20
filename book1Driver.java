class book1Driver
{
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

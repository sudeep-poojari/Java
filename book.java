class book
{
	static int bookid=4;
	static String bookname="java";
	static String bookauthor="adarsh";
	public static void BookDetails()
	{
		System.out.println("book id is"+bookid);
		System.out.println("book name is"+bookname);
		System.out.println("book author is"+bookauthor);
		
	}
	public static void main(String[] args)
	{
		System.out.println("the borrowed bo is");
		BookDetails();
		System.out.println("the book given back");
		
		
	}
}
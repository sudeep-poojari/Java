jssclass airoplaneDriver
{
	public static void main(String[] args)
		{
			airport ai=new airport("mangalore",34,4, new airoplane("black","AIR TNDIA",70));
			System.out.println("-------the airport details-----");
			ai.airportDet();
			System.out.println("--------the airoplane details----");
			ai.airoplaneDet();
		}
}
class airport
	{
		String loc;
		int capacity;
		int no_of_flights;
		airoplane a;
		airport(String loc,int capacity,int no_of_flights,airoplane a)
		{
			this.loc= loc;
			this.capacity=capacity;
			this.no_of_flights= no_of_flights;
			this.a=a;
		}
		public void airoplaneDet()
		{
			System.out.println("the airplane color is-----"+a.clr);
			System.out.println("the airplane brand is-----"+a.brand);
			System.out.println("the airplane capacity is-----"+a.capacity);
		}
		public void airportDet()
		{
			System.out.println("the airport loc is-----"+loc);
			System.out.println("the airport capacity is-----"+capacity);
			System.out.println("the airport no of fligts is-----"+no_of_flights);
		}
}
			
			
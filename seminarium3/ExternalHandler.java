class ExternalHandler
{
	Item[] i1;
	ExternalHandler()
	{
			//konstruktor
			i1=new Item[4];
			i1[0]=new Item("banan", 1, 25,"en frukt från afrika");
			i1[1]=new Item("morot", 1, 15,"ätabar orange sak");
			i1[2]=new Item("atombomb", 1, 1000000,"vapen av massförstörelse");
			i1[3]=new Item("unknown", 1, 0,"denna artikel finns ej");
	}
	//metoder
	public static void sparaSaleInfo(SaleInfo saleInfo)
	{
		/*
		*vad gör denna
		*
		*@param input vad?
		*@return retur vad?
		*/

	}
	public static void inventoryUpdate(SaleInfo saleInfo)
	{
		/*
		*vad gör denna
		*
		*@param input vad?
		*@return retur vad?
		*/

	}
	public SaleInfo taxAndDesc(String itemIdentifier) throws NoInternetException, UnknownItemException
	{
		/*
		*vad gör denna
		*
		*@param input vad?
		*@return retur vad?
		*/
		int z=3;
		for(int i=0;i<3;i++)
		{
			if(itemIdentifier.equals(i1[i].getName()))
			{
				z=i;
			}
		}
		if (z==2)
		{
			throw new NoInternetException("no internet connection");
		}
		if (z==3)
		{
			throw new UnknownItemException("no item of that name");
		}

		return new SaleInfo(i1[z], 0.20);
	}
	public static int fetchDiscount(Id customerId)
	{
		/*
		*vad gör denna
		*
		*@param input vad?
		*@return retur vad?
		*/

		//ej klar
		return 1;
	}
}
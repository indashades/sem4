class Item
{
	//variabler för dto
	private String name;
	private int amount;
	private int price;
	private String desc;
	Item(String name, int amount, int price,String desc)
	{
		this.name=name;
		this.amount=amount;
		this.price=price;
		this.desc=desc;
	}
	public int changeAmountBy(int changeAmount)
	{
		/*
		*ändrar värdet amount genom att ta amount+changeAmount
		*
		*@param changeAmount är värdet som förändrar amount
		*@return amount värdet på amount
		*/
		amount+=changeAmount;
		return amount;
	}
	public int getPrice()
		{
			/*
			*hämtar priset
			*
			*@return price värdet för föremålet
			*/
			return price;
	}
	public String getName()
			{
				/*
				*hämtar namnet
				*
				*@return name föremålets namn
				*/
			return name;
		}
		public String getdesc()
					{
						/*
						*hämtar namnet
						*
						*@return name föremålets namn
						*/
					return desc;
		}
}
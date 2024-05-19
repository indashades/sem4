class Observer
{
	double totalValue4;

	public Observer()
	{}
	public Observer(double totalValue4)
	{
		/*
		*konstruktor för observer
		*
		*@param totalValue4 är värdet som ges i arv till andra klasser
		*/
		this.totalValue4=totalValue4;
	}
	public void changeValue(double g)
	{
		/*
				*ändrar värdet som finns i den här klassen
				*
				*@param g är det nya värdet
		*/
		totalValue4=g;
	}
	public double printValue()
	{		/*
			*hämtar variabel
			*
			*@return totalValue4 vilket är det värde som lagras här
			*/
		return totalValue4;
	}
}
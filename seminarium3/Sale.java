class Sale
{
	//variabler
	Reciept kvitto;
	KvittoSvenska kvi;
	Sale()
	{
		//konstruktor
		//kvitto = new Reciept();   //när klar sen
	}
	public void getInfoAndReciept(SaleInfo saleInfo, int s)
	{
		/*
		*vad gör denna
		*
		*@param input vad?
		*@return retur vad?
		*/
		if(s==1)
		{
			kvitto=new Reciept(saleInfo);
		}
		else
		{
			kvi=new KvittoSvenska(saleInfo);
		}

	}
}
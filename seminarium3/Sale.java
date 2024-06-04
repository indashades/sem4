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
	public void getInfoAndReciept(SaleInfo saleInfo, int s,Observer a, Observer b)
	{
		/*
		*vad gör denna
		*
		*@param input vad?
		*@return retur vad?
		*/
		a.changeValue(saleInfo.taTotal());
		b.changeValue(saleInfo.taTotal());
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
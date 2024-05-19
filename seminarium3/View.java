
class View
{
	Controller controllerare;
	TotalRevenueView totalSakC;
	TotalRevenueFileOutput totalSakT;
	View()
	{
		//konstruktor
		controllerare=new Controller();
		totalSakC = new TotalRevenueView();
		totalSakT = new TotalRevenueFileOutput();
	}
	public void roligMetodSomFixarSaker()throws Exception
	{

		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.println("skriv valfri siffra förutom 0 för att starta sale:");
		int saleKlar=in.nextInt();
		if(saleKlar!=0)
		{
			controllerare.newSale();
		}
		while (saleKlar!=0)
		{
			Item tempItem = new Item("", 0, 0,"");
			SaleInfo infoSale = new SaleInfo(tempItem, 0.0);
			System.out.println("skriv item id:");


			java.io.PrintWriter filUt = new java.io.PrintWriter("log.txt");

			int q=1;
			while (q==1)
			{
				q=2;

				try
				{
					String temp4 = in.next();
					infoSale = controllerare.register(temp4);
				}
				catch(UnknownItemException e)
				{
					q=1;
					filUt.println("föremålet finns ej");
					filUt.flush();

					System.out.println("föremålet finns ej skriv item id:");

				}
				catch(NoInternetException e)
				{
					q=1;
					filUt.println("inget internet");
					filUt.flush();
					System.out.println("inget internet skriv item id igen:");
				}
			}
			int temp=infoSale.taItemAmount();
			int[] temp2 = infoSale.taValue();
			System.out.println("kostar "+temp2[temp-1]+"kr");
			System.out.println("vat: "+infoSale.taVAT());
			String[] temp3 = infoSale.taDesc();
			System.out.println("description: "+temp3[temp-1]);
			//end sale? mellan varje
			System.out.println("0 för att avsluta");
			saleKlar=in.nextInt();

		}
		System.out.println("totalt: "+controllerare.endSale(totalSakC,totalSakT));
		//enter amount paid
		System.out.println("enter payment: ");
		int temp5 = in.nextInt();
		System.out.println("i kassa: "+controllerare.payment(temp5));
		//höj pengar i kassa
		//reciept och change
		System.out.println("write 1 for reciept in ¨mostly english, skriv 2 för kvitto på svenska");
		int g=in.nextInt();
		controllerare.lastMethod(g);
		//här klar och kör sem4 sak



		totalSakC.printTotal();
		totalSakT.printTotalFil();
	}
}



class TotalRevenueView extends Observer
{
	public void printTotal()
	{
		System.out.println("total value: "+totalValue4);
	}
}
class TotalRevenueFileOutput extends Observer
{
	public void printTotalFil() throws Exception
	{
		java.io.PrintWriter filUt = new java.io.PrintWriter("log2.txt");
		filUt.println("total value: "+totalValue4);
		filUt.flush();
	}
}
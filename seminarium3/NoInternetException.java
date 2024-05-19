class NoInternetException extends Exception
{
public NoInternetException(String message)
{
	/*
			*konstruktor för exception då den menas vara offline
			*
			*@param message meddelande som är överflödigt här
			*/
	super(message);
}
}
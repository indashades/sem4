class UnknownItemException extends Exception
{

public UnknownItemException(String message)
{
	/*
			*konstruktor för exception när okänt föremål
			*
			*@param message ett överflödigt meddelande som inte används
			*/
	super(message);
}
}
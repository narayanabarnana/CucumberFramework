package javaNotes;

public class ReturnValueFromTryCatchFinally
{
public static void main(String[] args)
{
System.out.println(methodReturningValue());
}

static int methodReturningValue()
{
try
{
int i = Integer.parseInt("abc"); //This statement throws NumberFormatException
return 20;
}
catch(NumberFormatException e)
{
	int i=Integer.parseInt("10");
	return i;
}
finally
{
return 50;
}
}
}
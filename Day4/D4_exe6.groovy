class Integer2{
	int value;
	int getvalue()
	{
		return value
	}
	void setValue(int newValue)
	{
		this.value = value
	}
	boolean isEven()
	{
		if(value%2 == 0)
		{
			return true
		}
		else
		{
			return false
		}
	}
	boolean isOdd()
	{
		if(value%2 != 0)
		{
			return true
		}
		else
		{
			return false
		}
	}
	void prettyPrint()
	{
		println "The value is " + value
	}
	String toString()
	{
		return Integer.toString(value)
	}
}
Integer2 i2 = new Integer2();
print "Enter a number: ";
String str = System.console().readLine();
int i = Integer.parseInt(str);
	i2.setValue(i);
	print "The number you entered is "
	if (i2.isEven())
	{
		println "even.";
	} 
	else if (i2.isOdd()) 
	{
		println "odd.";
	} 
	else
	{
		println "undefined!! Your code is buggy!";
	}
int parsedInt = Integer.parseInt(i2.toString());
	if (parsedInt == i2.getValue())
	{
		println("Your toString() method seems to work fine.");
	}
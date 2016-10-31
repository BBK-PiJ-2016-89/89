int power(int i, int j)
{
	return(Math.pow(i,j))
}
void binary2decimal(String s)
{
	int digit = 0
	for (int i = 0 ; i < s.length(); i++)
	{
		int num = Integer.parseInt(s.substring(i, i+1))
		int exponent = (s.length()-1)-i
		int result = power(2 , exponent)
		digit = digit + num * result
	}
	println "The decimal number is = "+ digit
}
void decimal2binary(int num)
{
	boolean finished = false
	String str = ""
	while(!finished)
	{
		int reminder = num % 2
		num = num / 2
		str = str + reminder
		if (num == 0)
		{
			finished = true
		}
	}
	String str1 = ""
	for (int i = 0 ; i < str.length() ; i++)
	{
		str1 = str1 + (str.substring((str.length()-1-i),str.length()-i))
	}
	println "The binary would be: " + str1
}
println "Enter your choice:"
println "Enter zero to convert from binary to decimal: " 
println "Enter one to convert from decimal to binary: "
String str = ""
str = System.console().readLine()
int choice = Integer.parseInt(str)
switch(choice){
	case 0:	String s2=""
			print "Enter a binary number to convert to decimal: "
			s2 = System.console().readLine()
			binary2decimal(s2)
			break;
	case 1:	String s3 = ""
			int num = 0
			print "please enter a number to convert to binary: "
			s3 = System.console().readLine()
			num = Integer.parseInt(s3)
			decimal2binary(num)
			break;
	default: println "Invalid option. Please try again."
			break;
}

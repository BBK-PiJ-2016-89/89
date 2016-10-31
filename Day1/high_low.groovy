int num1 = 0, num2 = 0, down = 0, n = 1
String str =""
println "This program finds if the numbers are going up."
println "Please enter some numbers to check and end to -1:"
str = System.console().readLine()
num2 = Integer.parseInt(str)
while (num2 != -1)
{
	if (n == 1)
	{
		num1 = num2
		n = n + 1
	}
	else
	{
		str = System.console().readLine()
		num2 = Integer.parseInt(str)
		if(num2 == -1)
		{
			str = ""
		}
		else if ((num1 + 1 == num2) || (num1 - 1 == num2))
		{
			num1 = num2
		}
		else
		{
			down = 1
		}
	}
}
if (down == 0)
{
	str = "YES"
}
else
{
	str = "NO"
}
println str
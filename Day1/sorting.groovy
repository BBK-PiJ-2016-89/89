int first = 0, second = 0, third = 0
String str =""
println "Please enter 3 numbers and it will be sorted."
print "Enter the first number: "
str = System.console().readLine()
first = Integer.parseInt(str)
print "Enter the second number: "
str = System.console().readLine()
second = Integer.parseInt(str)
print "Enter the third number: "
str = System.console().readLine()
third = Integer.parseInt(str)
if ((first > second) && (first > third))
{
	if (second > third)
	{
		println third + ", " + second + ", " + first
	}
	else
	{
		println second + ", " + third + ", " + first
	}
}
else if ((second > first) && (second > third))
{
	if (first > third)
	{
		println third + ", " + first + ", " + second
	}
	else
	{
		println first + ", " + third + ", " + second
	}
}
else
{
	if (first > second)
	{
		println second + ", " + first + ", " + third
	}
	else
	{
		println first + ", " + second + ", " + third
	}
}
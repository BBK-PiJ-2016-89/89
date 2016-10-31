String str =""
int first = 0
int second = 0
int sum = 0
int n = 1
println "Enter two numbers to find the product."
print "Enter the first number: "
str = System.console().readLine()
first = Integer.parseInt(str)
print "Enter the second number: "
str = System.console().readLine()
second = Integer.parseInt(str)
if ((first > 0 && second > 0) || (first < 0 && second > 0))
{
	while (n <= second)
	{
		sum = sum + first
		n = n + 1
	}
}
else if (first > 0 && second <0)
{
	while ( n <= first)
	{
		sum = sum + second
		n = n + 1
	}
}
else
{
	second = second - second - second
	first = first - first - first
	while ( n <= second)
	{
		sum = sum + first
		n = n + 1
	}
}
println "The pruduct of " + first + " and " + second + " is = " + sum
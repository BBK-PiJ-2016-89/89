finished = false
println "Please enter two numbers and the program will find the products: "
print "Please enter the first number: "
String s1 = System.console().readLine()
int int1 = Integer.parseInt(s1)
print "Please enter second number: "
String s2 = System.console().readLine()
int int2 = Integer.parseInt(s2)
int product = 0
while (!finished)
{
	product = product + int1
	int2 = int2 - 1
	if (int2 <= 0)
	{
		finished = true
	}
}
print "The product of the two numbers is: " + product		

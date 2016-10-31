println "This program will find the division of two number and also finds the remainder."
finished = false
print "Enter the first number: "
String s1 = System.console().readLine()
int1 = Integer.parseInt(s1)
print "Please enter the second number: "
String s2 = System.console().readLine()
int2 = Integer.parseInt(s2)
int n = 0
while (!finished)
{
	int1 = int1 - int2
	n = n + 1
	if (int1 < 0)
	{
		int remainder = int1 + int2
		n = n - 1
		println n + ", Remainder " + remainder
		finished = true
	}
}

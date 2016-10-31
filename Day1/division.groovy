String str = ""
int first = 0
int second = 0
int remainder = 0
int sum = 0
int n = 0
boolean finished = false
println "Please enter two numbers to divide."
print "Please enter the first number: "
str = System.console().readLine()
first = Integer.parseInt(str)
print "Please enter the second number: "
str = System.console().readLine()
second = Integer.parseInt(str)
sum = first
while(!finished)
{
	sum = sum - second
	n = n + 1
	if ( sum < 0)
	{
		remainder = sum + second
		n = n - 1
		finished = true
	}
}
println first + " divided by " + second + " is " + n + ", remainder " + remainder
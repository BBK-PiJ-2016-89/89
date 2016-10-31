boolean finished = false
int n = 0
int m = 0, digit = 1
String str = ""
print "Please enter a number between 1 to 25: "
str = System.console().readLine()
n = Integer.parseInt(str)
if ( n > 25)
{
	finished = true
	println "You have to put a number less than or equal 25."
}
while (!finished)
{
	m = 1
	while (m <= n - digit)
	{
		print " "
		m++
	}
	m--
	while (m < n)
	{
		print digit
		++m
	}
	if ( n - digit == 0)
	{
		finished = true
	}
	++digit
	println ""
}

	
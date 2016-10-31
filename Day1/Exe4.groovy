finished = false
print "Please enter a number to check if it is a prime number. "
String str = System.console().readLine()
int i = Integer.parseInt(str)
int j = 2
if (i >= 2)
{
	while (!finished){
		remainder = i % j
		if (remainder == 0 && i != j){
			println "This number is not prime."
			finished = true
		}
		else if (remainder == 0 && i == j)
		{
			println "The " + i + "is a prime number."
			finished = true
		}
		else
		{
			j = j + 1
		}
	}
}
else
{
	println " The number is less than 2."
}
		
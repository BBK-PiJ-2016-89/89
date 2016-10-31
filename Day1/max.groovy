String str = ""
int max = 0, num = 0
boolean finished = false
println "This program finds the maximum."
println "Enter a serires of numbers, end with -1"
while (!finished)
{
	str = System.console().readLine()
	num = Integer.parseInt(str)
	if ( num == -1)
	{
		finished = true
	}
	else if ( num > max )
	{
		max = num
	}
}
println "The Maximum number is: " + max	
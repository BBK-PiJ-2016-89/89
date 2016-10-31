int i , j = 2, n = 0
boolean finished = false
println "This program shows prime number less than 1000."
while ( n <= 1000)
{
	i = 2
	while (!finished)
	{
		if ( j % i == 0 && i < j)
		{
			finished = true
		}
		else if ( j % i == 0 && i == j)
		{	
			print j + ", "
			finished = true
			n = n + 1
		}
		else
		{
			i = i + 1
		}
	}
	j = j + 1
	finished = false
}
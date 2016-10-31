int i , j = 2
boolean finished = false
println "This program shows prime number less than 1000."
while ( j < 1000)
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
		}
		else
		{
			i = i + 1
		}
	}
	j = j + 1
	finished = false
}
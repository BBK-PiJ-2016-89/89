String str ="", str1 = ""
int n = 0, m = 0, l = 0
while( l <= 3)
{
	l += 1
	print "Please input a letter(R or S or P): "
	str1 = System.console().readLine()
	int rannum = Math.abs(3 * Math.random())
	if ( rannum == 1)
	{
		str = "R"
	}
	else if ( rannum == 2)
	{
		str = "S"
	}
	else
	{
		str ="P"
	}
	println "You have entered: " + str1 + " Computer has entered: " + str
	if (str == str1)
	{
		println str + str1
		l = l - 1
	}
	else if (str == "R" && str1 == "S")
	{
		n += 1
	}
	else if (str == "R" && str1 == "P")
	{
		m += 1
	}
	else if (str == "S" && str1 == "P")
	{
		n += 1
	}
	else if (str == "S" && str1 == "R")
	{
		m += 1
	}
	else if (str == "P" && str1 == "R")
	{
		n += 1
	}
	else
	{
		m += 1
	}
	if (n >= 2)
	{
		println "The computer has won."
	}
	else if (m >= 2)
	{
		println "You have won."
	}
}

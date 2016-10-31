String str = ""
int i = 2, num = 0, diff = 0, num1 = 0
boolean finished = false, end = false
print "Enter a number: "
str = System.console().readLine()
num = Integer.parseInt(str)
num1 = num
while (!finished)
{
	num++
	while(!end)
	{
		if(num % i == 0 &&  i < num)
		{
			end = true
		}
		else if (num % i == 0 &&  i == num)
		{
			println "First prime = " + num
			end = true
			finished = true
		}
		else
		{
			++i
		}
	}
	end = false
}
diff = num - num1
i = 2
finished = false
while (!finished)
{
	if ((num1 - diff) % i == 0 && i < (num1 - diff))
	{
		finished = true
		println "There is no prime number in the same distance."
	}
	else if ((num1 - diff) % i == 0 && i == (num1 - diff))
	{
		println "Second prime = " + (num1-diff)
		println "The two numbers are in the same distance."
		finished = true
	}
	else
	{
		i++
	}
}

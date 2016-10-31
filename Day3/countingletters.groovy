int n = 0, l = 0, m = 0, times = 0
String str = "", str1 = ""
print "Enter a text: "
str = System.console().readLine()
print "Enter a short string to see how many times is repeated in the text: "
str1 = System.console().readLine()
boolean end = false
while (!end)
{
	if ( n == str.length())
	{
		end = true
	}
	else if (str.charAt(n).equals(str1.charAt(l))
			&& l < str1.length())
	{
		l += 1
		if ( l == str1.length())
		{
			times += 1
			l = 0
		}
	}
	n += 1
}

println "The string " + str1 + " has occurred " + times + " times."


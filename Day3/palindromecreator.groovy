String str = "", str1 = ""
boolean finished = false
int len = 0
print "Enter a text to see if it is a palindrome: "
str = System.console().readLine()
len = str.length()
while (!finished)
{
	str1 = str1 + str.substring(len-1, len)
	len -= 1
	if (len == 0)
	{
		finished = true
	}
}

	println  str + str1

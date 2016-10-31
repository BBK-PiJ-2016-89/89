println "This program counting any given letter in some text."
String str = "", letter = "", str1 = ""
int count = 0, len = 0, n = 0, m = 0
print "Please write a text: "
str = System.console().readLine()
boolean finished = false, end = false
while (!finished)
{
	print "Which letter would you like to count now? "
	letter = System.console().readLine()
	str1 = str1 + letter
	while(!end)
	{
		if (str1.charAt(n).equals(letter)
			&& m == 2)
		{
			finished = true
			end = true
			println "Repeated character. Exiting the program..."
			println "Thank you for your cooperation. Good bye!"
		}
		m += 1
	}
	len = str.length()
	while(n < len)
	{
		if (str.charAt(n).equals(letter))
		{
			count += 1
		}
		n += 1
	}
	print "There are " + count + " in your text."
	println ""
	m = 0
	n = 0
}


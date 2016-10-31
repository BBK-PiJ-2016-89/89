println "This program counting letter ,e, in some text."
String str = "", letter = "e"
int count = 0, len = 0, n = 0
print "Enter a text: "
str = System.console().readLine()
len = str.length()
while( n < len )
{
	if ( str.substring(n, n+1).equals("e"))
	{
		count += 1
	}
	n += 1
}
println "The letter e occured " + count + " times in the text."

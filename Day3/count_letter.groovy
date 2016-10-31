println "This program counting any given letter in some text."
String str = "", letter = ""
int count = 0, len = 0, n = 0
print "Enter a text: "
str = System.console().readLine()
len = str.length()
print "Enter a letter to search: "
letter = System.console().readLine()
while( n < len )
{
	if ( str.substring(n, n+1).equals(letter))
	{
		count += 1
	}
	n += 1
}
println "The letter " + letter + " occured " + count + " times in the text."
print "Enter a word or sentence: "
String str = System.console().readLine()
int len = 0, count = 0
len = str.length()
while ( count < len )
{
	println str.substring(count, count + 1)
	count += 1
}
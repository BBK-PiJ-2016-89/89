print "Enter a word or a sentence: "
String str = System.console().readLine()
String str1 = ""
int count = 0, len = 0
len = str.length()
boolean finished = false 
while ( !finished )
{
	str1 = str1 + str.substring(count, count+1)
	if( count == len - 1)
	{
		print str1
		finished = true
	}
	else if (str.substring(count , count+1).equals(" "))
	{
		println str1
		str1 = ""
	}
	count += 1
}
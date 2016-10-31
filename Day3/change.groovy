String str =""
int fiftyp = 0, twentyp = 0, tenp = 0, fivep = 0, twop = 0, onep = 0,diff = 0, diff1 = 0,fiftynote = 0, twentynote = 0, tennote = 0, fivenote = 0, twocoin = 0, onecoin = 0
double change = 0.0, note = 0.0, due = 0.0, paid = 0.0
println "you have to pay: "
str = System.console().readLine()
due = Double.parseDouble(str)
due *= 100
print "Which note or coin the customer has paid: "
str = System.console().readLine()
paid = Double.parseDouble(str)
paid *= 100
diff = paid - due
diff1 = diff
diff1 = diff1 % 100
diff = diff - diff1
while (diff1 != 0)
{
	if ( diff1 >= 50)
	{
		diff1 = diff1 - 50
		fiftyp = 1
	}
	else if (diff1 >= 20)
	{
		diff1 = diff1 - 20
		twentyp += 1
	}
	else if (diff1 >= 10)
	{
		diff1 = diff1 - 10
		tenp = 1
	}
	else if (diff1 >= 5)
	{
		diff1 = diff1 - 5
		fivep = 1
	}
	else if ( diff1 >= 2)
	{
		diff1 = diff1 - 2
		twop += 1
	}
	else if ( diff1 >= 1)
	{
		diff1 = diff1 - 1
		onep = 1
	}
}
diff /= 100
println " diff = " + diff
while (diff != 0)
{
	if ( diff >= 50 )
	{
		diff -= 50
		fiftynote += 1
	}
	else if (diff >= 20)
	{
		diff -= 20
		twentynote += 1
	}
	else if (diff >= 10)
	{
		diff -= 10
		tennote += 1
	}
	else if (diff >= 5)
	{
		diff -= 5
		fivenote += 1
	}
	else if (diff >= 2)
	{
		diff -= 2
		twocoin += 1
	}
	else if ( diff >= 1)
	{
		diff -= 1
		onecoin += 1
	}
}
println "£50 = "+ fiftynote + "," + "£20 = " + twentynote + "," + "£10 = " + tennote + "," + "£5 = " + fivenote + "," + "£2 = " + twocoin + "," + "£1 = " + onecoin +"," + "50p = " + fiftyp +","+ "20p = " + twentyp+","+ "10p = " +tenp+","+ "5p = " + fivep+","+ "2p = " + twop+","+"1P = " + onep
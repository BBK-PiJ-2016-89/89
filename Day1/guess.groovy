int numberToGuess = Math.abs(1000 * Math.random())
int number = 0, n = 1
String str
boolean finished = false
println "Please guess a number between 0 and 1000."
while (!finished)
{
	print "Tell me a number: "
	str = System.console().readLine()
	number = Integer.parseInt(str)
	if ( number < 0 || number > 1000)
	{
		println "The number you have entered is out of range."
		finished = true
	}
	else if ( number == numberToGuess)
	{
		println "CORRECT!"
		println " YOU NEEDED " + n + " guesses"
		finished = true
	}
	else if (number > numberToGuess)
	{
		println "No! My number is lower."
		n++
	}
	else
	{
		println "No! My number is higher."
		n++
	}
}
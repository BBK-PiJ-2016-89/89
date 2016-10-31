double calculateTotal(double amount, double rate)
{
	double total = amount * (1 + rate/100)
	return total
}
double period(double amount, double rate, int years)
{
	double total = calculateTotal(amount, rate)
	return total/years
}
double iniCapital(double amount, double rate, int years)
{
	double total = calculateTotal(amount, rate)
	double capital = total - amount
	double yearlyPa = period(amount, rate, years)
	return capital/yearlyPa
}

println "This program calculate the total amount borrowed for a mortgage. "

print "Enter the money borrowed: "
String str = System.console().readLine()
int amount = Double.parseDouble(str)

print "Enter the rate: "
str = System.console().readLine()
int rate = Double.parseDouble(str)

double total = calculateTotal(amount, rate)
println "The total amount is " + total

print "Enter the years you want to pay it back: "
str = System.console().readLine()
int years = Double.parseDouble(str)

double yearly = period(amount, rate, years)
println "Each year you have to pay " + yearly + " for " + years + " years."

double initialCa = iniCapital(amount, rate, years)
println "After " + initialCa + "years only the initial capital remains."
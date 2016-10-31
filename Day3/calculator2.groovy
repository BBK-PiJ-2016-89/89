String str1 = "", str2 = "", str3 = ""
double num1 = 0, num2 = 0
int choice = 0, n = 0
boolean finished = false
println "Enter two numbers to peform the calculation like (2*3 0r 3 * 6):"
str1 = System.console().readLine()
while (!finished)
{
	if ((str1.substring(n, n+1).equals("*")) || (str1.substring(n, n+1).equals("/")) || (str1.substring(n, n+1).equals("+")) || (str1.substring(n, n+1).equals("-")) || (str1.substring(n, n+1).equals(" ")))
	{
		finished = true
	}
	else
	{
	str2 = str2 + str1.charAt(n)
	n += 1
	}
}
num1 = Double.parseDouble(str2)
if ((str1.substring(n, n+1).equals("*") || str1.substring(n+1, n+2).equals("*")))
{
	choice = 1
}
else if ((str1.substring(n, n+1).equals("/") || str1.substring(n+1, n+2).equals("/")))
{
	choice = 2
}
else if ((str1.substring(n, n+1).equals("+") || str1.substring(n+1, n+2).equals("+")))
{
	choice = 3
}
else if ((str1.substring(n, n+1).equals("-") || str1.substring(n+1, n+2).equals("-")))
{
	choice = 4
}
if ( (str1.substring(n, n+1).equals("*")) || (str1.substring(n, n+1).equals("/")) || (str1.substring(n, n+1).equals("+")) || (str1.substring(n, n+1).equals("-")))
{
	str3 = str1.substring(n + 1)
}
else
{
	str3 = str1.substring(n + 2)
}
num2 = Double.parseDouble(str3)
switch (choice) {
case 1:
	println num1 + " * " + num2 + " = " + (num1 * num2)
break;
case 2:
	println num1 + " / " + num2 + " = " + (num1 / num2)
break;
case 3:
	println num1 + " + " + num2 + " = " + (num1 + num2)
break;
case 4:
	println num1 + " - " + num2 + " = " + (num1 - num2)
break;
default:
	println "Wrong oprand or numbers!"
break;
}
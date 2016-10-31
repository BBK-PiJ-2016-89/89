String str = "", str1 = ""
double num1 = 0.0, num2 = 0.0, answer = 0.0
println "Please enter  mathematical operation (one of the four basic ones) with two operands: "
str = System.console().readLine()
str1 = str.substring(0,1)
num1 = Double.parseDouble(str1)
str1 = str.substring(2)
num2 = Double.parseDouble(str1)
if (str.substring(1,2) == "+")
{
	chioce = 1
}
else if (str.substring(1,2) == "-")
{
	choice = 2
}
else if (str.substring(1,2) == "*")
{
	choice = 3
}
else if (str.substring(1,2) == "/")
{
	choice = 4
}
switch (choice) {
case 1:
	answer = num1 + num2
	println "The addition of " + num1 + " and " + num2 +" = " + answer
	break;
case 2:
	answer = num1 - num2
	println "The subtraction of " + num1 + " and " + num2 +" = " + answer
	break;
case 3:
	answer = num1 * num2
	println "The multipication of " + num1 + " and " + num2 +" = " + answer
	break;
case 4:
	answer = num1 / num2
	println "The division of " + num1 + " and " + num2 +" = " + answer
	break;
default:
	println "Maybe you did not choose the right choice!"
	break;
}
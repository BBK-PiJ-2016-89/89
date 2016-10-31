double num1 = 0.0 , num2 = 0.0, answer = 0.0
int choice = 0
String str
println " Enter two numbers to perform the calculation: "
print "Please enter the first number: "
str = System.console().readLine()
num1 = Double.parseDouble(str)
print "Please enter the second number: "
str = System.console().readLine()
num2 = Double.parseDouble(str)
println "Choose a number to perform the calculation: "
print "1 for addition, 2 for subtraction, 3 for multpication, and 4 for division: "
str = System.console().readLine()
choice = Integer.parseInt(str)
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
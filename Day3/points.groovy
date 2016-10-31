String str = ""
double firstdistance = 0, seconddistance = 0, thirddistance = 0
class Point{
	double x;
	double y;
}
print "Please enter the first points:"
Point first = new Point()
print "x = "
str = System.console().readLine()
first.x = Double.parseDouble(str)
print "y = "
str = System.console().readLine()
first.y = Double.parseDouble(str)
print "Please enter the second points:"
Point second = new Point()
print "x = "
str = System.console().readLine()
second.x = Double.parseDouble(str)
print "y = "
str = System.console().readLine()
second.y = Double.parseDouble(str)
print "Please enter the third points:"
Point third = new Point()
print "x = "
str = System.console().readLine()
third.x = Double.parseDouble(str)
print "y = "
str = System.console().readLine()
third.y = Double.parseDouble(str)
firstdistance = Math.sqrt((Math.pow(first.x-second.x , 2))+ (Math.pow(first.y-second.y , 2)))
println "firstdistance = " + firstdistance
seconddistance = Math.sqrt((Math.pow(first.x-third.x , 2))+ (Math.pow(first.y-third.y , 2)))
println "secondistance = " + seconddistance
thirddistance = Math.sqrt((Math.pow(second.x-third.x , 2))+ (Math.pow(second.y-third.y , 2)))
println "thirddistance = " + thirddistance
if (firstdistance < seconddistance && firstdistance < thirddistance)
{
	println "The first and second points are closer."
}
else if (seconddistance < firstdistance && seconddistance < thirddistance)
{
	println "The first and third points are closer."
}
else if (thirddistance < firstdistance && thirddistance < seconddistance)
{
	println "The second and third points are closer."
}
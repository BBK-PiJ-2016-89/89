class Point {
	double x
	double y
}
class Rectangle {
	Point upLeft
	Point downRight
}
class Inside {
	Point A
}
print "Enter the x and y value for the first point: x = "
Point firstpoint = new Point()
firstpoint.x = Double.parseDouble(System.console().readLine())
print "y = "
firstpoint.y = Double.parseDouble(System.console().readLine())
print "Enter the x and y value for the second point: x = "
Point secondpoint = new Point()
secondpoint.x = Double.parseDouble(System.console().readLine())
print "y = "
secondpoint.y = Double.parseDouble(System.console().readLine())
Rectangle myRectangle = new Rectangle()
myRectangle.upLeft = firstpoint
myRectangle.downRight = secondpoint
print "Enter a point to see if it is in the rectangle: x = "
Point thirdpoint = new Point()
thirdpoint.x = Double.parseDouble(System.console().readLine())
print "y = "
thirdpoint.y = Double.parseDouble(System.console().readLine())
Inside inside = new Inside()
inside.A = thirdpoint
if ( inside.A.x >= myRectangle.upLeft.x && inside.A.x <= myRectangle.downRight.x 
	&& inside.A.y <= myRectangle.upLeft.y && inside.A.y >= myRectangle.downRight.y)
{
	println "The point is inside the rectangle."
}
else
{
	println "The point is not inside the rectangle."
}
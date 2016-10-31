class Point {
	double x
	double y
}
class Rectangle {
	Point upLeft
	Point downRight
}
print "Enter the x and y value for the first point: "
Point firstpoint = new Point()
firstpoint.x = Double.parseDouble(System.console().readLine())
firstpoint.y = Double.parseDouble(System.console().readLine())
print "Enter the x and y value for the second point: "
Point secondpoint = new Point()
secondpoint.x = Double.parseDouble(System.console().readLine())
secondpoint.y = Double.parseDouble(System.console().readLine())
Rectangle myRectangle = new Rectangle()
myRectangle.upLeft = firstpoint
myRectangle.downRight = secondpoint
println "Perimeter: " + 2*((myRectangle.downRight.x - myRectangle.upLeft.x)+(myRectangle.upLeft.y - myRectangle.downRight.y))
println "Area: " + ((myRectangle.downRight.x - myRectangle.upLeft.x)*(myRectangle.upLeft.y - myRectangle.downRight.y))
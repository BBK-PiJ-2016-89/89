class Point {
		double x
		double y
		double distance2point(Point p)
		{
			return Math.sqrt((Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2)))
		}
		double distance2origin()
		{
			Point origin = new Point()
			origin.x = 0
			origin.y = 0
			return distance2point(origin)
		}
		void moveTo(double a, double b)
		{
			this.x = a
			this.y = b
			println "These are the new points " + this.x + ", " + this.y
		}
		void moveTo(Point t)
		{
			this.x = t.x
			this.y = t.y
			println "These are the new points " + this.x + ", " + this.y
		}
		Point clone()
		{
			Point p = new Point()
			p.x = x
			p.y = y
			return p
		}
		Point opposite()
		{
			Point p = new Point()
			p.x = -x
			p.y = -y
			return p
		}
}
println "You can find the distance of two points by choosing zero."
println "you find out a distance between a point and origin by choosing one."
println "You can change the first point to new point by choosing two."
println "You can change the first point to new point alternatively by choosing three."
println "For cloning please choose four."
println "For opposite points choose five."
String s = System.console().readLine()
int choice = Integer.parseInt(s)
switch (choice){
	case 0: 	println "Please enter first point: "
				Point one = new Point()
				print "First point x = "
				String str = System.console().readLine()
				one.x = Double.parseDouble(str)
				print "First point y = "
				str = System.console().readLine()
				one.y = Double.parseDouble(str)
				println "Please enter the second point: "
				Point two = new Point()
				print "Second point x = "
				str = System.console().readLine()
				two.x = Double.parseDouble(str)
				print "First point y = "
				str = System.console().readLine()
				two.y = Double.parseDouble(str)
				double result = one.distance2point(two)
				println "The distance between the two points is : " + result
				break;
	case 1:		println "Please enter first point: "
				Point one = new Point()
				print "First point x = "
				String str = System.console().readLine()
				one.x = Double.parseDouble(str)
				print "First point y = "
				str = System.console().readLine()
				one.y = Double.parseDouble(str)
				println "Distance from the orgin " + one.distance2origin()
				break;
	case 2:		println "Please enter first point: "
				Point one = new Point()
				print "First point x = "
				String str = System.console().readLine()
				one.x = Double.parseDouble(str)
				print "First point y = "
				str = System.console().readLine()
				one.y = Double.parseDouble(str)
				println "If you want to move to new point enter x and y:"
				print "new x = "
				str = System.console().readLine()
				double a = Double.parseDouble(str)
				print "new y = "
				str = System.console().readLine()
				double b = Double.parseDouble(str)
				one.moveTo(a, b)
				break;
	case 3:		println "Please enter first point: "
				Point one = new Point()
				print "First point x = "
				String str = System.console().readLine()
				one.x = Double.parseDouble(str)
				print "First point y = "
				str = System.console().readLine()
				one.y = Double.parseDouble(str)
				println"If you want to move this point to the given point."
				Point given = new Point()
				print "given.x = "
				str = System.console().readLine()
				given.x = Double.parseDouble(str)
				print "given.y = "
				str = System.console().readLine()
				given.y = Double.parseDouble(str)
				one.moveTo(given)
				break;
	case 4:		println "Please enter first point: "
				Point one = new Point()
				print "First point x = "
				String str = System.console().readLine()
				one.x = Double.parseDouble(str)
				print "First point y = "
				str = System.console().readLine()
				one.y = Double.parseDouble(str)
				A = one.clone()
				println "the point is: " + A.x + ", " + A.y
				break;
	case 5:		println "Please enter first point: "
				Point one = new Point()
				print "First point x = "
				String str = System.console().readLine()
				one.x = Double.parseDouble(str)
				print "First point y = "
				str = System.console().readLine()
				one.y = Double.parseDouble(str)
				B = one.opposite()
				println "the point is: " + B.x + ", " + B.y
				break;
	default: 	println "Invalid option. Please try again."
				break;
}




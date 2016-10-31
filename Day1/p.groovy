String str =""
int n, m = -1, l = 0
double p = 0
print "Enter a number for the number of percision: "
str = System.console().readLine()
n = Integer.parseInt(str)
while(l < n)
{
	m *= -1
	p += (4*m)/(2*l+1)
	l++
}
print "number of " + n +" to find 3.14159 is = "+ p
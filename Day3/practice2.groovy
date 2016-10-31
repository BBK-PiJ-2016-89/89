class Person {
	String name;
	int age;
	Person father;
	Person mother;
}
Person employee = new Person();
employee.name = "John Smith";
employee.age = 45;
println "BOSS: How old are you, " + employee.name + "?"
println "EMPLOYEE: I am " + employee.age + " years old.";
Person john = new Person();
john.name = "John Smith";
john.age = 35;
Person mary = new Person();
mary.name = "Mary Smith";
mary.age = 32;
Person student = new Person();
student.name = "John Smith, Jr.";
student.age = 5;
student.father = john
student.mother = mary
println "TEACHER: How old are you, " + student.name + "?"
println "LITTLE JOHN: I am " + student.age + " years old, sir.";
println "TEACHER: Who is your mother?"
println "LITTLE JOHN: " + student.mother.name + ", sir.";
println "Little John: " + student.father.name
println "Little John: " + student.father.age
Person grand = new Person();
grand.name = "Joe Smith";
grand.age = 70;
john.father = grand
println "The grand pa: " + student.father.father.name
println "The age of the grand pa: " + student.father.father.age

# Student-department
Classess:
1. Student -> properties: a unique id, name, department (Department)
2. Department -> properties: a unique id, name, list of students(Student)


Requirements:
1. The Student class is immutable.<br />
2. Builder pattern for creating student class.<br />
3. The Department class is immutable.<br />
4. If Department publishes any notices it will notify all the students(Observer pattern).<br />

Immutable class means that once an object is created, we cannot change its content. In Java, all the wrapper classes (like Integer, Boolean, Byte, Short) and String class is immutable. We can create our own immutable class as well. 

Following are the requirements: 
-The class must be declared as final (So that child classes can’t be created)<br />
-Data members in the class must be declared as private (So that direct access is not allowed)<br />
-Data members in the class must be declared as final (So that we can’t change the value of it after object creation)<br />
-A parametrized constructor should initialize all the fields performing a deep copy (So that data members can’t be modified with object reference)<br />
-Deep Copy of objects should be performed in the getter methods (To return a copy rather than returning the actual object reference)<br />
-No setters (To not have the option to change the value of the instance variable)<br />

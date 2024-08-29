package encapsulation; //example of encapsulation

public class Student
{
private String name;//declared a string in private

public String getName()//declared a inbuilt method getName() for getting the string.
                       //its a string so return type is string
{
	return name;
}

public void setName(String name)//declared another method setName() for setting the string.
{
	this.name=name;
}
}

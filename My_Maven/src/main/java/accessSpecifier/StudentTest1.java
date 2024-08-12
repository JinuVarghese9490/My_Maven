package accessSpecifier;

import access.Student;//not accesable within the package
public class StudentTest1 extends Student
{

	public static void main(String[] args) {
		Student obj=new Student();
		System.out.println(obj.s);
		System.out.println(obj.a);
		
		

	}

}

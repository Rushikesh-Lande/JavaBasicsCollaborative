//Create your own immutable class Student with fields: name, rollNumber, and a list of subjects. Ensure no one can modify the //object once it’s created
public final class Student 
{
private final String name;
private final int rollNumber;
private final String subject;

public Student(String name ,int rollNumber,String subject)
{
this.name=name;
this.rollNumber=rollNumber;
this.subject =subject;

}

public String getName()
{
   return name;
}
public int getRollNumber()
{
   return rollNumber;
}
public String getSubject()
{
   return subject;
}


public static void main(String[] args)
{
Student s = new Student("vishal",101,"Math");
System.out.println("name :"+s.getName());
System.out.println("name :"+s.getRollNumber());
System.out.println("name :"+s.getSubject());
}
}
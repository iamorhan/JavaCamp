public class InstructorManager extends UserManager
{
	public void add() 
	{
		
	}
	
	public void addAssignment(Instructor instructor) 
	{
		System.out.println("E�itmen "+instructor.getName()+" "+instructor.getSurname()+" sisteme �dev y�kledin");
	}
	
	public void checkAttendance(Student student) {
		System.out.println(student.getName()+" " + student.getSurname() + " Bug�n dersine kat�ld�");
	}
}

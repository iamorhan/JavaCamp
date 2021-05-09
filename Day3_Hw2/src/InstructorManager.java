public class InstructorManager extends UserManager
{
	public void add() 
	{
		
	}
	
	public void addAssignment(Instructor instructor) 
	{
		System.out.println("Eðitmen "+instructor.getName()+" "+instructor.getSurname()+" sisteme ödev yükledin");
	}
	
	public void checkAttendance(Student student) {
		System.out.println(student.getName()+" " + student.getSurname() + " Bugün dersine katýldý");
	}
}

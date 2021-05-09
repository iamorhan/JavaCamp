public class Main 
{
	public static void main(String[] args)
	{
		Student student =new Student();
		student.setId(1);
		student.setName("Orhan");
		student.setSurname("�zt�rk");
		student.setEmail("myemail@gmail.com");	
		student.setPassword("mypassword");
		System.out.println(student.getId()+" id'li ��renci ad� ve soyad�: "+student.getName()+" "+student.getSurname()+","+
				"Bu ��rencinin mail adresi "+student.getEmail());
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setName("Orhan");
		instructor.setSurname("�zt�rk");
		instructor.setEmail("myemail@gmail.com");
		instructor.setPassword("mypassword");
		System.out.println(student.getId()+" id'li e�itmenin ad� ve soyad�: "+instructor.getName()+" "+instructor.getSurname()+","+
				"Bu e�itmenin mail adresi "+instructor.getEmail());
		
		UserManager userManager = new UserManager();
		userManager.addStudent(student);
		userManager.addInstructor(instructor);
		userManager.signup(instructor);
		userManager.login(instructor);
		userManager.logout(instructor);
		userManager.signup(student);
		userManager.login(student);
		userManager.logout(student);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.addAssignment(instructor);
		instructorManager.checkAttendance(student);
		
		
		StudentManager studentManager=new StudentManager();
		studentManager.submitAssignment(student);
		studentManager.deleteAssignment(student);
	}

}

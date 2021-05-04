public class Main 
{

	public static void main(String[] args) 
	{
		Course course1 = new Course(1,"C# + Angular"," Engin Demiro�");
		Course course2 = new Course(2,"Java + React", "Engin Demiro�");
		Course course3 = new Course(3,"Programlamaya Giri� i�in Temel Kurs"," Engin Demiro�");
		
		Course [] courses=
		{
			course1,course2,course3
		};
		
		for (Course course : courses) 
		{
			System.out.println("Kurs id'si "+course.id+","+" Kurs ad� "+course.courseName+","+
					" Kurs e�itmeni "+course.instructorName);
		}
		
		System.out.println("Kurs say�s�="+courses.length);
		System.out.println("");
		
		Student student1 = new Student(1,"Orhan","�zt�rk");
		Student student2 = new Student(2,"Orhan","�zt�rk");
		
		Student [] students = 
		{
			student1,student2	
		};
		
		for (Student student : students) 
		{
			System.out.println("��renci id'si "+student.id+","+" ��renci ad� soyad� "
		+student.studentName+" "+student.studentSurname);
		}
		System.out.println("��renci say�s�="+students.length);
		System.out.println("");
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		System.out.println("");
		StudentManager studentManager = new StudentManager();
		studentManager.addToStudent(student1);
		studentManager.addToStudent(student2);
	}

}

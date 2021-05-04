public class Main 
{

	public static void main(String[] args) 
	{
		Course course1 = new Course(1,"C# + Angular"," Engin Demiroğ");
		Course course2 = new Course(2,"Java + React", "Engin Demiroğ");
		Course course3 = new Course(3,"Programlamaya Giriş için Temel Kurs"," Engin Demiroğ");
		
		Course [] courses=
		{
			course1,course2,course3
		};
		
		for (Course course : courses) 
		{
			System.out.println("Kurs id'si "+course.id+","+" Kurs adı "+course.courseName+","+
					" Kurs eğitmeni "+course.instructorName);
		}
		
		System.out.println("Kurs sayısı="+courses.length);
		System.out.println("");
		
		Student student1 = new Student(1,"Orhan","Öztürk");
		Student student2 = new Student(2,"Orhan","Öztürk");
		
		Student [] students = 
		{
			student1,student2	
		};
		
		for (Student student : students) 
		{
			System.out.println("Öğrenci id'si "+student.id+","+" Öğrenci adı soyadı "
		+student.studentName+" "+student.studentSurname);
		}
		System.out.println("Öğrenci sayısı="+students.length);
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

package relations;

import java.util.ArrayList;
import java.util.List;

public class GFG {

	public static void main(String[] args) {
		
		Student s1 = new Student("Priya", 1, "CSE");
		Student s2 = new Student("Miya", 4, "CSE");
		Student s3 = new Student("Jim", 11, "EEE");
		Student s4 = new Student("Tom", 21, "EEE");

		List<Student> cse_students = new ArrayList<Student>();
		cse_students.add(s1);
		cse_students.add(s2);
		
		List<Student> eee_students = new ArrayList<Student>();
		eee_students.add(s3);
		eee_students.add(s4);
		
		Department CSE = new Department("CSE", cse_students);
		Department EEE = new Department("EEE", eee_students);
		
		List<Department> departments = new ArrayList<Department>();
		departments.add(CSE);
		departments.add(EEE);
		
		Institute institute = new Institute("HITK", departments);
		System.out.println("Total number of students in the institute : ");
		System.out.println(institute.getTotalStudentInInstitute());
	}

}

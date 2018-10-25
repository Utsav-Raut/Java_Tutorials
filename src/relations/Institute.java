package relations;

import java.util.List;

public class Institute {

	String instituteName;
	private List<Department> departments;
	
	Institute(String instituteName, List<Department> departments) {
		this.instituteName = instituteName;
		this.departments = departments;
	}
	
	public int getTotalStudentInInstitute(){
		int numberOfStudents = 0;
		List<Student> students;
		for(Department dept: this.departments) {
			students = dept.getStudents();
			numberOfStudents += students.size();
		}
		
		return numberOfStudents;
	}
}

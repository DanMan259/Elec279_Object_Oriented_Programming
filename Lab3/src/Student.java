
public class Student extends Person{
	private int NumberCourses;
	private String CourseCodes [];
	private int	CourseGrades[];
	private final static int MaxCourses = 20;
	public Student(String name, String address, int idNum){
		super(name, address, idNum);
		NumberCourses = 0;
		CourseCodes = new String[MaxCourses];
		CourseGrades= new int[MaxCourses];
	}
	public String toString() {
		return "Student: "+super.toString()+"\n";
	}
	public void addGrade(String CourseCode, int Grade) {
    	CourseCodes[NumberCourses] = CourseCode;
    	CourseGrades[NumberCourses++] = Grade;
	}
	public void printGrades() {
		for(int i=0; i<NumberCourses;i++) {
			System.out.println("Course Code:"+CourseCodes[i]+"\nGrade:"+CourseGrades[i]+"\n");
		}
	}
	public static void main(String[] args) {
		Person p1 = new Person("Julia","181 University Ave.", 121456);
		System.out.println(p1.toString());
        Student s1 = new Student("John", "189 University Ave", 246718);
        s1.addGrade("ELEC 279", 97);
        s1.addGrade("ElEC 221", 68);
        System.out.println(s1.toString());
        s1.printGrades();
	}
}

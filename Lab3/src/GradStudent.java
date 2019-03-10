
public class GradStudent extends Student{
	private int NumberCommittee;
	private int NumberExams;
	private String examNames[];
	private String examGrades[];
	private final static int MaxExams = 6;
	public GradStudent(String name, String address, int idNum){
		super(name, address, idNum);
		NumberCommittee = 0;
		NumberExams = 0;
		examNames = new String[MaxExams];
		examGrades= new String[MaxExams];
	}
	public int getNumberCommittee() {
		return NumberCommittee;
	}
	public void setNumberCommittee(int i) {
		NumberCommittee = i;
	}
	public void addGrade(String CourseCode, String Grade) {
		examNames[NumberExams] = CourseCode;
		examGrades[NumberExams++] = Grade;
	}
	public String toString() {
		return "Grad: "+super.toString()+"\n";
	}
	public void printExamGrades() {
		for(int i=0; i<NumberExams;i++) {
			System.out.println("Exam Name:"+examNames[i]+"\nGrade:"+examGrades[i]+"\n");
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
        GradStudent s2 = new GradStudent("Tom","92 Reg st.", 1014);
        s2.addGrade("ELEC_279", 97);
        s2.addGrade("ELEC_271", 88);
        s2.addGrade("CompI", "PASS");
        s2.addGrade("COMPII", "PASS");
        s2.addGrade("Thesis defense first trial", "FAIL");
        s2.addGrade("Thesis defense second trial", "FAIL");
        s2.printExamGrades();
        s2.printGrades();
	}
}

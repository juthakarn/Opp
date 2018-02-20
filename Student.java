public class Student{

	private String stCode;
	private String name;
	private double gpa;

	public Student(){

	}
	public Student(String stCode,String name){
		this.stCode = stCode;
		this.name = name;
	}
	public Student(String stCode,String name,double gpa){
		this.stCode = stCode;
		this.name = name;
		this.gpa = gpa;
	}
	public String getCode(){
		return stCode;
	}
	public String getName(){
		return name;
	}
	public double getGPA(){
		return gpa;
	}
	public void setGPA(double gpa){
		this.gpa = gpa;
	}
	public String toString(){
		String s = "id: " +stCode+ " name: " +name+ " GPA: " +gpa;
		return s;
	}
}

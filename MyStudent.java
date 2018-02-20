public class MyStudent{
	public static void main(String[] args){
		StudentList Yorwor = new StudentList();

		Student st = new Student("5552277","Juthakarn",2.50);
		Student st1 = new Student("332255","Yoon",3.50);
		Student st3 = new Student("662233","Ying",4.00);
		System.out.println(st.getName());
		Yorwor.addStudent(st);
		Yorwor.addStudent(st1);
		Yorwor.addStudent(st3);

		Yorwor.showAllStudentInfo();

		System.out.println(Yorwor.searchStudentBystCode("662233"));
		System.out.println(Yorwor.searchStudentBystCode("332255"));
		System.out.println(Yorwor.removeStudentBystCode("332255"));

		Yorwor.showAllStudentInfo();
	}
}
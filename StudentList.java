import java.util.*;

public class StudentList{
	private ArrayList<Student> StudentList;

public StudentList(){
	this.StudentList = new ArrayList<Student>();
}

public void addStudent(Student st){
	this.StudentList.add(st);
}

public int searchStudentBystCode(String stCode){
	int i;
	for(i=0;i<this.StudentList.size();i++){
		if(this.StudentList.get(i).getCode()==stCode){
			return i;
		}
		else{
			continue;
		}
	}
	return -1;
}

public boolean removeStudentBystCode(String stCode){
	if(this.searchStudentBystCode(stCode) != -1){
		this.StudentList.remove(this.searchStudentBystCode(stCode));
		return true;
	}
	else{
		return false;
	}
}

public void showAllStudentInfo(){
	int i;
	for(i=0;i<this.StudentList.size();i++){
		System.out.println(this.StudentList.get(i));
	}
}

public int getnumberOfStudent(){
	return this.StudentList.size();
}

}
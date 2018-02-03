public class Book{

private String title;
private int pagenumber;
private String auther;

public Book (String title,int pagenumber,String auther){
	this.title = title;
	this.pagenumber = pagenumber;
	this.auther = auther;
}

public String gettitle(){
	return title;
}
public int getpagenumber(){
	return pagenumber;
}
public String getauther(){
	return auther;
}

public void settitle(String title){
	this.title = title;
}
public void setpagenumber(int pagenumber){
	this.pagenumber = pagenumber;
}
public void setauther(String auther){
	this.auther = auther;
}

public void showBook(){
	System.out.println(title);
	System.out.println(pagenumber);
	System.out.println(auther);
}

public boolean samebook(String title,int pagenumber,String auther){
	if (this.title == title&&this.pagenumber == pagenumber&&this.auther == auther){
		return true;
	}
	else{
		return false;
	}
}

}
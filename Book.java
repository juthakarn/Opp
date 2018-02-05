public class Book{

private String title;
private int pagenumber;
private String auther;

public Book(String title,int pagenumber,String auther){
	/*constructor recieve title,pagenumber,auther*/
	this.title = title;
	this.pagenumber = pagenumber;
	this.auther = auther;
}
public Book (String title,int pagenumber){
	/*constructor recieve title,pagenumber*/
	this.title = title;
	this.pagenumber = pagenumber;
}
public Book(String title){
	/*not recieve any parameter*/
}
public Book(){
	/*not recieve any parameter*/
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
	System.out.println("title:"+title+": "+pagenumber+" "+auther);	
}

public boolean samebook(String title,int pagenumber,String auther){
	if (this.title == title||this.pagenumber == pagenumber||this.auther == auther){
		return true;
	}
	else{
		return false;
	}
}

}
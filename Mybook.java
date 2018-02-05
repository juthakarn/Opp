public class Mybook{

public static void main(String[] args){
	Book Mybook1;
	Mybook1 = new Book();
	
	Book Mybook2;
	Mybook2 = new Book("javaprogramming");

	Book Mybook3;
	Mybook3 = new Book("cprogramming",500);

	Mybook1.settitle("oop");
	Mybook1.setpagenumber(1000);

	Mybook2.settitle("network");
	Mybook2.setpagenumber(600);

	Mybook1.showBook();
	Mybook2.showBook();
	Mybook3.showBook();

	Mybook1.setauther("jk");
	Mybook1.showBook();

	if(Mybook1.samebook("oop",1000,"JK")){
		System.out.println("true");
	}
	else{
		System.out.println("flase");
	}
}

}
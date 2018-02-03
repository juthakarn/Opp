public class Mybook{

public static void main(String[] args){
	Book Little_Prince;
	Little_Prince = new Book("Little Prince",89,"Jason Ham");

	Book Harry_Potter;
	Harry_Potter = new Book("Harry Potter",238,"Jk Rolling");

	Book Doraemon;
	Doraemon = new Book("Doraemon",56);

	Little_Prince.showBook();
	Harry_Potter.showBook();
	Doraemon.showBook();
}

}
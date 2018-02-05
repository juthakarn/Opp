public class Mypoint{

public static void main(String[] args){
	Point pt1 = new Point(2,3,4);
	Point pt2 = new Point(5,6,7);
	Point pt3 = new Point(8,9,1);

	pt1.showPoint();
	pt2.showPoint();
	pt3.showPoint();

	pt2.movebyvalue(10,11,12);
	pt2.showPoint();

	pt1.movebypoint(pt2);
	pt1.showPoint();
	}
}


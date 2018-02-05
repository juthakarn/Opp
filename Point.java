public class Point{
	private float x,y,z;

	public Point(){

	}
	public Point(float x){
		this.x = x;
	}
	public Point(float x,float y){
		this.x = x;
		this.y = y;
	}
	public Point(float x,float y,float z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public float getx(){
		return x;
	}
	public float gety(){
		return y;
	}
	public float getz(){
		return z;
	}
	public void setx(float x){
		this.x= x;
	}
	public void sety(float y){
		this.y = y;
	}
	public void setz(float z){
		this.z = z;
	}
	public void showPoint(){
		System.out.println(" x " + x + " y " + y + " z " + z);
	}
	public void movebyvalue(float x,float y,float z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public void movebypoint(Point newPoint){
		this.x = newPoint.getx();
		this.y = newPoint.gety();
		this.z = newPoint.getz();
	}
}
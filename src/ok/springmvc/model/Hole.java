package ok.springmvc.model;

public class Hole {
	private int number;
	private int par;
	private int course_id;
	
	public Hole(){}
	
	public Hole(int number, int par, int course_id){
		this.number = number;
		this.par = par;
		this.course_id = course_id;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getPar() {
		return par;
	}
	public void setPar(int par) {
		this.par = par;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	@Override
	public String toString() {
		return "Hole [number=" + number + ", par=" + par + ", course_id=" + course_id + "]";
	}
	
}

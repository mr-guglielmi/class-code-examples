
public class Student{

	protected int[] marks;
	protected String name;
	protected int grade;
	
	Student(String n, int g, int[] m){
		this.name = n;
		this.grade = g;
		this.marks = m;
	}
	
	public void nextGrade(){
		this.grade++;
	}
	
	public int computeAverage (){
		int average = 0;
		for (int i : this.marks){
			average += i;
		}
		
		return average / this.marks.length;
	}
	
	public int getMark (int i){
		return this.marks[i];
	}
	
	public void updateMark (int m, int i){
		this.marks[i] = m;
	}
	
}
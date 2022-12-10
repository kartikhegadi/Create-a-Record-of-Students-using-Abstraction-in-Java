
abstract public class Student {
	
	private String name;
	private int student_id;
	
	Student(String nm, int sid)
	{
		name=nm;
		student_id= sid;
	}
	
	public void basics()
	{
		System.out.println("Student Details \n");
		System.out.println("Name"+name);
		System.out.println("Reg number "+student_id);
		
	}
	
	public abstract String[] subjects();
	public abstract int learningcost();
	public abstract void details();
	

}

import java.util.Scanner;

public abstract class PartTimer implements StudentInterface{
	
	
	String name="QT";
	String subs[]=new String[maxcourses];
	Scanner s=new Scanner(System.in);

	public String name_id() {
		
		return name;
	}

	public String[] Subjects() {
		
		for(int i=0;i<maxcourses;i++)
		{
			System.out.println("Tyoe course name \n");
			subs[i]=s.next();
		}
		return subs;
	}
	
	public void output()
	{
		System.out.println("Name "+name);
		System.out.println("Courses");
		for(int i=0;i<maxcourses;i++)
		{
		 System.out.println(subs[i]);
		}
	}
	
	// the main method starts from here
	
	public static void main(String args[])
	{
		PartTimer pt= new PartTimer();
		pt.name_id();
		pt.subjects();
		pt.title();
		pt.output();
	
	}

	
	}
	
	



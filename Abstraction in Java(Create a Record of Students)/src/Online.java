
public abstract class Online extends Student {
	
	private String paltform;
	private int rate,totalcost=0;
	
	Online(String nm, int sid, String pf,int r) {
		super(nm, sid);
		paltform=pf;
		rate=r;
		
	}
	
	public String[] subjects()
	{
		String[] subs= {"DSALGO","JAVA","OPERATING SYSTEMS","OBJECT ORIRNTED PROGRAMMING"};
		return subs;
	}
	
	public int learningcost()
	{
		String subj[]=subjects();
		int number =subj.length;
		totalcost= number*rate;
		return totalcost;
		
	}
	
	public void details()
	{
		System.out.println("Learning Platform"+paltform);
		System.out.println("Learning cost"+totalcost);
	}
	

}

package constructor;

public class jobapp {
	String name;
	String skill;
	long pno;
	int exp;
	
	public jobapp(String name,String skill,long pno,int exp) 
	{
		this.name=name;
		this.skill=skill;
		this.pno=pno;
		this.exp=exp;
		System.out.println("submitted successful");
		
	}
	public jobapp(String name,String skill,long pno) 
	{
		this.name=name;
		this.skill=skill;
		this.pno=pno;
		System.out.println("submitted successful");
	}
	public jobapp(String name,long pno,int exp) 
	{
		this.name=name;
		this.pno=pno;
		this.exp=exp;
		System.out.println("submitted successful");
	}
	public jobapp(String name,String skill,int exp) 
	{
		this.name=name;
		this.skill=skill;
		this.exp=exp;
		System.out.println("submitted successful");
	}

}

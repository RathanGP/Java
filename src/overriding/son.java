package overriding;
public  class son extends father 
{
	public  void ride()
	{
		super.ride();
		System.out.println("pulsar is modified");
		super.ride();
	}
	

}

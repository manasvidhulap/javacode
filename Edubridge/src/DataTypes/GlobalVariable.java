package DataTypes;

public class GlobalVariable 
{
	String ename = "Chakuli";
	void Info()
	{
		int empid = 11221;
		System.out.println(ename+" "+empid);
	}
	void Info2()
	{
		String empDesignation = "Java Developer";
		System.out.println(ename+" "+empDesignation);
	}
	public static void main(String[] args) 
	{
		GlobalVariable g1 =  new GlobalVariable();
		g1.Info();
		g1.Info2();
	}

}

public class TestSource12
{
	public static void main(String[] args) throws Exception
	{
		int i = 1 ;
		// comment12
	  	System.out.println("hello12");
			while(i <= 1000)
			{
			System.out.println(i);
			throwExceptioni();
			Thread.sleep(5000);
		  }
	}

	public static void throwExceptioni() throws Exception
	{
		try
		{
			throw new Exception();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}

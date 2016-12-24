
public class test {

	
		
	int fibo=-1;
	
	public int fibM(int n)
	{
		System.out.print(n);
		if(n==1)
		{
			return 1;
		}
		else 
			return fibM(n)+fibM(n-1);
		
	}
	

	
}

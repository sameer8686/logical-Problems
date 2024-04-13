package Logic_Based_programs;

public class Odd_between_fifty_hundred {

	public static void main(String[] args) {

		
		for(int i=0;i<=100;i++)
		{
			if(i%2 != 0)
			{
				if(i>=50 && i<=100) 
				{
				System.out.println(i);
				}
			}
		}
	}

}

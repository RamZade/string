package string;

public class Str {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,1,2,3,4};
		
		for(int i=0;i<=arr.length;i++) 
		{
			for(int j=1;i<=arr.length-1;i++) 
			{
				if(arr[i]!=arr[j]) 
				{
					System.out.println(arr[i]);
				}
			}
					
		}
	}

}

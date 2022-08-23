/*
Program : To calculate minimum number from an array
@author : Tanay Patil
@Date : 23 aug
*/

class LinearSearch
{
	//method to find the number in an array
	static void findNumber(int searchNum)
	{
		int[]arr = {34,6,23,-7,12,54};
		boolean flag = false;
		//traversing the array
		
		for(int i=0;i<arr.length;i++)
		{
			if(searchNum == arr[i])
			{
				flag=true;
			break;
			}
			
				
				
		}
		
		if(flag == true)
		System.out.println("The number: "+ searchNum +" is present in the array");
	else
		System.out.println("The number is not present");
		
		
	}
	
	//calling main
	public static void main(String args[])
	{
		// calling findNumber method
		findNumber(Integer.parseInt(args[0]));
	}
}
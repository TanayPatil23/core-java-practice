class MinArrayDemo
{
	//method to calculate minimum number from an array
	static int minNumber()
	{
		int[]arr = {34,6,23,-7,12,54};
		int mNum = arr[0];
		//traversing the array
		
		for(int i=1;i<arr.length;i++)
		{
			if(mNum>arr[i]) //Checking whether the number is greater than number in array
			    mNum=arr[i]; // assigning lesser value
				
		}
		return mNum;
	}
	
	//calling main
	public static void main(String args[])
	{
		//calling minNumber method
		//int r;
		//r=minNumber();
		System.out.println("The minimum number in array is: "+ minNumber());
	}
}
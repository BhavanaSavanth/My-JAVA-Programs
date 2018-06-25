package com.wipro;

public class findSandL {

	public static void main(String[] args) {
		
		int[] myArray = {20 , 3 , 2 , 8, 1};
		
		int lar,slar;
		
		lar=myArray[0];
		slar = lar;
		
		int sml, ssml;
		
		ssml = sml = lar;
		
		for(int i =1;i<myArray.length;i++)
		{
			if(myArray[i]>lar)
			{
				slar = lar;
				lar = myArray[i];
			}// close if
			else	if(myArray[i]>slar )
				slar = myArray[i];
			else if (myArray[i] < slar && slar == lar)
				slar = myArray[i];
				
			if(myArray[i]<sml )
			{
				ssml = sml;
				sml = myArray[i];
			}// close if
			else if(myArray[i]<ssml)
				ssml = myArray[i];
			else if (myArray[i] > ssml && ssml == sml)
				ssml = myArray[i];
			
			
		}// close for
		System.out.println("The two largest numbers are " + lar + " " + slar );
		System.out.println("The two smallest numbers are " + sml + " "  + ssml);s
	}// close main

}

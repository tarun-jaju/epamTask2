package gift;
import java.util.*;
import java.util.Scanner;
interface Sweets
{
	int totalWeightOfSweet();
}

public class Sweet implements Sweets{
	
	int price,weight;

	ArrayList<Sweet> sweetArray=new ArrayList<Sweet>();
	 public Sweet()
	{
		
	}
	public Sweet(int price,int weight)
	{
		
		this.weight=weight;
		this.price=price;
	}
public	void getAttributesOfSweet()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter no of sweets");
		int noOfSweets=input.nextInt();
		//for loop to read values from user
		for(int i=1;i<=noOfSweets;i++) 
		{
			System.out.println("enter the attributes of sweet" +i);
			
			System.out.println("enter the price of sweet" +i);
			int p=input.nextInt();
			System.out.println("enter the weight of sweet"+i);
			int w=input.nextInt();
			Sweet s1=new Sweet(p,w);
			//storing the objects in arraylist
			sweetArray.add(s1);
			
		}
		input.close();
	}
public	int totalWeightOfSweet()
	{
	int totalweight=0;
	for(int i=0;i<sweetArray.size();i++)
	{
		totalweight+=sweetArray.get(i).weight;
	}
	return totalweight;
		
	}

}

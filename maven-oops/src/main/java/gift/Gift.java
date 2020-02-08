package gift;
import gift.Sweet;

public class Gift {

public static void main(String[] args)
{
	  Sweet s=new Sweet();
	  s.getAttributesOfSweet();
	  int sweetWeight=s.totalWeightOfSweet();
	  Chocolate c=new Chocolate();
	  c.getAttributesOfChocolate();
	  int chocolateWeight=c.totalWeightOfChocolate();
	  int totalWightOfGift=sweetWeight+chocolateWeight;
	  c.sort();
	  System.out.println("total weight of gift is"  );
	  System.out.println(totalWightOfGift);
	  
	  
	
	
}
}

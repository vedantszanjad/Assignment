package com.yash.assignmenettwo;

//Create A class Fruit with following fields in it, fruitname, fruitcolor. Create subclass 
//of Fruit, SweetFruit and SourFruits. You will have following fields, Calories, 
//Carbohydrate, Fiber, Sugar, Fat, Protein, vitamins list will be an array of string in 
//both the classes. You have to put an extra field by which you will tell why this fruit is 
//sweet and sour in taste.
class Fruit 
{
	String fruitName;
	String fruitColor;
	
	public Fruit(String fruitName, String fruitColor)
	{
		super();
		this.fruitName = fruitName;
		this.fruitColor = fruitColor;
	}
	
	

}

class SourFruit extends Fruit
{
	String [] sourFruitInfo = new String[9];
	String sourtest;
	
	public SourFruit(String fruitName, String fruitColor, String sourFruitInfo [] ,String sourtest)
	{
		super(fruitName, fruitColor);
		this.sourFruitInfo=sourFruitInfo;
		this.sourtest=sourtest;

	}
	public void display(SourFruit sf)
	{
		System.out.println("***SourFruits info***");
		System.out.println("Fruit Name ="+sf.fruitName);
		System.out.println("Fruit Color ="+sf.fruitColor);
		System.out.println("**Nutrition summary**");
		       for(String s:sf.sourFruitInfo)
		       {
		    	   System.out.print(s +" ");
		       }
		System.out.println();
		System.out.println("SourFruit because of sugar is =" +sf.sourtest);
		System.out.println("=============****=============");
	}
	
}

class SweetFruit extends Fruit
{
	String [] sweetFruitInfo = new String[9];
	String sweet;
	
	public SweetFruit(String fruitName, String fruitColor, String sweetFruitInfo [] ,String sweet)
	{
		super(fruitName, fruitColor);
		this.sweetFruitInfo=sweetFruitInfo;
		this.sweet=sweet;

	}
	public void display(SweetFruit sf)
	{
		System.out.println("***SweetFruits info***");
		System.out.println("Fruit Name ="+sf.fruitName);
		System.out.println("Fruit Color ="+sf.fruitColor);
		System.out.println("**Nutrition summary**");
		       for(String s:sf.sweetFruitInfo)
		       {
		    	   System.out.print(s +" ");
		       }
		System.out.println();
		System.out.println("SourFruit because of sugar is =" +sf.sweet);
		System.out.println("=============****=============");
	}
	
	
	
}


public class Program_First
{
	public static void main(String[] args) 
	{
		String sourfruit[]= {"20%calories","30%carbohydrate","10%fiber" ,"15%sugar", "3%fat" ,"9%protein" ,"12%vit"};
		String sweetfruit[]= {"13%calories","17%carbohydrate","26%fiber" ,"43%sugar", "5%fat" ,"5%protein" ,"10%vit"};
		
		SourFruit sf=new SourFruit("Mango", "yellow", sourfruit, "15%sugar");
		SweetFruit swf=new SweetFruit("Apple", "Red", sweetfruit, "40%sugar");
		
		sf.display(sf);
		swf.display(swf);
	}
}

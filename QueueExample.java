package Practice;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample 
{
	public static void main(String args[])
	{
		Queue<String> quFruits=new LinkedList<>();
		
		//add elements
		quFruits.add("Banana");
		quFruits.add("Apple");
		quFruits.add("Strawberry");
		System.out.println(quFruits);
		
		//remove elements
		quFruits.remove("Apple");
		System.out.println(quFruits);
		
		//add elements at last
		quFruits.add("Kiwi");
		System.out.println(quFruits);
		
		//default remove first element
		quFruits.remove();
		System.out.println(quFruits);
		
		quFruits.add("Banana");
		System.out.println(quFruits);
		
		quFruits.poll();
		System.out.println(quFruits);
		
	}
	
}

package Assignment;

import java.util.ArrayList;

public class Assignment1_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> colour = new ArrayList<String>();
		colour.add("white");
		colour.add("orange");
		colour.add("yellow");
		colour.add("green");
		colour.add("red");
		
		System.out.println("The colours are"+colour);
		//if ( colour=="Red " || colour=="orange")
			if(colour.contains("orange")|| colour.contains("Red"))
				
			{
				System.out.println("Have dinner at restaurant");
			}
			else
				System.out.println("Have dinner at Home");

}
}

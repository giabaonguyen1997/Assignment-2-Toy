
import java.util.Scanner;
import javax.swing.JOptionPane;

import _solution.Toy;

import java.util.Random;
public class birthday {
		public static void main (String a[]) {
			final String programmername= "Bao Nguyen";
			Scanner inputScanner = new Scanner(System.in);
			String toy;
			String childage,childname, card_answer, balloon_answer, choice, anothertoy_answer;
			int random, child_age;
			double price = 0;
			Random rand = new Random();//use to make random number
			random = rand.nextInt(100000);
			String choice1 = null ;
			
			JOptionPane.showMessageDialog(null, "Welcome to the toy company\n to choose gift for young children.");
			
			do {
				
			childname = JOptionPane.showInputDialog("Enter name of your child: "); // User enter your child name here
			childage = JOptionPane.showInputDialog("Enter the age of the child: "); // User enter your child age here
			
			//convert age from string to int
			child_age = Integer.parseInt(childage); 
			
			//Ask for toy choice
			toy = JOptionPane.showInputDialog("Choose a toy:  plushie, blocks,  book.");
			//call setAge
			Toy Age = new Toy();
			
			Age.setAge(child_age);
			
			//check child age
			Toy checkAge = new Toy(toy, child_age);
			
			//call the setToy function from toy.java class 
			Toy toy_choice = new Toy(toy, child_age); 
			
			toy_choice.setToy(toy);
			toy_choice.setCost(toy);
	
		if(checkAge.ageOK() == false) {
				choice1 = JOptionPane.showInputDialog("The age is not appropriate \n Do you want to cancel the request? Yes or No");
				
				
				if (choice1.equals("yes") || choice1.equals("Yes")) {
					childname = JOptionPane.showInputDialog("Enter name of your child."); // User enter your child name
					childage = JOptionPane.showInputDialog("Enter the age of the child."); // User enter your child age
					
					//convert age from string to integer
					child_age = Integer.parseInt(childage); 
					
					//Ask for the toy choice
					toy = JOptionPane.showInputDialog("Choose a toy:  plushie, blocks, or book.");
					
					
					Age.setAge(child_age);
					//Pass toy to setToy, and setCost
					toy_choice.setToy(toy);
					toy_choice.setCost(toy);
				
				}
		}
				
			
			card_answer = JOptionPane.showInputDialog("Do you want a card with the gifts? Yes or No");
			
			//If needed to addCard to the gift
			Toy check1 = new Toy(toy, child_age);
			check1.addCard(card_answer);
			
			balloon_answer = JOptionPane.showInputDialog("Do you want a baloon with the gift? Yes or No");
			//If needed to addBalloon to the gift
			check1.addBalloon(balloon_answer);
			
			// If needed to add another toy to the gift
			anothertoy_answer = JOptionPane.showInputDialog("Do you want another toy? Yes or No");
			
			//Call to String 
			Toy displayout = new Toy(toy, child_age);
			System.out.println("The gift for " + childname + displayout.toString());
			
			price+=(check1.getCost());
			} while(balloon_answer.equals("yes")|| balloon_answer.equals("Yes"));
			
			System.out.print("The cost of your order is $"+price);
			System.out.println(" Order number is "+random);
			
			System.out.println("\nPROGRAMMER NAME: " + programmername);
		}		
	}
				
		
		
	

		
		


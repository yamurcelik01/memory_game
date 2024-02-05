package memory_game;

import java.util.Scanner;

public class main {
	private static card[][] cards = new card[4][4];  
	
	public static void main(String[] args) {

		
		 cards[0][0] = new card('A');
		 cards[0][1] = new card('B');
		 cards[0][2] = new card('C');
		 cards[0][3] = new card('E');
		 cards[1][0] = new card('D');
		 cards[1][1] = new card('F');
		 cards[1][2] = new card('G');
		 cards[1][3] = new card('G');
		 cards[2][0] = new card('H');
		 cards[2][1] = new card('F');
		 cards[2][2] = new card('E');
		 cards[2][3] = new card('H');
		 cards[3][0] = new card('B');
		 cards[3][1] = new card('A');
		 cards[3][2] = new card('C');
		 cards[3][3] = new card('D');
		
		 //game_board();
		 while (game_over()== false) {
			game_board();
			predict();
		}
		  
	}
	
	public static void predict() {
		Scanner sc = new Scanner(System.in);
		System.out.println("First prediction (enter i and j values with space): ");
		int i1=sc.nextInt();
		int j1= sc.nextInt();
		
		cards[i1][j1].setPrediction(true);
		game_board();
		
		System.out.println("Second prediction (enter i and j values with space): ");
		int i2=sc.nextInt();
		int j2= sc.nextInt();
		if (cards[i1][j1].getValue() == cards[i2][j2].getValue()) {
			cards[i2][j2].setPrediction(true);
			
		}
		else {
			cards[i1][j1].setPrediction(false);
		}
		
	}
	
	public static boolean game_over() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (cards[i][j].isPrediction() == false) {
					return false;
					
				}
				
			}
			
		}
		return true;
	}
	
	
	
	public static void game_board() {
		
		for (int i = 0; i < 4; i++) {
			System.out.println(" __________________");
			for (int j = 0; j <4; j++) {
				
				if(cards[i][j].isPrediction()) {
					System.out.print(" | " + cards[i][j].getValue() + " | ");
					
				}
				
				else {
					System.out.print(" | | ");
				
				}
			}
			
			System.out.println(" ");
			
		}
	}

}

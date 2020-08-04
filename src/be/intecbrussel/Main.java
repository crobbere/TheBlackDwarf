package be.intecbrussel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	char [][] world = new char [16][16];
	for(int i = 0; i < world.length; i++){
		for(int j = 0; j < world.length; j++){
			char player = world[0][0] = '@';
			world[i][j] = '.';
		}
	}
		for(int i = 0; i < world.length; i++){
			for(int j = 0; j < world[i].length; j++){
				System.out.print(world[i][j] + " ");
			}
			System.out.println();
		}
	Scanner kbd = new Scanner(System.in);
		System.out.println("\nWhat direction do you want to go?\n" +
				"Possible directions: (N)orth, (S)outh, (E)ast or (W)est\n" +
				"Press (X) to exit.\n");
		String dir = kbd.next();
	switch(dir)	{
		case "n": for(int i = 0; i < world.length; i++){
					for(int j = 0; j < world.length; j++){
						if (world[i][j] == '@'){
							char temp = world[i][j];
							world[i][j] = world[i][j - 1];
							world[i][j - 1] = temp;
						}
					}
		}
		// printworld?
			break;
		case "s": for(int i = 0; i < world.length; i++){
			for(int j = 0; j < world.length; j++){
				if (world[i][j] == '@'){
					char temp = world[i][j];
					world[i][j] = world[i][j + 1];
					world[i][j + 1] = temp;
				}
			}
		}
			break;
		case "e": for(int i = 0; i < world.length; i++){
			for(int j = 0; j < world.length; j++){
				if (world[i][j] == '@'){
					char temp = world[i][j];
					world[i][j] = world[i + 1][j];
					world[i + 1][j] = temp;
				}
			}
		}
			break;
		case "w": for(int i = 0; i < world.length; i++){
			for(int j = 0; j < world.length; j++){
				if (world[i][j] == '@'){
					char temp = world[i][j];
					world[i][j] = world[i - 1][j];
					world[i + 1][j] = temp;
				}
			}
		}
			break;
		case "x":
			break;
	}

    }
}

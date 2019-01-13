import java.io.*;
import java.text.*;
import java.util.*;

public class Connect5 {

	public static String convert(int number) {
		if (number == 1)
			return "a";
		if (number == 2)
			return "b";
		if (number == 3)
			return "c";
		if (number == 4)
			return "d";
		if (number == 5)
			return "e";
		if (number == 6)
			return "f";
		if (number == 7)
			return "g";
		if (number == 8)
			return "h";
		if (number == 9)
			return "i";
		if (number == 10)
			return "j";
		if (number == 11)
			return "k";
		if (number == 12)
			return "l";
		if (number == 13)
			return "m";
		if (number == 14)
			return "n";
		if (number == 15)
			return "o";
		if (number == 16)
			return "p";
		if (number == 17)
			return "q";
		if (number == 18)
			return "r";
		if (number == 19)
			return "s";
		if (number == 20)
			return "t";
		return "unknown";

	}

	public static void main(String str[]) throws IOException, InterruptedException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.########");
		Random generator = new Random();

		for (int t = 0; t < 5; t++) {
			System.out.println("\n----------------------------------------------------------------------\n");
			Thread.sleep(150);
		}
		System.out.println("			CONNECT 5 BY TIMOTHY CAO");
		Thread.sleep(550);

		for (int t = 0; t < 5; t++) {
			System.out.println("\n----------------------------------------------------------------------\n");
			Thread.sleep(150);
		}

		String[][] board = new String[20][20];
		int startx = 1, starty = 1, endx = 1, endy = 1;

		for (int a = 0; a < 20; a++) {
			for (int b = 0; b < 20; b++)
				board[a][b] = ".";
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("----------------------------------------------------------------------");
		System.out.println("\n\nA  B  C  D  E  F  G  H  I  J  K  L  M  N  O  P  Q  R  S  T");
		for (int a = 0; a < 20; a++) {
			if (a > 0)
				System.out.println("[" + a + "]");
			for (int b = 0; b < 20; b++)
				System.out.print(board[a][b] + "  ");
		}
		System.out.println("[20]");
		////////////////////////////////////////////////////////////////////////////////////////////////////////

		int winner = 0;
		int counter = 0;
		while (winner == 0) {
			counter++;
			String input, temp;
			int xcoord = 0, ycoord = 0;

			if (counter < 2)
				System.out.println("\n\n\nTo make place a peice, type the coordinates of the location.\nE.g. 'a4'");

			int good = 0;
			do {

				int keepgoing = 0;
				do {
					keepgoing = 0;

					if (counter % 2 == 1) {
						System.out.println("\nPlayer 1's turn\n");
					} else {
						System.out.println("\nPlayer 2's turn\n");
					}
					input = stdin.readLine().toLowerCase();

					if (!input.equals("")) // if entered blank
					{
						String[] inputs = input.split("");

						if (inputs.length != 1) // if entered size array of 1
						{
							if (inputs.length >= 4) // if enter size array of 4+
							{
								keepgoing = 1;
								System.out.println("Please stay calm");
							} else {

								int temptest = 1, temptest2 = 1;
								if (inputs.length == 3) {
									temptest = 0;
									if (inputs[2].equals("0")) {
										temptest = 1;
									}
									if (inputs[2].equals("1")) {
										temptest = 1;
									}
									if (inputs[2].equals("2")) {
										temptest = 1;
									}
									if (inputs[2].equals("3")) {
										temptest = 1;
									}
									if (inputs[2].equals("4")) {
										temptest = 1;
									}
									if (inputs[2].equals("5")) {
										temptest = 1;
									}
									if (inputs[2].equals("6")) {
										temptest = 1;
									}
									if (inputs[2].equals("7")) {
										temptest = 1;
									}
									if (inputs[2].equals("8")) {
										temptest = 1;
									}
									if (inputs[2].equals("9")) {
										temptest = 1;
									}
								}
								temptest2 = 0;
								if (inputs[1].equals("0")) {
									temptest2 = 1;
								}
								if (inputs[1].equals("1")) {
									temptest2 = 1;
								}
								if (inputs[1].equals("2")) {
									temptest2 = 1;
								}
								if (inputs[1].equals("3")) {
									temptest2 = 1;
								}
								if (inputs[1].equals("4")) {
									temptest2 = 1;
								}
								if (inputs[1].equals("5")) {
									temptest2 = 1;
								}
								if (inputs[1].equals("6")) {
									temptest2 = 1;
								}
								if (inputs[1].equals("7")) {
									temptest2 = 1;
								}
								if (inputs[1].equals("8")) {
									temptest2 = 1;
								}
								if (inputs[1].equals("9")) {
									temptest2 = 1;
								}

								if (temptest2 == 1 && temptest == 1) {

									if (inputs.length == 3) {
										if (Integer.parseInt((inputs[1] + inputs[2])) > 20) {
											keepgoing = 1;
											System.out.println("You just played outside of the board");
											System.out.println("The board size is 20x20, keep this in mind");
										}
									}

									if (inputs.length == 2)
										ycoord = Integer.parseInt(inputs[1]);
									if (inputs.length == 3)
										ycoord = Integer.parseInt(inputs[1] + inputs[2]);

									inputs[0].toLowerCase();
									if (inputs[0].equals("a")) {
										xcoord = 1;
									} else if (inputs[0].equals("b")) {
										xcoord = 2;
									} else if (inputs[0].equals("c")) {
										xcoord = 3;
									} else if (inputs[0].equals("d")) {
										xcoord = 4;
									} else if (inputs[0].equals("e")) {
										xcoord = 5;
									} else if (inputs[0].equals("f")) {
										xcoord = 6;
									} else if (inputs[0].equals("g")) {
										xcoord = 7;
									} else if (inputs[0].equals("h")) {
										xcoord = 8;
									} else if (inputs[0].equals("i")) {
										xcoord = 9;
									} else if (inputs[0].equals("j")) {
										xcoord = 10;
									} else if (inputs[0].equals("k")) {
										xcoord = 11;
									} else if (inputs[0].equals("l")) {
										xcoord = 12;
									} else if (inputs[0].equals("m")) {
										xcoord = 13;
									} else if (inputs[0].equals("n")) {
										xcoord = 14;
									} else if (inputs[0].equals("o")) {
										xcoord = 15;
									} else if (inputs[0].equals("p")) {
										xcoord = 16;
									} else if (inputs[0].equals("q")) {
										xcoord = 17;
									} else if (inputs[0].equals("r")) {
										xcoord = 18;
									} else if (inputs[0].equals("s")) {
										xcoord = 19;
									} else if (inputs[0].equals("t")) {
										xcoord = 20;
									} else {
										System.out.println("You just played outside of the board");
										System.out.println("The board size is 20x20, keep this in mind");
										keepgoing = 1;
									}
								} else {
									keepgoing = 1;
								}
							}
						} else {
							keepgoing = 1;
						}
					} else {
						keepgoing = 1;
					}
				} while (keepgoing == 1);

				if (board[ycoord - 1][xcoord - 1] == ".") {
					good = 0;
					if (counter % 2 == 1) {
						board[ycoord - 1][xcoord - 1] = "X";
					} else {
						board[ycoord - 1][xcoord - 1] = "O";
					}
				} else {
					good = 1;
					System.out.println("Error! Spot already taken");
				}

			} while (good == 1);
			////////////////////////////////////////////////////////////////////////////////////////////////////////
			System.out.println("----------------------------------------------------------------------");
			System.out.println("\n\n\n\n\n\n\n\n\n\nA  B  C  D  E  F  G  H  I  J  K  L  M  N  O  P  Q  R  S  T");
			for (int a = 0; a < 20; a++) {
				if (a > 0)
					System.out.println("[" + a + "]");
				for (int b = 0; b < 20; b++)
					System.out.print(board[a][b] + "  ");
			}
			System.out.println("[20]");
			////////////////////////////////////////////////////////////////////////////////////////////////////////
			// check for horizontal win
			for (int a = 0; a < 15; a++) {
				for (int b = 0; b < 20; b++) {
					if (board[a][b].equals("O")) {
						if (board[a + 1][b].equals("O")) {
							if (board[a + 2][b].equals("O")) {
								if (board[a + 3][b].equals("O")) {
									if (board[a + 4][b].equals("O")) {
										if (counter % 2 == 1) {
											System.out.println("\n\n\nPlayer 1 WINS (vertically)");
										} else {
											System.out.println("\n\n\nPlayer 2 WINS (vertically)");
										}
										winner = 1;
										startx = a + 1;
										starty = b + 1;
										endx = a + 5;
										endy = b + 1;
									}
								}
							}
						}
					}
				}
			}

			// check for vertical win
			for (int c = 0; c < 20; c++) {
				for (int d = 0; d < 15; d++) {
					if (board[c][d].equals("O")) {
						if (board[c][d + 1].equals("O")) {
							if (board[c][d + 2].equals("O")) {
								if (board[c][d + 3].equals("O")) {
									if (board[c][d + 4].equals("O")) {
										if (counter % 2 == 1) {
											System.out.println("\n\n\nPlayer 1 WINS (horizontally)");
										} else {
											System.out.println("\n\n\nPlayer 2 WINS (horizontally)");
										}
										winner = 1;
										startx = c + 1;
										starty = d + 1;
										endx = c + 1;
										endy = d + 5;
									}
								}
							}
						}
					}
				}
			}

			// check for diagonal win
			for (int c = 0; c < 15; c++) {
				for (int d = 0; d < 15; d++) {
					if (board[c][d].equals("O")) {
						if (board[c + 1][d + 1].equals("O")) {
							if (board[c + 2][d + 2].equals("O")) {
								if (board[c + 3][d + 3].equals("O")) {
									if (board[c + 4][d + 4].equals("O")) {
										if (counter % 2 == 1) {
											System.out.println("\n\n\nPlayer 1 WINS (diagonally)");
										} else {
											System.out.println("\n\n\nPlayer 2 WINS (diagonally)");
										}
										winner = 1;
										startx = c + 1;
										starty = d + 1;
										endx = c + 5;
										endy = d + 5;
									}
								}
							}
						}
					}
				}
			}
			////////////////////////////////////////////////////////////////////////////////////////////////////////
			// check for horizontal win
			for (int a = 0; a < 15; a++) {
				for (int b = 0; b < 20; b++) {
					if (board[a][b].equals("X")) {
						if (board[a + 1][b].equals("X")) {
							if (board[a + 2][b].equals("X")) {
								if (board[a + 3][b].equals("X")) {
									if (board[a + 4][b].equals("X")) {
										if (counter % 2 == 1) {
											System.out.println("\n\n\nPlayer 1 WINS (vertically)");
										} else {
											System.out.println("\n\n\nPlayer 2 WINS (vertically)");
										}
										winner = 1;
										startx = a + 1;
										starty = b + 1;
										endx = a + 5;
										endy = b + 1;
									}
								}
							}
						}
					}
				}
			}

			// check for vertical win
			for (int c = 0; c < 20; c++) {
				for (int d = 0; d < 15; d++) {
					if (board[c][d].equals("X")) {
						if (board[c][d + 1].equals("X")) {
							if (board[c][d + 2].equals("X")) {
								if (board[c][d + 3].equals("X")) {
									if (board[c][d + 4].equals("X")) {
										if (counter % 2 == 1) {
											System.out.println("\n\n\nPlayer 1 WINS (horizontally)");
										} else {
											System.out.println("\n\n\nPlayer 2 WINS (horizontally)");
										}
										winner = 1;
										startx = c + 1;
										starty = d + 1;
										endx = c + 1;
										endy = d + 5;
									}
								}
							}
						}
					}
				}
			}

			// check for diagonal win
			for (int c = 0; c < 15; c++) {
				for (int d = 0; d < 15; d++) {
					if (board[c][d].equals("X")) {
						if (board[c + 1][d + 1].equals("X")) {
							if (board[c + 2][d + 2].equals("X")) {
								if (board[c + 3][d + 3].equals("X")) {
									if (board[c + 4][d + 4].equals("X")) {
										if (counter % 2 == 1) {
											System.out.println("\n\n\nPlayer 1 WINS (diagonally)");
										} else {
											System.out.println("\n\n\nPlayer 2 WINS (diagonally)");
										}
										winner = 1;
										startx = c + 1;
										starty = d + 1;
										endx = c + 5;
										endy = d + 5;
									}
								}
							}
						}
					}
				}
			}
			
			// check for diagonal win
						for (int c = 0; c < 15; c++) {
							for (int d = 5; d < 20; d++) {
								if (board[c][d].equals("X")) {
									if (board[c + 1][d - 1].equals("X")) {
										if (board[c + 2][d - 2].equals("X")) {
											if (board[c + 3][d - 3].equals("X")) {
												if (board[c + 4][d - 4].equals("X")) {
													if (counter % 2 == 1) {
														System.out.println("\n\n\nPlayer 1 WINS (diagonally)");
													} else {
														System.out.println("\n\n\nPlayer 2 WINS (diagonally)");
													}
													winner = 1;
													startx = c + 1;
													starty = d + 1;
													endx = c + 5;
													endy = d + 5;
												}
											}
										}
									}
								}
							}
						}
			////////////////////////////////////////////////////////////////////////////////////////////////////////

		}
		System.out.println(
				"\n\nThe victory was from: " + convert(starty) + "," + startx + " to " + convert(endy) + "," + endx);

		System.out.println("\n---------------------------\nThanks for playing\n---------------------------\n");

	}
}
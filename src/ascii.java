

/*--------------------------------------------------------------------------------------*/
/*  Java test_                                                      */
/*                                                                                      */
/*--------------------------------------------------------------------------------------*/
/*  Author: Timothy Cao                                                                 */
/*  Date:    2015/2016                                                                  */
/*--------------------------------------------------------------------------------------*/

// ===== Table of syntax ===== //
//String[] namearray = new String [1];
//namearray [0] = ,"first position," ; 
// for (int i=0;i<5i++){}
//

import java.io.*;
import java.util.*;
import java.text.*;

public class ascii {

	static void toad()
	{
		
		String[][] toad = new String[][] {
		{ 	". ..... ....  ... ................                     . ....... .              ",
			" ..,.::.,,.,,,.,,,.:,,:.,,,:.. ,.,                  . . .....                   ",
			"   ...      . ..  ........  . ....            . +DMMM7....     ..... .          ",
			"            .   . ...,:OMMMMMD....  ...      DMMMMMMMMMMM+ ....... . .          ",
			"         .... . ..,?MMMMMMMMMMMNM ... ...  ,DMMM=... ,MMMMM, ... ...        ....",
			"        . .... ..+MMMNMI.....=MMMMN,.. .. IMMN. . ..... .MMMN. . .         . ...",
			" .      ...     NMMN=..  .......NMMM.... IMN8..   ..  ....NMMD..            ... ",
			".             .NMMM.,OMM?... ....~MMM..  MM8  ....... ....,MMM,.           . .  ",
			".             OMMM,,NMMMD. ... . .ZMM+  MMM.,. ...... ?MMM. MMM.          ..    ",
			"             .MMM,..MMMM8.        .MMM..MM=. .. ..  .?MMMMN.MMM.      ....... ..",
			"       ..   ..MMM...,.. .      ....MMM  MM...       ..MMMM .MMM.  ..... .. .    ",
			"    .... . ...MMM       .   .    .,MMN..MM..           ... .MMM.... ..          ",
			"    ..........DMMO      . .... .. MMN.. MM?.           ....~MM8.... .           ",
			".... .   ..  . NMM$    ..... ....NMMZ.. MMM.        ...... MMM . .           ...",
			".......        .DMNND,. .....  $NMNI.   ,MM8        ... ..MMM..             ..  ",
			"....        ..... MMMMMMN..,DMMMNM,.   ..DMM8... ..... .~MMN...              .  ",
			"..        ..  ...7MMMMMMMMMMMMMM..        DMMMI.......ONMMMMM?..            ....",
			"          ... .,NMMM . ,8N87   ..     ......MMMMMMMMMMMMM  MMMM..   .          .",
			"           ...MMMM, ..            ............ZMMMMMMN.    .DMMM.... .          ",
			"          ..DMMMZ.            ...INM. .. D8 .              . ?MMM+.....         ",
			"           NMMM ..            ...MMM. ..DMMM.            .....:MMM,. ...        ",
			"        . MNN+ .           ......$MM. . 8MMM.      .............MMM ..         .",
			"      ...MMN ...    ... ...... .   .   ....,.  .  .:8MMMMMMMI.. .NMM.      .....",
			"       .+MM=    .  .?MMMMMMMNMO...,..      ...~NMMMMMMMMMNMMM.  .DMM..  . ..... ",
			"       .ZMM      . MMMMMMMMMMMMMMM ..      ,MMMMMM8:.... ..  . ..MMM  ........ .",
			"       . MMN........ ...  . . 8MMMMM.....DMMMM+. .              MMM.......      ",
			"       .. NMM ..            .    MNMNZ,NNMMM,..              ,MMMZ,...          ",
			"   . ..... MNM:..           ..  .. 7MNMMMN:..            ...MMMM...             ",
			"........   ..MMNN.... .    ........ ..O=           ..... NMMND....... ..        ",
			".....   .......MMMMM,.  . . ....... . . .          ..:NMMMMO.,ZNMMMMMMM=.       ",
			".      .=NMMMM7.,MMMMMMM+ ,.....           .... . DMMMMMMNMMMMMND ..7NMM~.      ",
			"     . MMMMMMMMMMMM +MMMMMMMMZ. ....  ... ...,MMMMMMNM~ . +MMM,,    ..MNM  .    ",
			"    ..MMN.....OMMM......?NMMMMMMMMMMMMMMMMMMMMMMMMM:.    ...MMN?..  ..MMM..     ",
			"    ..MMN   .IMMM,.   .    . ~NMMMMMMMMMMMMMMMI ... .    . .,MMM .   .MMM...    ",
			"    ..MMN....NMM..          .. .  ,....... ... ..          . ~NMN . .ZMM=.      ",
			"    ..MNM...DMM                ........ ..               ... .MMM ...MNN .      ",
			". . ..=MMN. MN8.      . ... .. .. .....            . .    ...,MMN...DMM=     .  ",
			".. .  .7MM~.NMN.    ........... .  ..              ..........NMM:..,MMZ.     ...",
			".  .  ..MMM~MMM,..   .........                 . ..... ... .:MMM...MMM.. . . ...",
			"        .MMMNMMN.... ..    .                  .......      :MMMMM.MMM. .........",
			"      ...NMNO.MNM.......              . .  .......     .. NMMDNMMMMM:.......    ",
			"      ..MMM.,..?MMM...               .........  .     ..NMMM:....MMMM... .      ",
			"  .  ..MMM,,.,..,NMMNI .             . .....     ...:NNMMM= .....,.MNM..        ",
			".... ,MMM.,=MM ... ZNNMNMO..   ..  .... ......  OMMMMMMM. ..., .D ..MMN         ",
			".  ..DMM.OMMMMM.,=MM..NMMMMMMMMMMMNMMMMNMMMMMMMMMMMM+MM:.NNM:.,8MMMMMMM.        ",
			".....MMMMMNN.MMNDNMMMOMNM  $MMMMMMMMMMMMMMMMMM$, ...+MM,MMMMMN,MMMMMMMN.       .",
			" . . =MMO..,. MMMMONMMMN ... .. . .. ... . ..  . .  .MMMMM..MMMMM?.. ...   .....",
			"    ......   . ......~:.                  . ..   .....$D:..  .:=..      ........",
			".......... .  ..... . ...............    .......................  ...... .... ..",
			"................................................................................",
			"................................................................................\n\n\n",}
		};
		for(int b = 0; b < 42; b++)
		System.out.println(toad[0][b]);
	}
	
	public static void main(String str[]) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat(" #.########");
		Random generator = new Random();

		String[][] namearray = new String[][] { //library of printable characters
				{ " ...###...", " ..##.##..", " .##...##.", " ##.....##", " #########", " ##.....##", " ##.....##" }, // A1
				{ " ########.", " ##.....##", " ##.....##", " ########.", " ##.....##", " ##.....##", " ########." }, // B2
				{ " .######.", " ##....##", " ##......", " ##......", " ##......", " ##....##", " .######." }, // C3
				{ " #######..", " ##....##.", " ##.....##", " ##.....##", " ##.....##", " ##....##.", " #######.." }, // D4
				{ " ########", " ##......", " ##......", " ######..", " ##......", " ##......", " ########" }, // E5
				{ " ########", " ########", " ##......", " ##......", " ######..", " ##......", " ##......",
						" ##......" }, // F6
				{ " .######..", " ##....##.", " ##.......", " ##...####", " ##....##.", " ##....##.", " .######.." }, // G7
				{ " ##.....##", " ##.....##", " ##.....##", " #########", " ##.....##", " ##.....##", " ##.....##" }, // H8
				{ " ####", " .##.", " .##.", " .##.", " .##.", " .##.", " ####" }, // I9
				{ " ......##", " ......##", " ......##", " ......##", " ##....##", " ##....##", " .######." }, // J10
				{ " ##....##", " ##...##.", " ##..##..", " #####...", " ##..##..", " ##...##.", " ##....##" }, // K11
				{ " ##......", " ##......", " ##......", " ##......", " ##......", " ##......", " ########" }, // L12
				{ " ##.....##", " ###...###", " ####.####", " ##.###.##", " ##.....##", " ##.....##", " ##.....##" }, // M13
				{ " ##....##", " ###...##", " ####..##", " ##.##.##", " ##..####", " ##...###", " ##....##" }, // N14
				{ " .#######.", " ##.....##", " ##.....##", " ##.....##", " ##.....##", " ##.....##", " .#######." }, // O15
				{ " ########.", " ##.....##", " ##.....##", " ########.", " ##.......", " ##.......", " ##......." }, // P16
				{ " .#######.", " ##.....##", " ##.....##", " ##.....##", " ##..##.##", " ##....##.", " .#####.##" }, // Q17
				{ " ########.", " ##.....##", " ##.....##", " ########.", " ##...##..", " ##....##.", " ##.....##" }, // R18
				{ " .######.", " ##....##", " ##......", " .######.", " ......##", " ##....##", " .######." }, // S19
				{ " ########", " ...##...", " ...##...", " ...##...", " ...##...", " ...##...", " ...##..." }, // T20
				{ " ##.....##", " ##.....##", " ##.....##", " ##.....##", " ##.....##", " ##.....##", " .#######." }, // U21
				{ " ##.....##", " ##.....##", " ##.....##", " ##.....##", " .##...##.", " ..##.##..", " ...###..." }, // V22
				{ " ##......##", " ##..##..##", " ##..##..##", " ##..##..##", " ##..##..##", " ##..##..##",
						" .###..###." }, // W23
				{ " ##.....##", " .##...##.", " ..##.##..", " ...###...", " ..##.##..", " .##...##.", " ##.....##" }, // X24
				{ " ##....##", " .##..##.", " ..####..", " ...##...", " ...##...", " ...##...", " ...##..." }, // Y25
				{ " ########", " .....##.", " ....##..", " ...##...", " ..##....", " .##.....", " ########" }, // Z26
				{ " ....", " ....", " ....", " ....", " ....", " ....", " ...." }, // <space>26
				{ " .###,", " .###.", " .###.", " .###.", " .###.", " .....", " .###." }, // exclamation27
				{ " .....", " .....", " .....", " .####", " .####", " ..##.", " .##.." }, // comma28
				{ " ....", " ....", " ....", " ....", " ....", " .###", " .###", }, // period29
				{ " ........", " ........", " ........", " .#######", " ........", " ........", " ........" }, // dash30
				
				{ " ...#####..", " ..##...##.", " .##.....##", " .##.....##", " .##.....##", " ..##...##.",
						" ...#####.." }, // ZERO31
				{ " ....##...", " ..####...", " ....##...", " ....##...", " ....##...", " ....##...", " ..######." }, //one32
				{ " ..####..", " .##...##",  " .....##.", " ....##..", " ...##...", " .##.....", " ########" },//two33
				{ " ..####..", " .##..##.",  " .....##.", " ...##...", " .....##.", " .##..##.", " ..####.." },//three34
				{"","","","","","","",},{"","","","","","","",},{"","","","","","","",},{"","","","","","","",},{"","","","","","","",},{"","","","","","","",}, //numbers 4-9
				{ " #..####."," #..#...."," #..#...."," #######."," ...#..#."," ...#..#."," ####..#.",}, //nazi symbol 41
				{ " .........."," ..#....#.."," ..#....#.."," ..#....#.."," #........#"," ##......##"," .########.",}, // happy face 42
				{ " ..##..##.."," .#......#."," ...#..#..."," .........."," ..######.."," .#......#."," ..........",}, // sad face 43
				{ "","","","","","","",}, //BACK UP SPACE A (NEW LINE) 44
				{ "..#######.",".##.....##",".......##.",".....###..","....##....","..........","....##....",},//Question mark 45
				{ ".............",".............",".............",".............",".............",".............",".............",},
				
		};

		
		System.out.println("Supported characters: Alphabet, numbers 0-3,\n exclamation point, period, comma, dash, space \n '(' = sad face, and ')' = happy, '@' = nazi symbol\n[easter egg with 'toad']\n\n");
		while (true){
		System.out.println("What word/sentance you want me to print??  [type / for new line]\n");
		String name = stdin.readLine();
		
		if (name.toLowerCase().equals("toad"))
		{
			toad();
		}
		
		name = name.toLowerCase();
		String[] differentlines = name.split("/");

		for (int f = 0; f < differentlines.length; f++)
		{ 
			if (differentlines[f] == null || differentlines[f].isEmpty()) {differentlines[f] = "A";} 
		}
		int counter = differentlines.length;
		System.out.println("\n");
		
		do {
		String[] stringArray = (differentlines[differentlines.length-counter]).split("");
		String[] namecharacters = new String[stringArray.length];

		for (int k = 0; k < stringArray.length; k++) {
			namecharacters[k] = stringArray[k];
		}

		int[] intcharacters = new int[stringArray.length];
		for (int p = 0; p < stringArray.length; p++) {
			if (namecharacters[p].equals("a")) {///////////////////////////////
				intcharacters[p] = 0;
			} else if (namecharacters[p].equals("b")) {
				intcharacters[p] = 1;
			} else if (namecharacters[p].equals("c")) {
				intcharacters[p] = 2;
			} else if (namecharacters[p].equals("d")) {
				intcharacters[p] = 3;
			} else if (namecharacters[p].equals("e")) {
				intcharacters[p] = 4;
			} else if (namecharacters[p].equals("f")) {
				intcharacters[p] = 5;
			} else if (namecharacters[p].equals("g")) {
				intcharacters[p] = 6;
			} else if (namecharacters[p].equals("h")) {
				intcharacters[p] = 7;
			} else if (namecharacters[p].equals("i")) {
				intcharacters[p] = 8;
			} else if (namecharacters[p].equals("j")) {
				intcharacters[p] = 9;
			} else if (namecharacters[p].equals("k")) {
				intcharacters[p] = 10;
			} else if (namecharacters[p].equals("l")) {
				intcharacters[p] = 11;
			} else if (namecharacters[p].equals("m")) {
				intcharacters[p] = 12;
			} else if (namecharacters[p].equals("n")) {
				intcharacters[p] = 13;
			} else if (namecharacters[p].equals("o")) {
				intcharacters[p] = 14;
			} else if (namecharacters[p].equals("p")) {
				intcharacters[p] = 15;
			} else if (namecharacters[p].equals("q")) {
				intcharacters[p] = 16;
			} else if (namecharacters[p].equals("r")) {
				intcharacters[p] = 17;
			} else if (namecharacters[p].equals("s")) {
				intcharacters[p] = 18;
			} else if (namecharacters[p].equals("t")) {
				intcharacters[p] = 19;
			} else if (namecharacters[p].equals("u")) {
				intcharacters[p] = 20;
			} else if (namecharacters[p].equals("v")) {
				intcharacters[p] = 21;
			} else if (namecharacters[p].equals("w")) {
				intcharacters[p] = 22;
			} else if (namecharacters[p].equals("x")) {
				intcharacters[p] = 23;
			} else if (namecharacters[p].equals("y")) {
				intcharacters[p] = 24;
			} else if (namecharacters[p].equals("z")) {
				intcharacters[p] = 25;
			} else if (namecharacters[p].equals(" ")) {///////////////////////////////
				intcharacters[p] = 26;
			} else if (namecharacters[p].equals("!")) {
				intcharacters[p] = 27;
			} else if (namecharacters[p].equals(",")) {
				intcharacters[p] = 28;
			} else if (namecharacters[p].equals(".")) {
				intcharacters[p] = 29;
			} else if (namecharacters[p].equals("-")) {
				intcharacters[p] = 30;
			} else if (namecharacters[p].equals("0")) {///////////////////////////////
				intcharacters[p] = 31;
			} else if (namecharacters[p].equals("1")) {
				intcharacters[p] = 32;
			}
			else if (namecharacters[p].equals("2")) {
				intcharacters[p] = 33;
			}
			else if (namecharacters[p].equals("3")) {
				intcharacters[p] = 34;
			}
			else if (namecharacters[p].equals("4")) {
				intcharacters[p] = 35;
			}
			else if (namecharacters[p].equals("5")) {
				intcharacters[p] = 36;
			}
			else if (namecharacters[p].equals("6")) {
				intcharacters[p] = 37;
			}
			else if (namecharacters[p].equals("7")) {
				intcharacters[p] = 38;
			}
			else if (namecharacters[p].equals("8")) {
				intcharacters[p] = 39;
			}
			else if (namecharacters[p].equals("9")) {///////////////////////////////
				intcharacters[p] = 40;
			}
			else if (namecharacters[p].equals("@")) {
				intcharacters[p] = 41;
			}
			else if (namecharacters[p].equals(")")) {
				intcharacters[p] = 42;
			}
			else if (namecharacters[p].equals("(")) {
				intcharacters[p] = 43;
			}
			else if (namecharacters[p].equals("A")) {
				intcharacters[p] = 44;
			}
			else if (namecharacters[p].equals("?")) {
				intcharacters[p] = 45;
			}
			else if (namecharacters[p].equals("	")) {
				intcharacters[p] = 46;
			}
			
			else {System.out.println("The character '" + namecharacters[p] + "' is not a built in character, \n and will be replaced with the letter 'a' ");}
		}

		for (int i = 0; i < 7; i++) {
			try { Thread.sleep (0); } catch (InterruptedException ex) { Thread.currentThread ().interrupt (); }
			for (int h = 0; h < namecharacters.length; h++) {
				try { Thread.sleep (0); } catch (InterruptedException ex) { Thread.currentThread ().interrupt (); }
				System.out.print(namearray[intcharacters[h]][i]);
			}
			System.out.println();
		}
		
		counter--;
		System.out.println("\n");
		} while (counter > 0);
		
		
		
		
		}
	}
}
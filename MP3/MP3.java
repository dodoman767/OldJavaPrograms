import java.io.*; 
public class MP3
{                   //MP3 by Timothy Cao P9 Comp Sci    //April 25 2016
    public static void main (String str[]) throws IOException
    {
	clearscreen ();
	int choice = -1, counter = -1; //Here, all essential multiuse variables are declared
	String line = "";
	String[] currentuser = {"default"};
	user (currentuser); //Starts program with log in
	String[] [] Collection = new String [3] [100]; //Declares the storage.
	for (int i = 0 ; i < 3 ; i++){                   // Initializes storage
	    for (int j = 0 ; j < 100 ; j++){
		Collection [i] [j] = "";
	    }
	}
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	do  {
	    choice = -1;
	    counter = -1;
	    BufferedReader reader = new BufferedReader (new FileReader (currentuser [0] + ".txt"));
	    while ((line = (reader.readLine ())) != null)
	    { //Finds all the information
		counter++;
		String[] temp = line.split ("-"); //seperates them by organization style
		Collection [0] [counter] = temp [0]; //First row is Artist
		Collection [1] [counter] = temp [1]; //Second row is title
		Collection [2] [counter] = temp [2]; //Third row is genre
	    }
	    reader.close ();
	    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    System.out.println ("\n\n\n==========| MENU |==========");
	    System.out.println ("1 - Change users");
	    System.out.println ("2 - View collection");
	    System.out.println ("3 - Add to collection");
	    System.out.println ("4 - Delete from collection");
	    System.out.println ("5 - Sort collection");
	    System.out.println ("6 - Backup this collection");
	    System.out.println ("7 - Restart this collection");
	    System.out.println ("0 - Quit program");
	    choice = Integer.parseInt (stdin.readLine ());
	    clearscreen ();
	    switch (choice){
		case 0:
		    System.out.println ("Farewell");
		    break;                                         //Quit
		case 1:
		    user (currentuser);
		    break;
		case 2:
		    view (Collection, counter);
		    break;
		case 3:
		    add (Collection, currentuser);
		    break;
		case 4:
		    delete (Collection, counter, currentuser);
		    break;
		case 5:
		    sort (Collection, currentuser, counter);
		    break;
		case 6:
		    backup (Collection, currentuser);
		    break;
		case 7:
		    reset (currentuser);
		    break;
		default: //in the case the user fails to follow simple instructions
		    System.out.println ("Please enter a number from 0-8");
	    }
	}while (choice != 0); //Exit
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void clearscreen ()
    {
	for (int i = 0 ; i < 10 ; i++)
	    System.out.println ("\n\n\n\n\n\n\n\n\n");
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void user (String currentuser[]) throws IOException
    { //LOG IN SYSTEM
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	System.out.println ("Please enter your username\n[Auto-creates in the case of absence]"); //Finds out the username
	currentuser [0] = stdin.readLine ();
	BufferedWriter writer = new BufferedWriter (new FileWriter (currentuser [0] + ".txt", true));
	writer.write (""); //Creates userfile if not already created
	clearscreen ();
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void view (String collection[] [], int counter)
    { //DISPLAYING SONGS
	clearscreen ();
	for (int i = 0 ; i < counter + 1 ; i++)
	{ //Goes over every song in format
	    System.out.println ("Song number: " + (i + 1) + "\nArtist: " + collection [0] [i] + "\nTitle: " + collection [1] [i] + "\nGenre: " + collection [2] [i] + "\n\n");
	}
	if (counter < 0)
	{ //in the case the system finds no songs
	    System.out.println ("Uh oh, this place is empty!\nWhy don't you add some songs here");
	}
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void add (String collection[] [], String currentuser[]) throws IOException
    { //ADDING SONGS
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in)); //Takes in information
	BufferedWriter writer3 = new BufferedWriter (new FileWriter (currentuser [0] + ".txt", true));
	System.out.println ("Adding songs: \nPlease enter in this format:\nartist-title-genre");
	writer3.write (stdin.readLine ());
	writer3.newLine (); //This saves it to the actual document, which will be reread
	writer3.close (); //Informs user on success
	System.out.println ("Added and saved!");
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////By Timothy
    public static void delete (String collection[] [], int counter, String currentuser[]) throws IOException
    { //DELETE SONGS
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	int removingnum = 0, validate2 = 0;
	int counter5 = 0; //Helpful variables for use
	String temp13 = "";
	if (counter > 0)
	{ //If the user actually has songs
	    view (collection, counter);
	    do {  //Makes sure it's a position that has a song
		System.out.println ("Here are the songs again, which number do you want to remove?");
		removingnum = Integer.parseInt (stdin.readLine ()) - 1; //User provides the direct location
		System.out.println ("Are you sure you want to remove " + collection[1][removingnum] + "?\n[1] = yes\n[0] = no");
		validate2 = Integer.parseInt(stdin.readLine()); //Makes sure it's the right song
	    }
	    while (removingnum < 0 || removingnum > counter || validate2 != 1 );
	    String line12 = "";
	    BufferedReader reader8 = new BufferedReader (new FileReader (currentuser [0] + ".txt"));
	    while ((line12 = (reader8.readLine ())) != null)
	    { //Records all the info you wish to keep
		if (counter5 != removingnum) {
		    if (temp13.equals ("")){
			temp13 = line12;
		    }
		    else{
			temp13 = temp13 + "|" + line12;
		    }
		} //Stores all BUT the song being removed into a string
		counter5++;
	    }
	    reader8.close ();
	    String temp14[] = temp13.split ("\\|"); //Seperates that string into components
	    BufferedWriter writer8 = new BufferedWriter (new FileWriter (currentuser [0] + ".txt"));
	    for (int f = 0 ; f < temp14.length ; f++)
	    { //Repopulates the file with the new set
		writer8.write (temp14 [f]);
		writer8.newLine ();
	    }
	    writer8.close ();
	} //in the case the user has no songs
	else if (counter < 0) {
	    System.out.println ("You have no songs, try again once you get some"); //No songs, how to delete nothingness?
	}
	else {
	    BufferedWriter writer11 = new BufferedWriter (new FileWriter (currentuser [0] + ".txt"));
	    writer11.newLine ();
	}
	System.out.println (collection [1] [removingnum]+ " has been sucessfully deleted"); //Informs
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// By dodoman767
    public static void sort (String collection[] [], String currentuser[], int counter) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	int size = collection [0].length;
	int type = 0;
	String temp = ""; //Asks for style of sorting
	System.out.println ("[1]Sort by Artist name\n[2]Sort by Title\n[3]Sort by Genre");
	type = Integer.parseInt (stdin.readLine ());
	type = type - 1;
	for (int a = 0 ; a < counter ; a++)
	{ //Initiating the slow bubble sort
	    for (int b = 0 ; b < counter - a ; b++)
	    {
		if (collection [type] [b].compareTo (collection [type] [b + 1]) > 0)
		{
		    for (int z = 0 ; z < 3 ; z++)
		    { //Efficiently triple stores all at once
			temp = collection [z] [b];
			collection [z] [b] = collection [z] [b + 1];
			collection [z] [b + 1] = temp;
	}}}}
	BufferedWriter writer4 = new BufferedWriter (new FileWriter (currentuser [0] + ".txt")); //SAVES TO FILE
	for (int c = 0 ; c < counter + 1 ; c++){
	    writer4.write (collection [0] [c] + "-" + collection [1] [c] + "-" + collection [2] [c]);
	    writer4.newLine ();
	}
	writer4.close ();
	System.out.println ("Sorted!");//Confirmation
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void backup (String collection[] [], String currentuser[]) throws IOException
    {
	BufferedWriter writer5 = new BufferedWriter (new FileWriter (currentuser [0] + "-BACKUP.txt")); //Makes new file
	BufferedReader reader5 = new BufferedReader (new FileReader (currentuser [0] + ".txt"));
	String line3 = "";
	while ((line3 = (reader5.readLine ())) != null) //Copies each line to the new text file 
	{
	    writer5.write (line3);
	    writer5.newLine ();
	}
	writer5.close ();
	System.out.println ("Done! Backup created called " + currentuser[0] + "-BACKUP.txt"); //informs user of complettion
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// By Timothy
    public static void reset (String currentuser[]) throws IOException
    {
	BufferedWriter writer6 = new BufferedWriter (new FileWriter (currentuser [0] + ".txt")); //Rewrites over it
	writer6.write ("");
	writer6.close ();
	System.out.println ("Done! Account items cleared!"); //Confirmation
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}



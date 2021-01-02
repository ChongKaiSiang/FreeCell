import java.util.*;
/**
 *This class basiclly is the freecell game.
 *@author ChongKaiSiang
 *@author TeeWaiBing
 */
public class FreeCell{
	/**
	 *This method call the main method.
	 *To restart the game.
	 */
	static void mainCaller(){
		main(null);
	}
	/**
	 *This method call Exit method.
	 *To quit the game.
	 */
	static void exit(){
		Exit();
	}
	/**
	 *The main method which run the game.
	 *Include many method to shuffle, add, and remove card.
	 *Perform movement of card by the command entered.
	 *Include column rotation to ease the game.
	 *@param args Unused
	 *@throws ArrayIndexOutOfBoundsException exception
	 */
	public static void main(String[] args){
		
		//Do all the task, such as :
		//Shuffle the card.
		//Perform movement by the command entered.
		//Make sure the input entered correctly.
		//Switch lowercase to uppercase.
		//move card from one place to another place following the rule.
		//Column rotation to ease the game.
		
		ArrayList<String> Card = new ArrayList<>(Arrays.asList( "dA", "d2", "d3", "d4", "d5", "d6", "d7", "d8", "d9", "dX", "dJ", "dQ", "dK", 
												"cA", "c2", "c3", "c4", "c5", "c6", "c7", "c8", "c9", "cX", "cJ", "cQ", "cK",
												"hA", "h2", "h3", "h4", "h5", "h6", "h7", "h8", "h9", "hX", "hJ", "hQ", "hK",
												"sA", "s2", "s3", "s4", "s5", "s6", "s7", "s8", "s9", "sX", "sJ", "sQ", "sK"));
		
		Collections.shuffle(Card);
		
		ArrayList<String> Pd = new ArrayList<> (Arrays.asList());
		ArrayList<String> Pc = new ArrayList<> (Arrays.asList());
		ArrayList<String> Ph = new ArrayList<> (Arrays.asList());
		ArrayList<String> Ps = new ArrayList<> (Arrays.asList());
		
		ArrayList<String> C1 =new ArrayList<>(Arrays.asList(Card.get(0),Card.get(1),Card.get(2),Card.get(3),Card.get(4),Card.get(5),Card.get(6)));
		ArrayList<String> C2 =new ArrayList<>(Arrays.asList(Card.get(7),Card.get(8),Card.get(9),Card.get(10),Card.get(11),Card.get(12),Card.get(13)));
		ArrayList<String> C3 =new ArrayList<>(Arrays.asList(Card.get(14),Card.get(15),Card.get(16),Card.get(17),Card.get(18),Card.get(19),Card.get(20)));
		ArrayList<String> C4 =new ArrayList<>(Arrays.asList(Card.get(21),Card.get(22),Card.get(23),Card.get(24),Card.get(25),Card.get(26),Card.get(27)));
		ArrayList<String> C5 =new ArrayList<>(Arrays.asList(Card.get(28),Card.get(29),Card.get(30),Card.get(31),Card.get(32),Card.get(33)));
		ArrayList<String> C6 =new ArrayList<>(Arrays.asList(Card.get(34),Card.get(35),Card.get(36),Card.get(37),Card.get(38),Card.get(39)));
		ArrayList<String> C7 =new ArrayList<>(Arrays.asList(Card.get(40),Card.get(41),Card.get(42),Card.get(43),Card.get(44),Card.get(45)));
		ArrayList<String> C8 =new ArrayList<>(Arrays.asList(Card.get(46),Card.get(47),Card.get(48),Card.get(49),Card.get(50),Card.get(51)));
		ArrayList<String> C9 =new ArrayList<>(Arrays.asList());
	
		Scanner input = new Scanner (System.in);
		String command1;
		String command2;
		String command3;
		String command4;
		int loop = 1;
		do{
			try{
			//print the table of ArrayList above
				printAll(Pd, Pc, Ph, Ps, C1, C2, C3, C4, C5, C6, C7, C8, C9);
				
				command1 = input.next();
				
				
				if (command1.equals("r")){
					mainCaller();
					break;
				}				
				else if(command1.equals("x")){
					loop = 1;
					exit();
					break;
				}
				else if(command1.equals("c1")||command1.equals("c2")||command1.equals("c3")||command1.equals("c4")||command1.equals("c5")||command1.equals("c6")||command1.equals("c7")||command1.equals("c8")||command1.equals("c9")){
							
					do{
						if (command1.equals("c1")){
									
							C1.add(0,C1.remove(C1.size()-1));
						}
						else if(command1.equals("c2")){
							C2.add(0,C2.remove(C2.size()-1));
						}
						else if(command1.equals("c3")){
							C3.add(0,C3.remove(C3.size()-1));
						}
						else if(command1.equals("c4")){
							C4.add(0,C4.remove(C4.size()-1));
						}
						else if(command1.equals("c5")){
							C5.add(0,C5.remove(C5.size()-1));
						}
						else if(command1.equals("c6")){
							C6.add(0,C6.remove(C6.size()-1));
						}
						else if(command1.equals("c7")){
							C7.add(0,C7.remove(C7.size()-1));
						}
						else if(command1.equals("c8")){
							C8.add(0,C8.remove(C8.size()-1));
						}
						else if(command1.equals("c9")){
							C9.add(0,C9.remove(C9.size()-1));
						}
								
						printAll(Pd, Pc, Ph, Ps, C1, C2, C3, C4, C5, C6, C7, C8, C9);
								
						command1 = input.next();	

					}while (command1.equals("c1")||command1.equals("c2")||command1.equals("c3")||command1.equals("c4")||command1.equals("c5")||command1.equals("c6")||command1.equals("c7")||command1.equals("c8")||command1.equals("c9"));	
					
				}
				if (command1.equals("r")){
					mainCaller();
					break;
				}				
						
				else if(command1.equals("x")){
					loop = 1;
					exit();
					break;
				}			
				command2 = input.next();
				
				command3 = input.next();
							
				command2 = SelCom2(command2);
				
				int move1 = 1;
				String compare1;
				do {
					switch (command1){
						
						case "1": 	
									
									compare1 = C1.get(C1.size()-1);
									if (compare1.equals(command2)){
										C1.remove(command2);
										move1 = 0;
										break;
									}
									else { 
										
										System.out.println ("Invalid input");
										System.out.println ("You should enter " + compare1 + " as second input." );
										System.out.println ("Please enter your second input again.");
										command2 = input.next();
										break;
									}
									
									
						
						case "2": 
									compare1 = C2.get(C2.size()-1);
									if (compare1.equals(command2)){
										C2.remove(command2);
										move1 = 0;
										break;
									}
									else { 
										
										System.out.println ("Invalid input");
										System.out.println ("You should enter " + compare1 + " as second input." );
										System.out.println ("Please enter your second input again.");
										command2 = input.next();
										break;
									}
									
						case "3": 
									compare1 = C3.get(C3.size()-1);
									if (compare1.equals(command2)){
										C3.remove(command2);
										move1 = 0;
										break;
									}
									else { 
										
										System.out.println ("Invalid input");
										System.out.println ("You should enter " + compare1 + " as second input." );
										System.out.println ("Please enter your second input again.");
										command2 = input.next();
										break;
									}
									
						case "4": 
									compare1 = C4.get(C4.size()-1);
									if (compare1.equals(command2)){
										C4.remove(command2);
										move1 = 0;
										break;
									}
									else { 
										
										System.out.println ("Invalid input");
										System.out.println ("You should enter " + compare1 + " as second input." );
										System.out.println ("Please enter your second input again.");
										command2 = input.next();
										break;
									}
									
						case "5": 
									compare1 = C5.get(C5.size()-1);
									if (compare1.equals(command2)){
										C5.remove(command2);
										move1 = 0;
										break;
									}
									else { 
										
										System.out.println ("Invalid input");
										System.out.println ("You should enter " + compare1 + " as second input." );
										System.out.println ("Please enter your second input again.");
										command2 = input.next();
										break;
									}
						case "6": 
									compare1 = C6.get(C6.size()-1);
									if (compare1.equals(command2)){
										C6.remove(command2);
										move1 = 0;
										break;
									}
									else { 
										
										System.out.println ("Invalid input");
										System.out.println ("You should enter " + compare1 + " as second input." );
										System.out.println ("Please enter your second input again.");
										command2 = input.next();
										break;
									}
									
						case "7": 
									compare1 = C7.get(C7.size()-1);
									if (compare1.equals(command2)){
										C7.remove(command2);
										move1 = 0;
										break;
									}
									else { 
										
										System.out.println ("Invalid input");
										System.out.println ("You should enter " + compare1 + " as second input." );
										System.out.println ("Please enter your second input again.");
										command2 = input.next();
										break;
									}
									
						case "8": 
									compare1 = C8.get(C8.size()-1);
									if (compare1.equals(command2)){
										C8.remove(command2);
										move1 = 0;
										break;
									}
									else { 
										
										System.out.println ("Invalid input");
										System.out.println ("You should enter " + compare1 + " as second input." );
										System.out.println ("Please enter your second input again.");
										command2 = input.next();
										break;
									}
									
						case "9": 
									compare1 = C9.get(C9.size()-1);
									if (compare1.equals(command2)){
										C9.remove(command2);
										move1 = 0;
										break;
									}
									else { 
										
										System.out.println ("Invalid input");
										System.out.println ("You should enter " + compare1 + " as second input." );
										System.out.println ("Please enter your second input again.");
										command2 = input.next();
										break;
									}		
									
					}
					
					command2 = SelCom2(command2);
				}while (move1 == 1);
				
				int move2 = 1;
				String compare2;
				
				do{
					switch(command3){
										
						case "1": 
									if(C1.size()==0){
										C1.add(command2);
										move2 = 0;
										break;
									}
									else {
										compare2 = C1.get(C1.size()-1);
									}
									
									if ((command2.equals("dA")||command2.equals("cA")||command2.equals("hA")||command2.equals("sA"))&&(compare2.equals("d2")||compare2.equals("c2")||compare2.equals("h2")||compare2.equals("s2"))){
										C1.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d2")||command2.equals("c2")||command2.equals("h2")||command2.equals("s2"))&&(compare2.equals("d3")||compare2.equals("c3")||compare2.equals("h3")||compare2.equals("s3"))){
										C1.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d3")||command2.equals("c3")||command2.equals("h3")||command2.equals("s3"))&&(compare2.equals("d4")||compare2.equals("c4")||compare2.equals("h4")||compare2.equals("s4"))){
										C1.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d4")||command2.equals("c4")||command2.equals("h4")||command2.equals("s5"))&&(compare2.equals("d5")||compare2.equals("c5")||compare2.equals("h5")||compare2.equals("s5"))){
										C1.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d5")||command2.equals("c5")||command2.equals("h5")||command2.equals("s6"))&&(compare2.equals("d6")||compare2.equals("c6")||compare2.equals("h6")||compare2.equals("s6"))){
										C1.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d6")||command2.equals("c6")||command2.equals("h6")||command2.equals("s7"))&&(compare2.equals("d7")||compare2.equals("c7")||compare2.equals("h7")||compare2.equals("s7"))){
										C1.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d7")||command2.equals("c7")||command2.equals("h7")||command2.equals("s7"))&&(compare2.equals("d8")||compare2.equals("c8")||compare2.equals("h8")||compare2.equals("s8"))){
										C1.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d8")||command2.equals("c8")||command2.equals("h8")||command2.equals("s8"))&&(compare2.equals("d9")||compare2.equals("c9")||compare2.equals("h9")||compare2.equals("s9"))){
										C1.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d9")||command2.equals("c9")||command2.equals("h9")||command2.equals("s9"))&&(compare2.equals("dX")||compare2.equals("cX")||compare2.equals("hX")||compare2.equals("sX"))){
										C1.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("dX")||command2.equals("cX")||command2.equals("hX")||command2.equals("sX"))&&(compare2.equals("dJ")||compare2.equals("cJ")||compare2.equals("hJ")||compare2.equals("sJ"))){
										C1.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("dJ")||command2.equals("cJ")||command2.equals("hJ")||command2.equals("sJ"))&&(compare2.equals("dQ")||compare2.equals("cQ")||compare2.equals("hQ")||compare2.equals("sQ"))){
										C1.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("dQ")||command2.equals("cQ")||command2.equals("hQ")||command2.equals("sQ"))&&(compare2.equals("dK")||compare2.equals("cK")||compare2.equals("hK")||compare2.equals("sK"))){
										C1.add(command2);
										move2 =0;
										break;
									}
									else if (command2.equals("dK")||command2.equals("cK")||command2.equals("hK")||command2.equals("sK")){
										C1.add(command2);
										move2 =0;
										break;
									}
									else {
										
										switch(command1){
											
											case "1" : C1.add(command2);
														break;
											case "2" : C2.add(command2);
														break;
											case "3" : C3.add(command2);
														break;
											case "4" : C4.add(command2);
														break;
											case "5" : C5.add(command2);
														break;
											case "6" : C6.add(command2);
														break;
											case "7" : C7.add(command2);
														break;
											case "8" : C8.add(command2);
														break;
											case "9" : C9.add(command2);
														break;			
										}				
														
										System.out.println("Invalid movement of card from 1 column to another");
										System.out.println("The moved card must be placed to a Column where its last card is one point bigger than the moved card.");
										move2 = 0;
										break;
									}
		
						case "2": 
									if(C2.size()==0){
										C2.add(command2);
										move2 = 0;
										break;
									}
									else{
										compare2 = C2.get(C2.size()-1);
									}
									if ((command2.equals("dA")||command2.equals("cA")||command2.equals("hA")||command2.equals("sA"))&&(compare2.equals("d2")||compare2.equals("c2")||compare2.equals("h2")||compare2.equals("s2"))){
										C2.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d2")||command2.equals("c2")||command2.equals("h2")||command2.equals("s2"))&&(compare2.equals("d3")||compare2.equals("c3")||compare2.equals("h3")||compare2.equals("s3"))){
										C2.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d3")||command2.equals("c3")||command2.equals("h3")||command2.equals("s3"))&&(compare2.equals("d4")||compare2.equals("c4")||compare2.equals("h4")||compare2.equals("s4"))){
										C2.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d4")||command2.equals("c4")||command2.equals("h4")||command2.equals("s4"))&&(compare2.equals("d5")||compare2.equals("c5")||compare2.equals("h5")||compare2.equals("s5"))){
										C2.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d5")||command2.equals("c5")||command2.equals("h5")||command2.equals("s5"))&&(compare2.equals("d6")||compare2.equals("c6")||compare2.equals("h6")||compare2.equals("s6"))){
										C2.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d6")||command2.equals("c6")||command2.equals("h6")||command2.equals("s6"))&&(compare2.equals("d7")||compare2.equals("c7")||compare2.equals("h7")||compare2.equals("s7"))){
										C2.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d7")||command2.equals("c7")||command2.equals("h7")||command2.equals("s7"))&&(compare2.equals("d8")||compare2.equals("c8")||compare2.equals("h8")||compare2.equals("s8"))){
										C2.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d8")||command2.equals("c8")||command2.equals("h8")||command2.equals("s8"))&&(compare2.equals("d9")||compare2.equals("c9")||compare2.equals("h9")||compare2.equals("s9"))){
										C2.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d9")||command2.equals("c9")||command2.equals("h9")||command2.equals("s9"))&&(compare2.equals("dX")||compare2.equals("cX")||compare2.equals("hX")||compare2.equals("sX"))){
										C2.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("dX")||command2.equals("cX")||command2.equals("hX")||command2.equals("sX"))&&(compare2.equals("dJ")||compare2.equals("cJ")||compare2.equals("hJ")||compare2.equals("sJ"))){
										C2.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("dJ")||command2.equals("cJ")||command2.equals("hJ")||command2.equals("sJ"))&&(compare2.equals("dQ")||compare2.equals("cQ")||compare2.equals("hQ")||compare2.equals("sQ"))){
										C2.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("dQ")||command2.equals("cQ")||command2.equals("hQ")||command2.equals("sQ"))&&(compare2.equals("dK")||compare2.equals("cK")||compare2.equals("hK")||compare2.equals("sK"))){
										C2.add(command2);
										move2 =0;
										break;
									}
									else if (command2.equals("dK")||command2.equals("cK")||command2.equals("hK")||command2.equals("sK")){
										C2.add(command2);
										move2 =0;
										break;
									}
									else {
										switch(command1){
											
											case "1" : C1.add(command2);
														break;
											case "2" : C2.add(command2);
														break;
											case "3" : C3.add(command2);
														break;
											case "4" : C4.add(command2);
														break;
											case "5" : C5.add(command2);
														break;
											case "6" : C6.add(command2);
														break;
											case "7" : C7.add(command2);
														break;
											case "8" : C8.add(command2);
														break;
											case "9" : C9.add(command2);
														break;			
										}				
														
										System.out.println("Invalid movement of card from 1 column to another");
										System.out.println("The moved card must be placed to a Column where its last card is one point bigger than the moved card.");
										move2 = 0;
										break;
									}
						
						case "3": 
									if(C3.size()==0){
										C3.add(command2);
										move2 = 0;
										break;
									}
									else{
										compare2 = C3.get(C3.size()-1);
									}
									if ((command2.equals("dA")||command2.equals("cA")||command2.equals("hA")||command2.equals("sA"))&&(compare2.equals("d2")||compare2.equals("c2")||compare2.equals("h2")||compare2.equals("s2"))){
										C3.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d2")||command2.equals("c2")||command2.equals("h2")||command2.equals("s2"))&&(compare2.equals("d3")||compare2.equals("c3")||compare2.equals("h3")||compare2.equals("s3"))){
										C3.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d3")||command2.equals("c3")||command2.equals("h3")||command2.equals("s3"))&&(compare2.equals("d4")||compare2.equals("c4")||compare2.equals("h4")||compare2.equals("s4"))){
										C3.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d4")||command2.equals("c4")||command2.equals("h4")||command2.equals("s4"))&&(compare2.equals("d5")||compare2.equals("c5")||compare2.equals("h5")||compare2.equals("s5"))){
										C3.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d5")||command2.equals("c5")||command2.equals("h5")||command2.equals("s5"))&&(compare2.equals("d6")||compare2.equals("c6")||compare2.equals("h6")||compare2.equals("s6"))){
										C3.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d6")||command2.equals("c6")||command2.equals("h6")||command2.equals("s6"))&&(compare2.equals("d7")||compare2.equals("c7")||compare2.equals("h7")||compare2.equals("s7"))){
										C3.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d7")||command2.equals("c7")||command2.equals("h7")||command2.equals("s7"))&&(compare2.equals("d8")||compare2.equals("c8")||compare2.equals("h8")||compare2.equals("s8"))){
										C3.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d8")||command2.equals("c8")||command2.equals("h8")||command2.equals("s8"))&&(compare2.equals("d9")||compare2.equals("c9")||compare2.equals("h9")||compare2.equals("s9"))){
										C3.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d9")||command2.equals("c9")||command2.equals("h9")||command2.equals("s9"))&&(compare2.equals("dX")||compare2.equals("cX")||compare2.equals("hX")||compare2.equals("sX"))){
										C3.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("dX")||command2.equals("cX")||command2.equals("hX")||command2.equals("sX"))&&(compare2.equals("dJ")||compare2.equals("cJ")||compare2.equals("hJ")||compare2.equals("sJ"))){
										C3.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("dJ")||command2.equals("cJ")||command2.equals("hJ")||command2.equals("sJ"))&&(compare2.equals("dQ")||compare2.equals("cQ")||compare2.equals("hQ")||compare2.equals("sQ"))){
										C3.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("dQ")||command2.equals("cQ")||command2.equals("hQ")||command2.equals("sQ"))&&(compare2.equals("dK")||compare2.equals("cK")||compare2.equals("hK")||compare2.equals("sK"))){
										C2.add(command2);
										move2 =0;
										break;
									}
									else if (command2.equals("dK")||command2.equals("cK")||command2.equals("hK")||command2.equals("sK")){
										C3.add(command2);
										move2 =0;
										break;
									}
									else {
										switch(command1){
											
											case "1" : C1.add(command2);
														break;
											case "2" : C2.add(command2);
														break;
											case "3" : C3.add(command2);
														break;
											case "4" : C4.add(command2);
														break;
											case "5" : C5.add(command2);
														break;
											case "6" : C6.add(command2);
														break;
											case "7" : C7.add(command2);
														break;
											case "8" : C8.add(command2);
														break;
											case "9" : C9.add(command2);
														break;			
										}				
														
										System.out.println("Invalid movement of card from 1 column to another");
										System.out.println("The moved card must be placed to a Column where its last card is one point bigger than the moved card.");
										move2 = 0;
										break;
									}
									
						case "4": 
									if(C4.size()==0){
										C4.add(command2);
										move2 = 0;
										break;
									}
									else{
										compare2 = C4.get(C4.size()-1);
									}
									
									if ((command2.equals("dA")||command2.equals("cA")||command2.equals("hA")||command2.equals("sA"))&&(compare2.equals("d2")||compare2.equals("c2")||compare2.equals("h2")||compare2.equals("s2"))){
										C4.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d2")||command2.equals("c2")||command2.equals("h2")||command2.equals("s2"))&&(compare2.equals("d3")||compare2.equals("c3")||compare2.equals("h3")||compare2.equals("s3"))){
										C4.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d3")||command2.equals("c3")||command2.equals("h3")||command2.equals("s3"))&&(compare2.equals("d4")||compare2.equals("c4")||compare2.equals("h4")||compare2.equals("s4"))){
										C4.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d4")||command2.equals("c4")||command2.equals("h4")||command2.equals("s4"))&&(compare2.equals("d5")||compare2.equals("c5")||compare2.equals("h5")||compare2.equals("s5"))){
										C4.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d5")||command2.equals("c5")||command2.equals("h5")||command2.equals("s5"))&&(compare2.equals("d6")||compare2.equals("c6")||compare2.equals("h6")||compare2.equals("s6"))){
										C4.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d6")||command2.equals("c6")||command2.equals("h6")||command2.equals("s6"))&&(compare2.equals("d7")||compare2.equals("c7")||compare2.equals("h7")||compare2.equals("s7"))){
										C4.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d7")||command2.equals("c7")||command2.equals("h7")||command2.equals("s7"))&&(compare2.equals("d8")||compare2.equals("c8")||compare2.equals("h8")||compare2.equals("s8"))){
										C4.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d8")||command2.equals("c8")||command2.equals("h8")||command2.equals("s8"))&&(compare2.equals("d9")||compare2.equals("c9")||compare2.equals("h9")||compare2.equals("s9"))){
										C4.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d9")||command2.equals("c9")||command2.equals("h9")||command2.equals("s9"))&&(compare2.equals("dX")||compare2.equals("cX")||compare2.equals("hX")||compare2.equals("sX"))){
										C4.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("dX")||command2.equals("cX")||command2.equals("hX")||command2.equals("sX"))&&(compare2.equals("dJ")||compare2.equals("cJ")||compare2.equals("hJ")||compare2.equals("sJ"))){
										C4.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("dJ")||command2.equals("cJ")||command2.equals("hJ")||command2.equals("sJ"))&&(compare2.equals("dQ")||compare2.equals("cQ")||compare2.equals("hQ")||compare2.equals("sQ"))){
										C4.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("dQ")||command2.equals("cQ")||command2.equals("hQ")||command2.equals("sQ"))&&(compare2.equals("dK")||compare2.equals("cK")||compare2.equals("hK")||compare2.equals("sK"))){
										C4.add(command2);
										move2 =0;
										break;
									}
									else if (command2.equals("dK")||command2.equals("cK")||command2.equals("hK")||command2.equals("sK")){
										C4.add(command2);
										move2 =0;
										break;
									}
									else {
										switch(command1){
											
											case "1" : C1.add(command2);
														break;
											case "2" : C2.add(command2);
														break;
											case "3" : C3.add(command2);
														break;
											case "4" : C4.add(command2);
														break;
											case "5" : C5.add(command2);
														break;
											case "6" : C6.add(command2);
														break;
											case "7" : C7.add(command2);
														break;
											case "8" : C8.add(command2);
														break;
											case "9" : C9.add(command2);
														break;			
										}				
														
										System.out.println("Invalid movement of card from 1 column to another");
										System.out.println("The moved card must be placed to a Column where its last card is one point bigger than the moved card.");
										move2 = 0;
										break;
									}
									
						case "5": 
									
									if(C5.size()==0){
										C5.add(command2);
										move2 = 0;
										break;
									}
									else {
										compare2 = C5.get(C5.size()-1);
									}
									if ((command2.equals("dA")||command2.equals("cA")||command2.equals("hA")||command2.equals("sA"))&&(compare2.equals("d2")||compare2.equals("c2")||compare2.equals("h2")||compare2.equals("s2"))){
										C5.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d2")||command2.equals("c2")||command2.equals("h2")||command2.equals("s2"))&&(compare2.equals("d3")||compare2.equals("c3")||compare2.equals("h3")||compare2.equals("s3"))){
										C5.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d3")||command2.equals("c3")||command2.equals("h3")||command2.equals("s3"))&&(compare2.equals("d4")||compare2.equals("c4")||compare2.equals("h4")||compare2.equals("s4"))){
										C5.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d4")||command2.equals("c4")||command2.equals("h4")||command2.equals("s4"))&&(compare2.equals("d5")||compare2.equals("c5")||compare2.equals("h5")||compare2.equals("s5"))){
										C5.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d5")||command2.equals("c5")||command2.equals("h5")||command2.equals("s5"))&&(compare2.equals("d6")||compare2.equals("c6")||compare2.equals("h6")||compare2.equals("s6"))){
										C5.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d6")||command2.equals("c6")||command2.equals("h6")||command2.equals("s6"))&&(compare2.equals("d7")||compare2.equals("c7")||compare2.equals("h7")||compare2.equals("s7"))){
										C5.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d7")||command2.equals("c7")||command2.equals("h7")||command2.equals("s7"))&&(compare2.equals("d8")||compare2.equals("c8")||compare2.equals("h8")||compare2.equals("s8"))){
										C5.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d8")||command2.equals("c8")||command2.equals("h8")||command2.equals("s8"))&&(compare2.equals("d9")||compare2.equals("c9")||compare2.equals("h9")||compare2.equals("s9"))){
										C5.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d9")||command2.equals("c9")||command2.equals("h9")||command2.equals("s9"))&&(compare2.equals("dX")||compare2.equals("cX")||compare2.equals("hX")||compare2.equals("sX"))){
										C5.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("dX")||command2.equals("cX")||command2.equals("hX")||command2.equals("sX"))&&(compare2.equals("dJ")||compare2.equals("cJ")||compare2.equals("hJ")||compare2.equals("sJ"))){
										C5.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("dJ")||command2.equals("cJ")||command2.equals("hJ")||command2.equals("sJ"))&&(compare2.equals("dQ")||compare2.equals("cQ")||compare2.equals("hQ")||compare2.equals("sQ"))){
										C5.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("dQ")||command2.equals("cQ")||command2.equals("hQ")||command2.equals("sQ"))&&(compare2.equals("dK")||compare2.equals("cK")||compare2.equals("hK")||compare2.equals("sK"))){
										C5.add(command2);
										move2 =0;
										break;
									}
									else if (command2.equals("dK")||command2.equals("cK")||command2.equals("hK")||command2.equals("sK")){
										C5.add(command2);
										move2 =0;
										break;
									}
									else {
										switch(command1){
											
											case "1" : C1.add(command2);
														break;
											case "2" : C2.add(command2);
														break;
											case "3" : C3.add(command2);
														break;
											case "4" : C4.add(command2);
														break;
											case "5" : C5.add(command2);
														break;
											case "6" : C6.add(command2);
														break;
											case "7" : C7.add(command2);
														break;
											case "8" : C8.add(command2);
														break;
											case "9" : C9.add(command2);
														break;			
										}				
														
										System.out.println("Invalid movement of card from 1 column to another");
										System.out.println("The moved card must be placed to a Column where its last card is one point bigger than the moved card.");
										move2 = 0;
										break;
									}
									
						case "6": 
									if(C6.size()==0){
										C6.add(command2);
										move2 = 0;
										break;
									}
									else{
										compare2 = C6.get(C6.size()-1);
									}
									
									if ((command2.equals("dA")||command2.equals("cA")||command2.equals("hA")||command2.equals("sA"))&&(compare2.equals("d2")||compare2.equals("c2")||compare2.equals("h2")||compare2.equals("s2"))){
										C6.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d2")||command2.equals("c2")||command2.equals("h2")||command2.equals("s2"))&&(compare2.equals("d3")||compare2.equals("c3")||compare2.equals("h3")||compare2.equals("s3"))){
										C6.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d3")||command2.equals("c3")||command2.equals("h3")||command2.equals("s3"))&&(compare2.equals("d4")||compare2.equals("c4")||compare2.equals("h4")||compare2.equals("s4"))){
										C6.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d4")||command2.equals("c4")||command2.equals("h4")||command2.equals("s4"))&&(compare2.equals("d5")||compare2.equals("c5")||compare2.equals("h5")||compare2.equals("s5"))){
										C6.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d5")||command2.equals("c5")||command2.equals("h5")||command2.equals("s5"))&&(compare2.equals("d6")||compare2.equals("c6")||compare2.equals("h6")||compare2.equals("s6"))){
										C6.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d6")||command2.equals("c6")||command2.equals("h6")||command2.equals("s6"))&&(compare2.equals("d7")||compare2.equals("c7")||compare2.equals("h7")||compare2.equals("s7"))){
										C6.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d7")||command2.equals("c7")||command2.equals("h7")||command2.equals("s7"))&&(compare2.equals("d8")||compare2.equals("c8")||compare2.equals("h8")||compare2.equals("s8"))){
										C6.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d8")||command2.equals("c8")||command2.equals("h8")||command2.equals("s8"))&&(compare2.equals("d9")||compare2.equals("c9")||compare2.equals("h9")||compare2.equals("s9"))){
										C6.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d9")||command2.equals("c9")||command2.equals("h9")||command2.equals("s9"))&&(compare2.equals("dX")||compare2.equals("cX")||compare2.equals("hX")||compare2.equals("sX"))){
										C6.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("dX")||command2.equals("cX")||command2.equals("hX")||command2.equals("sX"))&&(compare2.equals("dJ")||compare2.equals("cJ")||compare2.equals("hJ")||compare2.equals("sJ"))){
										C6.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("dJ")||command2.equals("cJ")||command2.equals("hJ")||command2.equals("sJ"))&&(compare2.equals("dQ")||compare2.equals("cQ")||compare2.equals("hQ")||compare2.equals("sQ"))){
										C6.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("dQ")||command2.equals("cQ")||command2.equals("hQ")||command2.equals("sQ"))&&(compare2.equals("dK")||compare2.equals("cK")||compare2.equals("hK")||compare2.equals("sK"))){
										C6.add(command2);
										move2 =0;
										break;
									}
									else if (command2.equals("dK")||command2.equals("cK")||command2.equals("hK")||command2.equals("sK")){
										C6.add(command2);
										move2 =0;
										break;
									}
									else {
										switch(command1){
											
											case "1" : C1.add(command2);
														break;
											case "2" : C2.add(command2);
														break;
											case "3" : C3.add(command2);
														break;
											case "4" : C4.add(command2);
														break;
											case "5" : C5.add(command2);
														break;
											case "6" : C6.add(command2);
														break;
											case "7" : C7.add(command2);
														break;
											case "8" : C8.add(command2);
														break;
											case "9" : C9.add(command2);
														break;			
										}				
														
										System.out.println("Invalid movement of card from 1 column to another");
										System.out.println("The moved card must be placed to a Column where its last card is one point bigger than the moved card.");
										move2 = 0;
										break;
									}
									
						case "7": 
						
									if(C7.size()==0){
										C7.add(command2);
										move2 = 0;
										break;
									}
									else{
										compare2 = C7.get(C7.size()-1);
									}
									if ((command2.equals("dA")||command2.equals("cA")||command2.equals("hA")||command2.equals("sA"))&&(compare2.equals("d2")||compare2.equals("c2")||compare2.equals("h2")||compare2.equals("s2"))){
										C7.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d2")||command2.equals("c2")||command2.equals("h2")||command2.equals("s2"))&&(compare2.equals("d3")||compare2.equals("c3")||compare2.equals("h3")||compare2.equals("s3"))){
										C7.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d3")||command2.equals("c3")||command2.equals("h3")||command2.equals("s3"))&&(compare2.equals("d4")||compare2.equals("c4")||compare2.equals("h4")||compare2.equals("s4"))){
										C7.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d4")||command2.equals("c4")||command2.equals("h4")||command2.equals("s4"))&&(compare2.equals("d5")||compare2.equals("c5")||compare2.equals("h5")||compare2.equals("s5"))){
										C7.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d5")||command2.equals("c5")||command2.equals("h5")||command2.equals("s5"))&&(compare2.equals("d6")||compare2.equals("c6")||compare2.equals("h6")||compare2.equals("s6"))){
										C7.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d6")||command2.equals("c6")||command2.equals("h6")||command2.equals("s6"))&&(compare2.equals("d7")||compare2.equals("c7")||compare2.equals("h7")||compare2.equals("s7"))){
										C7.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d7")||command2.equals("c7")||command2.equals("h7")||command2.equals("s7"))&&(compare2.equals("d8")||compare2.equals("c8")||compare2.equals("h8")||compare2.equals("s8"))){
										C7.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d8")||command2.equals("c8")||command2.equals("h8")||command2.equals("s8"))&&(compare2.equals("d9")||compare2.equals("c9")||compare2.equals("h9")||compare2.equals("s9"))){
										C7.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d9")||command2.equals("c9")||command2.equals("h9")||command2.equals("s9"))&&(compare2.equals("dX")||compare2.equals("cX")||compare2.equals("hX")||compare2.equals("sX"))){
										C7.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("dX")||command2.equals("cX")||command2.equals("hX")||command2.equals("sX"))&&(compare2.equals("dJ")||compare2.equals("cJ")||compare2.equals("hJ")||compare2.equals("sJ"))){
										C7.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("dJ")||command2.equals("cJ")||command2.equals("hJ")||command2.equals("sJ"))&&(compare2.equals("dQ")||compare2.equals("cQ")||compare2.equals("hQ")||compare2.equals("sQ"))){
										C7.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("dQ")||command2.equals("cQ")||command2.equals("hQ")||command2.equals("sQ"))&&(compare2.equals("dK")||compare2.equals("cK")||compare2.equals("hK")||compare2.equals("sK"))){
										C7.add(command2);
										move2 =0;
										break;
									}
									else if (command2.equals("dK")||command2.equals("cK")||command2.equals("hK")||command2.equals("sK")){
										C7.add(command2);
										move2 =0;
										break;
									}
									else {
										switch(command1){
											
											case "1" : C1.add(command2);
														break;
											case "2" : C2.add(command2);
														break;
											case "3" : C3.add(command2);
														break;
											case "4" : C4.add(command2);
														break;
											case "5" : C5.add(command2);
														break;
											case "6" : C6.add(command2);
														break;
											case "7" : C7.add(command2);
														break;
											case "8" : C8.add(command2);
														break;
											case "9" : C9.add(command2);
														break;			
										}				
														
										System.out.println("Invalid movement of card from 1 column to another");
										System.out.println("The moved card must be placed to a Column where its last card is one point bigger than the moved card.");
										move2 = 0;
										break;
									}
									
						case "8": 
									
									if(C8.size()==0){
										C8.add(command2);
										move2 = 0;
										break;
									}
									else {
										compare2 = C8.get(C8.size()-1);
									}
									
									if ((command2.equals("dA")||command2.equals("cA")||command2.equals("hA")||command2.equals("sA"))&&(compare2.equals("d2")||compare2.equals("c2")||compare2.equals("h2")||compare2.equals("s2"))){
										C8.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d2")||command2.equals("c2")||command2.equals("h2")||command2.equals("s2"))&&(compare2.equals("d3")||compare2.equals("c3")||compare2.equals("h3")||compare2.equals("s3"))){
										C8.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d3")||command2.equals("c3")||command2.equals("h3")||command2.equals("s3"))&&(compare2.equals("d4")||compare2.equals("c4")||compare2.equals("h4")||compare2.equals("s4"))){
										C8.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d4")||command2.equals("c4")||command2.equals("h4")||command2.equals("s4"))&&(compare2.equals("d5")||compare2.equals("c5")||compare2.equals("h5")||compare2.equals("s5"))){
										C8.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d5")||command2.equals("c5")||command2.equals("h5")||command2.equals("s5"))&&(compare2.equals("d6")||compare2.equals("c6")||compare2.equals("h6")||compare2.equals("s6"))){
										C8.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d6")||command2.equals("c6")||command2.equals("h6")||command2.equals("s6"))&&(compare2.equals("d7")||compare2.equals("c7")||compare2.equals("h7")||compare2.equals("s7"))){
										C8.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d7")||command2.equals("c7")||command2.equals("h7")||command2.equals("s7"))&&(compare2.equals("d8")||compare2.equals("c8")||compare2.equals("h8")||compare2.equals("s8"))){
										C8.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d8")||command2.equals("c8")||command2.equals("h8")||command2.equals("s8"))&&(compare2.equals("d9")||compare2.equals("c9")||compare2.equals("h9")||compare2.equals("s9"))){
										C8.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d9")||command2.equals("c9")||command2.equals("h9")||command2.equals("s9"))&&(compare2.equals("dX")||compare2.equals("cX")||compare2.equals("hX")||compare2.equals("sX"))){
										C8.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("dX")||command2.equals("cX")||command2.equals("hX")||command2.equals("sX"))&&(compare2.equals("dJ")||compare2.equals("cJ")||compare2.equals("hJ")||compare2.equals("sJ"))){
										C8.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("dJ")||command2.equals("cJ")||command2.equals("hJ")||command2.equals("sJ"))&&(compare2.equals("dQ")||compare2.equals("cQ")||compare2.equals("hQ")||compare2.equals("sQ"))){
										C8.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("dQ")||command2.equals("cQ")||command2.equals("hQ")||command2.equals("sQ"))&&(compare2.equals("dK")||compare2.equals("cK")||compare2.equals("hK")||compare2.equals("sK"))){
										C8.add(command2);
										move2 =0;
										break;
									}
									else if (command2.equals("dK")||command2.equals("cK")||command2.equals("hK")||command2.equals("sK")){
										C8.add(command2);
										move2 =0;
										break;
									}
									else {
										switch(command1){
											
											case "1" : C1.add(command2);
														break;
											case "2" : C2.add(command2);
														break;
											case "3" : C3.add(command2);
														break;
											case "4" : C4.add(command2);
														break;
											case "5" : C5.add(command2);
														break;
											case "6" : C6.add(command2);
														break;
											case "7" : C7.add(command2);
														break;
											case "8" : C8.add(command2);
														break;
											case "9" : C9.add(command2);
														break;			
										}				
														
										System.out.println("Invalid movement of card from 1 column to another");
										System.out.println("The moved card must be placed to a Column where its last card is one point bigger than the moved card.");
										move2 = 0;
										break;
									}
									
						case "9": 
									
									if(C9.size()==0){
										C9.add(command2);
										move2 = 0;
										break;
									}
									else {
										compare2 = C9.get(C9.size()-1);
									}
							
									if ((command2.equals("dA")||command2.equals("cA")||command2.equals("hA")||command2.equals("sA"))&&(compare2.equals("d2")||compare2.equals("c2")||compare2.equals("h2")||compare2.equals("s2"))){
										C9.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d2")||command2.equals("c2")||command2.equals("h2")||command2.equals("s2"))&&(compare2.equals("d3")||compare2.equals("c3")||compare2.equals("h3")||compare2.equals("s3"))){
										C9.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d3")||command2.equals("c3")||command2.equals("h3")||command2.equals("s3"))&&(compare2.equals("d4")||compare2.equals("c4")||compare2.equals("h4")||compare2.equals("s4"))){
										C9.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d4")||command2.equals("c4")||command2.equals("h4")||command2.equals("s4"))&&(compare2.equals("d5")||compare2.equals("c5")||compare2.equals("h5")||compare2.equals("s5"))){
										C9.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d5")||command2.equals("c5")||command2.equals("h5")||command2.equals("s5"))&&(compare2.equals("d6")||compare2.equals("c6")||compare2.equals("h6")||compare2.equals("s6"))){
										C9.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d6")||command2.equals("c6")||command2.equals("h6")||command2.equals("s6"))&&(compare2.equals("d7")||compare2.equals("c7")||compare2.equals("h7")||compare2.equals("s7"))){
										C9.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d7")||command2.equals("c7")||command2.equals("h7")||command2.equals("s7"))&&(compare2.equals("d8")||compare2.equals("c8")||compare2.equals("h8")||compare2.equals("s8"))){
										C9.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d8")||command2.equals("c8")||command2.equals("h8")||command2.equals("s8"))&&(compare2.equals("d9")||compare2.equals("c9")||compare2.equals("h9")||compare2.equals("s9"))){
										C9.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("d9")||command2.equals("c9")||command2.equals("h9")||command2.equals("s9"))&&(compare2.equals("dX")||compare2.equals("cX")||compare2.equals("hX")||compare2.equals("sX"))){
										C9.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("dX")||command2.equals("cX")||command2.equals("hX")||command2.equals("sX"))&&(compare2.equals("dJ")||compare2.equals("cJ")||compare2.equals("hJ")||compare2.equals("sJ"))){
										C9.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("dJ")||command2.equals("cJ")||command2.equals("hJ")||command2.equals("sJ"))&&(compare2.equals("dQ")||compare2.equals("cQ")||compare2.equals("hQ")||compare2.equals("sQ"))){
										C9.add(command2);
										move2 =0;
										break;
									}
									else if ((command2.equals("dQ")||command2.equals("cQ")||command2.equals("hQ")||command2.equals("sQ"))&&(compare2.equals("dK")||compare2.equals("cK")||compare2.equals("hK")||compare2.equals("sK"))){
										C9.add(command2);
										move2 =0;
										break;
									}
									else if (command2.equals("dK")||command2.equals("cK")||command2.equals("hK")||command2.equals("sK")){
										C9.add(command2);
										move2 =0;
										break;
									}
									else {
										switch(command1){
											
											case "1" : C1.add(command2);
														break;
											case "2" : C2.add(command2);
														break;
											case "3" : C3.add(command2);
														break;
											case "4" : C4.add(command2);
														break;
											case "5" : C5.add(command2);
														break;
											case "6" : C6.add(command2);
														break;
											case "7" : C7.add(command2);
														break;
											case "8" : C8.add(command2);
														break;
											case "9" : C9.add(command2);
														break;			
										}				
														
										System.out.println("Invalid movement of card from 1 column to another");
										System.out.println("The moved card must be placed to a Column where its last card is one point bigger than the moved card.");
										move2 = 0;
										break;
									}
									
						case "d": 	if (Pd.size()==0){
										if (command2.equals("dA")){
								
											Pd.add(command2);
											move2 = 0;	
											break;
										}
										
										
										else {
											switch(command1){
												
												case "1" : C1.add(command2);
															break;
												case "2" : C2.add(command2);
															break;
												case "3" : C3.add(command2);
															break;
												case "4" : C4.add(command2);
															break;
												case "5" : C5.add(command2);
															break;
												case "6" : C6.add(command2);
															break;
												case "7" : C7.add(command2);
															break;
												case "8" : C8.add(command2);
															break;
												case "9" : C9.add(command2);
															break;			
											}				
															
											System.out.println("Invalid movement.");
											System.out.println("First card in this pile must be dA.");
											move2 = 0;
											break;
													
										}
									}
									
									else {
										compare2 = Pd.get(Pd.size()-1);
									}
									
									

									if (command2.equals("d2")&&compare2.equals("dA")){
								
											Pd.add(command2);
											move2 = 0;
											break;
									}
									else if (command2.equals("d2")&&compare2.equals("dA")){
								
											Pd.add(command2);
											move2 = 0;
											break;
									}
									else if (command2.equals("d3")&&compare2.equals("d2")){
								
											Pd.add(command2);
											move2 = 0;
											break;
									}
									else if (command2.equals("d4")&&compare2.equals("d3")){
								
											Pd.add(command2);
											move2 = 0;
											break;
									}	
									else if (command2.equals("d5")&&compare2.equals("d4")){
								
											Pd.add(command2);
											move2 = 0;
											break;
									}	
									else if (command2.equals("d6")&&compare2.equals("d5")){
								
											Pd.add(command2);
											move2 = 0;
											break;
									}	
									else if (command2.equals("d7")&&compare2.equals("d6")){
								
											Pd.add(command2);
											move2 = 0;
											break;
									}	
									else if (command2.equals("d8")&&compare2.equals("d7")){
								
											Pd.add(command2);
											move2 = 0;
											break;
									}	
									else if (command2.equals("d9")&&compare2.equals("d8")){
								
											Pd.add(command2);
											move2 = 0;
											break;
									}	
									else if (command2.equals("dX")&&compare2.equals("d9")){
								
											Pd.add(command2);
											move2 = 0;
											break;
									}
									else if (command2.equals("dJ")&&compare2.equals("dX")){
								
											Pd.add(command2);
											move2 = 0;
											break;
									}	
									else if (command2.equals("dQ")&&compare2.equals("dJ")){
								
											Pd.add(command2);
											move2 = 0;
											break;
									}
									else if (command2.equals("dK")&&compare2.equals("dQ")){
								
											Pd.add(command2);
											move2 = 0;
											break;
									}
									else {
										switch(command1){
											
											case "1" : C1.add(command2);
														break;
											case "2" : C2.add(command2);
														break;
											case "3" : C3.add(command2);
														break;
											case "4" : C4.add(command2);
														break;
											case "5" : C5.add(command2);
														break;
											case "6" : C6.add(command2);
														break;
											case "7" : C7.add(command2);
														break;
											case "8" : C8.add(command2);
														break;
											case "9" : C9.add(command2);
														break;			
										}				
														
										System.out.println("Invalid movement.");
										System.out.println("Please move follow the rule.");
				
										move2 = 0;
										break;
												
											
									}	
											
											
						case "c":  if (Pc.size()==0){
										if (command2.equals("cA")){
								
											Pc.add(command2);
											move2 = 0;	
											break;
										}
										
										
										else {
											switch(command1){
												
												case "1" : C1.add(command2);
															break;
												case "2" : C2.add(command2);
															break;
												case "3" : C3.add(command2);
															break;
												case "4" : C4.add(command2);
															break;
												case "5" : C5.add(command2);
															break;
												case "6" : C6.add(command2);
															break;
												case "7" : C7.add(command2);
															break;
												case "8" : C8.add(command2);
															break;
												case "9" : C9.add(command2);
															break;			
											}				
															
											System.out.println("Invalid movement.");
											System.out.println("First card in this pile must be cA.");
											move2 = 0;
											break;
													
										}
									}
									
									else {
										compare2 = Pc.get(Pc.size()-1);
									}
									
									

									if (command2.equals("c2")&&compare2.equals("cA")){
								
											Pc.add(command2);
											move2 = 0;
											break;
									}
									else if (command2.equals("c2")&&compare2.equals("cA")){
								
											Pc.add(command2);
											move2 = 0;
											break;
									}
									else if (command2.equals("c3")&&compare2.equals("c2")){
								
											Pc.add(command2);
											move2 = 0;
											break;
									}
									else if (command2.equals("c4")&&compare2.equals("c3")){
								
											Pc.add(command2);
											move2 = 0;
											break;
									}	
									else if (command2.equals("c5")&&compare2.equals("c4")){
								
											Pc.add(command2);
											move2 = 0;
											break;
									}	
									else if (command2.equals("c6")&&compare2.equals("c5")){
								
											Pc.add(command2);
											move2 = 0;
											break;
									}	
									else if (command2.equals("c7")&&compare2.equals("c6")){
								
											Pc.add(command2);
											move2 = 0;
											break;
									}	
									else if (command2.equals("c8")&&compare2.equals("c7")){
								
											Pc.add(command2);
											move2 = 0;
											break;
									}	
									else if (command2.equals("c9")&&compare2.equals("c8")){
								
											Pc.add(command2);
											move2 = 0;
											break;
									}	
									else if (command2.equals("cX")&&compare2.equals("c9")){
								
											Pc.add(command2);
											move2 = 0;
											break;
									}
									else if (command2.equals("cJ")&&compare2.equals("cX")){
								
											Pc.add(command2);
											move2 = 0;
											break;
									}	
									else if (command2.equals("cQ")&&compare2.equals("cJ")){
								
											Pc.add(command2);
											move2 = 0;
											break;
									}
									else if (command2.equals("cK")&&compare2.equals("cQ")){
								
											Pc.add(command2);
											move2 = 0;
											break;
									}
									else {
										switch(command1){
											
											case "1" : C1.add(command2);
														break;
											case "2" : C2.add(command2);
														break;
											case "3" : C3.add(command2);
														break;
											case "4" : C4.add(command2);
														break;
											case "5" : C5.add(command2);
														break;
											case "6" : C6.add(command2);
														break;
											case "7" : C7.add(command2);
														break;
											case "8" : C8.add(command2);
														break;
											case "9" : C9.add(command2);
														break;			
										}				
														
										System.out.println("Invalid movement.");
										System.out.println("Please move follow the rule.");
				
										move2 = 0;
										break;
												
											
									}	
											
									
						case "h":   if (Ph.size()==0){
										if (command2.equals("hA")){
								
											Ph.add(command2);
											move2 = 0;	
											break;
										}
										
										
										else {
											switch(command1){
												
												case "1" : C1.add(command2);
															break;
												case "2" : C2.add(command2);
															break;
												case "3" : C3.add(command2);
															break;
												case "4" : C4.add(command2);
															break;
												case "5" : C5.add(command2);
															break;
												case "6" : C6.add(command2);
															break;
												case "7" : C7.add(command2);
															break;
												case "8" : C8.add(command2);
															break;
												case "9" : C9.add(command2);
															break;			
											}				
															
											System.out.println("Invalid movement.");
											System.out.println("First card in this pile must be hA.");
											move2 = 0;
											break;
													
										}
									}
									
									else {
										compare2 = Ph.get(Ph.size()-1);
									}
									
									

									if (command2.equals("h2")&&compare2.equals("hA")){
								
											Ph.add(command2);
											move2 = 0;
											break;
									}
									else if (command2.equals("h2")&&compare2.equals("hA")){
								
											Ph.add(command2);
											move2 = 0;
											break;
									}
									else if (command2.equals("h3")&&compare2.equals("h2")){
								
											Ph.add(command2);
											move2 = 0;
											break;
									}
									else if (command2.equals("h4")&&compare2.equals("h3")){
								
											Ph.add(command2);
											move2 = 0;
											break;
									}	
									else if (command2.equals("h5")&&compare2.equals("h4")){
								
											Ph.add(command2);
											move2 = 0;
											break;
									}	
									else if (command2.equals("h6")&&compare2.equals("h5")){
								
											Ph.add(command2);
											move2 = 0;
											break;
									}	
									else if (command2.equals("h7")&&compare2.equals("h6")){
								
											Ph.add(command2);
											move2 = 0;
											break;
									}	
									else if (command2.equals("h8")&&compare2.equals("h7")){
								
											Ph.add(command2);
											move2 = 0;
											break;
									}	
									else if (command2.equals("h9")&&compare2.equals("h8")){
								
											Ph.add(command2);
											move2 = 0;
											break;
									}	
									else if (command2.equals("hX")&&compare2.equals("h9")){
								
											Ph.add(command2);
											move2 = 0;
											break;
									}
									else if (command2.equals("hJ")&&compare2.equals("hX")){
								
											Ph.add(command2);
											move2 = 0;
											break;
									}	
									else if (command2.equals("hQ")&&compare2.equals("hJ")){
								
											Ph.add(command2);
											move2 = 0;
											break;
									}
									else if (command2.equals("hK")&&compare2.equals("hQ")){
								
											Ph.add(command2);
											move2 = 0;
											break;
									}
									else {
										switch(command1){
											
											case "1" : C1.add(command2);
														break;
											case "2" : C2.add(command2);
														break;
											case "3" : C3.add(command2);
														break;
											case "4" : C4.add(command2);
														break;
											case "5" : C5.add(command2);
														break;
											case "6" : C6.add(command2);
														break;
											case "7" : C7.add(command2);
														break;
											case "8" : C8.add(command2);
														break;
											case "9" : C9.add(command2);
														break;			
										}				
														
										System.out.println("Invalid movement.");
										System.out.println("Please move follow the rule.");
				
										move2 = 0;
										break;
												
											
									}	
											
									
						case "s":   if (Ps.size()==0){
										if (command2.equals("sA")){
								
											Ps.add(command2);
											move2 = 0;	
											break;
										}
										
										
										else {
											switch(command1){
												
												case "1" : C1.add(command2);
															break;
												case "2" : C2.add(command2);
															break;
												case "3" : C3.add(command2);
															break;
												case "4" : C4.add(command2);
															break;
												case "5" : C5.add(command2);
															break;
												case "6" : C6.add(command2);
															break;
												case "7" : C7.add(command2);
															break;
												case "8" : C8.add(command2);
															break;
												case "9" : C9.add(command2);
															break;			
											}				
															
											System.out.println("Invalid movement.");
											System.out.println("First card in this pile must be sA.");
											move2 = 0;
											break;
													
										}
									}
									
									else {
										compare2 = Ps.get(Ps.size()-1);
									}
									
									

									if (command2.equals("s2")&&compare2.equals("sA")){
								
											Ps.add(command2);
											move2 = 0;
											break;
									}
									else if (command2.equals("s2")&&compare2.equals("sA")){
								
											Ps.add(command2);
											move2 = 0;
											break;
									}
									else if (command2.equals("s3")&&compare2.equals("s2")){
								
											Ps.add(command2);
											move2 = 0;
											break;
									}
									else if (command2.equals("s4")&&compare2.equals("s3")){
								
											Ps.add(command2);
											move2 = 0;
											break;
									}	
									else if (command2.equals("s5")&&compare2.equals("s4")){
								
											Ps.add(command2);
											move2 = 0;
											break;
									}	
									else if (command2.equals("s6")&&compare2.equals("s5")){
								
											Ps.add(command2);
											move2 = 0;
											break;
									}	
									else if (command2.equals("s7")&&compare2.equals("s6")){
								
											Ps.add(command2);
											move2 = 0;
											break;
									}	
									else if (command2.equals("s8")&&compare2.equals("s7")){
								
											Ps.add(command2);
											move2 = 0;
											break;
									}	
									else if (command2.equals("s9")&&compare2.equals("s8")){
								
											Ps.add(command2);
											move2 = 0;
											break;
									}	
									else if (command2.equals("sX")&&compare2.equals("s9")){
								
											Ps.add(command2);
											move2 = 0;
											break;
									}
									else if (command2.equals("sJ")&&compare2.equals("sX")){
								
											Ps.add(command2);
											move2 = 0;
											break;
									}	
									else if (command2.equals("sQ")&&compare2.equals("sJ")){
								
											Ps.add(command2);
											move2 = 0;
											break;
									}
									else if (command2.equals("sK")&&compare2.equals("sQ")){
								
											Ps.add(command2);
											move2 = 0;
											break;
									}
									else {
										switch(command1){
											
											case "1" : C1.add(command2);
														break;
											case "2" : C2.add(command2);
														break;
											case "3" : C3.add(command2);
														break;
											case "4" : C4.add(command2);
														break;
											case "5" : C5.add(command2);
														break;
											case "6" : C6.add(command2);
														break;
											case "7" : C7.add(command2);
														break;
											case "8" : C8.add(command2);
														break;
											case "9" : C9.add(command2);
														break;			
										}				
														
										System.out.println("Invalid movement.");
										System.out.println("Please move follow the rule.");
				
										move2 = 0;
										break;
												
											
									}	
											
					}
					
				}while(move2 == 1);
				if (Pd.size()==13 && Pc.size()==13 && Ph.size()==13 && Ps.size()==13)	{
					
					System.out.print("Pile  d: ");
					System.out.println(Pd);
					
					System.out.print("Pile  c: ");
					System.out.println(Pc);
					
					System.out.print("Pile  h: ");
					System.out.println(Ph);
					
					System.out.print("Pile  s: ");
					System.out.println(Ps);
					
					System.out.println("Congratulation!!! You win the game.");
					System.out.println("Press r to restart or x to exit.");
					
					command4 = input.next();		
					if (command4.equals("r")){
						loop = 1;
						mainCaller();
						break;
							
					}				
								
					else if(command4.equals("x")){
						loop = 1;
						
						exit();
						break;
							
					}
					else{
						
						System.out.println("Since wrong input is entered.");
						System.out.println("So, the program will treat it as exit.");
						loop = 1;
						exit();
						break;
					}
				
				}
			
			}
			
			catch(ArrayIndexOutOfBoundsException ex){
				System.out.println("Array index out of bound.");
				System.out.println("Please try again.");
			}
		}while(loop ==1);
	}	
	/**
	 *This is Exit method.
	 *Just an empty method to quit the program.
	 */
	public static void Exit(){
		
	}
	/**
	 *This is printAll method to show all the pile and column.
	 *@param Pd first array list
	 *@param Pc second array list
	 *@param Ps third array list
	 *@param Ph fouth array list
	 *@param C1 fifth array list
	 *@param C2 sixth array list
	 *@param C3 seventh array list
	 *@param C4 eighth array list
	 *@param C5 nineth array list
	 *@param C6 tenth array list
	 *@param C7 eleventh array list
	 *@param C8 twelveth array list
	 *@param C9 thirteenth array list
	 */
	public static void printAll(ArrayList<String> Pd, ArrayList<String> Pc, ArrayList<String> Ph, ArrayList<String> Ps, ArrayList<String> C1, ArrayList<String> C2, ArrayList<String> C3, ArrayList<String> C4, ArrayList<String> C5, ArrayList<String> C6, ArrayList<String> C7, ArrayList<String> C8, ArrayList<String> C9){
			System.out.print("Pile  d: ");
			System.out.println(Pd);
			
			System.out.print("Pile  c: ");
			System.out.println(Pc);
			
			System.out.print("Pile  h: ");
			System.out.println(Ph);
			
			System.out.print("Pile  s: ");
			System.out.println(Ps);
			
			System.out.print("Column 1: ");
			System.out.println(C1);
			
			System.out.print("Column 2: ");
			System.out.println(C2);
			
			System.out.print("Column 3: ");
			System.out.println(C3);
			
			System.out.print("Column 4: ");
			System.out.println(C4);
			
			System.out.print("Column 5: ");
			System.out.println(C5);
			
			System.out.print("Column 6: ");
			System.out.println(C6);
			
			System.out.print("Column 7: ");
			System.out.println(C7);
			
			System.out.print("Column 8: ");
			System.out.println(C8);
			
			System.out.print("Column 9: ");
			System.out.println(C9);
			
			
			
			System.out.print("Command > ");
	}
	
	/**
	 *This is SelCom2 method to switch lowercase to uppercase.
	 *@param command2 string value 
	 *@return command2
	 */
	public static String SelCom2(String command2){
		switch(command2){
				
				case "da": command2 = "dA";
							break;
				
				case "dx": command2 = "dX";
							break;
				
				case "dj": command2 = "dJ";
							break;
				
				case "dq": command2 = "dQ";
							break;
							
				case "dk": command2 = "dK";
							break;
									
				case "ca": command2 = "cA";
							break;
							
				case "cx": command2 = "cX";
							break;
				
				case "cj": command2 = "cJ";
							break;
				
				case "cq": command2 = "cQ";
							break;
				
				case "ck": command2 = "cK";
							break;

				case "ha": command2 = "hA";
							break;					
				
				case "hx": command2 = "hX";
							break;
				
				case "hj": command2 = "hJ";
							break;
				
				case "hq": command2 = "hQ";
							break;
				
				case "hk": command2 = "hK";
							break;
							
				case "sa": command2 = "sA";
							break;					
				
				case "sx": command2 = "sX";
							break;
				
				case "sj": command2 = "sJ";
							break;
				
				case "sq": command2 = "sQ";
							break;
				
				case "sk": command2 = "sK";
							break;
		}
		return command2;
	}
		
}





				
	



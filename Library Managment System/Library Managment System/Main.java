import java.util.*;
public class Main {
/**
 * @param args
 */
public static void main(String[] args) {
			Signup tree = new Signup();
			Book library= new Book();
			tree.insert(0,new RegisterUser("behram", "211400177") );
			tree.insert(1,new RegisterUser("ahmad", "211400181" ));
			library.addBook(new Book(211,"Data Structure ","H Cormen"));
			library.addBook(new Book(212,"introduction to proghramming ","thomas k"));
			Scanner in = new Scanner(System.in);
			System.out.println("**************************************************");	
			System.out.println("WELCOM TO LIBRARY LOGIN PAGE\n");		
			System.out.println("press 	1  for login  : \n");
		    System.out.println("press     2  for sign up:\n");
		    System.out.println("Press 	0  for log out:\n");
			System.out.println("**************************************************");	
		   int  input =in.nextInt();
		
		// Do by using do while loop this loop first run after exicution cehck condition 
		while(input!=0){
		    
		    // By using switch statement this statement check condition and display require result
		    // Outter switch 
		    	switch(input) {
		    	// Case No 1 this case check login detail
		    	      case 1:
		    	      Scanner login = new Scanner(System.in);
		    	      System.out.println("Enter your username : ");
		    	      String username = login.nextLine();
		    	      System.out.println("Enter your password:  ");
		    	      String password = login.nextLine();
		    	      // this if check user name and password if both are correct then login 
		    	      if (tree.isUserValid(username, password)) {
		    	    	  				System.out.println("**************************************************");
		    	    	  				System.out.println("Login successful!      ");
		    			                System.out.println("Welcom to The library :");
		    			                //Scanner read = new Scanner(System.in);
		    			                System.out.println("**************************************************");
		    			                System.out.println("1. Add  book                 ");
							            System.out.println("2. Remove books              ");
							            System.out.println("3. Print book                ");
							            System.out.println("4. Search Book               ");
							            System.out.println("5. Total Number of book check");
							            System.out.println("6. Updat Book detail         ");
										System.out.println("7. generate report           ");
							            System.out.println("0. for logh out              ");
							            System.out.print("Enter choice:                  ");
							            Scanner scanner;
										int choice = in.nextInt();
				// here we use while loop this loop use for book add remove update search 
				while (choice != 0) {	
					// inner switch this switch statement use run Book class method 
		    	switch (choice) {
		    			// case 1 use add book in array of book class	            
		    			case 1:
		    			System.out.print("Enter book ID:    ");
		    			int id =in.nextInt();
		    			in.nextLine();
		    			System.out.print("Enter book title:  ");
		    			String title = in.nextLine();
		    			System.out.print("Enter book author: ");
		    			String author = in.nextLine();
		    			library.addBook(new Book(id, title, author));
		    			break;
		    			// this case use to remove book from Book class array
		    			case 2:
		    			System.out.print("Enter book ID:     ");
		    			id = in.nextInt();
		    			library.removeBook(id);
		    			break;
		    			// this case print all books objects That are store in book class array
		    			case 3:
		    			 library.print();
						 System.out.println();
		    			 break;
		    			 // this use case search book from the book class array according to book id no
		    			case 4:
		    			System.out.print("Enter book ID: ");
		    			 id = in.nextInt();
		    			int result=library.searchBook(id);
		    	// this if check result value if value is equals to 0 then book is not found other wise book found
		    	if(result!=0) {
		    			System.out.println("The book is found :    ");
		    		}// end of if block
		    	else {
		    			System.out.println("The book is not found :");
		    	}// end of else block
		    			break;
		    			// this case print total numbers of book that are store in book class array
		    			case 5:
		    			System.out.println("The Total Number of book is :"+library.totalBooks());
		    			break;
		    			// this case is use update the value of book that is store in book class array
		    			case 6:
		    			System.out.print("Enter The position : ");
		    			int posi = in.nextInt();
		    			System.out.print("Enter book ID:       ");
		    			int id1 = in.nextInt();
		    			in.nextLine();
		    			System.out.print("Enter book title:    ");
		    			String title1 = in.nextLine();
		    			System.out.print("Enter book author:    ");
		    			String author1 = in.nextLine();
		    			library.replaceBook(posi, new Book(id1, title1, author1));
		    			break;
						case 7:
						System.out.println("The Total Number of books in library is :"+library.totalBooks());
						System.out.println("List of Books is :");
						library.print();
						System.out.println();
						System.out.println("The list of User is :");
						tree.printInOrder();
						break;
		    			// this is default case of inner switch statement if we enter worng value then default case run
		    			default:
		    			System.out.println("Invalid choice.      ");
		    					                    
		    	}// end of inner switch 
		    					 System.out.println();
		    					 System.out.println("1. Add  book                 ");
		    					 System.out.println("2. Remove books              ");
		    					 System.out.println("3. Print book                ");
		    					 System.out.println("4. Search Book               ");
		    					 System.out.println("5. Total Number of book check");
		    					 System.out.println("6. Updat Book detail         ");
								 System.out.println("7. generate report           ");
		    					 System.out.println("0. for logh out              ");
		    					 System.out.print("Enter choice:                  ");
		    					 choice = in.nextInt();
		    	} // end of while loop
		    	} // end of if Main block
		    			                
		    			            
		    	else {
		    			          System.out.println("Invalid username or password.");
		    		}// end of else Main block
		    	        break;
		    	        // this case use for sign up 
		    	        case 2:
		    	        		 	Scanner scanner1 = new Scanner(System.in);
									System.out.println("**************************************************");	
									System.out.println("WELCOM TO LIBRARY Sign Up Page\n");	
						    		System.out.println("Press 1 User Regiteration :    ");
						    		System.out.println("Press 2 User data Update :     ");
						    		System.out.println("Press 3 Remove user :          ");
						    		System.out.println("Press 4 Display All user list: ");
						    		System.out.println("Press 0 for exit :             ");
									System.out.println("**************************************************");
						    		int exper=scanner1.nextInt();
				// while loop use for user registration and save data in user register class tree
				while(exper!=0) {
					// start inner switch statement 
					switch(exper) {
					// this is use get data from user and store in tree
						  case 1:
						   // this while loop get user name if and check user name equal to quit if equal then it will break
								System.out.println("How many user you whant to add and your in put grater then 1");
								int user=scanner1.nextInt();
								for(int i=2;i<=user;i++){
									scanner1.nextLine();
									System.out.println("Enter a username :  ");
						    	    String username1 = scanner1.nextLine();
						    	    //scanner1.nextLine();
						    	    System.out.println("Enter a password: ");
						    	    String password1 = scanner1.nextLine();
						    	    //scanner1.nextLine();         
						    	   tree.insert(i, new RegisterUser(username1, password1));
						    	   System.out.println("User added successfully!");
						    	   System.out.println();
								}//end of loop
						break;
						   // this case use update user data from user register class tree
						case 2:
						    	 //Scanner a = new Scanner(System.in);
								 System.out.println("Enter position ");
								 int posi=scanner1.nextInt();
						    	   System.out.println("Enter a username  ");
					    	       String username2 = scanner1.nextLine();
					    	       scanner1.nextLine();
					    	       System.out.println("Enter a password: ");
					    	       String password2 = scanner1.nextLine();
					    	       in.nextLine();
					    	       RegisterUser user1 = new RegisterUser(username2, password2);
						    	   tree.update(posi, user1);
						break;
						//this case use for remove user from user register class tree
					  case 3:
						    	 System.out.println("Enter the position");
								 int key=scanner1.nextInt();
						    	 tree.delete(key);
					 break;
					 // this case use print all user data that are store in user register class
					 case 4:
						    	tree.printInOrder();
					 break;
					 default:
						   }//end of switch register user switch
						    	        	System.out.println("Press 1 User Regiteration :   ");
								    		System.out.println("Press 2 User data Update :    ");
								    		System.out.println("Press 3 Remove user :         ");
								    		System.out.println("Press 4 Display All user list:");
								    		System.out.println("Press 0 for exit :            ");
						    	    		exper=scanner1.nextInt();
						    	        }//end of while
		    	        		 break;
		    	        		 default:
		    	        			 System.out.println("Please Enter the Valid Informathoin");
		    	        	 }//end of switch case
		    	        	 System.out.println("press 	1  for login :");
		    	        	 System.out.println("press  2  for sign up:");
		    	        	 System.out.println("Press 	0  for log out:");
		    	        	 input =in.nextInt();
		    	         } //end of while loop 
	
		     System.out.println("*******************************************************************");
	    	 System.out.println("             You are success fully log out the system              ");
	    	 System.out.println("             Muhammad Behram  Roll no 211400177                    ");
	    	 System.out.println("             Ahmad mehmoood   Roll no 211400177                    ");
	    	 System.out.println("             Submitted to sir:                                     ");
	    	 System.out.println("                 			sir Kamal Ashrif Gill                   ");
	    	 System.out.println("*******************************************************************");
	    	        
		}// end of main
}// end of class


	        
	      

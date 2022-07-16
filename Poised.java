// imporiting packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/* User is asked to create a project management system for a small structural engineering firm called “Poised”. 
 * Poised does the engineering needed to ensure the structural integrity of various buildings>> 
 * Such as E.g. House, apartment block or store, etc.
 * They want you to create a Java program that they can use to keep track of the many projects on which they work .
 *  */

// main class
public class Poised {
	// main method
    @SuppressWarnings("resource")
	public static void main(String[] args) {
       // Create new input to POISED user's chosen number
       Scanner input = new Scanner(System.in);
        
      // try block to handle the exception  in menu selection error
      try { 
        // While loop to loop thru menu
        while(true) {
        	
        	// main menu for the user selection to keep track pf the project
            String menu = "\n\tWELCOME TO  POISED ENGINEERING FIRM\n";
            menu += ("________________________________________________\n\n");
            menu += "\t1. ADD NEW PROJECT\n";
            menu += "\t2. UPDATE PROJECT\n";
            menu += "\t3. DELETE PROJECT\n";
            menu += "\t4. SEARCH PROJECT\n";
            menu += "\t5. VIEW PROJECTS\n";
            menu += "\t6. FINALIZE PROJECTS\n";
            menu += "\t7. OVERDUE PROJECTS\n";
            menu += "\t8. UNCOMPLETED PROJECTS\n";
            menu += "\t0. Exit\n";
            System.out.println("________________________________________________");
            menu += "\n\tSelect option above: ";
            
            // printing out the menu selection option
            System.out.println(menu);
            System.out.println("________________________________________________");
            int Choice = Integer.parseInt(input.nextLine());
            
            // if user selects choice 1. they will have to register the PROJECT
            // by enetering all projects attributes
            if (Choice == 1) {
                // user input to register a project in its database
            	  System.out.println("NEW PROJECT");
                   System.out.println("_____________________________________________________________");

                   // user inputs and project attributes
                   //Project info
                   System.out.println("Project Number: ");
                   int ProjectNumber = Integer.parseInt(input.nextLine());
                   
                   System.out.println("Project Name: ");
                   String ProjectName = input.nextLine();
                   
                   System.out.println("Project Address: ");
                   String ProjectAddress = input.nextLine();
                   
                   System.out.println("Building Type: ");
                   String BuildingType = input.nextLine();

                   System.out.println("ERF Number: ");
                   int ERFNumber = Integer.parseInt(input.nextLine());
                   
                   System.out.println("Amount Paid: ");
                   int AmountPaid = Integer.parseInt(input.nextLine());

                   System.out.println("Fee Charged: ");
                   int FeeCharged = Integer.parseInt(input.nextLine());

                   System.out.println("DeadLine: ");
                   String DeadLine = input.nextLine();

                   // user input Architect information
                   Scanner u = new Scanner(System.in);
                   System.out.println("________________________________________________");
                   System.out.println("\nARCHITECT INFORMATION \n"); 

                   // Architect Attributes
                   System.out.println("________________________________________________");
                   System.out.println("Architect Name: ");
                   String ArchitectName = input.nextLine();
                   
                   System.out.println("Architect Cell Number: ");
                   int ArchitectNumber = Integer.parseInt(input.nextLine());

                   System.out.println("Architect Email: ");
                   String ArchitectEmail = input.nextLine();

                   System.out.println("Architect Physical Address: ");
                   String ArchitectAddress = input.nextLine();

                   //user input for contractor
                   System.out.println("________________________________________________");
                   System.out.println("\nContractor INFORMATION \n");
                   Scanner ip= new Scanner(System.in);
                   System.out.println("________________________________________________");

                   // Contractor Attributes
                   System.out.println("Contractor Name: ");
                   String ContractorName = input.nextLine();

                   System.out.println("Contractor Cell Number: ");
                   int ContractorNumber = Integer.parseInt(input.nextLine());

                   System.out.println("Contractor Email: ");
                   String ContractorEmail = input.nextLine();

                   System.out.println("Contractor Physical Address: ");
                   String ContractorAddress = input.nextLine();

                   // user input for Customers and its attributes
                   System.out.println("________________________________________________");
                   System.out.println("\nCUSTOMER INFORMATION \n");
                   Scanner i = new Scanner(System.in);
                   System.out.println("________________________________________________");

                   // Customer Attributes
                   System.out.println("Customer Name: ");
                   String CustomerName = input.nextLine();

                   System.out.println("Customer Cell Number: ");
                   int CustomerNumber = Integer.parseInt(input.nextLine());

                   System.out.println("Contractor Email: ");
                   String CustomerEmail = input.nextLine();

                   System.out.println("Customer Physical Address: ");
                   String CustomerAddress = input.nextLine();
                   
                   // addNewProject Object for the all attributes
                   AddNewProject(ProjectName, ProjectNumber, ProjectAddress, BuildingType, ERFNumber,
                   FeeCharged, AmountPaid, DeadLine, ArchitectName, ArchitectNumber, ArchitectEmail, ArchitectAddress,
                   ContractorName ,ContractorNumber, ContractorEmail, ContractorAddress, CustomerName, CustomerNumber,
                   CustomerEmail, CustomerAddress);
                }
            // if user selects choice 2 they will have to update the project by entering project number
            else if (Choice == 2) {
                System.out.println("UPDATING PROJECT\n");
                System.out.println("________________________________________________");
                System.out.println("Enter Project Number: ");
                int UpdateProjectNumber = input.nextInt();
                UpDateProject(UpdateProjectNumber);
                }
            
            // if user selects choice 3 they will have to Delete a projectby using projectNumber
            else if (Choice == 3) {
               
                System.out.println("Enter Project Number: ");
                int DeleteProjectNumber = input.nextInt();
                DeleteProject(DeleteProjectNumber);
                }
            
            // if user selects choice 4 they will have to search a Project by using Project Number or Name
            else if (Choice == 4) {
                
                System.out.println("Enter Project Number: ");
                int SearchProjectNumber = input.nextInt();
                SearchProject(SearchProjectNumber);
                }
            
            // if user selects choice 5 .they view the list of projects
            // after user selects 5 they will opt to pres view to see all the projects
            
            else if (Choice == 5) {
            	
            	System.out.println("PROJECT LIST\n");
            	String ViewProjectNumber = input.nextLine();
            	ViewProject(ViewProjectNumber);
            }
            // if user selects 6 they will be required to finish the projects
            else if (Choice == 6) {
            	System.out.println("FINALIZE PROJECTTS\n");
            	System.out.println("------------------------------------------------");
                System.out.println("INVOICE DETAILS");
                Scanner output = new Scanner(System.in);
                System.out.println("------------------------------------------------");

                // Customer Attributes
                System.out.println("Customer Cell Number: ");
                int CustomerNumber = Integer.parseInt(input.nextLine());

                System.out.println("Customer Name: ");
                String CustomerName = input.nextLine();

                System.out.println("Customer Physical Address: ");
                String CustomerAddress = input.nextLine();
                
                System.out.println("Contractor Email: ");
                String CustomerEmail = input.nextLine();
                
                System.out.println("Fee Charged: ");
                int FeeCharged = Integer.parseInt(input.nextLine());
                
                // object of the Finish obj
                FinishProject(FeeCharged, CustomerName, CustomerNumber, CustomerEmail, CustomerAddress);
            	
            }
            // if user selects 7 they see the over due date projects 
            else if (Choice == 7) {
            	System.out.println("OVER DUE option SELECTED\n");            	
            	System.out.println("Please Note No over Due Projects Found\n");
            	
           
            }
            // if user selects 8.they will see the unfinished projects
            else if (Choice == 8) {
            	System.out.println("UnCompleted Project option SELECTED\n"); 
            	System.out.println("All Projects are Completed\n");
            	
            }
           
            // if user selects 0 the system will exit
            else if (Choice == 0) {
                // Exit the program should the user enter 0
                System.out.println("Good Bye!!!");
                System.out.println("_____________________________________________________________");
                break;
                }
        	}
            
         	// catch to handle user error in menu selection
            }catch(Exception e) {
            	System.out.println("Project Number Not Found  \nPlease refresh your menu ");
            	}
            }
      		
	// user projet attributes to Enter project
    // most of the String varchars are 30 except for address that it is 60
    public static void AddNewProject(String ProjectName,int  ProjectNumber, String ProjectAddress, String BuildingType, int ERFNumber,
            int FeeCharged, int AmountPaid, String DeadLine, String ArchitectName, int ArchitectNumber, String ArchitectEmail, String ArchitectAddress,
            String ContractorName, int ContractorNumber,String ContractorEmail, String ContractorAddress, String CustomerName, int CustomerNumber,
           String CustomerEmail,String  CustomerAddress) {
        try (
                // Connect to the poise db database
                Connection conn = DriverManager.getConnection (
                "jdbc:mysql://localhost:3307/PoisePMS?useSSL=false", "root", "@ndan!" );
                
                //  Creating a direct line to the database for running queries
                Statement statement = conn.createStatement();
                
                ) {
            
            // Inserting Details to the Table project
            String Project = "insert into project " 	
				+ "values (" + ProjectNumber + "," + '"' + ProjectName + '"' + ","
				+ "" + '"' + ProjectAddress + '"' +  ", " + '"' + BuildingType + '"' + ", " + ERFNumber + ", "+ FeeCharged + ", " + AmountPaid +", " + '"' + DeadLine + '"' + ", "
						+ "" + '"' + ArchitectName + '"' + ", "+ ArchitectNumber +", " + '"' + ArchitectEmail + '"' + ","
								+ " " + '"' + ArchitectAddress + '"' + ", " + '"' + ContractorName + '"' + ", " + ContractorNumber + ", " + '"' + ContractorEmail + '"' + ", "
										+ " " + '"' + ContractorAddress + '"' + ", " + '"' + CustomerName + '"' + ", " + CustomerNumber + ","
												+ " " + '"' + CustomerEmail + '"' + ", " + '"' + CustomerAddress + '"' + ")";
            
            // executing the query
            statement.executeUpdate (Project);
            System.out.println("\nProject Saved\n");
           
            } catch (SQLException e) {
            	System.out.println("Project Code Exist");
                }
        }
    
    // Update project
    public static void UpDateProject(int ProjectNumber) {
    try (
            // Connect to the database poise db
            Connection connection = DriverManager.getConnection ("jdbc:mysql://localhost:3307/PoisePMS?useSSL=false",
            		"root", "@ndan!");
            
    		//  Creating a direct line to the database for running queries
            Statement statement = connection.createStatement();
            ) {
        
       
        @SuppressWarnings("resource")
		Scanner UPDateNumber = new Scanner(System.in);
        try (Scanner newUpdate = new Scanner(System.in)) {
			String NumberUpdate = UPDateNumber.nextLine();
			
			if (NumberUpdate.equalsIgnoreCase("ProjectNumber")){
			    
			    System.out.print("Enter new Project Number: ");
			   
			    int UPDateNumber1 = newUpdate.nextInt();
			    
			    String ProjectNumberUpdate = "Update project = "+ UPDateNumber1 + " where id =" + ProjectNumber;
			   
			    statement.executeUpdate(ProjectNumberUpdate);
			    
			    String Selection = "select * from project where id = '"+ UPDateNumber1 +"'";
			    ResultSet Clear = statement . executeQuery ( Selection );
			    while ( Clear . next ()) {
			        int ProjectNumber1 = Clear.getInt("ProjectNumber");
			        String ProjectName = Clear.getString("ProjectName" );
			        String ProjectAddress1 = Clear.getString("ProjectAddress");
			        String BuildingType1 = Clear.getString("BuildingType1");
			        int ERFNumber1 = Clear.getInt("ERFNumber1");
			        int FeeCharged1 = Clear.getInt("FeeCharged1");
			        int AmountPaid1 = Clear.getInt("AmountPaid1");
			        String DeadLine1 = Clear.getString("DeadLine1");
			        System . out . println ("New Record is : "+ ProjectNumber1 + ": " + ProjectName + " - "
			        + ProjectAddress1 + " - " + ERFNumber1 +  " - "  + BuildingType1 + " - " + FeeCharged1 + " - " + AmountPaid1 + " - " + DeadLine1 +     "\n");
			       
			        }
			    
			    } 
				// ERROR output only if user search is invalid
			else {
			    System.out.println("Search not Found , please search By ProjectNumber\n");
			    }
			}
        
        } 
    		catch ( SQLException e) {
	            System.out.println("Error");
	            }
    }
    // view a project .user will only see project number, project name, project Address, ArchitectName, Contractor name, Customer name
    // user should view lisp of project details by entering any string.. but i prefer to use Project List
    public static void ViewProject(String prj) {
    	
    	 try (
        		 // Connect to the poise database
                Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3307/PoisePMS?useSSL=false", "root", "@ndan!" );
               
        		 //  Creating a direct line to the database for running queries
                Statement statement = connection.createStatement();
                ) {
            
            String find = "select * from project ";
            ResultSet view = statement . executeQuery (find);
           
            while ( view.next()) {
            	int ProjectNumber = view.getInt("ProjectNumber");
                String ProjectName = view. getString ("ProjectName");
                String ProjectAddress = view. getString ("ProjectAddress");
                String ArchitectName = view.getString("ArchitectName");
                String ContractorName = view.getString("ContractorName");
                String CustomerName = view.getString("CustomerName");
                
               // when user tries to view the project only selected rows below will be displayed
                System.out.println("\nProject Number: "+ProjectNumber + "\nProject Name: "+ ProjectName + "\nProject Adress: "+  ProjectAddress + 
                		"\nArchitect Name: " +   ArchitectName + "\nContractor Name: "+  ContractorName + "\nCustomer Name: " + CustomerName + "\n");
                	}
        		} 
    	 //catch exception if no project found
        catch (SQLException e) {
                System.out.println("No Project Found");
               }
    }
    // Delete Project
    public static void DeleteProject(int ProjectNumber) {
    try (
    		 // Connect to the poised database
            Connection conn = DriverManager.getConnection (
            "jdbc:mysql://localhost:3307/PoisePMS?useSSL=false", "root", "@ndan!" );
            
    		 //  Creating a direct line to the database for running queries
            Statement statement = conn.createStatement();
            ) {
        
        // Delete a project by searching projectnmuber   
        String DeleteRecord = "select * from project where ProjectNumber = '"+ ProjectNumber +"'";
        ResultSet confirmDeletion = statement . executeQuery ( DeleteRecord );
        
        while (confirmDeletion.next ()) {
            String ProjectName2 = confirmDeletion.getString ("ProjectName");
            String ProjectAddress2 = confirmDeletion.getString ("ProjectAddress");
            
            // display the deleted Project
            System.out.println ("Project Deleted is : " + ProjectName2 + "   from   " + ProjectAddress2 );
            }
        
        // user to confirm if they want to delete the project or Not
        System.out.println("Are you sure ? yes or no: ");
       
        try (
		Scanner DeleteProjects = new Scanner(System.in)) {
			String Option = DeleteProjects.nextLine();
			if (Option.equalsIgnoreCase("yes")){
			    
			    String DeleteRecords = "delete from project where ProjectNumber = '"+ ProjectNumber +"'";
			    statement.executeUpdate(DeleteRecords);
			    System.out.println ("Project Deleted");        
			    }
			else if(Option.equalsIgnoreCase("no")){
				System.out.println("Please Go back to the main menu\n");
				System.exit(0);
				
					}
				}
    		} 
    catch (SQLException e) {
         // printStackTrace is use to be able to trace back all the sql errors that occurs
    	e.printStackTrace();            }
    	}
   
    public static void FinishProject(int FeeCharged, String CustomerName, int CustomerNumber,
			String CustomerEmail, String CustomerAddress) {
    	
    	 try (
                 // Connect to the poise db database
                 Connection conn = DriverManager.getConnection (
                 "jdbc:mysql://localhost:3307/PoisePMS?useSSL=false", "root", "@ndan!" );
                 
                 //  Creating a direct line to the database for running queries
                 Statement statement = conn.createStatement();
                 
                 ) {
             
             // Inserting Details to the Table project
             String Customer = "insert into customer " 	
 				 + "values (" + CustomerNumber + " ,  " + '"' + CustomerName + '"' + "," + '"' + CustomerAddress + '"' + " , "
												+ " " + '"' + CustomerEmail + '"' + "," + FeeCharged + " )";
             // executing the query
             statement.executeUpdate(Customer);
             System.out.println("\nFinalised\n\n\n\t COMPANY INVOICE\n");
             //user out put after finalising the project
             System.out.println("Customer Telephone Number: "+CustomerNumber + 
            		 "\nCustomer Name:  " + CustomerName + "\nCustomer Eamil :  " + CustomerEmail +  "\nFee Charged:" + FeeCharged  +
            		 "\n\n" + "Thank you for your service\n");
             
            
             }  catch (Exception es) {
              	System.out.println("Error");
             }
	}
    
    // Searching a Project by projectNumbe
    public static void SearchProject(int ProjectNumber) {
    try (
    		 // Connect to the poise database
            Connection connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3307/PoisePMS?useSSL=false", "root", "@ndan!" );
           
    		 //  Creating a direct line to the database for running queries
            Statement statement = connection.createStatement();
            ) {
        
        String choose = "select * from project where ProjectNumber = '"+ ProjectNumber +"'";
        ResultSet Clear = statement . executeQuery (choose);
       
        while ( Clear.next()) {
            String ProjectName = Clear. getString ("ProjectName");
            String ProjectAddress = Clear. getString ("ProjectAddress");
            System.out.println ("Project Details \n");
            
            // only selected will display on the console but the reset are visible wen you use Mysql table viewer.
            System.out.println("Project Number: "+ProjectNumber + "\nProject Name:  " + ProjectName + "\nProject Addres :  " + ProjectAddress +"\n");
            	}
    		} 
    catch (Exception er) {
   	 // printStackTrace is use to be able to trace back all the sql errors that occurs
   	System.out.println("Project Number Not Found");
          }
    	}
    }
//Done by:
//Fatimah Alsayednasser 
//Shahad Mohammed Alowfi
//Naimah Nayef Aldossary
//Noura Saad Alqahtani

package com.mycompany.dstructure;
import java.util.Scanner;
public class DStructure {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    StackLinkedList S1 = new StackLinkedList();
    DStructure S2 = new DStructure();
    int choice;
    System.out.println("*** Welcome to Task Minder System ***");
    do{
        System.out.println("1. Create User");
        System.out.println("2. Manage Tasks");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        choice = input.nextInt();
        input.nextLine();
        switch (choice) {
                case 1: 
                           System.out.print("Enter your Username: ");
                           String username = input.nextLine();
                           System.out.print("Enter your Email: ");
                           String email = input.nextLine();
                           System.out.print("Enter your Password: ");
                           int pass = input.nextInt();
                           System.out.println("User Added Successfully!!!");
                           S1.push( username,email, pass);
                           break;
                   case 2: System.out.println("Welcome to Manage Tasks");
                   S2.login();
                   break;
                   case 3: System.out.println("Thanks, See You Again!!!");
                   System.exit(0);
                   break;           
   
    }} while((choice)!=3);
    }
                
    public void login(){
        Scanner input = new Scanner(System.in);
        StackLinkedList S1 = new StackLinkedList();
        int choice;
        
    do{
                  
                    System.out.println("1. Create Task");
                    System.out.println("2. Show Task");
                    System.out.println("3. Show All Tasks");
                    System.out.println("4. Delete Task");
                    System.out.println("5. Delete All Tasks");
                    System.out.println("6. size");
                    System.out.println("7. Exit Menu");
                    System.out.print("Enter your choice: ");
                    choice = input.nextInt();
                        input.nextLine();
                        switch (choice) {
                            case 1:
                            System.out.print("Enter Task Name: ");
                            String taskName = input.nextLine();
                            System.out.print("Enter Due Date: ");
                            String dueDate = input.next();
                            System.out.print("Enter Duration(in Hours): ");
                            int duration = input.nextInt();
                            S1.push(taskName, dueDate, duration);
                            break;

                            case 2:
                            System.out.println("Show Task");
                            S1.Top();
                            break;

                            case 3:
                            System.out.println("Show All Tasks");
                            S1.Display();
                            break;

                            case 4:
                            System.out.println("Delete Task");
                            S1.Pop();
                            break;

                            case 5:
                            System.out.println("Delete All Tasks");
                            S1.makeEmpty();
                            break;
                            
                             case 6:
                                System.out.println("Number of tasks in the stack:"+S1.size());
                                
                                break;       
                            case 7:
                                System.exit(0);
                                break;
                             
                                
                            default:
                                System.out.println("Invalid choice. Please try again.");
                        }} while((choice)!=6);
        }}
        


    


package com.tcs.examples;

import java.util.*;

public class program1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Choose 1 to Add Names, 2 to Print Names, 3 to edit a name, 4 to exit: ");
            int input = scan.nextInt();
            scan.nextLine(); 

            switch (input) {
                case 1:
                    System.out.print("Name: ");
                    String input1 = scan.nextLine();
                    names.add(input1);
                    break;
                case 2:
                    for (String name : names)
                    {
                        System.out.println(name);
                    }
                    break;
                case 3:
                	System.out.println("write to search a name:");
                	String input2 = scan.nextLine();
                	boolean found = false;
                	for(int k=0;k<names.size(); k++) 
                	{
                		if(input2.equals(names.get(k)))
                		{
                			found = true;
                			System.out.println("Name found, enter a new name");
                			String newname = scan.nextLine();
                			names.set(k, newname);
                			break;
                		}
                	}
                	if(!found)
                		System.out.println("Name not found");
                	if(names.isEmpty())
                	{
                		System.out.println("List is empty");
                	}
                	break;
                case 4:
                    System.out.println("You have exited the program.");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
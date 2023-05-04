package edu.examples.java_classes.input.command.impl;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import edu.examples.java_classes.logic.*;
import edu.examples.java_classes.entity.Note;
import edu.examples.java_classes.output.NotebookOutput;
import edu.examples.java_classes.input.command.Command;

public class ConsoleFindItemByDate implements Command{
	
	private NotebookOutput output = new NotebookOutput();
	private NotebookLogic logic = new NotebookLogic();

	
	@Override
	public void execute() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the year:");
		System.out.print("> ");
        int year = sc.nextInt();
        
        System.out.println("Please enter the month: ");
		System.out.println("> ");
		int month = sc.nextInt();
		
		System.out.println("Please enter the date: ");
		System.out.println("> ");
		int day = sc.nextInt();
		
			
		Date date = new Date();
		date.setHours(0);		
		date.setMinutes(0);
		date.setSeconds(0);
		       
		List<Note> result = logic.find(date);
		
     	output.print("Date",result);

	}

}
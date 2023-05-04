package edu.examples.java_classes.input.command.impl;

import edu.examples.java_classes.input.command.Command;
import java.util.List;
import java.util.Scanner;
import edu.examples.java_classes.entity.Note;
import edu.examples.java_classes.logic.NotebookLogic;

public class ConsoleFindItemByContent implements Command {

	private NotebookLogic logic = new NotebookLogic();

	@Override
	public void execute() {

		System.out.println("Enter the text:");
		System.out.print("> ");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();

		List<Note> result = logic.find(text);
		
		System.out.println(result);
	}
}

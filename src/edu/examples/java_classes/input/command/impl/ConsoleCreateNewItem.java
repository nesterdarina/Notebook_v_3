package edu.examples.java_classes.input.command.impl;

import edu.examples.java_classes.input.command.Command;
import java.util.Scanner;
import edu.examples.java_classes.logic.NotebookLogic;

public class ConsoleCreateNewItem implements Command {

	private NotebookLogic logic = new NotebookLogic();

	@Override
	public void execute() {

		System.out.println("Create a title:");
		System.out.print("> ");

		Scanner sc = new Scanner(System.in);
		String title1 = sc.nextLine();

		System.out.println("Create a content:");
		System.out.print("> ");

		String content1 = sc.nextLine();

		logic.add(title1, content1);

	}
}

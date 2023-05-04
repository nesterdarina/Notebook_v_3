package edu.examples.java_classes.input;


import java.util.HashMap;
import java.util.Map;

import edu.examples.java_classes.input.command.MenuCommand;

public final class MenuBuilder {
	private static final MenuBuilder instance = new MenuBuilder();
	
	private MenuSelectionSystem menuSystem = new MenuSelectionSystem();
	private Display display = new Display();
	private InputTerminal terminal = new InputTerminal();

	private MenuBuilder() {
		ConcreteMenu cm1 = new ConcreteMenu("ГЛАВНОЕ МЕНЮ");
		cm1.setItems(MenuCommand.CREATE_NEW_ITEM.getConsoleCode(), "Create a note.");
		cm1.setItems(MenuCommand.SHOW_FIND_MENU.getConsoleCode(),"Find a note.");
		cm1.setItems(MenuCommand.EXIT_CODE.getConsoleCode(),"Close.");

		menuSystem.add(Menu.MAIN_MENU, cm1);

		ConcreteMenu cm2 = new ConcreteMenu("ПОИСК");
		cm2.setItems(MenuCommand.FIND_BY_DATE.getConsoleCode(),"By date.");
		cm2.setItems(MenuCommand.FIND_BY_CONTENT.getConsoleCode(),"By content.");
		cm2.setItems(MenuCommand.EXIT_CODE.getConsoleCode(), "Exit.");

		menuSystem.add(Menu.SEARCH_MENU, cm2);
	}

	public static MenuBuilder getInstance() {
		return instance;
	}

	public MenuSelectionSystem getMenuSystem() {
		return menuSystem;
	}

	public Display getDisplay() {
		return display;
	}

	public InputTerminal getTerminal() {
		return terminal;
	}
	
}

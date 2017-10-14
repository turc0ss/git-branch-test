package com.tmattila.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI(path=MainUI.NAME)
@Theme("valo")
@Title("Testing Git")
public class MainUI extends UI {

	final static String NAME = "/ui";
	
	@Override
	protected void init(VaadinRequest request) {
		
		VerticalLayout rootLayout = new VerticalLayout();
		Label message = new Label("This is a test message");
		rootLayout.addComponent(message);
		
		setContent(rootLayout);
		
	}
}

package com.tmattila.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI(path=MainUI.NAME)
@Theme("valo")
@Title("Testing Git")
public class MainUI extends UI {

	final static String NAME = "/ui";
	
	@Override
	protected void init(VaadinRequest request) {
		
		// A container that is 100% wide by default
		VerticalLayout layout = new VerticalLayout();

		// label will only take the space it needs
		Label label = new Label();
		
		
		// Get the label's text to initialize a field
		TextField editor = new TextField("Name: ", 
		                                 label.getValue());

		// Change the label's text
		editor.addValueChangeListener(event -> label.setValue(event.getValue()));
		
		layout.addComponent(editor);
		layout.addComponent(label);
		
		setContent(layout);
		
		// THIS IS WORKING SOLUTION WITH VAADIN 2.0.0
		
	}
}

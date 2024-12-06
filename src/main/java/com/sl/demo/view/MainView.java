package com.sl.demo.view;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("/ui")
public class MainView extends VerticalLayout {
	
	public MainView() {
		add(new Text("Hello world from Vaddin and Spring Boot..."));
	}

}

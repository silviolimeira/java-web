package com.sl.demo.view;

import com.sl.demo.model.Person;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.ColumnTextAlign;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import java.util.ArrayList;
import java.util.List;

public class VerticalLayoutView extends Div {

	Span title;
	VerticalLayout formVertical;
	HorizontalLayout formHorizontal;
	VerticalLayout mainLayout;

	public VerticalLayoutView() {


		title = new Span("Layout Example");
		Button button1 = new Button("Vertical Layout");
		Button button2 = new Button("Button 2");
		Button button3 = new Button("Button 3");
		Button button4 = new Button("Button 4");
		Button button5 = new Button("Button 5");

		mainLayout = new VerticalLayout();
		mainLayout.add(title, button1);

		formVertical = new VerticalLayout();
		button1.setText("Vertical Layout");
		formVertical.setWidth("600px");
		formVertical.setHeight("600px");
		formVertical.setAlignItems(FlexComponent.Alignment.STRETCH);
		formVertical.add(button2, button3, button4, button5);


		mainLayout.add(formVertical);
		add(mainLayout);

		button1.addClickListener(event -> {
			if (button1.getText().equals("Horizontal Layout")) {
				mainLayout.remove(formHorizontal);
				formVertical = new VerticalLayout();
				//formVertical.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
				formVertical.setAlignItems(FlexComponent.Alignment.STRETCH);

				formVertical.setWidth("600px");
				formVertical.setHeight("600px");
				button1.setText("Vertical Layout");
				formVertical.add(button2, button3, button4, button5);
				mainLayout.add(formVertical);
				add(mainLayout);
			} else {
				mainLayout.remove(formVertical);
				formHorizontal = new HorizontalLayout();
				formHorizontal.setJustifyContentMode(FlexComponent.JustifyContentMode.EVENLY);
				formHorizontal.setWidth("600px");
				formHorizontal.setHeight("600px");
				button1.setText("Horizontal Layout");
				formHorizontal.add(button2, button3, button4, button5);
				mainLayout.add(formHorizontal);
				add(mainLayout);
			}
		});


	}
	

}

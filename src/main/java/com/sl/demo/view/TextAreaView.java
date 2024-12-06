package com.sl.demo.view;

import com.sl.demo.model.Person;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.data.binder.ValidationException;
import com.vaadin.flow.data.value.ValueChangeMode;

public class TextAreaView extends Div {
	
	Span title;
	TextArea textArea;
	
	public TextAreaView() {

		title = new Span("Text Area Example");

		textArea = new TextArea();
		textArea.setLabel("Description");
		textArea.setValue("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		textArea.setHeight("300px");
		textArea.setWidth("600px");
		textArea.setMaxLength(10);
		textArea.setValueChangeMode(ValueChangeMode.LAZY);
		textArea.addValueChangeListener(event -> {
			System.out.println("Something has been changed");
		});

		VerticalLayout form = new VerticalLayout();
		form.add(title, textArea);
		add(form);

	}
	

}

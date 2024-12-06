package com.sl.demo.view;

import com.sl.demo.model.Person;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.data.binder.ValidationException;

public class PersonView extends Div {
	
	Span title;
	TextField name;
	Person person;
	Button saveButton;
	
	public PersonView() {

		title = new Span("People Insert");
		name = new TextField("Name:");

		Person person = new Person();
		Binder<Person> binder = new Binder<>();
		binder.bind(name, Person::getName, Person::setName);
		
		saveButton = new Button("Save", event -> {
			try {
				binder.writeBean(person);
				System.out.println("TODO save " + person);
			} catch (ValidationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		VerticalLayout form = new VerticalLayout();
		form.add(title, name, saveButton);
		add(form);
		
		
		
	}
	

}

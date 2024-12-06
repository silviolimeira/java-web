package com.sl.demo.view;

import com.sl.demo.model.Person;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.checkbox.CheckboxGroup;
import com.vaadin.flow.component.checkbox.CheckboxGroupVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import java.util.ArrayList;
import java.util.List;

public class ComboBoxView extends Div {

	Span title;
	Checkbox checkbox;
	ComboBox<Person> comboBox;

	public ComboBoxView() {


		title = new Span("Text Area Example");

		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Silvio", 50));
		persons.add(new Person("Maria Carolina", 26));
		persons.add(new Person("Silvio", 24));
		persons.add(new Person("Juliana", 47));


		comboBox = new ComboBox<>("Employee");
		comboBox.setItems(persons);
		comboBox.setPlaceholder("Select an employee");
		comboBox.setItemLabelGenerator(person -> person.getName() + " - " + person.getAge());
		comboBox.addValueChangeListener(event -> {
			System.out.println(comboBox.getValue());
		});

		VerticalLayout form = new VerticalLayout();
		form.add(title, comboBox);
		add(form);

	}
	

}

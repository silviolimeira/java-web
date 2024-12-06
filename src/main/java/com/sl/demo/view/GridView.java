package com.sl.demo.view;

import com.sl.demo.model.Person;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.grid.ColumnTextAlign;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Style;

import java.util.ArrayList;
import java.util.List;

public class GridView extends Div {

	Span title;
	Grid<Person> grid;

	public GridView() {


		title = new Span("Grid Example");

		// This data is usually located in a database table
		List<Person> employees = new ArrayList<>();
		employees.add(new Person("Silvio", "silvio@gmail.com", 55));
		employees.add(new Person("Silvio Cesar", "silvio.cesar@gmail.com", 24));
		employees.add(new Person("Maria Carolina", "silvio.cesar@gmail.com", 26));
		employees.add(new Person("Julinana", "juliana@gmail.com", 47));

		grid = new Grid<Person>(Person.class, false);
		grid.addColumn(Person::getName).setHeader("Name").setTextAlign(ColumnTextAlign.START);
		grid.addColumn(Person::getEmail).setHeader("Email").setTextAlign(ColumnTextAlign.CENTER);
		grid.addColumn(Person::getAge).setHeader("Age").setTextAlign(ColumnTextAlign.END);
		grid.setWidth("600px");
		grid.setItems(employees);
		grid.setAllRowsVisible(true);


		VerticalLayout form = new VerticalLayout();
		form.add(title, grid);
		add(form);

	}
	

}

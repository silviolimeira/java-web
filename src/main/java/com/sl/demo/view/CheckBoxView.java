package com.sl.demo.view;

import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.checkbox.CheckboxGroup;
import com.vaadin.flow.component.checkbox.CheckboxGroupVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.data.value.ValueChangeMode;

public class CheckBoxView extends Div {

	Span title;
	Checkbox checkbox;
	CheckboxGroup<String> checkboxGroup;

	public CheckBoxView() {

		title = new Span("Text Area Example");

		checkbox = new Checkbox();
		checkbox.setLabel("I agree the terms");
		checkbox.setEnabled(true);
		checkbox.addValueChangeListener(event -> {
			System.out.println(checkbox.getValue());
		});

		checkboxGroup = new CheckboxGroup<>();
		checkboxGroup.setLabel("Days");
		checkboxGroup.setItems("Monday", "Tuesday", "Wednesday");
		checkboxGroup.addThemeVariants(CheckboxGroupVariant.LUMO_VERTICAL);
		checkboxGroup.addValueChangeListener(event -> {
			System.out.println(checkboxGroup.getValue());
		});

		VerticalLayout form = new VerticalLayout();
		form.add(title, checkbox, checkboxGroup);
		add(form);

	}
	

}

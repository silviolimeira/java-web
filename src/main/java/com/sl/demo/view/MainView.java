package com.sl.demo.view;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("/ui")
public class MainView extends VerticalLayout {
	
	TextField name;
	Button button;
	Button sayHello;
	Span span;
	int contador;

	public MainView() {
		add(new Text("Hello world from Vaddin and Spring Boot..."));

		span = new Span("This is a span in Vaadin...");
		span.getElement().getStyle().set("font-size", "23px")
			.set("font-weight", "bold");
		add(span);
		
		button = new Button("Click me!", event -> {
			verifyName();
		});
		
		add(button);
	}
	
	private void verifyName() {
		
		String text = button.getText();
		if (!text.equals("Say Hello!")) {
			name = new TextField("Digite seu nome:");
			add(name);
			sayHello = new Button("Say Hello!", event -> {
				span.setText("Hello " + name.getValue());
				if (contador > 0) {
					span.setText(span.getText() + ", have a very nice day! And " + ((contador >= 2) ? " more " + contador + " peoples." : "more " + contador + " people."));
				} else {
					span.setText(span.getText() + "!");
				}
				contador++;
				remove(name, sayHello);
			});
			add(sayHello);
		}
		
	}

}

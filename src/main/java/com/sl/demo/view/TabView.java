package com.sl.demo.view;

import com.sl.demo.model.Person;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.ColumnTextAlign;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.TabVariant;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.tabs.TabsVariant;

import java.util.ArrayList;
import java.util.List;

public class TabView extends Div {

	Span title;
	Tab tab1;
	Tab tab2;
	Tab tab3;



	public TabView() {

		tab1 = new Tab(VaadinIcon.BELL.create(), new Span("Orders"));
		tab2 = new Tab(VaadinIcon.COG.create(), new Span("Payments"));
		tab3 = new Tab(VaadinIcon.USER.create(), new Span("Services"));

		title = new Span("Tabs Example");

		tab1.addThemeVariants(TabVariant.LUMO_ICON_ON_TOP);
		tab2.addThemeVariants(TabVariant.LUMO_ICON_ON_TOP);
		tab3.addThemeVariants(TabVariant.LUMO_ICON_ON_TOP);

		Tabs mainTab = new Tabs(tab1, tab2, tab3);
		mainTab.setSelectedTab(tab2);
		mainTab.setOrientation(Tabs.Orientation.HORIZONTAL);
		mainTab.addThemeVariants(TabsVariant.LUMO_CENTERED);
		mainTab.addThemeVariants(TabsVariant.LUMO_EQUAL_WIDTH_TABS);
		mainTab.setWidth("100%");

		VerticalLayout form = new VerticalLayout();
		form.setWidth("600px");
		form.add(title, mainTab);
		add(form);

	}
	

}

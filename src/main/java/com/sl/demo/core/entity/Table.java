package com.sl.demo.core.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Table {

	private int number;
	private String description;
	
	private static List<Table> tables;
	
	public Table() {
		tables = new ArrayList<>();
	}
	
	public Table(int number, String description) {
		this.number = number;
		this.description = description;
	}
	
	public List<Table> getTables() {
		return this.tables;
	}
	
	public void addTable(Table table) {
		this.tables.add(table);
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(number);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Table other = (Table) obj;
		return number == other.number;
	}
	@Override
	public String toString() {
		return "Table [number=" + number + ", description=" + description + "]";
	}
	
}

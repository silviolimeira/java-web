package com.sl.demo.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sl.demo.core.entity.Table;
import com.sl.demo.dto.TableDTO;

@Component
public class TableModel {

	Table table;
	
	public TableModel() {
		table = new Table();
	}
	
	public void addTable(TableDTO dto) {
		
		table = new Table(dto.number(), dto.description());
		table.addTable(table);
		
	}
 	
	public List<TableDTO> listTables() {
		List<Table> list = table.getTables();
		List<TableDTO> dtos = new ArrayList<>();
		for (Table table : list) {
			dtos.add(new TableDTO(table.getNumber(), table.getDescription()));
		}
		return dtos;
	}
}

package com.sl.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sl.demo.dto.TableDTO;
import com.sl.demo.model.TableModel;

@RestController
@RequestMapping("/tables")
public class TableController {

	@Autowired
	TableModel tableModel;
	
	@PostMapping
    public ResponseEntity add(@RequestBody TableDTO dto){
	
		tableModel.addTable(dto);
		System.out.println(dto);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping
	public List<TableDTO> listAll() {
		List<TableDTO> list = tableModel.listTables();
		System.out.println(list);
		return list;
	}
	
}

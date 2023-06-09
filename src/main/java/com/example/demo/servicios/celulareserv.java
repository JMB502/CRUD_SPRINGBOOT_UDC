package com.example.demo.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.icelulares;
import com.example.demo.interfacesSer.icelularesser;
import com.example.demo.modelo.celular;
@Service
public class celulareserv implements icelularesser {

	@Autowired
	private icelulares data;
	@Override
	public List<celular> listar() {
		
		return (List<celular>)data.findAll();
	}

	@Override
	public Optional<celular> listarId(int id) {
		return data.findById(id);
		
	}

	@Override
	public int save(celular c) {
	int  res = 0;
	celular celular=data.save(c);
	if(!celular.equals(null)) {
		res =1;
	}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}

}

package com.example.demo.interfacesSer;

import java.util.List;


import java.util.Optional;

import com.example.demo.modelo.celular;

public interface icelularesser {
public List<celular>listar();
public Optional<celular>listarId(int id);
public int save(celular c);
public void delete (int id);

}

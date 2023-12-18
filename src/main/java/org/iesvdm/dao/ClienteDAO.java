package org.iesvdm.dao;

import java.util.List;
import java.util.Optional;

import org.iesvdm.modelo.Cliente;

public interface ClienteDAO {
	// careta el codigo interactua solo con la interface   (careta)
	// no le importa lo que haya detras del codigo  NO HEREDO -> implementacion
	// implementas firmas de metodos  no codigo.
	// el resto del codigo
	public void create(Cliente cliente);
	
	public List<Cliente> getAll();

	public Optional<Cliente>  find(int id);
	
	public void update(Cliente cliente);
	
	public void delete(long id);
	
}

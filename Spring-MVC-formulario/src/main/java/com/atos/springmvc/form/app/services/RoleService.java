package com.atos.springmvc.form.app.services;

import java.util.List;

import com.atos.springmvc.form.app.models.domain.Role;

public interface RoleService {
	
	public List<Role> listar();
	public Role obtenerPorId(Integer id);

}

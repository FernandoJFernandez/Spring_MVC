package com.bolsadeideas.springboot.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@Value("${texto.indexcontroller.index.titulo}")
	private String textoIndex;
	@Value("${texto.indexcontroller.perfil.titulo}")
	private String textoPerfil;
	@Value("${texto.indexcontroller.listar.titulo}")
	private String textoListar;
	
	@GetMapping({"/index", "/", "", "/home"})
	public String index(Model model) {
		model.addAttribute("titulo",textoIndex);
		return "index";	
	}
	
	@GetMapping("/perfil")
	public String perfil(Model model){
		Usuario usuario = new Usuario();
		usuario.setNombre("Fernando");
		usuario.setApellido("Fernández");
		usuario.setEmail("fernando@correo.com");
		model.addAttribute("usuario",usuario);
		model.addAttribute("titulo",textoPerfil.concat(usuario.getNombre()));
		return "perfil";
	}
	
/*
	@GetMapping("/listar")
	public String listar(Model model){
		List<Usuario>usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Nombre1","Apellido1","correo1@correo.com"));
		usuarios.add(new Usuario("Nombre2","Apellido2","correo2@correo.com"));
		usuarios.add(new Usuario("Nombre3","Apellido3","correo3@correo.com"));
		model.addAttribute("titulo", "Listado de Usuarios");
		model.addAttribute("usuarios",usuarios);
		return "listar";
	}
*/
	
	@GetMapping("/listar")
	public String listar(Model model){
		model.addAttribute("titulo", textoListar);
		return "listar";	
	}
	@ModelAttribute("usuarios")
	public List<Usuario>poblarUsuarios(){
		List<Usuario>usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Nombre1","Apellido1","correo1@correo.com"));
		usuarios.add(new Usuario("Nombre2","Apellido2","correo2@correo.com"));
		usuarios.add(new Usuario("Nombre3","Apellido3","correo3@correo.com"));
		return usuarios;
	}
}

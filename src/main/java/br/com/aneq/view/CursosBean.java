package br.com.aneq.view;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.aneq.dao.CursoDAO;
import br.com.aneq.model.Curso;

@ManagedBean
@SessionScoped
public class CursosBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private CursoDAO cursoDAO;

	private List<Curso> cursos;
	private Curso curso = new Curso();
	
	public CursosBean() {
		this.cursoDAO = new CursoDAO();
		this.cursos = cursoDAO.lista();		
	}

	public List<Curso> getCursos() {
		return this.cursos;
	}
	
	public Curso getCurso() {
		return this.curso;
	}
	
	public void adicionar() {
		this.cursos.add(this.curso);
		this.curso = new Curso();
	}
	
}

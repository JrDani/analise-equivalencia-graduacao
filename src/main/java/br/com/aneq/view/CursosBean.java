package br.com.aneq.view;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.aneq.model.Curso;
import br.com.aneq.util.HibernateUtil;

@ManagedBean
@SessionScoped
public class CursosBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private List<Curso> cursos;
	private Curso curso = new Curso();
	
	@PostConstruct
	public void init() {
		Session session = HibernateUtil.getSession();
		this.cursos = session.createCriteria(Curso.class).list();
		
		session.close();
	}	

	public List<Curso> getCursos() {
		return this.cursos;
	}
	
	public Curso getCurso() {
		return this.curso;
	}
	
	public void adicionar() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		session.merge(this.curso);
		
		tx.commit();
		session.close();
		
		this.curso = new Curso();
	}
	
}

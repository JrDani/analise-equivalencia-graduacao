package br.com.aneq.dao;

import java.util.List;

import org.hibernate.Session;

import br.com.aneq.model.Curso;
import br.com.aneq.util.HibernateUtil;

public class CursoDAO {
		
	public List<Curso> lista() {
		List<Curso> cursos = null;
		try {
			Session session = HibernateUtil.getSession();
			cursos = session.createCriteria(Curso.class).list();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cursos;
	}
}

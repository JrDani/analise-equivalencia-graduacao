package br.com.aneq.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.aneq.model.Curso;

@Stateless
public class CursoDAO {
	
	@PersistenceContext(unitName = "aneqPU")
    private EntityManager em;
	
	public List<Curso> lista() {
		List<Curso> cursos = null;
		try {
			Query query = em.createQuery("select c from Curso c");
			cursos = query.getResultList();		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cursos;
	}
}

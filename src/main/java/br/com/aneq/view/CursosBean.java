package br.com.aneq.view;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CursosBean {
	private static final long serialVersionUID = 1L;

	private List<Object> cursos;
	
	public CursosBean() {
		this.cursos = new ArrayList<Object>();
		for(int i=0; i<10; i++) {
			this.cursos.add(new Object());
		}
	}

	public List<Object> getCursos() {
		return cursos;
	}

	public void setCursos(List<Object> cursos) {
		this.cursos = cursos;
	}
	
}

package spring.escopo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class ClasseDAO {
	
	@Autowired
	ClasseJdbc objetoJdbc;

	public ClasseJdbc getObjetoJdbc() {
		return objetoJdbc;
	}

	public void setObjetoJdbc(ClasseJdbc objetoJdbc) {
		this.objetoJdbc = objetoJdbc;
	}
	
	
	
}

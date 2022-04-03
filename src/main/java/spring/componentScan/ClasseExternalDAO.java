package spring.componentScan;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class ClasseExternalDAO {
	
	@Autowired
	ClasseExternalJdbc objetoJdbc;

	public ClasseExternalJdbc getObjetoJdbc() {
		return objetoJdbc;
	}

	public void setObjetoJdbc(ClasseExternalJdbc objetoJdbc) {
		this.objetoJdbc = objetoJdbc;
	}
	
	@PostConstruct
	public void postConstructor() {
		System.out.println("Objeto criado");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("Objeto finalizado");
	}
	
}

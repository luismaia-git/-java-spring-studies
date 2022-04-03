package spring.escopo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AplicacaoEscopo {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(AplicacaoEscopo.class, args);
		
		ClasseDAO objetoDao1 = applicationContext.getBean(ClasseDAO.class);
		ClasseDAO objetoDao2 = applicationContext.getBean(ClasseDAO.class);

		
		System.out.println("Objeto Dao1 - " + objetoDao1);
		System.out.println("Objeto Dao2 - " + objetoDao2);

		System.out.println("Objeto JDBC - " + objetoDao1.getObjetoJdbc());
		System.out.println("Objeto JDBC - " + objetoDao2.getObjetoJdbc());

	}

}
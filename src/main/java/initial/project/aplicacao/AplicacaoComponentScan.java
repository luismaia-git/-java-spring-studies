package initial.project.aplicacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import spring.componentScan.ClasseExternalDAO;

@SpringBootApplication
@ComponentScan("spring.componentScan;")
public class AplicacaoComponentScan {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(AplicacaoComponentScan.class, args);
		ClasseExternalDAO objetoDAOExternal = applicationContext.getBean(ClasseExternalDAO.class);

		System.out.println("External DAO - " + objetoDAOExternal);
		System.out.println("External JDBC DAO - " + objetoDAOExternal.getObjetoJdbc());
	}

}
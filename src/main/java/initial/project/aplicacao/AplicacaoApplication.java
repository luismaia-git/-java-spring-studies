package initial.project.aplicacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import initial.project.aplicacao.basico.ClasseA;

@SpringBootApplication
public class AplicacaoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(AplicacaoApplication.class, args);
		ClasseA objetoA = applicationContext.getBean(ClasseA.class);
		objetoA.execute();
	}

}
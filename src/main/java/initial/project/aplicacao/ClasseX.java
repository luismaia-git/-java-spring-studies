package initial.project.aplicacao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ClasseX implements InterfaceB {

	@Override
	public void metodoInterfaceB() {
		System.out.println("Metodo na classe X");
		
	}

}

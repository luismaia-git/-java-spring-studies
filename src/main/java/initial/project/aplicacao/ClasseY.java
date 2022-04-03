package initial.project.aplicacao;

import org.springframework.stereotype.Component;

@Component

public class ClasseY implements InterfaceB {

	@Override
	public void metodoInterfaceB() {
		System.out.println("Metodo na classe Y");
		
	}

}

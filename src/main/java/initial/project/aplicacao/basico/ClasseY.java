package initial.project.aplicacao.basico;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("classeY")
public class ClasseY implements InterfaceB {

	@Override
	public void metodoInterfaceB() {
		System.out.println("Metodo na classe Y");
		
	}

}

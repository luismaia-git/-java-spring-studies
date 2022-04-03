package initial.project.aplicacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClasseA {
	
	@Autowired
	@Qualifier("classeY")
	private InterfaceB interfaceB;
	
	
	public void execute() {
		interfaceB.metodoInterfaceB(); 
	}
}

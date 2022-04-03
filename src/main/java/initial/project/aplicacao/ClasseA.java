package initial.project.aplicacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClasseA {
	
	@Autowired
	private InterfaceB interfaceB;
	
	
	public ClasseA(InterfaceB interfaceB) {
		this.interfaceB = interfaceB;
	}
	
	public void execute() {
		interfaceB.metodoInterfaceB(); 
	}
}

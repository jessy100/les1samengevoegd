package CompositePattern;

import java.util.ArrayList;

public class ControllerCompositeComposite implements ControllerCompositeComponent{
	public ArrayList<ControllerCompositeComponent> lijst = new ArrayList<ControllerCompositeComponent>();
	
	@Override
	public void templateMethod() {
		for(ControllerCompositeComponent comp : lijst) {
			comp.templateMethod();
		}
		
	}

}

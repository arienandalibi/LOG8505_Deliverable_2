package my.project.design;

import org.eclipse.emf.ecore.EObject;

/**
 * The services class used by VSM.
 */
public class Services {
    private int operationalCapabilityCounter = 1;
    private int operationalActorCounter = 1;
    private int operationalEntityCounter = 1;
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    
    public String getOperationalCapabilityName(EObject self) {
    	return "OperationalCapability " + operationalCapabilityCounter++;
    }
    
    public String getOperationalActorName(EObject self) {
    	return "Actor " + operationalActorCounter++;
    }
    
    public String getOperationalEntityName(EObject self) {
    	return "Entity " + operationalEntityCounter++;
    }
    
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
}

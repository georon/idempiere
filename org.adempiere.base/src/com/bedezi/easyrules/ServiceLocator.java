package com.bedezi.easyrules;

import org.adempiere.base.equinox.EquinoxExtensionHolder;
import org.adempiere.base.equinox.EquinoxExtensionLocator;

public class ServiceLocator {

	private static IRulesFactory rulesFactoryService;
	
	public static IRulesFactory rulesFactoryInstance() throws RuleEngineException{
		if(rulesFactoryService == null) {
			rulesFactoryService = getRulesFactory();
		}
		
		if(rulesFactoryService != null  ) {
			System.out.println(">>> Returning RulesFactory for: " + rulesFactoryService.getClass().getName());
			return rulesFactoryService;
		}
		
		String errMsg = ">>> Error: can't find RulesFactory";
		System.out.println( errMsg );
		throw new RuleEngineException(errMsg);
	}
	public static IRulesFactory getRulesFactory() { //change to array or list of all Rules factoriews from any plugins that implement rules
		EquinoxExtensionHolder<IRulesFactory> rulesFactoryHolder = null;
		int maxIterations = 5;
		int waitMillis = 1000;
		int iterations = 0;
		boolean found = false;
		while (true) {
			rulesFactoryHolder = EquinoxExtensionLocator.instance().locate(IRulesFactory.class, IRulesFactory.IRulesFactory_CLASS_NAME );
					//Service.locator().list(IRulesFactory.class).getServiceReferences();
			if (rulesFactoryHolder != null && rulesFactoryHolder.getExtension() instanceof IRulesFactory) {

						found = true;
						System.out.println(">>> Found the RulesFactory: " + rulesFactoryHolder.getExtension().getClass().getName());
						return rulesFactoryHolder.getExtension();
				
			}
			iterations++;
			if (found || iterations >= maxIterations) {
				break;
			}
			try {
				Thread.sleep(waitMillis);
			} catch (InterruptedException e) {
			}
		}
		return null;
	}

}

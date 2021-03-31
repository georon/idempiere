package com.bedezi.idempiere.easyrules;

import java.util.List;
import java.util.Properties;

import org.adempiere.base.DefaultProcessFactory;
import org.adempiere.base.IProcessFactory;
//import org.adempiere.base.IServiceReferenceHolder;
//import org.adempiere.base.Service;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.RuleBuilder;
import org.osgi.framework.BundleActivator;
//import org.jeasy.rules.core.RuleBuilder;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.adempiere.base.equinox.EquinoxExtensionLocator;
import org.adempiere.base.equinox.EquinoxExtensionHolder;

public class DefaultRulesFactory implements IRulesFactory{
	
	private RulesEngine DEFAULT_RULESENGINE ;
	
	static private final IRulesFactory DEFAULT_RULES_FACTORY = new DefaultRulesFactory();
	static private IRulesFactory rulesFactoryService;
	

	public DefaultRulesFactory() {
		DEFAULT_RULESENGINE = new DefaultRulesEngine();
	}
	

	public static IRulesFactory rulesFactoryInstance(String clazz) {
		if(rulesFactoryService == null) {
			rulesFactoryService = getRulesFactory();
		}
		
		if(rulesFactoryService != null  ) {
			System.out.println(">>> Returning RulesFactory for: " + clazz);
			return rulesFactoryService;
		}
		
		System.out.println(">>> Returning the DEFAULT_RULES_FACTORY RulesFactory" );
		return DEFAULT_RULES_FACTORY;
	}

	@Override
	public RulesEngine rulesEngine(String clazz) {
		// TODO change according to clazz
		return DEFAULT_RULESENGINE;
	}

	@Override
	public RuleBuilder rulesBuilder(String clazz) {
		// TODO Auto-generated method stub
		return new RuleBuilder();
	}
	
	public Rule buildRule(String ruleType, Properties ctx, Facts facts) throws RuleClassNorFoundException  {
		
				throw new RuleClassNorFoundException("Not supposed to be here: Unkown ruleType");
	}
	
	/**
	 * This method load the process factories waiting until the DefaultProcessFactory on base is loaded (IDEMPIERE-3829)
	 * @return List of factories implementing IProcessFactory
	 */
	private static IRulesFactory getRulesFactory() {
		EquinoxExtensionHolder<IRulesFactory> rulesFactoryHolder = null;
		int maxIterations = 5;
		int waitMillis = 1000;
		int iterations = 0;
		boolean found = false;
		while (true) {
			rulesFactoryHolder = EquinoxExtensionLocator.instance().locate(IRulesFactory.class, "com.bedezi.idempiere.easyrules.IRulesFactory" );
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

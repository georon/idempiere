package com.bedezi.easyrules;

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

public abstract class AbstractRulesFactory implements IRulesFactory{
	
	private RulesEngine DEFAULT_RULESENGINE ;
	

	public AbstractRulesFactory() {
		DEFAULT_RULESENGINE = new DefaultRulesEngine();
	}
	

	@Override
	public RulesEngine rulesEngine() {
		// TODO change according to clazz
		return DEFAULT_RULESENGINE;
	}



	@Override
	public RuleBuilder rulesBuilder(String clazz) {
		// TODO Auto-generated method stub
		return new RuleBuilder();
	}
	
	public abstract Rule buildRule(String ruleType, Properties ctx, Facts facts) throws RuleClassNotFoundException; 
	

}

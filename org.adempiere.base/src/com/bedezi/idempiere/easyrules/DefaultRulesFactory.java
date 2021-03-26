package com.bedezi.idempiere.easyrules;

import java.util.Properties;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.RuleBuilder;
import org.osgi.framework.BundleActivator;
import org.jeasy.rules.core.RuleBuilder;
import org.jeasy.rules.core.DefaultRulesEngine;

public class DefaultRulesFactory implements IRulesFactory{
	
	private RulesEngine DEFAULT_RULESENGINE ;
	
	static private final IRulesFactory DEFAULT_RULES_FACTORY = new DefaultRulesFactory();
	

	private DefaultRulesFactory() {
		DEFAULT_RULESENGINE = new DefaultRulesEngine();
	}
	

	public static IRulesFactory rulesFactoryInstance(String clazz) {
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
		
		switch ( ruleType ){
		case IRulesFactory.FIELD_DISPLAY_RULE : 
			//return new com.spm.rules.SpmDisplayRule(ctx, facts); <- remove SPM package dependency
			try {
				return (Rule) Class.forName("com.spm.rules.SpmDisplayRule" ).getDeclaredConstructor(Properties.class,Facts.class).newInstance(ctx, facts);
			}catch(Exception ex) {
				ex.printStackTrace();
				throw new RuleClassNorFoundException("DefaultRulesFactory: " + ex.getMessage());
			}
			//return new com.spm.rules.SpmDisplayRule(ctx, facts);
		case IRulesFactory.FIELD_ENABLED_RULE :
			//return new com.spm.rules.SpmEnableRule(ctx, facts); <- remove SPM package dependency
			try {
				return (Rule) Class.forName("com.spm.rules.SpmEnableRule").getDeclaredConstructor(Properties.class,Facts.class).newInstance(ctx, facts);
			}catch(Exception ex) {
				ex.printStackTrace();
				throw new RuleClassNorFoundException("DefaultRulesFactory: " + ex.getMessage());
			}
		default:
				throw new RuleClassNorFoundException("DefaultRulesFactory: Unkown ruleType");
		}
			

	}

}

package com.bedezi.idempiere.easyrules;

import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.RuleBuilder;
import org.jeasy.rules.core.DefaultRulesEngine;

public class DefaultRulesFactory implements IRulesFactory{
	
	static public final RulesEngine DEFAULT_RULESENGINE = new DefaultRulesEngine();

	@Override
	public RulesEngine rulesEngine(String clazz) {
		// TODO change according to clazz
		return DEFAULT_RULESENGINE;
	}

	@Override
	public RuleBuilder rulesBuilder(String clazz) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.bedezi.idempiere.easyrules;

import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.RuleBuilder;

public interface IRulesFactory {
	
	public RulesEngine rulesEngine(String clazz);
	public RuleBuilder rulesBuilder(String clazz);

}

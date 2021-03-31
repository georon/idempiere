package com.bedezi.idempiere.easyrules;

import java.util.Properties;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.RuleBuilder;
import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.Facts;

public interface IRulesFactory {
	
	public static final String DEFAULT_RULEsENGINE_NAME = "DEFAULT_RULEsENGINE_NAME";
	public static final String FIELD_DISPLAY_RULE = "FIELD_DISPLAY_RULE";
	public static final String FIELD_ENABLED_RULE = "FIELD_ENABLED_RULE";
	public static final String SPM_RULEsENGINE_NAME = "DEFAULT_RULEsENGINE_NAME";
	
	public RulesEngine rulesEngine(String clazz);
	public RuleBuilder rulesBuilder(String clazz);
	//public IRulesFactory rulesFactoryInstance(String clazz); 
	public Rule buildRule(String clazz, Properties ctx, Facts facts) throws RuleClassNorFoundException;
}

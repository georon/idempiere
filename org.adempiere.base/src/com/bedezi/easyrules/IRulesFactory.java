package com.bedezi.easyrules;

import java.util.Properties;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.RuleBuilder;
import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.Facts;

public interface IRulesFactory {
	
	public static final String IRulesFactory_CLASS_NAME = "com.bedezi.idempiere.easyrules.IRulesFactory";
	public static final String DEFAULT_RULEsENGINE_NAME = "DEFAULT_RULEsENGINE_NAME";
	public static final String SPM_RULEsENGINE_NAME = "SPM_RULEsENGINE_NAME";
	
	public static final String FIELD_DISPLAY_RULE = "FIELD_DISPLAY_RULE";
	public static final String FIELD_ENABLED_RULE = "FIELD_ENABLED_RULE";
	public static final String TAB_DisplayRule = "TAB_DisplayRule";
	public static final String RECORD_CascadeRule = "RECORD_CascadeRule";
	public static final String RECORD_DataRecordValidationRule = "RECORD_DataRecordValidationRule";
	public static final String RECORD_RollupRule = "RECORD_RollupRule";
	
	
	public RulesEngine rulesEngine();
	public RuleBuilder rulesBuilder(String clazz);
	public Rule buildRule(String clazz, Properties ctx, Facts facts) throws RuleClassNotFoundException;

}

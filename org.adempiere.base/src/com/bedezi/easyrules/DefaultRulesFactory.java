package com.bedezi.easyrules;

import java.util.Properties;

import org.jeasy.rules.api.Action;
import org.jeasy.rules.api.Condition;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;

import com.bedezi.easyrules.*;


public class DefaultRulesFactory extends AbstractRulesFactory{
	
	public DefaultRulesFactory() {
		super();
	}
	

	
	public Rule buildRule(String ruleType, Properties ctx, Facts facts) throws RuleClassNotFoundException  {
		System.out.println(">>> DefaultRuleFactory: building dummy rule");
		return this.rulesBuilder("")
		.name("Dummy Rule")
		.when( Condition.FALSE)
		.then(new Action() {
			
			@Override
			public void execute(Facts arg0) throws Exception {
				System.out.println(">>> Default Rule: No action");			
			}
		})
		.build();

	}

}

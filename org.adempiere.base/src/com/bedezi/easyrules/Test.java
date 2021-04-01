package com.bedezi.easyrules;

import org.compiere.util.CLogger;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.compiere.util.CLogger;

public class Test {
	
	/**	Logger			*/
	protected static CLogger	log = CLogger.getCLogger(Test.class);
	
    public static void main(String... args) {
    	
        // create facts
        Facts facts = new Facts();

        // create rules
        Rules rules = new Rules();
        rules.register(new TestRule());

        // create a rules engine and fire rules on known facts
        RulesEngine rulesEngine = new DefaultRulesEngine();
        log.info("Starting RulesEngine");
        rulesEngine.fire(rules, facts);
        log.info("Completed RulesEngine");
    }
}
package com.bedezi.idempiere.easyrules;

import org.compiere.util.CLogger;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.compiere.util.CLogger;

public class Launcher {
	
	/**	Logger			*/
	protected static CLogger	log = CLogger.getCLogger(Launcher.class);
	
    public static void main(String... args) {
    	
        // create facts
        Facts facts = new Facts();

        // create rules
        Rules rules = new Rules();
        rules.register(new HelloWorldRule());

        // create a rules engine and fire rules on known facts
        RulesEngine rulesEngine = new DefaultRulesEngine();
        log.info("Starting RulesEngine");
        rulesEngine.fire(rules, facts);
        log.info("Completed RulesEngine");
    }
}
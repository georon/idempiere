package com.bedezi.idempiere.easyrules;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Launcher {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Launcher.class);
	
    public static void main(String... args) {
    	
        // create facts
        Facts facts = new Facts();
        facts.add(null);

        // create rules
        Rules rules = new Rules();
        rules.register(new HelloWorldRule());

        // create a rules engine and fire rules on known facts
        RulesEngine rulesEngine = new DefaultRulesEngine();
        LOGGER.info("Starting RulesEngine");
        rulesEngine.fire(rules, facts);
        LOGGER.info("Completed RulesEngine");
    }
}
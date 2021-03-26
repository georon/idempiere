package com.bedezi.idempiere.easyrules;

import java.util.Map;
import java.util.Properties;

import org.compiere.util.CLogger;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Rule;
import org.jeasy.rules.api.Facts;

@Rule(name = "Hello World rule", description = "Always say hello world")
public class HelloWorldRule {
	
	/**	Logger			*/
	protected CLogger	log = CLogger.getCLogger(getClass());
	
	private java.util.Properties ctx;
	private java.util.Map<String,Object> state; //careful what's changed
	private java.util.Map<String,Object> sharedState; //careful what's changed
	private Facts facts;
	
	
	public HelloWorldRule() {
		
	}
	
    public HelloWorldRule(Properties ctx, Map<String,Object> state, Map<String,Object> sharedState, Facts facts) {
		super();
		this.ctx = ctx;
		this.state = state;
		this.sharedState = sharedState;
		this.facts = facts;
	}

	@Condition
    public boolean when() {
    	System.out.println("when Rule: " + this.toString());
    	log.info("In when");
        return true;
    }

    @Action
    public void then() throws Exception {
        System.out.println("hello world action. Update shared state value objects");
    }
}
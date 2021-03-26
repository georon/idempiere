package com.spm.rules;

import java.util.ArrayList;
//import java.util.Map;
import java.util.Properties;
import org.jeasy.rules.api.Fact;
//import org.jeasy.rules.annotation.Action;
//import org.jeasy.rules.annotation.Condition;
//import org.jeasy.rules.annotation.Rule;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;

import com.spm.model.I_spm_lookup_data;

import org.compiere.model.GridTabVO;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.compiere.model.GridFieldVO;

//@Rule(name = "SpmDisplayRule", description = "Set Rule based Field display logic")
public class SpmDisplayRule implements org.jeasy.rules.api.Rule{
	
	/**	Logger			*/
	protected CLogger	log = CLogger.getCLogger(getClass());
	
	private java.util.Properties ctx;
	private GridTabVO tabVO; //careful what's changed
	private Facts facts;
	
	
    public SpmDisplayRule(Properties ctx, Facts facts) {
		super();
		this.ctx = ctx;
		this.facts = facts;
		//Fact<GridTabVO> fact =  facts.get(GridTabVO.class.getName());
		this.tabVO = facts.get(GridTabVO.class.getName());
	}

//	@Condition
//    public boolean when() {
//    	System.out.println("SpmDisplayRule::when Rule" );
//    	log.info("In when");
//    	// some arbitrary sample logic - move some of this to additional tables
//    	//if( tabVO.IsUsingRules && 
//    	if(	tabVO.AD_Table_ID == I_spm_lookup_data.Table_ID &&
//    			Env.getAD_Role_ID(Env.getCtx()) == 103 ) { // ad_role_id for "GardenWorld User"
//    		System.out.println("SpmDisplayRule::Rule applies" );
//    		return true;
//    	}
//    	
//        return false;
//    }

//    @Action
//    public void then() throws Exception {
//        System.out.println("SpmDisplayRule:action. Update shared state value objects");
//        // some arbitrary sample logic - move some of this to additional tables
//        ArrayList<GridFieldVO> filedList = tabVO.getFields();
//        for( GridFieldVO vof : filedList) {
//        	if( vof.ColumnName.equals( I_spm_lookup_data.COLUMNNAME_lookup_subcategory)){
//        		vof.DisplayLogic = "1 = 0"; //improve this, may be false or Boolean.FALSE    		
//        	}
//        }
//    }

	@Override
	public int compareTo(Rule o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean evaluate(Facts arg0) {
    	System.out.println("SpmDisplayRule.evaluate" );
    	log.info("In when");
    	// some arbitrary sample logic - move some of this to additional tables
    	//if( tabVO.IsUsingRules && 
    	if(	tabVO.AD_Table_ID == I_spm_lookup_data.Table_ID &&
    			Env.getAD_Role_ID(Env.getCtx()) == 103 ) { // ad_role_id for "GardenWorld User"
    		System.out.println("SpmDisplayRule::Rule applies" );
    		return true;
    	}
    	
        return false;
	}

	@Override
	public void execute(Facts arg0) throws Exception {
	       System.out.println("SpmDisplayRule.execute -> Update shared state value objects");
	        // some arbitrary sample logic - move some of this to additional tables
	        ArrayList<GridFieldVO> filedList = tabVO.getFields();
	        for( GridFieldVO vof : filedList) {
	        	if( vof.ColumnName.equals( I_spm_lookup_data.COLUMNNAME_lookup_subcategory)){
	        		vof.DisplayLogic = "1 = 0"; //improve this, may be false or Boolean.FALSE    		
	        	}
	        }
		
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Set Rule based Field display logic";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "SpmDisplayRule";
	}

	@Override
	public int getPriority() {
		// TODO Auto-generated method stub
		return 0;
	}
}
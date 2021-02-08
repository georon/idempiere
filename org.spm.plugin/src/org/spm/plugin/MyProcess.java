package org.spm.plugin;

//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.Properties;
import java.util.logging.Level;

import org.compiere.process.ProcessInfoParameter;
//import org.adempiere.util.IProcessUI;
//import org.compiere.model.MRoleMenu;
//import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
//import org.compiere.util.DB;


/**
 * @author GeoRon
 *
 */
public class MyProcess extends SvrProcess {

		//private int p_role_id = 0;
		
		@Override
		protected void prepare() {
			ProcessInfoParameter params[]= this.getProcessInfo().getParameter();
			System.out.println("------------In MyProcess.prepare");
			if(params != null) {
				for ( ProcessInfoParameter param : params ) {
					//set on local vars
					System.out.println("Param name = " + param.getParameterName() + "value = " + param.getParameter());
				}
				
			}
		}
		
		
		@Override
		protected String doIt() throws Exception 
		{
			log.log(Level.INFO, "Doing the Process/Report: " + getProcessInfo().getTitle() );
			log.log(Level.INFO, "AD_Client_ID: " + getProcessInfo().getAD_Client_ID());
			log.log(Level.INFO, "AD_User_ID: " + getProcessInfo().getAD_User_ID());
			//IProcessUI processUI = (IProcessUI) getCtx().get(PROCESS_UI_CTX_KEY);
			return null;
		}
	}

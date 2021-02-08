package org.spm.plugin;

import org.adempiere.base.IProcessFactory;
import org.compiere.process.ProcessCall;

public class MyProcessFactory implements IProcessFactory{

	@Override
	public ProcessCall newProcessInstance(String className) {
		if( className.equals("org.spm.plugin.MyProcess")){
			System.out.println("MyProcessFactory return new MyProcess");
			return new MyProcess();
		}
		System.out.println("----------- Did not match: MyProcessFactory return new MyProcess");
		return null;
	}

}

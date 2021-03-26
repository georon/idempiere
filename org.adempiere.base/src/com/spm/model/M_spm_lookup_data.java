package com.spm.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.POInfo;

public class M_spm_lookup_data extends X_spm_lookup_data {
	
	/**
	 * 
	 */
	
	@Override
	public boolean load (String trxName)
	{
		boolean loaded = super.load(trxName);
		return loaded;
	}
	
	@Override
	protected boolean load (ResultSet rs)
	{
		boolean loaded = super.load(rs);
		return loaded;
	}
	
	@Override
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = super.initPO(ctx);
      return poi;
    }
	

	
	private static final long serialVersionUID = 20210320L;

	public M_spm_lookup_data(Properties ctx, int spm_lookup_data_ID, String trxName) {
		super(ctx, spm_lookup_data_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public M_spm_lookup_data(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {
		// TODO Auto-generated method stub
		return super.beforeSave(newRecord);
	}

	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		// TODO Auto-generated method stub
		return super.afterSave(newRecord, success);
	}



}

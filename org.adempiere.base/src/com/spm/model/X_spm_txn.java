/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package com.spm.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for spm_txn
 *  @author iDempiere (generated) 
 *  @version Release 8.2 - $Id$ */
public class X_spm_txn extends PO implements I_spm_txn, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210303L;

    /** Standard Constructor */
    public X_spm_txn (Properties ctx, int spm_txn_ID, String trxName)
    {
      super (ctx, spm_txn_ID, trxName);
      /** if (spm_txn_ID == 0)
        {
			setDescription (null);
			setName (null);
			setspm_txn_ID (0);
			setspm_txn_rec_type_ID (0);
			setspm_txn_state_ID (0);
			settxn_level (Env.ZERO);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_spm_txn (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 7 - System - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuilder sb = new StringBuilder ("X_spm_txn[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set activefrom.
		@param activefrom activefrom	  */
	public void setactivefrom (Timestamp activefrom)
	{
		set_Value (COLUMNNAME_activefrom, activefrom);
	}

	/** Get activefrom.
		@return activefrom	  */
	public Timestamp getactivefrom () 
	{
		return (Timestamp)get_Value(COLUMNNAME_activefrom);
	}

	/** Set activeto.
		@param activeto activeto	  */
	public void setactiveto (Timestamp activeto)
	{
		set_Value (COLUMNNAME_activeto, activeto);
	}

	/** Get activeto.
		@return activeto	  */
	public Timestamp getactiveto () 
	{
		return (Timestamp)get_Value(COLUMNNAME_activeto);
	}

	/** Set actual_amount.
		@param actual_amount actual_amount	  */
	public void setactual_amount (BigDecimal actual_amount)
	{
		set_Value (COLUMNNAME_actual_amount, actual_amount);
	}

	/** Get actual_amount.
		@return actual_amount	  */
	public BigDecimal getactual_amount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_actual_amount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set actual_end_date.
		@param actual_end_date actual_end_date	  */
	public void setactual_end_date (Timestamp actual_end_date)
	{
		set_Value (COLUMNNAME_actual_end_date, actual_end_date);
	}

	/** Get actual_end_date.
		@return actual_end_date	  */
	public Timestamp getactual_end_date () 
	{
		return (Timestamp)get_Value(COLUMNNAME_actual_end_date);
	}

	/** Set actual_start_date.
		@param actual_start_date actual_start_date	  */
	public void setactual_start_date (Timestamp actual_start_date)
	{
		set_Value (COLUMNNAME_actual_start_date, actual_start_date);
	}

	/** Get actual_start_date.
		@return actual_start_date	  */
	public Timestamp getactual_start_date () 
	{
		return (Timestamp)get_Value(COLUMNNAME_actual_start_date);
	}

	/** Set budget_amount.
		@param budget_amount budget_amount	  */
	public void setbudget_amount (BigDecimal budget_amount)
	{
		set_Value (COLUMNNAME_budget_amount, budget_amount);
	}

	/** Get budget_amount.
		@return budget_amount	  */
	public BigDecimal getbudget_amount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_budget_amount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set cancelled.
		@param cancelled cancelled	  */
	public void setcancelled (boolean cancelled)
	{
		set_Value (COLUMNNAME_cancelled, Boolean.valueOf(cancelled));
	}

	/** Get cancelled.
		@return cancelled	  */
	public boolean iscancelled () 
	{
		Object oo = get_Value(COLUMNNAME_cancelled);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set completed.
		@param completed completed	  */
	public void setcompleted (boolean completed)
	{
		set_Value (COLUMNNAME_completed, Boolean.valueOf(completed));
	}

	/** Get completed.
		@return completed	  */
	public boolean iscompleted () 
	{
		Object oo = get_Value(COLUMNNAME_completed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set deleted.
		@param deleted deleted	  */
	public void setdeleted (boolean deleted)
	{
		set_Value (COLUMNNAME_deleted, Boolean.valueOf(deleted));
	}

	/** Get deleted.
		@return deleted	  */
	public boolean isdeleted () 
	{
		Object oo = get_Value(COLUMNNAME_deleted);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Comment/Help.
		@param Help 
		Comment or Hint
	  */
	public void setHelp (String Help)
	{
		set_Value (COLUMNNAME_Help, Help);
	}

	/** Get Comment/Help.
		@return Comment or Hint
	  */
	public String getHelp () 
	{
		return (String)get_Value(COLUMNNAME_Help);
	}

	/** Set initial_planned_end_date.
		@param initial_planned_end_date initial_planned_end_date	  */
	public void setinitial_planned_end_date (Timestamp initial_planned_end_date)
	{
		set_Value (COLUMNNAME_initial_planned_end_date, initial_planned_end_date);
	}

	/** Get initial_planned_end_date.
		@return initial_planned_end_date	  */
	public Timestamp getinitial_planned_end_date () 
	{
		return (Timestamp)get_Value(COLUMNNAME_initial_planned_end_date);
	}

	/** Set initial_planned_start_date.
		@param initial_planned_start_date initial_planned_start_date	  */
	public void setinitial_planned_start_date (Timestamp initial_planned_start_date)
	{
		set_Value (COLUMNNAME_initial_planned_start_date, initial_planned_start_date);
	}

	/** Get initial_planned_start_date.
		@return initial_planned_start_date	  */
	public Timestamp getinitial_planned_start_date () 
	{
		return (Timestamp)get_Value(COLUMNNAME_initial_planned_start_date);
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

	public org.compiere.model.I_AD_User getowner() throws RuntimeException
    {
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_Name)
			.getPO(getowner_id(), get_TrxName());	}

	/** Set owner_id.
		@param owner_id owner_id	  */
	public void setowner_id (int owner_id)
	{
		set_Value (COLUMNNAME_owner_id, Integer.valueOf(owner_id));
	}

	/** Get owner_id.
		@return owner_id	  */
	public int getowner_id () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_owner_id);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_spm_txn getparent_txn() throws RuntimeException
    {
		return (I_spm_txn)MTable.get(getCtx(), I_spm_txn.Table_Name)
			.getPO(getparent_txn_id(), get_TrxName());	}

	/** Set parent_txn_id.
		@param parent_txn_id parent_txn_id	  */
	public void setparent_txn_id (int parent_txn_id)
	{
		set_ValueNoCheck (COLUMNNAME_parent_txn_id, Integer.valueOf(parent_txn_id));
	}

	/** Get parent_txn_id.
		@return parent_txn_id	  */
	public int getparent_txn_id () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_parent_txn_id);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set planned_end_date.
		@param planned_end_date planned_end_date	  */
	public void setplanned_end_date (Timestamp planned_end_date)
	{
		set_Value (COLUMNNAME_planned_end_date, planned_end_date);
	}

	/** Get planned_end_date.
		@return planned_end_date	  */
	public Timestamp getplanned_end_date () 
	{
		return (Timestamp)get_Value(COLUMNNAME_planned_end_date);
	}

	/** Set planned_start_date.
		@param planned_start_date planned_start_date	  */
	public void setplanned_start_date (Timestamp planned_start_date)
	{
		set_Value (COLUMNNAME_planned_start_date, planned_start_date);
	}

	/** Get planned_start_date.
		@return planned_start_date	  */
	public Timestamp getplanned_start_date () 
	{
		return (Timestamp)get_Value(COLUMNNAME_planned_start_date);
	}

	/** Set processing_update.
		@param processing_update processing_update	  */
	public void setprocessing_update (boolean processing_update)
	{
		set_Value (COLUMNNAME_processing_update, Boolean.valueOf(processing_update));
	}

	/** Get processing_update.
		@return processing_update	  */
	public boolean isprocessing_update () 
	{
		Object oo = get_Value(COLUMNNAME_processing_update);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set serial.
		@param serial serial	  */
	public void setserial (int serial)
	{
		set_Value (COLUMNNAME_serial, Integer.valueOf(serial));
	}

	/** Get serial.
		@return serial	  */
	public int getserial () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_serial);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_spm_txn_category getspm_txn_category() throws RuntimeException
    {
		return (I_spm_txn_category)MTable.get(getCtx(), I_spm_txn_category.Table_Name)
			.getPO(getspm_txn_category_ID(), get_TrxName());	}

	/** Set spm_txn_category.
		@param spm_txn_category_ID spm_txn_category	  */
	public void setspm_txn_category_ID (int spm_txn_category_ID)
	{
		if (spm_txn_category_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_spm_txn_category_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_spm_txn_category_ID, Integer.valueOf(spm_txn_category_ID));
	}

	/** Get spm_txn_category.
		@return spm_txn_category	  */
	public int getspm_txn_category_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_spm_txn_category_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set spm_txn.
		@param spm_txn_ID spm_txn	  */
	public void setspm_txn_ID (int spm_txn_ID)
	{
		if (spm_txn_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_spm_txn_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_spm_txn_ID, Integer.valueOf(spm_txn_ID));
	}

	/** Get spm_txn.
		@return spm_txn	  */
	public int getspm_txn_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_spm_txn_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_spm_txn_rec_type getspm_txn_rec_type() throws RuntimeException
    {
		return (I_spm_txn_rec_type)MTable.get(getCtx(), I_spm_txn_rec_type.Table_Name)
			.getPO(getspm_txn_rec_type_ID(), get_TrxName());	}

	/** Set spm_txn_rec_type.
		@param spm_txn_rec_type_ID spm_txn_rec_type	  */
	public void setspm_txn_rec_type_ID (int spm_txn_rec_type_ID)
	{
		if (spm_txn_rec_type_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_spm_txn_rec_type_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_spm_txn_rec_type_ID, Integer.valueOf(spm_txn_rec_type_ID));
	}

	/** Get spm_txn_rec_type.
		@return spm_txn_rec_type	  */
	public int getspm_txn_rec_type_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_spm_txn_rec_type_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_spm_txn_state getspm_txn_state() throws RuntimeException
    {
		return (I_spm_txn_state)MTable.get(getCtx(), I_spm_txn_state.Table_Name)
			.getPO(getspm_txn_state_ID(), get_TrxName());	}

	/** Set spm_txn_state.
		@param spm_txn_state_ID spm_txn_state	  */
	public void setspm_txn_state_ID (int spm_txn_state_ID)
	{
		if (spm_txn_state_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_spm_txn_state_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_spm_txn_state_ID, Integer.valueOf(spm_txn_state_ID));
	}

	/** Get spm_txn_state.
		@return spm_txn_state	  */
	public int getspm_txn_state_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_spm_txn_state_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set spm_txn_UU.
		@param spm_txn_UU spm_txn_UU	  */
	public void setspm_txn_UU (String spm_txn_UU)
	{
		set_ValueNoCheck (COLUMNNAME_spm_txn_UU, spm_txn_UU);
	}

	/** Get spm_txn_UU.
		@return spm_txn_UU	  */
	public String getspm_txn_UU () 
	{
		return (String)get_Value(COLUMNNAME_spm_txn_UU);
	}

	/** Set started.
		@param started started	  */
	public void setstarted (boolean started)
	{
		set_Value (COLUMNNAME_started, Boolean.valueOf(started));
	}

	/** Get started.
		@return started	  */
	public boolean isstarted () 
	{
		Object oo = get_Value(COLUMNNAME_started);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set txn_level.
		@param txn_level txn_level	  */
	public void settxn_level (BigDecimal txn_level)
	{
		set_Value (COLUMNNAME_txn_level, txn_level);
	}

	/** Get txn_level.
		@return txn_level	  */
	public BigDecimal gettxn_level () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_txn_level);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Search Key.
		@param Value 
		Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue () 
	{
		return (String)get_Value(COLUMNNAME_Value);
	}
}
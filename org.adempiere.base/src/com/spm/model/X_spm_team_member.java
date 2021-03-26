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

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for spm_team_member
 *  @author iDempiere (generated) 
 *  @version Release 8.2 - $Id$ */
public class X_spm_team_member extends PO implements I_spm_team_member, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210303L;

    /** Standard Constructor */
    public X_spm_team_member (Properties ctx, int spm_team_member_ID, String trxName)
    {
      super (ctx, spm_team_member_ID, trxName);
      /** if (spm_team_member_ID == 0)
        {
			setAD_User_ID (0);
			setspm_team_ID (0);
			setspm_team_member_ID (0);
        } */
    }

    /** Load Constructor */
    public X_spm_team_member (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_spm_team_member[")
        .append(get_ID()).append("]");
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

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException
    {
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_Name)
			.getPO(getAD_User_ID(), get_TrxName());	}

	/** Set User/Contact.
		@param AD_User_ID 
		User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID)
	{
		if (AD_User_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_AD_User_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/** Get User/Contact.
		@return User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_spm_team getspm_team() throws RuntimeException
    {
		return (I_spm_team)MTable.get(getCtx(), I_spm_team.Table_Name)
			.getPO(getspm_team_ID(), get_TrxName());	}

	/** Set spm_team.
		@param spm_team_ID spm_team	  */
	public void setspm_team_ID (int spm_team_ID)
	{
		if (spm_team_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_spm_team_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_spm_team_ID, Integer.valueOf(spm_team_ID));
	}

	/** Get spm_team.
		@return spm_team	  */
	public int getspm_team_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_spm_team_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set spm_team_member.
		@param spm_team_member_ID spm_team_member	  */
	public void setspm_team_member_ID (int spm_team_member_ID)
	{
		if (spm_team_member_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_spm_team_member_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_spm_team_member_ID, Integer.valueOf(spm_team_member_ID));
	}

	/** Get spm_team_member.
		@return spm_team_member	  */
	public int getspm_team_member_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_spm_team_member_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set spm_team_member_UU.
		@param spm_team_member_UU spm_team_member_UU	  */
	public void setspm_team_member_UU (String spm_team_member_UU)
	{
		set_ValueNoCheck (COLUMNNAME_spm_team_member_UU, spm_team_member_UU);
	}

	/** Get spm_team_member_UU.
		@return spm_team_member_UU	  */
	public String getspm_team_member_UU () 
	{
		return (String)get_Value(COLUMNNAME_spm_team_member_UU);
	}
}
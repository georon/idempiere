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

/** Generated Model for spm_team
 *  @author iDempiere (generated) 
 *  @version Release 8.2 - $Id$ */
public class X_spm_team extends PO implements I_spm_team, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210303L;

    /** Standard Constructor */
    public X_spm_team (Properties ctx, int spm_team_ID, String trxName)
    {
      super (ctx, spm_team_ID, trxName);
      /** if (spm_team_ID == 0)
        {
			setName (null);
			setspm_team_ID (0);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_spm_team (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_spm_team[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
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

	/** Set spm_team_UU.
		@param spm_team_UU spm_team_UU	  */
	public void setspm_team_UU (String spm_team_UU)
	{
		set_ValueNoCheck (COLUMNNAME_spm_team_UU, spm_team_UU);
	}

	/** Get spm_team_UU.
		@return spm_team_UU	  */
	public String getspm_team_UU () 
	{
		return (String)get_Value(COLUMNNAME_spm_team_UU);
	}

	/** Set Valid from.
		@param ValidFrom 
		Valid from including this date (first day)
	  */
	public void setValidFrom (Timestamp ValidFrom)
	{
		set_Value (COLUMNNAME_ValidFrom, ValidFrom);
	}

	/** Get Valid from.
		@return Valid from including this date (first day)
	  */
	public Timestamp getValidFrom () 
	{
		return (Timestamp)get_Value(COLUMNNAME_ValidFrom);
	}

	/** Set Valid to.
		@param ValidTo 
		Valid to including this date (last day)
	  */
	public void setValidTo (Timestamp ValidTo)
	{
		set_Value (COLUMNNAME_ValidTo, ValidTo);
	}

	/** Get Valid to.
		@return Valid to including this date (last day)
	  */
	public Timestamp getValidTo () 
	{
		return (Timestamp)get_Value(COLUMNNAME_ValidTo);
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
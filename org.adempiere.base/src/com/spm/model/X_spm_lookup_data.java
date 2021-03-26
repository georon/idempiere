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
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for spm_lookup_data
 *  @author iDempiere (generated) 
 *  @version Release 8.2 - $Id$ */
public class X_spm_lookup_data extends PO implements I_spm_lookup_data, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210303L;

    /** Standard Constructor */
    public X_spm_lookup_data (Properties ctx, int spm_lookup_data_ID, String trxName)
    {
      super (ctx, spm_lookup_data_ID, trxName);
      /** if (spm_lookup_data_ID == 0)
        {
			setlookup_category (null);
			setlookup_key (null);
			setlookup_subcategory (null);
			setlookup_value (null);
			setspm_lookup_data_ID (0);
        } */
    }

    /** Load Constructor */
    public X_spm_lookup_data (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_spm_lookup_data[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set lookup_category.
		@param lookup_category lookup_category	  */
	public void setlookup_category (String lookup_category)
	{
		set_Value (COLUMNNAME_lookup_category, lookup_category);
	}

	/** Get lookup_category.
		@return lookup_category	  */
	public String getlookup_category () 
	{
		return (String)get_Value(COLUMNNAME_lookup_category);
	}

	/** Set lookup_key.
		@param lookup_key lookup_key	  */
	public void setlookup_key (String lookup_key)
	{
		set_Value (COLUMNNAME_lookup_key, lookup_key);
	}

	/** Get lookup_key.
		@return lookup_key	  */
	public String getlookup_key () 
	{
		return (String)get_Value(COLUMNNAME_lookup_key);
	}

	/** Set lookup_subcategory.
		@param lookup_subcategory lookup_subcategory	  */
	public void setlookup_subcategory (String lookup_subcategory)
	{
		set_Value (COLUMNNAME_lookup_subcategory, lookup_subcategory);
	}

	/** Get lookup_subcategory.
		@return lookup_subcategory	  */
	public String getlookup_subcategory () 
	{
		return (String)get_Value(COLUMNNAME_lookup_subcategory);
	}

	/** Set lookup_value.
		@param lookup_value lookup_value	  */
	public void setlookup_value (String lookup_value)
	{
		set_Value (COLUMNNAME_lookup_value, lookup_value);
	}

	/** Get lookup_value.
		@return lookup_value	  */
	public String getlookup_value () 
	{
		return (String)get_Value(COLUMNNAME_lookup_value);
	}

	/** Set spm_lookup_data.
		@param spm_lookup_data_ID spm_lookup_data	  */
	public void setspm_lookup_data_ID (int spm_lookup_data_ID)
	{
		if (spm_lookup_data_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_spm_lookup_data_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_spm_lookup_data_ID, Integer.valueOf(spm_lookup_data_ID));
	}

	/** Get spm_lookup_data.
		@return spm_lookup_data	  */
	public int getspm_lookup_data_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_spm_lookup_data_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}
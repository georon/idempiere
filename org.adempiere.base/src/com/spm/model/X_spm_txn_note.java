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

/** Generated Model for spm_txn_note
 *  @author iDempiere (generated) 
 *  @version Release 8.2 - $Id$ */
public class X_spm_txn_note extends PO implements I_spm_txn_note, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210303L;

    /** Standard Constructor */
    public X_spm_txn_note (Properties ctx, int spm_txn_note_ID, String trxName)
    {
      super (ctx, spm_txn_note_ID, trxName);
      /** if (spm_txn_note_ID == 0)
        {
			setNote (null);
			setspm_txn_ID (0);
			setspm_txn_note_ID (0);
        } */
    }

    /** Load Constructor */
    public X_spm_txn_note (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_spm_txn_note[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Note.
		@param Note 
		Optional additional user defined information
	  */
	public void setNote (String Note)
	{
		set_Value (COLUMNNAME_Note, Note);
	}

	/** Get Note.
		@return Optional additional user defined information
	  */
	public String getNote () 
	{
		return (String)get_Value(COLUMNNAME_Note);
	}

	public I_spm_txn getspm_txn() throws RuntimeException
    {
		return (I_spm_txn)MTable.get(getCtx(), I_spm_txn.Table_Name)
			.getPO(getspm_txn_ID(), get_TrxName());	}

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

	/** Set spm_txn_note.
		@param spm_txn_note_ID spm_txn_note	  */
	public void setspm_txn_note_ID (int spm_txn_note_ID)
	{
		if (spm_txn_note_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_spm_txn_note_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_spm_txn_note_ID, Integer.valueOf(spm_txn_note_ID));
	}

	/** Get spm_txn_note.
		@return spm_txn_note	  */
	public int getspm_txn_note_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_spm_txn_note_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}
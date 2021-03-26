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
package com.spm.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for spm_txn
 *  @author iDempiere (generated) 
 *  @version Release 8.2
 */
@SuppressWarnings("all")
public interface I_spm_txn 
{

    /** TableName=spm_txn */
    public static final String Table_Name = "spm_txn";

    /** AD_Table_ID=1000012 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 7 - System - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /** Column name activefrom */
    public static final String COLUMNNAME_activefrom = "activefrom";

	/** Set activefrom	  */
	public void setactivefrom (Timestamp activefrom);

	/** Get activefrom	  */
	public Timestamp getactivefrom();

    /** Column name activeto */
    public static final String COLUMNNAME_activeto = "activeto";

	/** Set activeto	  */
	public void setactiveto (Timestamp activeto);

	/** Get activeto	  */
	public Timestamp getactiveto();

    /** Column name actual_amount */
    public static final String COLUMNNAME_actual_amount = "actual_amount";

	/** Set actual_amount	  */
	public void setactual_amount (BigDecimal actual_amount);

	/** Get actual_amount	  */
	public BigDecimal getactual_amount();

    /** Column name actual_end_date */
    public static final String COLUMNNAME_actual_end_date = "actual_end_date";

	/** Set actual_end_date	  */
	public void setactual_end_date (Timestamp actual_end_date);

	/** Get actual_end_date	  */
	public Timestamp getactual_end_date();

    /** Column name actual_start_date */
    public static final String COLUMNNAME_actual_start_date = "actual_start_date";

	/** Set actual_start_date	  */
	public void setactual_start_date (Timestamp actual_start_date);

	/** Get actual_start_date	  */
	public Timestamp getactual_start_date();

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name budget_amount */
    public static final String COLUMNNAME_budget_amount = "budget_amount";

	/** Set budget_amount	  */
	public void setbudget_amount (BigDecimal budget_amount);

	/** Get budget_amount	  */
	public BigDecimal getbudget_amount();

    /** Column name cancelled */
    public static final String COLUMNNAME_cancelled = "cancelled";

	/** Set cancelled	  */
	public void setcancelled (boolean cancelled);

	/** Get cancelled	  */
	public boolean iscancelled();

    /** Column name completed */
    public static final String COLUMNNAME_completed = "completed";

	/** Set completed	  */
	public void setcompleted (boolean completed);

	/** Get completed	  */
	public boolean iscompleted();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name deleted */
    public static final String COLUMNNAME_deleted = "deleted";

	/** Set deleted	  */
	public void setdeleted (boolean deleted);

	/** Get deleted	  */
	public boolean isdeleted();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name Help */
    public static final String COLUMNNAME_Help = "Help";

	/** Set Comment/Help.
	  * Comment or Hint
	  */
	public void setHelp (String Help);

	/** Get Comment/Help.
	  * Comment or Hint
	  */
	public String getHelp();

    /** Column name initial_planned_end_date */
    public static final String COLUMNNAME_initial_planned_end_date = "initial_planned_end_date";

	/** Set initial_planned_end_date	  */
	public void setinitial_planned_end_date (Timestamp initial_planned_end_date);

	/** Get initial_planned_end_date	  */
	public Timestamp getinitial_planned_end_date();

    /** Column name initial_planned_start_date */
    public static final String COLUMNNAME_initial_planned_start_date = "initial_planned_start_date";

	/** Set initial_planned_start_date	  */
	public void setinitial_planned_start_date (Timestamp initial_planned_start_date);

	/** Get initial_planned_start_date	  */
	public Timestamp getinitial_planned_start_date();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name owner_id */
    public static final String COLUMNNAME_owner_id = "owner_id";

	/** Set owner_id	  */
	public void setowner_id (int owner_id);

	/** Get owner_id	  */
	public int getowner_id();

	public org.compiere.model.I_AD_User getowner() throws RuntimeException;

    /** Column name parent_txn_id */
    public static final String COLUMNNAME_parent_txn_id = "parent_txn_id";

	/** Set parent_txn_id	  */
	public void setparent_txn_id (int parent_txn_id);

	/** Get parent_txn_id	  */
	public int getparent_txn_id();

	public I_spm_txn getparent_txn() throws RuntimeException;

    /** Column name planned_end_date */
    public static final String COLUMNNAME_planned_end_date = "planned_end_date";

	/** Set planned_end_date	  */
	public void setplanned_end_date (Timestamp planned_end_date);

	/** Get planned_end_date	  */
	public Timestamp getplanned_end_date();

    /** Column name planned_start_date */
    public static final String COLUMNNAME_planned_start_date = "planned_start_date";

	/** Set planned_start_date	  */
	public void setplanned_start_date (Timestamp planned_start_date);

	/** Get planned_start_date	  */
	public Timestamp getplanned_start_date();

    /** Column name processing_update */
    public static final String COLUMNNAME_processing_update = "processing_update";

	/** Set processing_update	  */
	public void setprocessing_update (boolean processing_update);

	/** Get processing_update	  */
	public boolean isprocessing_update();

    /** Column name serial */
    public static final String COLUMNNAME_serial = "serial";

	/** Set serial	  */
	public void setserial (int serial);

	/** Get serial	  */
	public int getserial();

    /** Column name spm_txn_category_ID */
    public static final String COLUMNNAME_spm_txn_category_ID = "spm_txn_category_ID";

	/** Set spm_txn_category	  */
	public void setspm_txn_category_ID (int spm_txn_category_ID);

	/** Get spm_txn_category	  */
	public int getspm_txn_category_ID();

	public I_spm_txn_category getspm_txn_category() throws RuntimeException;

    /** Column name spm_txn_ID */
    public static final String COLUMNNAME_spm_txn_ID = "spm_txn_ID";

	/** Set spm_txn	  */
	public void setspm_txn_ID (int spm_txn_ID);

	/** Get spm_txn	  */
	public int getspm_txn_ID();

    /** Column name spm_txn_rec_type_ID */
    public static final String COLUMNNAME_spm_txn_rec_type_ID = "spm_txn_rec_type_ID";

	/** Set spm_txn_rec_type	  */
	public void setspm_txn_rec_type_ID (int spm_txn_rec_type_ID);

	/** Get spm_txn_rec_type	  */
	public int getspm_txn_rec_type_ID();

	public I_spm_txn_rec_type getspm_txn_rec_type() throws RuntimeException;

    /** Column name spm_txn_state_ID */
    public static final String COLUMNNAME_spm_txn_state_ID = "spm_txn_state_ID";

	/** Set spm_txn_state	  */
	public void setspm_txn_state_ID (int spm_txn_state_ID);

	/** Get spm_txn_state	  */
	public int getspm_txn_state_ID();

	public I_spm_txn_state getspm_txn_state() throws RuntimeException;

    /** Column name spm_txn_UU */
    public static final String COLUMNNAME_spm_txn_UU = "spm_txn_UU";

	/** Set spm_txn_UU	  */
	public void setspm_txn_UU (String spm_txn_UU);

	/** Get spm_txn_UU	  */
	public String getspm_txn_UU();

    /** Column name started */
    public static final String COLUMNNAME_started = "started";

	/** Set started	  */
	public void setstarted (boolean started);

	/** Get started	  */
	public boolean isstarted();

    /** Column name txn_level */
    public static final String COLUMNNAME_txn_level = "txn_level";

	/** Set txn_level	  */
	public void settxn_level (BigDecimal txn_level);

	/** Get txn_level	  */
	public BigDecimal gettxn_level();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name Value */
    public static final String COLUMNNAME_Value = "Value";

	/** Set Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value);

	/** Get Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public String getValue();
}

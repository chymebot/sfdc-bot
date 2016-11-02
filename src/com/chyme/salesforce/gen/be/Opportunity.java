//	Generated using Unvired Modeller - Build R-4.000.0002
package com.chyme.salesforce.gen.be;

import java.sql.Date;
import java.util.ArrayList;

import com.unvired.lib.utility.BusinessEntity;
import com.unvired.lib.utility.Structure;

public class Opportunity extends BusinessEntity {

	private static final long serialVersionUID = 1L;
	public static final String NAME = "Opportunity";
	public Opportunity()
	{
		setName(NAME);
		setHeader(new Opportunity_HEADER());
	}

	public Opportunity_HEADER getOpportunity_HEADER()
	{
		return (Opportunity_HEADER)super.getHeader();
	}

	public static class Opportunity_HEADER extends Structure
	{
		private static final long serialVersionUID = 1L;
		public static final String NAME = "Opportunity_HEADER";

		public static final String FLD_Id = "Id";
		public static final String FLD_AccountId = "AccountId";
		public static final String FLD_AccountName = "AccountName";
		public static final String FLD_Description = "Description";
		public static final String FLD_StageName = "StageName";
		public static final String FLD_Amount = "Amount";
		public static final String FLD_Probability = "Probability";
		public static final String FLD_ExpectedRevenue = "ExpectedRevenue";
		public static final String FLD_CloseDate = "CloseDate";
		public static final String FLD_LeadSource = "LeadSource";
		public static final String FLD_OwnerId = "OwnerId";

		public static final ArrayList<String> FIELDS = new ArrayList<String>();

		static {
			FIELDS.add(FLD_Id);
			FIELDS.add(FLD_AccountId);
			FIELDS.add(FLD_AccountName);
			FIELDS.add(FLD_Description);
			FIELDS.add(FLD_StageName);
			FIELDS.add(FLD_Amount);
			FIELDS.add(FLD_Probability);
			FIELDS.add(FLD_ExpectedRevenue);
			FIELDS.add(FLD_CloseDate);
			FIELDS.add(FLD_LeadSource);
			FIELDS.add(FLD_OwnerId);
		}

		public Opportunity_HEADER()
		{
			setName(NAME);
		}

		public String getId()
		{
			return getField(FLD_Id);
		}

		public void setId(String value)
		{
			if(value != null)
				addField(FLD_Id, value);
		}

		public String getAccountId()
		{
			return getField(FLD_AccountId);
		}

		public void setAccountId(String value)
		{
			if(value != null)
				addField(FLD_AccountId, value);
		}

		public String getAccountName()
		{
			return getField(FLD_AccountName);
		}

		public void setAccountName(String value)
		{
			if(value != null)
				addField(FLD_AccountName, value);
		}

		public String getDescription()
		{
			return getField(FLD_Description);
		}

		public void setDescription(String value)
		{
			if(value != null)
				addField(FLD_Description, value);
		}

		public String getStageName()
		{
			return getField(FLD_StageName);
		}

		public void setStageName(String value)
		{
			if(value != null)
				addField(FLD_StageName, value);
		}

		public String getAmount()
		{
			return getField(FLD_Amount);
		}

		public void setAmount(String value)
		{
			if(value != null)
				addField(FLD_Amount, value);
		}

		public String getProbability()
		{
			return getField(FLD_Probability);
		}

		public void setProbability(String value)
		{
			if(value != null)
				addField(FLD_Probability, value);
		}

		public String getExpectedRevenue()
		{
			return getField(FLD_ExpectedRevenue);
		}

		public void setExpectedRevenue(String value)
		{
			if(value != null)
				addField(FLD_ExpectedRevenue, value);
		}

		public Date getCloseDate()
		{
			Date date = null;
			try
			{
				date = Date.valueOf(getField(FLD_CloseDate));
			}
			catch(Exception ex)
			{}
			return date;
		}

		public void setCloseDate(Date value)
		{
			if(value != null)
				addField(FLD_CloseDate, value.toString());
		}

		public String getLeadSource()
		{
			return getField(FLD_LeadSource);
		}

		public void setLeadSource(String value)
		{
			if(value != null)
				addField(FLD_LeadSource, value);
		}

		public String getOwnerId()
		{
			return getField(FLD_OwnerId);
		}

		public void setOwnerId(String value)
		{
			if(value != null)
				addField(FLD_OwnerId, value);
		}

	}
}
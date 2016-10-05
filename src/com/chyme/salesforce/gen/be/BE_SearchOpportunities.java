//	Generated using Unvired Modeller - Build R-4.000.0002
package com.chyme.salesforce.gen.be;

import java.util.ArrayList;

import com.unvired.lib.utility.BusinessEntity;
import com.unvired.lib.utility.Structure;

public class BE_SearchOpportunities extends BusinessEntity {

	private static final long serialVersionUID = 1L;
	public static final String NAME = "BE_SearchOpportunities";
	public BE_SearchOpportunities()
	{
		setName(NAME);
		setHeader(new SearchOpportunities_HEADER());
	}

	public SearchOpportunities_HEADER getSearchOpportunities_HEADER()
	{
		return (SearchOpportunities_HEADER)super.getHeader();
	}

	public static class SearchOpportunities_HEADER extends Structure
	{
		private static final long serialVersionUID = 1L;
		public static final String NAME = "SearchOpportunities_HEADER";

		public static final String FLD_OPPORTUNITY_NAME = "OPPORTUNITY_NAME";
		public static final String FLD_STAGE = "STAGE";

		public static final ArrayList<String> FIELDS = new ArrayList<String>();

		static {
			FIELDS.add(FLD_OPPORTUNITY_NAME);
			FIELDS.add(FLD_STAGE);
		}

		public SearchOpportunities_HEADER()
		{
			setName(NAME);
		}

		public String getOPPORTUNITY_NAME()
		{
			return getField(FLD_OPPORTUNITY_NAME);
		}

		public void setOPPORTUNITY_NAME(String value)
		{
			if(value != null)
				addField(FLD_OPPORTUNITY_NAME, value);
		}

		public String getSTAGE()
		{
			return getField(FLD_STAGE);
		}

		public void setSTAGE(String value)
		{
			if(value != null)
				addField(FLD_STAGE, value);
		}

	}
}
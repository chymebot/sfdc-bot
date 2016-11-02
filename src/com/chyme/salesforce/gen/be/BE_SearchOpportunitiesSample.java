//	Generated using Unvired Modeller - Build R-4.000.0002
package com.chyme.salesforce.gen.be;

import java.util.ArrayList;

import com.unvired.lib.utility.BusinessEntity;
import com.unvired.lib.utility.Structure;

public class BE_SearchOpportunitiesSample extends BusinessEntity {

	private static final long serialVersionUID = 1L;
	public static final String NAME = "BE_SearchOpportunitiesSample";
	public BE_SearchOpportunitiesSample()
	{
		setName(NAME);
		setHeader(new SearchOpportunitiesSample_HEADER());
	}

	public SearchOpportunitiesSample_HEADER getSearchOpportunitiesSample_HEADER()
	{
		return (SearchOpportunitiesSample_HEADER)super.getHeader();
	}

	public static class SearchOpportunitiesSample_HEADER extends Structure
	{
		private static final long serialVersionUID = 1L;
		public static final String NAME = "SearchOpportunitiesSample_HEADER";

		public static final String FLD_OPPORTUNITY_NAME = "OPPORTUNITY_NAME";
		public static final String FLD_STAGE = "STAGE";

		public static final ArrayList<String> FIELDS = new ArrayList<String>();

		static {
			FIELDS.add(FLD_OPPORTUNITY_NAME);
			FIELDS.add(FLD_STAGE);
		}

		public SearchOpportunitiesSample_HEADER()
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
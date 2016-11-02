//	Generated using Unvired Modeller - Build R-4.000.0002
package com.chyme.salesforce.gen.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import com.chyme.salesforce.gen.be.BE_SearchOpportunitiesSample;
import com.chyme.salesforce.gen.be.Opportunity;
import com.unvired.lib.utility.BusinessEntity;
import com.unvired.lib.utility.Structure;

public class BEUtility
{
	public static List<BE_SearchOpportunitiesSample> getBE_SearchOpportunitiesSample(List<BusinessEntity> beList)
	{
		ArrayList<BE_SearchOpportunitiesSample> typedBEs = new ArrayList<BE_SearchOpportunitiesSample>();

		if(beList != null)
		{
			for (BusinessEntity be : beList)
			{
				if(be.getName().equals(BE_SearchOpportunitiesSample.NAME))
				{
					BE_SearchOpportunitiesSample typedBE = new BE_SearchOpportunitiesSample();
					typedBEs.add(typedBE);
					for (Entry<String, String> field : be.getHeader().getFieldsInOrder().entrySet())
					{
						typedBE.getHeader().addField(field.getKey(), field.getValue());
					}

					//	Process each item individually
					for (Structure item : be.getItems())
					{
					}
				}
			}
		}
		return typedBEs;
	}

	public static List<Opportunity> getOpportunity(List<BusinessEntity> beList)
	{
		ArrayList<Opportunity> typedBEs = new ArrayList<Opportunity>();

		if(beList != null)
		{
			for (BusinessEntity be : beList)
			{
				if(be.getName().equals(Opportunity.NAME))
				{
					Opportunity typedBE = new Opportunity();
					typedBEs.add(typedBE);
					for (Entry<String, String> field : be.getHeader().getFieldsInOrder().entrySet())
					{
						typedBE.getHeader().addField(field.getKey(), field.getValue());
					}

					//	Process each item individually
					for (Structure item : be.getItems())
					{
					}
				}
			}
		}
		return typedBEs;
	}

}
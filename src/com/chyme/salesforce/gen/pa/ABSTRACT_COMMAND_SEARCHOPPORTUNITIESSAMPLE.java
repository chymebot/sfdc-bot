//	Generated using Unvired Modeller - Build R-4.000.0002
package com.chyme.salesforce.gen.pa;

import com.chyme.salesforce.gen.utils.BEUtility;
import com.unvired.ump.agent.IBusinessProcess;

public abstract class ABSTRACT_COMMAND_SEARCHOPPORTUNITIESSAMPLE extends BotService {
	protected com.chyme.salesforce.gen.be.BE_SearchOpportunitiesSample inputBE_SearchOpportunitiesSample;

	public void init(IBusinessProcess process) {
		super.init(process);

		inputBE_SearchOpportunitiesSample = BEUtility.getBE_SearchOpportunitiesSample(process.getBusinessEntityInput())
				.get(0);

	}

	public com.chyme.salesforce.gen.salesforce.sobject.OPPORTUNITY mapPojoToSalesforce(
			com.chyme.salesforce.gen.be.BE_SearchOpportunitiesSample pojo) {
		com.chyme.salesforce.gen.salesforce.sobject.OPPORTUNITY entity = new com.chyme.salesforce.gen.salesforce.sobject.OPPORTUNITY();
		com.chyme.salesforce.gen.be.BE_SearchOpportunitiesSample.SearchOpportunitiesSample_HEADER header = (com.chyme.salesforce.gen.be.BE_SearchOpportunitiesSample.SearchOpportunitiesSample_HEADER) pojo
				.getHeader();

		entity.setNAME(header.getOPPORTUNITY_NAME());
		entity.setSTAGENAME(header.getSTAGE());

		return entity;
	}

	public com.chyme.salesforce.gen.be.Opportunity mapSalesforceToPojo(
			com.chyme.salesforce.gen.salesforce.sobject.OPPORTUNITY entity) {
		com.chyme.salesforce.gen.be.Opportunity pojo = new com.chyme.salesforce.gen.be.Opportunity();
		com.chyme.salesforce.gen.be.Opportunity.Opportunity_HEADER header = (com.chyme.salesforce.gen.be.Opportunity.Opportunity_HEADER) pojo
				.getHeader();

		header.setId(entity.getID());
		header.setAccountId(entity.getACCOUNTID());
		header.setDescription(entity.getDESCRIPTION());
		header.setStageName(entity.getSTAGENAME());
		header.setAmount(entity.getAMOUNT());
		header.setProbability(entity.getPROBABILITY());
		header.setExpectedRevenue(entity.getEXPECTEDREVENUE());
		header.setCloseDate(entity.getCLOSEDATE());
		header.setLeadSource(entity.getLEADSOURCE());
		header.setOwnerId(entity.getOWNERID());
		header.setAccountName(entity.getNAME());

		return pojo;
	}

	public com.chyme.salesforce.gen.be.Opportunity mapSalesforceToBE(
			com.chyme.salesforce.gen.salesforce.sobject.OPPORTUNITY header) {
		com.chyme.salesforce.gen.be.Opportunity be = mapSalesforceToPojo(header);

		return be;
	}

}

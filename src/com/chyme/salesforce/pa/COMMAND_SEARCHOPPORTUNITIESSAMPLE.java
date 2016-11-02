package com.chyme.salesforce.pa;

import com.chyme.salesforce.gen.pa.ABSTRACT_COMMAND_SEARCHOPPORTUNITIESSAMPLE;
import com.chyme.salesforce.gen.salesforce.sobject.OPPORTUNITY;
import com.chyme.salesforce.gen.salesforce.sobject.SOBJECT;
import com.unvired.chyme.api.Message;
import com.unvired.ump.agent.IHTTPResponse;

public class COMMAND_SEARCHOPPORTUNITIESSAMPLE extends ABSTRACT_COMMAND_SEARCHOPPORTUNITIESSAMPLE {

	private SOBJECT[] opportunities = null;
		
	public void execute() {

		try {				
			String opportunityName = inputBE_SearchOpportunitiesSample.getSearchOpportunitiesSample_HEADER().getOPPORTUNITY_NAME();
			String opportunityStage = inputBE_SearchOpportunitiesSample.getSearchOpportunitiesSample_HEADER().getSTAGE();			

			boolean whereClause = false;
			String queryString = "SELECT Id, Name, OwnerId, AccountId, Type, LeadSource, Amount, ExpectedRevenue, CloseDate, StageName, Probability, Description FROM Opportunity";

			if (opportunityName != null && !opportunityName.equals("")) {
				queryString += " WHERE Name LIKE '%" + opportunityName + "%'";
				whereClause = true;
			}

			if (opportunityStage != null && !opportunityStage.isEmpty() && !opportunityStage.equals("Default")) {
				if (whereClause) {
					queryString += " AND StageName = " + "'" + opportunityStage + "'";
				} else {
					queryString += " WHERE StageName = " + "'" + opportunityStage + "'";
					whereClause = true;
				}
			}			
			
			IHTTPResponse httpResponse = sfdcQuery(queryString);
			if(httpResponse.isSuccess() && (httpResponse.getCode() == 200 || httpResponse.getCode() == 201)){
				String query = httpResponse.getMessage();
				if (query != null && !query.isEmpty())
					opportunities = sfdcGetObjectsFromQuery(OPPORTUNITY.class, query);
					for (int i = 0; i < opportunities.length; i++) {
						SOBJECT opportunityRecord = opportunities[i];
						OPPORTUNITY opportunity = (OPPORTUNITY) opportunityRecord;	
						chymeAPI.addBE(mapSalesforceToPojo(opportunity));
					}
					chymeAPI.setMessage(new Message("Opportunity(s) matching your search criteria are available.", null, Message.FLAG_GROUP_BE));
			} else				
				chymeAPI.setMessage(new Message(httpResponse.getMessage()));							
		} catch (Exception e) {
			chymeAPI.setMessage(new Message(e.getMessage()));	
		}
	}	
}
//	Generated using Unvired Modeller - Build R-4.000.0002
package com.chyme.salesforce.gen.salesforce.sobject;

import java.sql.Date;
import java.sql.Timestamp;

public class OPPORTUNITY extends SOBJECT
{
	private static final long serialVersionUID = 1L;

	public static String FIELD_ID = "Id";
	public static String FIELD_ISDELETED = "IsDeleted";
	public static String FIELD_ACCOUNTID = "AccountId";
	public static String FIELD_ISPRIVATE = "IsPrivate";
	public static String FIELD_NAME = "Name";
	public static String FIELD_DESCRIPTION = "Description";
	public static String FIELD_STAGENAME = "StageName";
	public static String FIELD_AMOUNT = "Amount";
	public static String FIELD_PROBABILITY = "Probability";
	public static String FIELD_EXPECTEDREVENUE = "ExpectedRevenue";
	public static String FIELD_TOTALOPPORTUNITYQUANTITY = "TotalOpportunityQuantity";
	public static String FIELD_CLOSEDATE = "CloseDate";
	public static String FIELD_TYPE = "Type";
	public static String FIELD_NEXTSTEP = "NextStep";
	public static String FIELD_LEADSOURCE = "LeadSource";
	public static String FIELD_ISCLOSED = "IsClosed";
	public static String FIELD_ISWON = "IsWon";
	public static String FIELD_FORECASTCATEGORY = "ForecastCategory";
	public static String FIELD_FORECASTCATEGORYNAME = "ForecastCategoryName";
	public static String FIELD_CAMPAIGNID = "CampaignId";
	public static String FIELD_HASOPPORTUNITYLINEITEM = "HasOpportunityLineItem";
	public static String FIELD_PRICEBOOK2ID = "Pricebook2Id";
	public static String FIELD_OWNERID = "OwnerId";
	public static String FIELD_CREATEDDATE = "CreatedDate";
	public static String FIELD_CREATEDBYID = "CreatedById";
	public static String FIELD_LASTMODIFIEDDATE = "LastModifiedDate";
	public static String FIELD_LASTMODIFIEDBYID = "LastModifiedById";
	public static String FIELD_SYSTEMMODSTAMP = "SystemModstamp";
	public static String FIELD_LASTACTIVITYDATE = "LastActivityDate";
	public static String FIELD_FISCALQUARTER = "FiscalQuarter";
	public static String FIELD_FISCALYEAR = "FiscalYear";
	public static String FIELD_FISCAL = "Fiscal";
	public static String FIELD_LASTVIEWEDDATE = "LastViewedDate";
	public static String FIELD_LASTREFERENCEDDATE = "LastReferencedDate";
	public static String FIELD_HASOPENACTIVITY = "HasOpenActivity";
	public static String FIELD_HASOVERDUETASK = "HasOverdueTask";
	public static String FIELD_DELIVERYINSTALLATIONSTATUS__C = "DeliveryInstallationStatus__c";
	public static String FIELD_TRACKINGNUMBER__C = "TrackingNumber__c";
	public static String FIELD_ORDERNUMBER__C = "OrderNumber__c";
	public static String FIELD_CURRENTGENERATORS__C = "CurrentGenerators__c";
	public static String FIELD_MAINCOMPETITORS__C = "MainCompetitors__c";

	public static String[] FIELDS = {FIELD_ID,FIELD_ISDELETED,FIELD_ACCOUNTID,FIELD_ISPRIVATE,FIELD_NAME,FIELD_DESCRIPTION,FIELD_STAGENAME,FIELD_AMOUNT,FIELD_PROBABILITY,FIELD_EXPECTEDREVENUE,FIELD_TOTALOPPORTUNITYQUANTITY,FIELD_CLOSEDATE,FIELD_TYPE,FIELD_NEXTSTEP,FIELD_LEADSOURCE,FIELD_ISCLOSED,FIELD_ISWON,FIELD_FORECASTCATEGORY,FIELD_FORECASTCATEGORYNAME,FIELD_CAMPAIGNID,FIELD_HASOPPORTUNITYLINEITEM,FIELD_PRICEBOOK2ID,FIELD_OWNERID,FIELD_CREATEDDATE,FIELD_CREATEDBYID,FIELD_LASTMODIFIEDDATE,FIELD_LASTMODIFIEDBYID,FIELD_SYSTEMMODSTAMP,FIELD_LASTACTIVITYDATE,FIELD_FISCALQUARTER,FIELD_FISCALYEAR,FIELD_FISCAL,FIELD_LASTVIEWEDDATE,FIELD_LASTREFERENCEDDATE,FIELD_HASOPENACTIVITY,FIELD_HASOVERDUETASK,FIELD_DELIVERYINSTALLATIONSTATUS__C,FIELD_TRACKINGNUMBER__C,FIELD_ORDERNUMBER__C,FIELD_CURRENTGENERATORS__C,FIELD_MAINCOMPETITORS__C};
	public OPPORTUNITY()
	{
	}

	public String getID(){
		return (String)values.get("Id");
	}
	public void setID(String value){
		values.put("Id", value);
	}
	public Boolean getISDELETED(){
		return (Boolean)values.get("IsDeleted");
	}
	public void setISDELETED(Boolean value){
		values.put("IsDeleted", value);
	}
	public String getACCOUNTID(){
		return (String)values.get("AccountId");
	}
	public void setACCOUNTID(String value){
		values.put("AccountId", value);
	}
	public Boolean getISPRIVATE(){
		return (Boolean)values.get("IsPrivate");
	}
	public void setISPRIVATE(Boolean value){
		values.put("IsPrivate", value);
	}
	public String getNAME(){
		return (String)values.get("Name");
	}
	public void setNAME(String value){
		values.put("Name", value);
	}
	public String getDESCRIPTION(){
		return (String)values.get("Description");
	}
	public void setDESCRIPTION(String value){
		values.put("Description", value);
	}
	public String getSTAGENAME(){
		return (String)values.get("StageName");
	}
	public void setSTAGENAME(String value){
		values.put("StageName", value);
	}
	public String getAMOUNT(){
		return (String)values.get("Amount");
	}
	public void setAMOUNT(String value){
		values.put("Amount", value);
	}
	public String getPROBABILITY(){
		return (String)values.get("Probability");
	}
	public void setPROBABILITY(String value){
		values.put("Probability", value);
	}
	public String getEXPECTEDREVENUE(){
		return (String)values.get("ExpectedRevenue");
	}
	public void setEXPECTEDREVENUE(String value){
		values.put("ExpectedRevenue", value);
	}
	public Double getTOTALOPPORTUNITYQUANTITY(){
		return (Double)values.get("TotalOpportunityQuantity");
	}
	public void setTOTALOPPORTUNITYQUANTITY(Double value){
		values.put("TotalOpportunityQuantity", value);
	}
	public Date getCLOSEDATE(){
		return (Date)values.get("CloseDate");
	}
	public void setCLOSEDATE(Date value){
		values.put("CloseDate", value);
	}
	public String getTYPE(){
		return (String)values.get("Type");
	}
	public void setTYPE(String value){
		values.put("Type", value);
	}
	public String getNEXTSTEP(){
		return (String)values.get("NextStep");
	}
	public void setNEXTSTEP(String value){
		values.put("NextStep", value);
	}
	public String getLEADSOURCE(){
		return (String)values.get("LeadSource");
	}
	public void setLEADSOURCE(String value){
		values.put("LeadSource", value);
	}
	public Boolean getISCLOSED(){
		return (Boolean)values.get("IsClosed");
	}
	public void setISCLOSED(Boolean value){
		values.put("IsClosed", value);
	}
	public Boolean getISWON(){
		return (Boolean)values.get("IsWon");
	}
	public void setISWON(Boolean value){
		values.put("IsWon", value);
	}
	public String getFORECASTCATEGORY(){
		return (String)values.get("ForecastCategory");
	}
	public void setFORECASTCATEGORY(String value){
		values.put("ForecastCategory", value);
	}
	public String getFORECASTCATEGORYNAME(){
		return (String)values.get("ForecastCategoryName");
	}
	public void setFORECASTCATEGORYNAME(String value){
		values.put("ForecastCategoryName", value);
	}
	public String getCAMPAIGNID(){
		return (String)values.get("CampaignId");
	}
	public void setCAMPAIGNID(String value){
		values.put("CampaignId", value);
	}
	public Boolean getHASOPPORTUNITYLINEITEM(){
		return (Boolean)values.get("HasOpportunityLineItem");
	}
	public void setHASOPPORTUNITYLINEITEM(Boolean value){
		values.put("HasOpportunityLineItem", value);
	}
	public String getPRICEBOOK2ID(){
		return (String)values.get("Pricebook2Id");
	}
	public void setPRICEBOOK2ID(String value){
		values.put("Pricebook2Id", value);
	}
	public String getOWNERID(){
		return (String)values.get("OwnerId");
	}
	public void setOWNERID(String value){
		values.put("OwnerId", value);
	}
	public Timestamp getCREATEDDATE(){
		return (Timestamp)values.get("CreatedDate");
	}
	public void setCREATEDDATE(Timestamp value){
		values.put("CreatedDate", value);
	}
	public String getCREATEDBYID(){
		return (String)values.get("CreatedById");
	}
	public void setCREATEDBYID(String value){
		values.put("CreatedById", value);
	}
	public Timestamp getLASTMODIFIEDDATE(){
		return (Timestamp)values.get("LastModifiedDate");
	}
	public void setLASTMODIFIEDDATE(Timestamp value){
		values.put("LastModifiedDate", value);
	}
	public String getLASTMODIFIEDBYID(){
		return (String)values.get("LastModifiedById");
	}
	public void setLASTMODIFIEDBYID(String value){
		values.put("LastModifiedById", value);
	}
	public Timestamp getSYSTEMMODSTAMP(){
		return (Timestamp)values.get("SystemModstamp");
	}
	public void setSYSTEMMODSTAMP(Timestamp value){
		values.put("SystemModstamp", value);
	}
	public Date getLASTACTIVITYDATE(){
		return (Date)values.get("LastActivityDate");
	}
	public void setLASTACTIVITYDATE(Date value){
		values.put("LastActivityDate", value);
	}
	public Integer getFISCALQUARTER(){
		return (Integer)values.get("FiscalQuarter");
	}
	public void setFISCALQUARTER(Integer value){
		values.put("FiscalQuarter", value);
	}
	public Integer getFISCALYEAR(){
		return (Integer)values.get("FiscalYear");
	}
	public void setFISCALYEAR(Integer value){
		values.put("FiscalYear", value);
	}
	public String getFISCAL(){
		return (String)values.get("Fiscal");
	}
	public void setFISCAL(String value){
		values.put("Fiscal", value);
	}
	public Timestamp getLASTVIEWEDDATE(){
		return (Timestamp)values.get("LastViewedDate");
	}
	public void setLASTVIEWEDDATE(Timestamp value){
		values.put("LastViewedDate", value);
	}
	public Timestamp getLASTREFERENCEDDATE(){
		return (Timestamp)values.get("LastReferencedDate");
	}
	public void setLASTREFERENCEDDATE(Timestamp value){
		values.put("LastReferencedDate", value);
	}
	public Boolean getHASOPENACTIVITY(){
		return (Boolean)values.get("HasOpenActivity");
	}
	public void setHASOPENACTIVITY(Boolean value){
		values.put("HasOpenActivity", value);
	}
	public Boolean getHASOVERDUETASK(){
		return (Boolean)values.get("HasOverdueTask");
	}
	public void setHASOVERDUETASK(Boolean value){
		values.put("HasOverdueTask", value);
	}
	public String getDELIVERYINSTALLATIONSTATUS__C(){
		return (String)values.get("DeliveryInstallationStatus__c");
	}
	public void setDELIVERYINSTALLATIONSTATUS__C(String value){
		values.put("DeliveryInstallationStatus__c", value);
	}
	public String getTRACKINGNUMBER__C(){
		return (String)values.get("TrackingNumber__c");
	}
	public void setTRACKINGNUMBER__C(String value){
		values.put("TrackingNumber__c", value);
	}
	public String getORDERNUMBER__C(){
		return (String)values.get("OrderNumber__c");
	}
	public void setORDERNUMBER__C(String value){
		values.put("OrderNumber__c", value);
	}
	public String getCURRENTGENERATORS__C(){
		return (String)values.get("CurrentGenerators__c");
	}
	public void setCURRENTGENERATORS__C(String value){
		values.put("CurrentGenerators__c", value);
	}
	public String getMAINCOMPETITORS__C(){
		return (String)values.get("MainCompetitors__c");
	}
	public void setMAINCOMPETITORS__C(String value){
		values.put("MainCompetitors__c", value);
	}
	public String getKey(){
		return "Id";
	}
	public String getObjectName(){
		return "Opportunity";
	}
}
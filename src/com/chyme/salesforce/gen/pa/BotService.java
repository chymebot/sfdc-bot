//	Generated using Unvired Modeller - Build R-4.000.0002
package com.chyme.salesforce.gen.pa;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.unvired.chyme.api.ChymeAPI;
import com.unvired.lib.utility.InfoMessage;
import com.unvired.lib.utility.InfoMessage.InfoMessageCategory;
import com.unvired.ump.agent.IBusinessProcess;
import com.unvired.ump.agent.IBusinessProcess.RequestType;
import com.unvired.ump.agent.IHTTPRequest;
import com.unvired.ump.agent.IHTTPResponse;
import com.unvired.ump.agent.IProcessAgent;
import com.unvired.ump.agent.InvalidOutput;

public abstract class BotService implements IProcessAgent {
	protected Vector<InfoMessage> infoMessages;
	protected IBusinessProcess process;
	protected ChymeAPI chymeAPI;

	public void init(IBusinessProcess process) {
		this.process = process;
		infoMessages = new Vector<InfoMessage>();
		chymeAPI = new ChymeAPI(process);
	}

	public void finish() {
		try {
			process.setOutput(chymeAPI.getBusinessEntityOutput(), null);
		} catch (InvalidOutput e) {
			process.getInfoMessageList().add(new InfoMessage(e.getMessage(), InfoMessageCategory.FAILURE));
		}
	}

	protected void addParameter(Hashtable<String, String> parameters, String name, String value, String defaultValue) {
		if (!isEmpty(name)) {
			if (!isEmpty(value))
				parameters.put(name, value);
			else if (!isEmpty(defaultValue))
				parameters.put(name, defaultValue);
		}
	}

	protected boolean isEmpty(String value) {
		return (value == null || value.trim().isEmpty());
	}

	static final String AUTHORIZAION = "Bearer 00D90000000bBFp!AQQAQGw34ZtET82WrU1Jmx5.55oRyc.m2McCJQQkhD13WFfO1LmngVM7R26A3bF.lucBLvzy9qKjUuHdFQ_iCZUv8CndP3a8";

	static final String VERSION = "v36.0";
	static final String CREATE = "/services/data/VERSION/sobjects/SOBJECT/";
	static final String UPDATE = "/services/data/VERSION/sobjects/SOBJECT/KEY";
	static final String DELETE = "/services/data/VERSION/sobjects/SOBJECT/KEY";
	static final String GET = "/services/data/VERSION/sobjects/SOBJECT/KEY";
	static final String ATTACHMENT = "/services/data/VERSION/sobjects/Attachment/KEY/body";
	static final String DOC_INSERT = "/services/data/VERSION/sobjects/Document/";
	static final String DOC_UPDATE = "/services/data/VERSION/sobjects/Document/KEY";
	static final String QUERY = "/services/data/VERSION/query/?q=SOSQL_QUERY";
	static final String QUERY_REMAINING = "/services/data/VERSION/query/QUERY_ID";

	public IHTTPResponse sfdcCreate(com.chyme.salesforce.gen.salesforce.sobject.SOBJECT sObject) {
		IHTTPRequest httpRequest = (IHTTPRequest) process.createRequest(RequestType.HTTP);

		//	Verb
		httpRequest.setVerb(IHTTPRequest.HTTPVerb.POST);

		//	Path
		String path = CREATE.replaceAll("VERSION", VERSION);
		path = path.replaceAll("SOBJECT", sObject.getObjectName());
		httpRequest.setPath(path);

		//	Header
		Hashtable<String, String> headers = new Hashtable<String, String>();
		headers.put("Content-Type", "application/json");
		headers.put("Authorization", AUTHORIZAION);
		httpRequest.setHeaders(headers);

		//	Body
		httpRequest.setMessageBody(sObject.getJson());

		//	Execute
		IHTTPResponse httpResponse = (IHTTPResponse) process.getService().submitRequest(httpRequest,
				Constant.SALESFORCE_SAMPLE_SALESFORCE_SAMPLE_SALESFORCE_EXECUTE);

		return httpResponse;
	}

	public IHTTPResponse sfdcUpdate(com.chyme.salesforce.gen.salesforce.sobject.SOBJECT sObject) {
		IHTTPRequest httpRequest = (IHTTPRequest) process.createRequest(RequestType.HTTP);

		//	Verb
		httpRequest.setVerb(IHTTPRequest.HTTPVerb.PATCH);

		//	Path
		String path = UPDATE.replaceAll("VERSION", VERSION);
		path = path.replaceAll("SOBJECT", sObject.getObjectName());
		path = path.replaceAll("KEY", String.valueOf(sObject.getValue(sObject.getKey())));
		httpRequest.setPath(path);

		//	Header
		Hashtable<String, String> headers = new Hashtable<String, String>();
		headers.put("Content-Type", "application/json");
		headers.put("Authorization", AUTHORIZAION);
		httpRequest.setHeaders(headers);

		//	Body
		sObject.setValue(sObject.getKey(), null);
		httpRequest.setMessageBody(sObject.getJson());

		//	Execute
		IHTTPResponse httpResponse = (IHTTPResponse) process.getService().submitRequest(httpRequest,
				Constant.SALESFORCE_SAMPLE_SALESFORCE_SAMPLE_SALESFORCE_EXECUTE);

		return httpResponse;
	}

	public IHTTPResponse sfdcDelete(com.chyme.salesforce.gen.salesforce.sobject.SOBJECT sObject) {
		IHTTPRequest httpRequest = (IHTTPRequest) process.createRequest(RequestType.HTTP);

		//	Verb
		httpRequest.setVerb(IHTTPRequest.HTTPVerb.DELETE);

		//	Path
		String path = DELETE.replaceAll("VERSION", VERSION);
		path = path.replaceAll("SOBJECT", sObject.getObjectName());
		path = path.replaceAll("KEY", String.valueOf(sObject.getValue(sObject.getKey())));
		httpRequest.setPath(path);

		//	Header
		Hashtable<String, String> headers = new Hashtable<String, String>();
		headers.put("Authorization", AUTHORIZAION);
		httpRequest.setHeaders(headers);

		//	Body
		httpRequest.setMessageBody(sObject.getJson());

		//	Execute
		IHTTPResponse httpResponse = (IHTTPResponse) process.getService().submitRequest(httpRequest,
				Constant.SALESFORCE_SAMPLE_SALESFORCE_SAMPLE_SALESFORCE_EXECUTE);
		return httpResponse;
	}

	public IHTTPResponse sfdcGet(Class sObject, String id, String fields[]) {
		com.chyme.salesforce.gen.salesforce.sobject.SOBJECT object = null;
		IHTTPResponse httpResponse = null;
		try {
			IHTTPRequest httpRequest = (IHTTPRequest) process.createRequest(RequestType.HTTP);

			object = (com.chyme.salesforce.gen.salesforce.sobject.SOBJECT) sObject.newInstance();

			//	Verb
			httpRequest.setVerb(IHTTPRequest.HTTPVerb.GET);

			//	Path
			String path = GET.replaceAll("VERSION", VERSION);
			path = path.replaceAll("SOBJECT", object.getObjectName());
			path = path.replaceAll("KEY", id);
			httpRequest.setPath(path);

			//	Header
			Hashtable<String, String> headers = new Hashtable<String, String>();
			headers.put("Authorization", AUTHORIZAION);
			httpRequest.setHeaders(headers);

			//	Execute
			httpResponse = (IHTTPResponse) process.getService().submitRequest(httpRequest,
					Constant.SALESFORCE_SAMPLE_SALESFORCE_SAMPLE_SALESFORCE_EXECUTE);
		} catch (Exception ex) {

		}
		return httpResponse;
	}

	public java.io.File sfdcGetAttachment(String id) {
		return null;
	}

	public java.io.File sfdcGetDocument(String id) {
		return null;
	}

	public String sfdcCreateDocument(java.io.File file) {
		return null;
	}

	public IHTTPResponse sfdcQuery(String query) {
		IHTTPResponse httpResponse = null;
		try {
			IHTTPRequest httpRequest = (IHTTPRequest) process.createRequest(RequestType.HTTP);

			//	Verb
			httpRequest.setVerb(IHTTPRequest.HTTPVerb.GET);

			//	Path
			String path = QUERY.replaceAll("VERSION", VERSION);
			path = path.replaceAll("SOSQL_QUERY", java.net.URLEncoder.encode(query, "UTF-8"));
			httpRequest.setPath(path);

			//	Header
			Hashtable<String, String> headers = new Hashtable<String, String>();
			headers.put("Authorization", AUTHORIZAION);
			httpRequest.setHeaders(headers);

			//	Execute
			httpResponse = (IHTTPResponse) process.getService().submitRequest(httpRequest,
					Constant.SALESFORCE_SAMPLE_SALESFORCE_SAMPLE_SALESFORCE_EXECUTE);
		} catch (Exception ex) {

		}
		return httpResponse;
	}

	public String sfdcQueryRemaining(String queryID) {
		try {
			IHTTPRequest httpRequest = (IHTTPRequest) process.createRequest(RequestType.HTTP);

			//	Verb
			httpRequest.setVerb(IHTTPRequest.HTTPVerb.GET);

			//	Path
			String path = "";
			if (queryID.contains("/"))
				path = queryID;
			else {
				QUERY_REMAINING.replaceAll("VERSION", VERSION);
				path = path.replaceAll("QUERY_ID", queryID);
				httpRequest.setPath(path);
			}

			//	Header
			Hashtable<String, String> headers = new Hashtable<String, String>();
			headers.put("Authorization", AUTHORIZAION);
			httpRequest.setHeaders(headers);

			//	Execute
			IHTTPResponse httpResponse = (IHTTPResponse) process.getService().submitRequest(httpRequest,
					Constant.SALESFORCE_SAMPLE_SALESFORCE_SAMPLE_SALESFORCE_EXECUTE);
			if (httpResponse.isSuccess()) {
				return httpResponse.getMessage();
			} else
				process.getInfoMessageList().addAll(httpResponse.getInfoMessages());
		} catch (Exception ex) {

		}
		return "";
	}

	public com.chyme.salesforce.gen.salesforce.sobject.SOBJECT[] sfdcGetObjectsFromQuery(Class sObject,
			String queryResult) {
		ArrayList<com.chyme.salesforce.gen.salesforce.sobject.SOBJECT> results = new ArrayList<com.chyme.salesforce.gen.salesforce.sobject.SOBJECT>();

		try {
			JsonObject resultObject = (JsonObject) new JsonParser().parse(queryResult);
			JsonArray sObjects = (JsonArray) resultObject.get("records");
			if (sObjects != null) {
				for (int i = 0; i < sObjects.size(); i++) {
					com.chyme.salesforce.gen.salesforce.sobject.SOBJECT sObj = (com.chyme.salesforce.gen.salesforce.sobject.SOBJECT) sObject
							.newInstance();
					sObj.load(new Gson().toJson(sObjects.get(i)));
					results.add(sObj);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return results.toArray(new com.chyme.salesforce.gen.salesforce.sobject.SOBJECT[] {});
	}

}

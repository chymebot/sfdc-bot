package com.chyme.salesforce.gen.salesforce.sobject;


import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map.Entry;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public abstract class SOBJECT
{
	public static String version = "36.0";
	public static final String SERVER_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
	public static final String DEVICE_DATE_FORMAT = "yyyy-MM-dd hh:mm:ss.SSS";
	
	HashMap<String, Object> values = new HashMap<String, Object>();
	
	public abstract String getKey();
	public abstract String getObjectName();
	
	public Object getValue(String field)
	{
		return values.get(field);
	}
	
	public void setValue(String field, Object value)
	{
		if(value!=null)
			values.put(field, value);
		else
			values.remove(field);
	}
	
	public String getJson()
	{
		JsonObject jsonObject = new JsonObject();
		
		for (Entry<String, Object> entry : values.entrySet()) 
		{
			Object value = entry.getValue();
			if(value instanceof String)
				jsonObject.addProperty(entry.getKey(), (String)entry.getValue());
			else if(value instanceof Boolean)
				jsonObject.addProperty(entry.getKey(), (Boolean)entry.getValue());
			else if(value instanceof Number)
				jsonObject.addProperty(entry.getKey(), (Number)entry.getValue());
			else if(value instanceof Date)
				jsonObject.addProperty(entry.getKey(), ((Date)entry.getValue()).toString());
			else if(value instanceof Timestamp){
				String formattedDateTime;
				try {							
					SimpleDateFormat sdf1 = new SimpleDateFormat(DEVICE_DATE_FORMAT);
					java.util.Date date = sdf1.parse(entry.getValue().toString());					
					SimpleDateFormat sdf2 = new SimpleDateFormat(SERVER_DATE_FORMAT);
					formattedDateTime = sdf2.format(date);							
				} catch (ParseException e) {
					e.printStackTrace();
					formattedDateTime = "";
				}
				jsonObject.addProperty(entry.getKey(), formattedDateTime);
			}				
		}
		return new Gson().toJson(jsonObject);
	}
	
	public void load(String json)
	{
		try
		{
			values.clear();
			JsonObject jsonObject = (JsonObject)new JsonParser().parse(json);
			for(Entry<String,JsonElement> entry : jsonObject.entrySet())
			{
				if(entry.getValue()==null || entry.getValue() instanceof JsonNull)
					continue;
			
				Method method = null;
				try
				{
					method = this.getClass().getMethod("get"+entry.getKey().toUpperCase());

					if(method.getReturnType() == String.class)
					{
						values.put(entry.getKey().toString(), entry.getValue().getAsString());
					}
					else if(method.getReturnType() == Boolean.class)
					{
						values.put(entry.getKey().toString(), entry.getValue().getAsBoolean());
					}
					else if(method.getReturnType() == Date.class)
				    {
				        values.put(entry.getKey().toString(), Date.valueOf(entry.getValue().getAsString()));
				    }
					else if(method.getReturnType() == Timestamp.class)
					{						
						SimpleDateFormat sdf = new SimpleDateFormat(SERVER_DATE_FORMAT);
						java.util.Date date = sdf.parse(entry.getValue().getAsString());
						Timestamp timestamp = new Timestamp(date.getTime());
						values.put(entry.getKey().toString(), timestamp);
					}
					else if(method.getReturnType() == Integer.class)
					{
						values.put(entry.getKey().toString(), entry.getValue().getAsInt());
					}
					else if(method.getReturnType() == Long.class)
					{
						values.put(entry.getKey().toString(), entry.getValue().getAsLong());
					}
					else if(method.getReturnType() == Double.class)
					{
						values.put(entry.getKey().toString(), entry.getValue().getAsDouble());
					}
					else if(method.getReturnType() == Float.class)
					{
						values.put(entry.getKey().toString(), entry.getValue().getAsFloat());
					}
					else if(method.getReturnType() == BigDecimal.class)
					{
						values.put(entry.getKey().toString(), entry.getValue().getAsBigDecimal());
					}
					else 
					{
						values.put(entry.getKey().toString(), entry.getValue().getAsString());
					}
				}
				catch(Exception e){}				
			}
		}
		catch(Exception ex)
		{
			
		}
	}
}

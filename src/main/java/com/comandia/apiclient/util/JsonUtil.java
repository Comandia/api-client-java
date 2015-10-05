package com.comandia.apiclient.util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonUtil {
	
	public static boolean isValidJson(String jsonString){
		return isJsonObject(jsonString) || isJsonArray(jsonString);
	}
	
	public static boolean isJsonObject(String jsonString) {
		try {
			new JSONObject(jsonString);
		} catch (JSONException e) {
			return false;
		}
		return true;
	}
	
	public static boolean isJsonArray(String jsonString) {
		try {
			new JSONArray(jsonString);
		} catch (JSONException e) {
			return false;
		}
		return true;
	}


	public static JSONObject toJsonObject(String jsonString) {
		if(isJsonObject(jsonString)) {
			return new JSONObject(jsonString);
		}
		return null;
	}
	
	public static JSONArray toJsonArray(String jsonString) {
		if(isJsonArray(jsonString)) {
			return new JSONArray(jsonString);
		}
		return null;
	}

	
	public static boolean hasKey(String jsonString, String key) {
		JSONObject jsonObject = toJsonObject(jsonString);
		return jsonObject!=null && jsonObject.has(key);
	}
}

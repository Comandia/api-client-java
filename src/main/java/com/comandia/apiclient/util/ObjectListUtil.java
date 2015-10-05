package com.comandia.apiclient.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.comandia.api.rest.v1.model.ResponseObjectList;
import com.comandia.api.rest.v1.model.ResultList;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectListUtil {
	@SuppressWarnings("unchecked")
	public static <T> ResponseObjectList getObjectList(JSONObject jsonObject, Class<T> clx) {
		ResponseObjectList olr = new ResponseObjectList();
		
		List<?> objectList = new ArrayList<T>();
		ObjectMapper resultListMapper = new ObjectMapper();
		try {
			
			ResultList resultList = resultListMapper.readValue(jsonObject.toString(), ResultList.class);
			List<LinkedHashMap<String, String>> results_ = (List<LinkedHashMap<String, String>>) resultList.getResults();
			
			ObjectMapper objectMapper = new ObjectMapper();
			
			objectList = objectMapper.readValue(new JSONArray(results_).toString(), objectMapper.getTypeFactory().constructCollectionType(List.class, clx));
			
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		olr.setResults(objectList);
		olr.setTotalCount(jsonObject.getInt("totalCount"));
		olr.setOffset(jsonObject.getInt("offset"));
		olr.setLimit(jsonObject.getInt("limit"));
		return olr;
	}
}

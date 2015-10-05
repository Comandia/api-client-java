package com.comandia.api.rest.v1.model;

import java.util.List;

public class ResponseObjectList {
	
	List<?> results;
	Integer totalCount;
	Integer offset;
	Integer limit;
	
	
	
	/*@SuppressWarnings("unchecked")
	public  <T> ObjectListResponse(JSONObject jsonObject, List<?> cls) {
		List<?> objectList = new ArrayList<T>();
		ObjectMapper resultListMapper = new ObjectMapper();
		try {
			
			ResultList resultList = resultListMapper.readValue(jsonObject.toString(), ResultList.class);
			List<LinkedHashMap<String, String>> results_ = (List<LinkedHashMap<String, String>>) resultList.getResults();
			
			ObjectMapper objectMapper = new ObjectMapper();
			objectList.addAll(objectMapper.readValue(new JSONArray(results_).toString(), cls.getClass()));
			
			for(LinkedHashMap<String, String> object : results_) {
				JSONObject mapJsonObject = new JSONObject(object);
				ObjectMapper objectMapper = new ObjectMapper();
				objectList.add(objectMapper.readValue(mapJsonObject.toString(), cls.getClass()));
			}
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
		
		this.results = objectList;
		this.totalCount = jsonObject.getInt("totalCount");
		this.offset = jsonObject.getInt("offset");
		this.limit = jsonObject.getInt("limit");
	}*/

	public List<?> getResults() {
		return (List<?>)results;
	}

	public <xclass> void setResults(List<xclass> results) {
		this.results = results;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}
}

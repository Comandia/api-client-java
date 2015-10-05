package com.comandia.api.rest.v1.model;

import java.util.List;

public class ResultList {

	List<?> results;
	Integer totalCount;
	Integer offset;
	Integer limit;
	
	public <T extends Object> ResultList() {
		
	}
	
	public <T extends Object> ResultList(List<T> results, Integer totalCount, Integer offset, Integer limit) {
		super();
		this.results = results;
		this.totalCount = totalCount;
		this.offset = offset;
		this.limit = limit;
	}
	
	public List<?> getResults() {
		return results;
	}
	public void setResults(List<Object> results) {
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

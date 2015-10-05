package com.comandia.api.rest.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Brand{
	public Integer brandid;
	public String name;
	public boolean isactive;
	
	public Integer getBrandid() {
		return brandid;
	}
	public void setBrandid(Integer brandid) {
		this.brandid = brandid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	
//	@Override
//	public List<Error> validate(V1Constants.OPT opt) {
//		List<Error> returnList = new ArrayList<Error>();
//		switch (opt) {
//		case ADD:
//			if(name==null) returnList.add(new Error(V1Constants.ERROR_CODE_VALIDATION,"brand.name","brand.name is required!"));
//			break;
//		case UPDATE:
//			if(brandid==null)  returnList.add(new Error(V1Constants.ERROR_CODE_VALIDATION,"brand.brandid","brand.brandid is required!"));
//			if(name==null)  returnList.add(new Error(V1Constants.ERROR_CODE_VALIDATION,"brand.name","brand.name is required!"));
//			break;
//		default:
//			break;
//		}
//		
//		return returnList.isEmpty()?null:returnList;
//	}
//	
	

}

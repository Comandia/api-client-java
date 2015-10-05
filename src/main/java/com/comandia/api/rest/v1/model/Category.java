package com.comandia.api.rest.v1.model;


public class Category {
	public Integer categoryid;
	public String name;
	public Integer overcategoryid;
	private Integer sortorder;
	
	boolean isactive;
	public Integer getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getOvercategoryid() {
		return overcategoryid;
	}
	public void setOvercategoryid(Integer overcategoryid) {
		this.overcategoryid = overcategoryid;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	
	
	public Integer getSortorder() {
		return sortorder;
	}
	public void setSortorder(Integer sortorder) {
		this.sortorder = sortorder;
	}
	
//	@Override
//	public List<Error> validate(V1Constants.OPT opt) {
//		List<Error> returnList = new ArrayList<Error>();
//		switch (opt) {
//		case ADD:
//			if(name==null) returnList.add(new Error(V1Constants.ERROR_CODE_VALIDATION,"category.name","category.name is required!"));
//			break;
//		case UPDATE:
//			if(categoryid==null)  returnList.add(new Error(V1Constants.ERROR_CODE_VALIDATION,"category.categoryid","category.categoryid is required!"));
//			if(name==null)  returnList.add(new Error(V1Constants.ERROR_CODE_VALIDATION,"category.name","category.name is required!"));
//			break;
//		default:
//			break;
//		}
//		
//		return returnList.isEmpty()?null:returnList;
//	}
}

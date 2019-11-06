package com.occ.invoice.model;

public class WorkModel {
	
	private String work_name;
	
    private String work_address;

	public String getWork_name() {
		return work_name;
	}

	public void setWork_name(String work_name) {
		this.work_name = work_name;
	}

	public String getWork_address() {
		return work_address;
	}

	public void setWork_address(String work_address) {
		this.work_address = work_address;
	}

	@Override
	public String toString() {
		return "WorkModel [work_name=" + work_name + ", work_address=" + work_address + "]";
	}    
    

}

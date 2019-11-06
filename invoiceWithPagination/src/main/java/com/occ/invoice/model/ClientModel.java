package com.occ.invoice.model;

public class ClientModel {
	private String client_name;
	
    private String client_address;
	
    private String client_mobile;
	
    private String client_landline;
	
    private String client_fax;
	
    private String client_email;
	
    private String client_gstin_uin;
    
    private String client_id;

	public String getClient_name() {
		return client_name;
	}

	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}

	public String getClient_address() {
		return client_address;
	}

	public void setClient_address(String client_address) {
		this.client_address = client_address;
	}

	public String getClient_mobile() {
		return client_mobile;
	}

	public void setClient_mobile(String client_mobile) {
		this.client_mobile = client_mobile;
	}

	public String getClient_landline() {
		return client_landline;
	}

	public void setClient_landline(String client_landline) {
		this.client_landline = client_landline;
	}

	public String getClient_fax() {
		return client_fax;
	}

	public void setClient_fax(String client_fax) {
		this.client_fax = client_fax;
	}

	public String getClient_email() {
		return client_email;
	}

	public void setClient_email(String client_email) {
		this.client_email = client_email;
	}

	public String getClient_gstin_uin() {
		return client_gstin_uin;
	}

	public void setClient_gstin_uin(String client_gstin_uin) {
		this.client_gstin_uin = client_gstin_uin;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	@Override
	public String toString() {
		return "ClientModel [client_name=" + client_name + ", client_address=" + client_address + ", client_mobile="
				+ client_mobile + ", client_landline=" + client_landline + ", client_fax=" + client_fax
				+ ", client_email=" + client_email + ", client_gstin_uin=" + client_gstin_uin + ", client_id="
				+ client_id + "]";
	}
	
	
    
    
}

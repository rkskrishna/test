package com.occ.invoice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name = "mst_client")
public class Client extends AuditModel{
	private static final long serialVersionUID = 1L;
	 
	private long client_id;
	
    private String client_name;
	
    private String client_address;
	
    private String client_mobile;
	
    private String client_landline;
	
    private String client_fax;
	
    private String client_email;
	
    private String client_gstin_uin;
       
    public Client() {
  
    }
 
    public Client(String client_name, String client_address, String client_mobile,
			String client_fax, String client_email, String client_gstin_uin) {
		super();
	
		this.client_name = client_name;
		this.client_address = client_address;
		this.client_mobile = client_mobile;
		this.client_fax = client_fax;
		this.client_email = client_email;
		this.client_gstin_uin = client_gstin_uin;
		
	}
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id", nullable = false)
    public long getClient_id() {
		return client_id;
	}

	public void setClient_id(long client_id) {
		this.client_id = client_id;
	}

	
	@Column(name = "client_name", nullable = false) 
	public String getClient_name() {
		return client_name;
	}

	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}

	@Column(name = "client_address", nullable = false)
	public String getClient_address() {
		return client_address;
	}

	public void setClient_address(String client_address) {
		this.client_address = client_address;
	}
	
	@Column(name = "client_mobile", nullable = false) 
	public String getClient_mobile() {
		return client_mobile;
	}

	public void setClient_mobile(String client_mobile) {
		this.client_mobile = client_mobile;
	}
	
	@Column(name = "client_landline", nullable = false) 
	public String getClient_landline() {
		return client_landline;
	}

	public void setClient_landline(String client_landline) {
		this.client_landline = client_landline;
	}
	
	@Column(name = "client_fax", nullable = false) 
	public String getClient_fax() {
		return client_fax;
	}

	public void setClient_fax(String client_fax) {
		this.client_fax = client_fax;
	}
	@Email
	@Column(name = "client_email", nullable = false) 
	public String getClient_email() {
		return client_email;
	}

	public void setClient_email(String client_email) {
		this.client_email = client_email;
	}
	
	@Column(name = "client_gstin_uin", nullable = false) 
	public String getClient_gstin_uin() {
		return client_gstin_uin;
	}

	public void setClient_gstin_uin(String client_gstin_uin) {
		this.client_gstin_uin = client_gstin_uin;
	}
	  
    @Override
	public String toString() {
		return "Client [ client_name=" + client_name + ", client_address="
				+ client_address + ", client_mobile=" + client_mobile + ", client_fax=" + client_fax + ", client_email="
				+ client_email + ", client_gstin_uin=" + client_gstin_uin + "]";
	}
}
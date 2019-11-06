package com.occ.invoice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mst_work")
public class WorkEntity extends AuditModel {
	
	private static final long serialVersionUID = 1L;
	
	private long work_id;
	
    private String work_name;
	
    private String work_address;
    
    public WorkEntity() {
    	  
    }
    
    public WorkEntity(String work_name, String work_address) {
		super();
		this.work_name = work_name;
		this.work_address = work_address;
		
	}
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "work_id", nullable = false)
	public long getId() {
		return work_id;
	}

	public void setId(long work_id) {
		this.work_id = work_id;
	}
	@Column(name = "work_name", nullable = false)
	public String getWork_name() {
		return work_name;
	}

	public void setWork_name(String work_name) {
		this.work_name = work_name;
	}
	@Column(name = "work_address", nullable = false)
	public String getWork_address() {
		return work_address;
	}

	public void setWork_address(String work_address) {
		this.work_address = work_address;
	}

	@Override
	public String toString() {
		return "WorkEntity [work_id=" + work_id + ", work_name=" + work_name + ", work_address=" + work_address + "]";
	}

}

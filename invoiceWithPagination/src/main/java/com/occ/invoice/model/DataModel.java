/**
 * Copyright © NIC. All rights reserved.

 *
 * This software is the confidential and proprietary information 
 * of NIC.You shall not disclose such Confidential Information and 
 * shall use it only in accordance with the terms and conditions 
 * entered into with NIC.
 *
 * Id: DataModel.java,v 1.1
 *
 * Date Author Changes
 * Jul 29, 2017, 11:25:22 PM  prakash Created
 */
package com.occ.invoice.model;

import java.util.List;
import java.util.Map;

//import org.json.simple.JSONObject;

public class DataModel 
{
	private String status;
	private String msg;
	private int errorCode;
	private String errormsg;
	private Object record;
	private List<?> recordList;
	private List<Map<String,?>> mappingList;
	private Map<String,?> mappingData;
	private String jsonData;
	public String getStatus() {
		return status;
	}
	public String getMsg() {
		return msg;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public String getErrormsg() {
		return errormsg;
	}
	public Object getRecord() {
		return record;
	}
	public List<?> getRecordList() {
		return recordList;
	}
	public List<Map<String, ?>> getMappingList() {
		return mappingList;
	}
	public Map<String, ?> getMappingData() {
		return mappingData;
	}
	public String getJsonData() {
		return jsonData;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}
	public void setRecord(Object record) {
		this.record = record;
	}
	public void setRecordList(List<?> recordList) {
		this.recordList = recordList;
	}
	public void setMappingList(List<Map<String, ?>> mappingList) {
		this.mappingList = mappingList;
	}
	public void setMappingData(Map<String, ?> mappingData) {
		this.mappingData = mappingData;
	}
	public void setJsonData(String jsonData) {
		this.jsonData = jsonData;
	}
	@Override
	public String toString() {
		return "DataModel [status=" + status + ", msg=" + msg + ", errorCode=" + errorCode + ", errormsg=" + errormsg
				+ ", record=" + record + ", recordList=" + recordList + ", mappingList=" + mappingList
				+ ", mappingData=" + mappingData + ", jsonData=" + jsonData + "]";
	}
	
}

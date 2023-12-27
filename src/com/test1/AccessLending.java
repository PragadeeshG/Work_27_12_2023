package com.test1;

public class AccessLending {
	private long lendingId;
	private String customerId;
	private Integer accessId;
	private String segment;
	private Integer department;
	private Integer accessRole;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public AccessLending() {

	}

	public AccessLending(long lendingId, String customerId, Integer accessId, String segment, Integer department,
			Integer accessRole, String creationDate, String modifiedDate, String entityState) {
		super();
		this.lendingId = lendingId;
		this.customerId = customerId;
		this.accessId = accessId;
		this.segment = segment;
		this.department = department;
		this.accessRole = accessRole;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getLendingId() {
		return lendingId;
	}

	public void setLendingId(long lendingId) {
		this.lendingId = lendingId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Integer getAccessId() {
		return accessId;
	}

	public void setAccessId(Integer accessId) {
		this.accessId = accessId;
	}

	public String getSegment() {
		return segment;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}

	public Integer getDepartment() {
		return department;
	}

	public void setDepartment(Integer department) {
		this.department = department;
	}

	public Integer getAccessRole() {
		return accessRole;
	}

	public void setAccessRole(Integer accessRole) {
		this.accessRole = accessRole;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}

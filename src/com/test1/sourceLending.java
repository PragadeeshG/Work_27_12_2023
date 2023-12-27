package com.test1;

public class sourceLending {
	private Integer refId;
	private String customerId;
	private Integer sourceId;
	private Integer lendingUnit;
	private Integer noOfSources;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public sourceLending() {

	}

	public sourceLending(Integer refId, String customerId, Integer sourceId, Integer lendingUnit, Integer noOfSources,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.refId = refId;
		this.customerId = customerId;
		this.sourceId = sourceId;
		this.lendingUnit = lendingUnit;
		this.noOfSources = noOfSources;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getRefId() {
		return refId;
	}

	public void setRefId(Integer refId) {
		this.refId = refId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Integer getSourceId() {
		return sourceId;
	}

	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}

	public Integer getLendingUnit() {
		return lendingUnit;
	}

	public void setLendingUnit(Integer lendingUnit) {
		this.lendingUnit = lendingUnit;
	}

	public Integer getNoOfSources() {
		return noOfSources;
	}

	public void setNoOfSources(Integer noOfSources) {
		this.noOfSources = noOfSources;
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

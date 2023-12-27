package com.test1;

public class DataLending {
	private long lendingId;
	private String customerId;
	private String aggregate;
	private String aggregateFormula;
	private String globalMarket;
	private String assetClass;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DataLending() {

	}

	public DataLending(long lendingId, String customerId, String aggregate, String aggregateFormula,
			String globalMarket, String assetClass, String creationDate, String modifiedDate, String entityState) {
		super();
		this.lendingId = lendingId;
		this.customerId = customerId;
		this.aggregate = aggregate;
		this.aggregateFormula = aggregateFormula;
		this.globalMarket = globalMarket;
		this.assetClass = assetClass;
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

	public String getAggregate() {
		return aggregate;
	}

	public void setAggregate(String aggregate) {
		this.aggregate = aggregate;
	}

	public String getAggregateFormula() {
		return aggregateFormula;
	}

	public void setAggregateFormula(String aggregateFormula) {
		this.aggregateFormula = aggregateFormula;
	}

	public String getGlobalMarket() {
		return globalMarket;
	}

	public void setGlobalMarket(String globalMarket) {
		this.globalMarket = globalMarket;
	}

	public String getAssetClass() {
		return assetClass;
	}

	public void setAssetClass(String assetClass) {
		this.assetClass = assetClass;
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

package com.test1;

public class WealthLending {
	private long lendingId;
	private String customerId;
	private String collaterals;
	private String bonds;
	private String deposits;
	private long loanUnit;
	private String multiLoanCurr;
	private boolean repayApplicable;
	private long capital;
	private long annualReturn;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public WealthLending() {

	}

	public WealthLending(long lendingId, String customerId, String collaterals, String bonds, String deposits,
			long loanUnit, String multiLoanCurr, boolean repayApplicable, long capital, long annualReturn,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.lendingId = lendingId;
		this.customerId = customerId;
		this.collaterals = collaterals;
		this.bonds = bonds;
		this.deposits = deposits;
		this.loanUnit = loanUnit;
		this.multiLoanCurr = multiLoanCurr;
		this.repayApplicable = repayApplicable;
		this.capital = capital;
		this.annualReturn = annualReturn;
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

	public String getCollaterals() {
		return collaterals;
	}

	public void setCollaterals(String collaterals) {
		this.collaterals = collaterals;
	}

	public String getBonds() {
		return bonds;
	}

	public void setBonds(String bonds) {
		this.bonds = bonds;
	}

	public String getDeposits() {
		return deposits;
	}

	public void setDeposits(String deposits) {
		this.deposits = deposits;
	}

	public long getLoanUnit() {
		return loanUnit;
	}

	public void setLoanUnit(long loanUnit) {
		this.loanUnit = loanUnit;
	}

	public String getMultiLoanCurr() {
		return multiLoanCurr;
	}

	public void setMultiLoanCurr(String multiLoanCurr) {
		this.multiLoanCurr = multiLoanCurr;
	}

	public boolean isRepayApplicable() {
		return repayApplicable;
	}

	public void setRepayApplicable(boolean repayApplicable) {
		this.repayApplicable = repayApplicable;
	}

	public long getCapital() {
		return capital;
	}

	public void setCapital(long capital) {
		this.capital = capital;
	}

	public long getAnnualReturn() {
		return annualReturn;
	}

	public void setAnnualReturn(long annualReturn) {
		this.annualReturn = annualReturn;
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

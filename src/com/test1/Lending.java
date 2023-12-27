package com.test1;

public class Lending {
	private long lendingId;
	private String code;
	private String lendingName;
	private String lendingDef;
	private String benifits;
	private String maturityDate;
	private String veerifications;
	private String creationDate;
	private String modifiedDate;

	public Lending() {

	}

	public Lending(long lendingId, String code, String lendingName, String lendingDef, String benifits,
			String maturityDate, String veerifications, String creationDate, String modifiedDate) {
		super();
		this.lendingId = lendingId;
		this.code = code;
		this.lendingName = lendingName;
		this.lendingDef = lendingDef;
		this.benifits = benifits;
		this.maturityDate = maturityDate;
		this.veerifications = veerifications;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
	}

	public long getLendingId() {
		return lendingId;
	}

	public void setLendingId(long lendingId) {
		this.lendingId = lendingId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLendingName() {
		return lendingName;
	}

	public void setLendingName(String lendingName) {
		this.lendingName = lendingName;
	}

	public String getLendingDef() {
		return lendingDef;
	}

	public void setLendingDef(String lendingDef) {
		this.lendingDef = lendingDef;
	}

	public String getBenifits() {
		return benifits;
	}

	public void setBenifits(String benifits) {
		this.benifits = benifits;
	}

	public String getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;
	}

	public String getVeerifications() {
		return veerifications;
	}

	public void setVeerifications(String veerifications) {
		this.veerifications = veerifications;
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

}

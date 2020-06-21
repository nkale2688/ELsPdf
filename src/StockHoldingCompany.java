

import java.io.Serializable;



public class StockHoldingCompany implements Serializable, Cloneable {

	private static final long serialVersionUID = 8231985433965897352L;

	
	private int stockHoldingCompanyId;

	private String name;

	private String name2;

	private String zipCode;

	private String place;

	private String street1;

	private String stockHoldingCompanyList;

	private String telephoneAreaCode;

	private String telephoneNo;

	private String street;

	public int getStockHoldingCompanyId() {
		return stockHoldingCompanyId;
	}

	public void setStockHoldingCompanyId(int stockHoldingCompanyId) {
		this.stockHoldingCompanyId = stockHoldingCompanyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getStockHoldingCompanyList() {
		return stockHoldingCompanyList;
	}

	public void setStockHoldingCompanyList(String stockHoldingCompanyList) {
		this.stockHoldingCompanyList = stockHoldingCompanyList;
	}

	public String getTelephoneAreaCode() {
		return telephoneAreaCode;
	}

	public void setTelephoneAreaCode(String telephoneAreaCode) {
		this.telephoneAreaCode = telephoneAreaCode;
	}

	public String getTelephoneNo() {
		return telephoneNo;
	}

	public void setTelephoneNo(String telephoneNo) {
		this.telephoneNo = telephoneNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

}

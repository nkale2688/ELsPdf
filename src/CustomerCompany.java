

import java.io.Serializable;


public class CustomerCompany implements Serializable, Cloneable {
	
	private static final long serialVersionUID = 3313589119845235303L;

	private int companyCode;

	private String returnText;

	private String countryCode;

	private String name;

	private String city;

	private String zipCode;

	private String adressLine1;

	private String adressLine2;

	private String adressLine3;

	private String customerCompanyList;

	private String logoPath;

	private String codBLZ;

	private String codCustomerNo;

	private String address;

	public int getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}

	public String getReturnText() {
		return returnText;
	}

	public void setReturnText(String returnText) {
		this.returnText = returnText;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getAdressLine1() {
		return adressLine1;
	}

	public void setAdressLine1(String adressLine1) {
		this.adressLine1 = adressLine1;
	}

	public String getAdressLine2() {
		return adressLine2;
	}

	public void setAdressLine2(String adressLine2) {
		this.adressLine2 = adressLine2;
	}

	public String getAdressLine3() {
		return adressLine3;
	}

	public void setAdressLine3(String adressLine3) {
		this.adressLine3 = adressLine3;
	}

	public String getCustomerCompanyList() {
		return customerCompanyList;
	}

	public void setCustomerCompanyList(String customerCompanyList) {
		this.customerCompanyList = customerCompanyList;
	}

	public String getLogoPath() {
		return logoPath;
	}

	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}

	public String getCodBLZ() {
		return codBLZ;
	}

	public void setCodBLZ(String codBLZ) {
		this.codBLZ = codBLZ;
	}

	public String getCodCustomerNo() {
		return codCustomerNo;
	}

	public void setCodCustomerNo(String codCustomerNo) {
		this.codCustomerNo = codCustomerNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipCodeAndPlace() {
		return zipCode + " " + city;
	}

	

}

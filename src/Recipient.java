

import java.io.Serializable;



public class Recipient implements Serializable, Cloneable {

	private static final long serialVersionUID = -3119128870975617444L;


	/**
	 * Represents customers telephone
	 */
	private String customerTelephone;

	/**
	 * Represents customer name
	 */
	private String customerName;

	/**
	 * Represents Customer street
	 */
	private String customerStreet;

	/**
	 * Represents Customer company code
	 */
	private String customerCompanyCode;

	/**
	 * Represents Additional info for customer
	 */
	private String additionalInfo;

	/**
	 * Represents Customer zip code
	 */
	private String customerZipCode;

	private String customerPlace;

	private String customerAdressNo;

	private String customerAdditionalName;

	private String customerAdressDirection;

	private String tourCell;

	private String depot;

	private String starDepot;

	private String countryCode;

	private String postalKeyCode;

	private String dpaNo;

	private String salutationList;

	private String customerEmailAddress;

	private int customerAddressId;

	/**
	 * @return
	 */
	public String getCustomerTelephone() {
		return customerTelephone;
	}

	/**
	 * @param customerTelephone
	 */
	public void setCustomerTelephone(String customerTelephone) {
		this.customerTelephone = customerTelephone;
	}

	/**
	 * @return
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return
	 */
	public String getCustomerStreet() {
		return customerStreet;
	}

	/**
	 * @param customerStreet
	 */
	public void setCustomerStreet(String customerStreet) {
		this.customerStreet = customerStreet;
	}

	/**
	 * @return
	 */
	public String getCustomerCompanyCode() {
		return customerCompanyCode;
	}

	/**
	 * @param customerCompanyCode
	 */
	public void setCustomerCompanyCode(String customerCompanyCode) {
		this.customerCompanyCode = customerCompanyCode;
	}

	/**
	 * @return
	 */
	public String getAdditionalInfo() {
		return additionalInfo;
	}

	/**
	 * @param additionalInfo
	 */
	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	/**
	 * @return
	 */
	public String getCustomerZipCode() {
		return customerZipCode;
	}

	/**
	 * @param customerZipCode
	 */
	public void setCustomerZipCode(String customerZipCode) {
		this.customerZipCode = customerZipCode;
	}

	public String getCustomerPlace() {
		return customerPlace;
	}

	public void setCustomerPlace(String customerPlace) {
		this.customerPlace = customerPlace;
	}

	public String getCustomerAdressNo() {
		return customerAdressNo;
	}

	public void setCustomerAdressNo(String customerAdressNo) {
		this.customerAdressNo = customerAdressNo;
	}

	public String getCustomerAdditionalName() {
		return customerAdditionalName;
	}

	public void setCustomerAdditionalName(String customerAdditionalName) {
		this.customerAdditionalName = customerAdditionalName;
	}

	public String getCustomerAdressDirection() {
		return customerAdressDirection;
	}

	public void setCustomerAdressDirection(String customerAdressDirection) {
		this.customerAdressDirection = customerAdressDirection;
	}

	public String getTourCell() {
		return tourCell;
	}

	public void setTourCell(String tourCell) {
		this.tourCell = tourCell;
	}

	public String getDepot() {
		return depot;
	}

	public void setDepot(String depot) {
		this.depot = depot;
	}

	public String getStarDepot() {
		return starDepot;
	}

	public void setStarDepot(String starDepot) {
		this.starDepot = starDepot;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getPostalKeyCode() {
		return postalKeyCode;
	}

	public void setPostalKeyCode(String postalKeyCode) {
		this.postalKeyCode = postalKeyCode;
	}

	public String getDpaNo() {
		return dpaNo;
	}

	public void setDpaNo(String dpaNo) {
		this.dpaNo = dpaNo;
	}

	public String getSalutationList() {
		return salutationList;
	}

	public void setSalutationList(String salutationList) {
		this.salutationList = salutationList;
	}



	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}

	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}

	public int getCustomerAddressId() {
		return customerAddressId;
	}

	public void setCustomerAddressId(int customerAddressId) {
		this.customerAddressId = customerAddressId;
	}

}

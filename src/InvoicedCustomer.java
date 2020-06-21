

import java.io.Serializable;


public class InvoicedCustomer implements Serializable, Cloneable {

	private static final long serialVersionUID = -3744324620861917325L;

	

	private static final int CUSTOMER_NO_MAX_LENGTH = 8;

	/**
	 * Represents customer nr + "/" customer sub no
	 */
	private String customeNrWithSubNr;

	private String customerNr;

	private int customerSubNr;

	private String accountHolderName;

	private String customerNumberWithSubNumberUnformatted;

	/**
	 * This field returns unformatted data as it was fetched in old way in
	 * ONLINE.
	 */
	public String getCustomerNumberWithSubNumberUnformatted() {
		return customerNumberWithSubNumberUnformatted;
	}

	public void setCustomerNumberWithSubNumberUnformatted(
			String customerNumberWithSubNumberUnformatted) {
		this.customerNumberWithSubNumberUnformatted = customerNumberWithSubNumberUnformatted;
	}

	/**
	 * Getter for CustomeNrWithSubNr
	 * 
	 * @return
	 */
	public String getCustomeNrWithSubNr() {
		return customeNrWithSubNr;
	}

	/**
	 * Setter for CustomeNrWithSubNr
	 * 
	 * @param customeNrWithSubNr
	 */
	public void setCustomeNrWithSubNr(String customeNrWithSubNr) {
		this.customeNrWithSubNr = customeNrWithSubNr;
	}

	public String getCustomerNr() {
		return customerNr;
	}

	public void setCustomerNr(String customerNr) {
		this.customerNr = customerNr;
	}

	public int getCustomerSubNr() {
		return customerSubNr;
	}

	public void setCustomerSubNr(int customerSubNr) {
		this.customerSubNr = customerSubNr;
	}

	public String getCustNrSubNrWithSpace() {
		return this.customerNr + this.customerSubNr + "  ";
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getOriginalCustomeNrWithSubNr() {
		if (customerNr.length() > CUSTOMER_NO_MAX_LENGTH) {
			return customerNr.substring(0, CUSTOMER_NO_MAX_LENGTH)
					+ customerSubNr;
		}
		return customerNr + customerSubNr;
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

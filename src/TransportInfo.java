

import java.io.Serializable;


public class TransportInfo implements Serializable, Cloneable {

	private static final long serialVersionUID = -2145575606607756702L;

	
	private String freightDepoNo;

	private String transportKz;

	public String getFreightDepoNo() {
		return freightDepoNo;
	}

	public void setFreightDepoNo(String freightDepoNo) {
		this.freightDepoNo = freightDepoNo;
	}

	/**
	 * @return the transportKz
	 */
	public String getTransportKz() {
		return transportKz;
	}

	/**
	 * @param transportKz
	 *            the transportKz to set
	 */
	public void setTransportKz(String transportKz) {
		this.transportKz = transportKz;
	}
	

}

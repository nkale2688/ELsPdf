

import java.io.Serializable;



public class DeliveryInfo implements Serializable, Cloneable {

	private static final long serialVersionUID = 90892260654600398L;


	private String deliveryLocationList;

	private String deliveryLocation;

	public String getDeLiveryLocationList() {
		return deliveryLocationList;
	}

	public void setDeLiveryLocationList(String deLiveryLocationList) {
		this.deliveryLocationList = deLiveryLocationList;
	}

	public String getDeLiveryLocation() {
		return deliveryLocation;
	}

	public void setDeLiveryLocation(String deLiveryLocation) {
		this.deliveryLocation = deLiveryLocation;
	}
	

}

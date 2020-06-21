

import java.io.Serializable;



public class PriceInfo implements Serializable, Cloneable {

	private static final long serialVersionUID = -2743107559724634157L;

	
	private String ekPrice;

	private String vkPrice;

	public String getEkPrice() {
		return ekPrice;
	}

	public void setEkPrice(String ekPrice) {
		this.ekPrice = ekPrice;
	}

	public String getVkPrice() {
		return vkPrice;
	}

	public void setVkPrice(String vkPrice) {
		this.vkPrice = vkPrice;
	}
	

}

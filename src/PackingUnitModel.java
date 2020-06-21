

import java.io.Serializable;



public class PackingUnitModel implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	
	private int colliKey;
	private String colliNumber;
	private double length;
	private double height;
	private double width;
	private double weight;
	private int carrierProductCode;
	private String carrierProductPrintText;

	public int getColliKey() {
		return colliKey;
	}

	public void setColliKey(int colliKey) {
		this.colliKey = colliKey;
	}

	public String getColliNumber() {
		return colliNumber;
	}

	public void setColliNumber(String colliNumber) {
		this.colliNumber = colliNumber;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getCarrierProductCode() {
		return carrierProductCode;
	}

	public void setCarrierProductCode(int carrierProductCode) {
		this.carrierProductCode = carrierProductCode;
	}

	public String getCarrierProductPrintText() {
		return carrierProductPrintText;
	}

	public void setCarrierProductPrintText(String carrierProductPrintText) {
		this.carrierProductPrintText = carrierProductPrintText;
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

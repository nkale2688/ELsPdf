

import java.io.Serializable;


public class PhysicalAttributes implements Serializable, Cloneable {

	private static final long serialVersionUID = -4327804569098681656L;


	private int width;

	private int length;

	private int height;

	private int cubicMeter;

	private String engravingText;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getEngravingText() {
		return engravingText;
	}

	public void setEngravingText(String engravingText) {
		this.engravingText = engravingText;
	}

	public int getCubicMeter() {
		return cubicMeter;
	}

	public void setCubicMeter(int cubicMeter) {
		this.cubicMeter = cubicMeter;
	}

	

}

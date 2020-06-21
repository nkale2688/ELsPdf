

import java.io.Serializable;



/**
 * this class represents a detailed packingUnit within the orderposition this
 * object will include a singleData of OrderItem.packingunits-List it is needed
 * for special sort for orderpositions and it's packingUnits
 * 
 * @author sredelin
 *
 */
public class PackingUnitInfo implements Serializable, Cloneable {



	private static final long serialVersionUID = 1L;

	private String packetIdentificationNo;

	private PackingUnitModel packingUnitDetail;

	public PackingUnitModel getPackingUnitDetail() {
		return packingUnitDetail;
	}

	public void setPackingUnitDetail(PackingUnitModel packingunit) {
		this.packingUnitDetail = packingunit;
	}

	public String getPacketIdentificationNo() {
		return packetIdentificationNo;
	}

	public void setPacketIdentificationNo(String packetIdentificationNo) {
		this.packetIdentificationNo = packetIdentificationNo;
	}

	@Override
	public Object clone() {
		PackingUnitInfo obj = null;
		try {
			obj = (PackingUnitInfo) super.clone();
			if (obj.packingUnitDetail != null) {
				obj.packingUnitDetail = (PackingUnitModel) packingUnitDetail
						.clone();
			}
		} catch (CloneNotSupportedException e) {
			return null;
		}
		return obj;
	}
}

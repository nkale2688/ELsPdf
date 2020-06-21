

import java.io.Serializable;



public class AdditionalInfo implements Serializable, Cloneable {

	private static final long serialVersionUID = -8777245009617199784L;

	

	private String loginDate;

	private String mengeLfdMeter;

	private String greenDotNo;

	private String valutaKz;

	private String anzahlRaten;

	private String sorterFaheigKz;

	private String isERWPackliste;

	private String versandArtDecode;

	private String oebbtotalNoOfPackingUnits;

	private String oebbNveSsccColi;

	private String oebbDepot;

	private String bahnlcNo;

	private String billingSystem;

	private String printVaDate;

	private String printEllDate;

	private String printUebDate;

	private String printCancellationDate;

	public String getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(String loginDate) {
		this.loginDate = loginDate;
	}

	public String getMengeLFDMeter() {
		return mengeLfdMeter;
	}

	public void setMengeLfdMeter(String mengeLfdMeter) {
		this.mengeLfdMeter = mengeLfdMeter;
	}

	public String getGreenDotNo() {
		return greenDotNo;
	}

	public void setGreenDotNo(String greenDotNo) {
		this.greenDotNo = greenDotNo;
	}

	public String getValutaKz() {
		return valutaKz;
	}

	public void setValutaKz(String valutaKz) {
		this.valutaKz = valutaKz;
	}

	public String getAnzahlRaten() {
		return anzahlRaten;
	}

	public void setAnzahlRaten(String anzahlRaten) {
		this.anzahlRaten = anzahlRaten;
	}

	public String getSorterFaheigKz() {
		return sorterFaheigKz;
	}

	public void setSorterFaheigKz(String sorterFaheigKz) {
		this.sorterFaheigKz = sorterFaheigKz;
	}

	public String getIsERWPackliste() {
		return isERWPackliste;
	}

	public void setIsERWPackliste(String isERWPackliste) {
		this.isERWPackliste = isERWPackliste;
	}

	public String getVersandArtDecode() {
		return versandArtDecode;
	}

	public void setVersandArtDecode(String versandArtDecode) {
		this.versandArtDecode = versandArtDecode;
	}

	public String getOEBBtotalNoOfPackingUnits() {
		return oebbtotalNoOfPackingUnits;
	}

	public void setOEBBtotalNoOfPackingUnits(String oEBBtotalNoOfPackingUnits) {
		this.oebbtotalNoOfPackingUnits = oEBBtotalNoOfPackingUnits;
	}

	public String getOEBBNveSsccColi() {
		return oebbNveSsccColi;
	}

	public void setOEBBNveSsccColi(String oEBBNveSsccColi) {
		this.oebbNveSsccColi = oEBBNveSsccColi;
	}

	public String getOEBBDepot() {
		return oebbDepot;
	}

	public void setOEBBDepot(String oEBBDepot) {
		this.oebbDepot = oEBBDepot;
	}

	public String getBAHNLcNo() {
		return bahnlcNo;
	}

	public void setBAHNLcNo(String bahnlcNo) {
		this.bahnlcNo = bahnlcNo;
	}

	public String getPrintVaDate() {
		return printVaDate;
	}

	public void setPrintVaDate(String printVaDate) {
		this.printVaDate = printVaDate;
	}

	public String getPrintEllDate() {
		return printEllDate;
	}

	public void setPrintEllDate(String printEllDate) {
		this.printEllDate = printEllDate;
	}

	public String getPrintUebDate() {
		return printUebDate;
	}

	public void setPrintUebDate(String printUebDate) {
		this.printUebDate = printUebDate;
	}

	public String getPrintCancellationDate() {
		return printCancellationDate;
	}

	public void setPrintCancellationDate(String printCancellationDate) {
		this.printCancellationDate = printCancellationDate;
	}

	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			
			return null;
		}
	}

	public void setBillingSystem(String billingSystem) {
		this.billingSystem = billingSystem;
	}

	public String getBillingSystem() {
		return billingSystem;
	}

}

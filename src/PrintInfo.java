

import java.io.Serializable;


public class PrintInfo implements Serializable, Cloneable {

	private static final long serialVersionUID = -5094743731038350006L;

	

	private String stickerType;

	private String stickerTypeVAList;

	private String stickerTypeKAList;

	private String stickerNumber;

	private String barcodeNo;

	private String displayDDBBarCode;

	private String printKANo;

	private String printTANo;

	private String printVANo;

	private String printELLNo;

	private String printUEBNo;

	private String codCustomerCoDescription;

	private String codCustomerNo;

	private String codBlz;

	public String getStickerNumber() {
		return stickerNumber;
	}

	public void setStickerNumber(String stickerNumber) {
		this.stickerNumber = stickerNumber;
	}

	public String getStickerTypeVAList() {
		return stickerTypeVAList;
	}

	public void setStickerTypeVAList(String stickerTypeVAList) {
		this.stickerTypeVAList = stickerTypeVAList;
	}

	public String getBarcodeNo() {
		return barcodeNo;
	}

	public void setBarcodeNo(String barcodeNo) {
		this.barcodeNo = barcodeNo;
	}

	public String getStickerType() {
		return stickerType;
	}

	public void setStickerType(String stickerType) {
		this.stickerType = stickerType;
	}

	public String getStickerTypeKAList() {
		return stickerTypeKAList;
	}

	public void setStickerTypeKAList(String stickerTypeKAList) {
		this.stickerTypeKAList = stickerTypeKAList;
	}

	public String getPrintKANo() {
		return printKANo;
	}

	public void setPrintKANo(String printKANo) {
		this.printKANo = printKANo;
	}

	public String getPrintTANo() {
		return printTANo;
	}

	public void setPrintTANo(String printTANo) {
		this.printTANo = printTANo;
	}

	public String getPrintVANo() {
		return printVANo;
	}

	public void setPrintVANo(String printVANo) {
		this.printVANo = printVANo;
	}

	public String getPrintELLNo() {
		return printELLNo;
	}

	public void setPrintELLNo(String printELLNo) {
		this.printELLNo = printELLNo;
	}

	public String getPrintUEBNo() {
		return printUEBNo;
	}

	public void setPrintUEBNo(String printUEBNo) {
		this.printUEBNo = printUEBNo;
	}

	public String getDisplayDDBBarCode() {
		return displayDDBBarCode;
	}

	public void setDisplayDDBBarCode(String displayDDBBarCode) {
		this.displayDDBBarCode = displayDDBBarCode;
	}

	public String getCodCustomerCoDescription() {
		return codCustomerCoDescription;
	}

	public void setCodCustomerCoDescription(String codCustomerCoDescription) {
		this.codCustomerCoDescription = codCustomerCoDescription;
	}

	public String getCodCustomerNo() {
		return codCustomerNo;
	}

	public void setCodCustomerNo(String codCustomerNo) {
		this.codCustomerNo = codCustomerNo;
	}

	public String getCodBlz() {
		return codBlz;
	}

	public void setCodBlz(String codBlz) {
		this.codBlz = codBlz;
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

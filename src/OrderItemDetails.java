

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;


public class OrderItemDetails implements Serializable, Cloneable {

	
	private static final long serialVersionUID = 1L;

	private Long autoKey;

	private int statusKz;
	
	private String spedition;

	/**
	 * Represents order date
	 */
	private String orderDate;
	
	private String deliveryDate;

	/**
	 * Represents order no
	 */
	private String orderNo;

	/**
	 * Represents entry no
	 */
	private long entryNo;

	/**
	 * Represents article no
	 */
	private String articleNo;

	/**
	 * Represents article description
	 */
	private String description;

	/**
	 * Represents article quantity
	 */
	private int quantity;

	/**
	 * Represents meterware kz info
	 */
	private String meterwareKzInfo;

	private int originalMeterwareKzInfo;

	/**
	 * Represents customer delivery zip code
	 */
	private String deliveryZipCode;

	/**
	 * Represents article size
	 */
	private String size;

	/**
	 * Represents internal article no
	 */
	private String internalArticleNo;

	/**
	 * Represents internal article size
	 */
	private String internalSize;

	/**
	 * Represents internal article description
	 */
	private String internalDescription;

	/**
	 * Represents packet packing number
	 */
	private String paketPackingNr;

	/**
	 * Represents Type of Order
	 */
	private String orderType;

	/**
	 * Represents Cash on Delivery Amount
	 */
	private String cashOnDeliveryAmt;

	/**
	 * Represents shipment id
	 */
	private int shipmentId;

	/**
	 * Represents Supplier
	 */
	private String supplier;

	/**
	 * Represents Invoiced customer
	 */
	private InvoicedCustomer invoicedCustomer;

	/**
	 * Represents Recipient
	 */
	private Recipient recipient;

	private StockHoldingCompany stockHoldingCompany;

	/**
	 * Represents invoce date/auftrag faktur datum
	 */
	private String invoiceDate;

	private String originalInvoiceDate;

	/**
	 * Represents Bill No.
	 */
	private String rechnungNr;

	private String paketNr;

	/**
	 * Represents greuenerPunktKz
	 */
	private String greuenerPunktKz;

	/**
	 * Represents return key BST
	 */
	private String retSchlusselBST;

	/**
	 * Represents postleit code
	 */
	private String postleitCode;

	/**
	 * Represents Order Status
	 */
	private int orderStatus;

	/**
	 * Represents Colli Nr
	 */
	private String colliNr;

	/**
	 * Represents aufkleber no
	 */
	private String aufkleberNo;

	private CustomerCompany customerCompany;

	private String cashOnDelivery;

	private PriceInfo priceInfo;

	private PackingUnitInfo packingUnitInfo;

	private PhysicalAttributes physicalAttributes;

	private int totalNoOfPackingUnits;

	private List<PackingUnitModel> packingunits;

	private String packetWeight;

	private String industryDay;

	private String dayOfWeek;

	private AdditionalInfo additionalInfo;

	private TransportInfo transportInfo;

	private PrintInfo printInfo;

	private DeliveryInfo deliveryInfo;

	private String returnKeyCounter;

	private String runningDay;

	private String cancellationDate;

	private String articlePositionTA;

	private String upsId;

	private String postId;

	private String positionTA;

	private String positionVA;

	private String parcelBunchingCode;

	private String maxDate;

	private String articlePrintDescription;

	private String shippingKey;

	private String sendungsNr;

	private String prodId;

	private String noaPurchaseOrderNo;

	private int packageCounter;

	private int hermesSchwinge;

	private String shipmentType;

	private String ukPrice;

	private String handlingCost;

	private String crsItemNumber;

	private String boxType;

	private String returnsId;

	private String returnsKeyCode;

	private String billingKz;

	private String secretCargoPostAl;

	private String invNumber;

	private String invText;

	private Integer incidentStatus;
	
	private String elsNo;
	
	private String newELSNo;
	
	private String shipmentDate;

	/**
	 * @return the shipmentId
	 */
	public int getShipmentId() {
		return shipmentId;
	}

	/**
	 * @param shipmentId
	 *            the shipmentId to set
	 */
	public void setShipmentId(int shipmentId) {
		this.shipmentId = shipmentId;
	}

	/**
	 * @return the aufkleberNo
	 */
	public String getAufkleberNo() {
		return aufkleberNo;
	}

	/**
	 * @param aufkleberNo
	 *            the aufkleberNo to set
	 */
	public void setAufkleberNo(String aufkleberNo) {
		this.aufkleberNo = aufkleberNo;
	}

	/**
	 * @return the colliNr
	 */
	public String getColliNr() {
		return colliNr;
	}

	/**
	 * @param colliNr
	 *            the colliNr to set
	 */
	public void setColliNr(String colliNr) {
		this.colliNr = colliNr;
	}

	/**
	 * @return the paketPackingNr
	 */
	public String getPaketPackingNr() {
		return paketPackingNr;
	}

	/**
	 * @param paketPackingNr
	 *            the paketPackingNr to set
	 */
	public void setPaketPackingNr(String paketPackingNr) {
		this.paketPackingNr = paketPackingNr;
	}

	/**
	 * @return the orderType
	 */
	public String getOrderType() {
		return orderType;
	}

	/**
	 * @param orderType
	 *            the orderType to set
	 */
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	/**
	 * @return the cashOnDeliveryAmt
	 */
	public String getCashOnDeliveryAmt() {
		return cashOnDeliveryAmt;
	}

	/**
	 * @param cashOnDeliveryAmt
	 *            the cashOnDeliveryAmt to set
	 */
	public void setCashOnDeliveryAmt(String cashOnDeliveryAmt) {
		this.cashOnDeliveryAmt = cashOnDeliveryAmt;
	}

	/**
	 * @return the shipmentType
	 */
	public String getShipmentType() {
		return shipmentType;
	}

	/**
	 * @param shipmentType
	 *            the shipmentType to set
	 */
	public void setShipmentType(String shipmentType) {
		this.shipmentType = shipmentType;
	}

	/**
	 * @return the invoiceDate
	 */
	public String getInvoiceDate() {
		return invoiceDate;
	}

	/**
	 * @param invoiceDate
	 *            the invoiceDate to set
	 */
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	/**
	 * @return the rechnungNr
	 */
	public String getRechnungNr() {
		return rechnungNr;
	}

	/**
	 * @param rechnungNr
	 *            the rechnungNr to set
	 */
	public void setRechnungNr(String rechnungNr) {
		this.rechnungNr = rechnungNr;
	}

	/**
	 * @return the greuenerPunktKz
	 */
	public String getGreuenerPunktKz() {
		return greuenerPunktKz;
	}

	/**
	 * @param greuenerPunktKz
	 *            the greuenerPunktKz to set
	 */
	public void setGreuenerPunktKz(String greuenerPunktKz) {
		this.greuenerPunktKz = greuenerPunktKz;
	}

	/**
	 * @return the retSchlusselBST
	 */
	public String getRetSchlusselBST() {
		return retSchlusselBST;
	}

	/**
	 * @param retSchlusselBST
	 *            the retSchlusselBST to set
	 */
	public void setRetSchlusselBST(String retSchlusselBST) {
		this.retSchlusselBST = retSchlusselBST;
	}

	/**
	 * @return the postleitCode
	 */
	public String getPostleitCode() {
		return postleitCode;
	}

	/**
	 * @param postleitCode
	 *            the postleitCode to set
	 */
	public void setPostleitCode(String postleitCode) {
		this.postleitCode = postleitCode;
	}

	/**
	 * @return the orderStatus
	 */
	public int getOrderStatus() {
		return orderStatus;
	}

	/**
	 * @param orderStatus
	 *            the orderStatus to set
	 */
	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}

	/**
	 * @return
	 */
	public String getOrderDate() {
		return orderDate;
	}

	/**
	 * @param orderDate
	 */
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * @return
	 */
	public String getSupplier() {
		return supplier;
	}

	/**
	 * @param supplier
	 */
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	/**
	 * @return
	 */
	public InvoicedCustomer getInvoicedCustomer() {
		return invoicedCustomer;
	}

	/**
	 * @param invoicedCustomer
	 */
	public void setInvoicedCustomer(InvoicedCustomer invoicedCustomer) {
		this.invoicedCustomer = invoicedCustomer;
	}

	/**
	 * @return
	 */
	public long getEntryNo() {
		return entryNo;
	}

	/**
	 * @param entryNo
	 */
	public void setEntryNo(long entryNo) {
		this.entryNo = entryNo;
	}

	/**
	 * @return
	 */
	public String getArticleNo() {
		return articleNo;
	}

	/**
	 * @param articleNo
	 */
	public void setArticleNo(String articleNo) {
		this.articleNo = articleNo;
	}

	/**
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return
	 */
	public String getOrderNo() {
		return orderNo;
	}

	/**
	 * @param orderNo
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	/**
	 * @return
	 */
	public String getDeliveryZipCode() {
		return deliveryZipCode;
	}

	/**
	 * @param deliveryZipCode
	 */
	public void setDeliveryZipCode(String deliveryZipCode) {
		this.deliveryZipCode = deliveryZipCode;
	}

	/**
	 * @return
	 */
	public Recipient getRecipient() {
		return recipient;
	}

	/**
	 * @param recipient
	 */
	public void setRecipient(Recipient recipient) {
		this.recipient = recipient;
	}

	/**
	 * @return
	 */
	public String getMeterwareKzInfo() {
		return meterwareKzInfo;
	}

	/**
	 * @param meterwareKzInfo
	 */
	public void setMeterwareKzInfo(String meterwareKzInfo) {
		this.meterwareKzInfo = meterwareKzInfo;
	}

	/**
	 * @return
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @param size
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * @return
	 */
	public String getInternalArticleNo() {
		return internalArticleNo;
	}

	/**
	 * @param internalArticleNo
	 */
	public void setInternalArticleNo(String internalArticleNo) {
		this.internalArticleNo = internalArticleNo;
	}

	/**
	 * @return
	 */
	public String getInternalSize() {
		return internalSize;
	}

	/**
	 * @param internalSize
	 */
	public void setInternalSize(String internalSize) {
		this.internalSize = internalSize;
	}

	/**
	 * @return
	 */
	public String getInternalDescription() {
		return internalDescription;
	}

	/**
	 * @param internalDescription
	 */
	public void setInternalDescription(String internalDescription) {
		this.internalDescription = internalDescription;
	}

	public StockHoldingCompany getStockHoldingCompany() {
		return stockHoldingCompany;
	}

	public void setStockHoldingCompany(StockHoldingCompany stockHoldingCompany) {
		this.stockHoldingCompany = stockHoldingCompany;
	}

	public long getAutoKey() {
		return autoKey;
	}

	public void setAutoKey(Long autoKey) {
		this.autoKey = autoKey;
	}

	public String getFormattedAutoKey() {
		return "I" + this.autoKey;
	}

	public int getStatusKz() {
		return statusKz;
	}

	public void setStatusKz(int statusKz) {
		this.statusKz = statusKz;
	}

	public CustomerCompany getCustomerCompany() {
		return customerCompany;
	}

	public void setCustomerCompany(CustomerCompany customerCompany) {
		this.customerCompany = customerCompany;
	}

	public String getCashOnDelivery() {
		return cashOnDelivery;
	}

	public void setCashOnDelivery(String cashOnDelivery) {
		this.cashOnDelivery = cashOnDelivery;
	}

	public PriceInfo getPriceInfo() {
		return priceInfo;
	}

	public void setPriceInfo(PriceInfo priceInfo) {
		this.priceInfo = priceInfo;
	}

	public PackingUnitInfo getPackingUnitInfo() {
		return packingUnitInfo;
	}

	public void setPackingUnitInfo(PackingUnitInfo packingUnitInfo) {
		this.packingUnitInfo = packingUnitInfo;
	}

	public PhysicalAttributes getPhysicalAttributes() {
		return physicalAttributes;
	}

	public void setPhysicalAttributes(PhysicalAttributes physicalAttributes) {
		this.physicalAttributes = physicalAttributes;
	}

	public int getTotalNoOfPackingUnits() {
		return totalNoOfPackingUnits;
	}

	public void setTotalNoOfPackingUnits(int totalNoOfPackingUnits) {
		this.totalNoOfPackingUnits = totalNoOfPackingUnits;
	}

	public List<PackingUnitModel> getPackingunits() {
		return packingunits;
	}

	public void addPackingunit(PackingUnitModel packingunit) {
		if (this.packingunits == null) {
			this.packingunits = new ArrayList<>();
		}
		this.packingunits.add(packingunit);
	}

	public void setPackingunits(List<PackingUnitModel> packingunits) {
		this.packingunits = packingunits;
	}

	public String getPacketWeight() {
		return packetWeight;
	}

	public void setPacketWeight(String packetWeight) {
		this.packetWeight = packetWeight;
	}

	public String getIndustryDay() {
		return industryDay;
	}

	public void setIndustryDay(String industryDay) {
		this.industryDay = industryDay;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public AdditionalInfo getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(AdditionalInfo additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public TransportInfo getTransportInfo() {
		return transportInfo;
	}

	public void setTransportInfo(TransportInfo transportInfo) {
		this.transportInfo = transportInfo;
	}

	public PrintInfo getPrintInfo() {
		return printInfo;
	}

	public void setPrintInfo(PrintInfo printInfo) {
		this.printInfo = printInfo;
	}

	public DeliveryInfo getDeliveryInfo() {
		return deliveryInfo;
	}

	public void setDeliveryInfo(DeliveryInfo deliveryInfo) {
		this.deliveryInfo = deliveryInfo;
	}

	public String getReturnKeyCounter() {
		return returnKeyCounter;
	}

	public void setReturnKeyCounter(String returnKeyCounter) {
		this.returnKeyCounter = returnKeyCounter;
	}

	public String getRunningDay() {
		return runningDay;
	}

	public void setRunningDay(String runningDay) {
		this.runningDay = runningDay;
	}

	public String getCancellationDate() {
		return cancellationDate;
	}

	public void setCancellationDate(String cancellationDate) {
		this.cancellationDate = cancellationDate;
	}

	public String getArticlePositionTA() {
		return articlePositionTA;
	}

	public void setArticlePositionTA(String articlePositionTA) {
		this.articlePositionTA = articlePositionTA;
	}

	public String getUpsId() {
		return upsId;
	}

	public void setUpsId(String upsId) {
		this.upsId = upsId;
	}

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public String getOriginalInvoiceDate() {
		return originalInvoiceDate;
	}

	public void setOriginalInvoiceDate(String originalInvoiceDate) {
		this.originalInvoiceDate = originalInvoiceDate;
	}

	public String getPaketNr() {
		return paketNr;
	}

	public void setPaketNr(String paketNr) {
		this.paketNr = paketNr;
	}

	public String getPositionTA() {
		return positionTA;
	}

	public void setPositionTA(String positionTA) {
		this.positionTA = positionTA;
	}

	public String getPositionVA() {
		return positionVA;
	}

	public void setPositionVA(String positionVA) {
		this.positionVA = positionVA;
	}

	public String getParcelBunchingCode() {
		return parcelBunchingCode;
	}

	public void setParcelBunchingCode(String parcelBunchingCode) {
		this.parcelBunchingCode = parcelBunchingCode;
	}

	public String getMaxDate() {
		return maxDate;
	}

	public void setMaxDate(String maxDate) {
		this.maxDate = maxDate;
	}

	public String getArticlePrintDescription() {
		return articlePrintDescription;
	}

	public void setArticlePrintDescription(String articlePrintDescription) {
		this.articlePrintDescription = articlePrintDescription;
	}

	public String getShippingKey() {
		return shippingKey;
	}

	public void setShippingKey(String shippingKey) {
		this.shippingKey = shippingKey;
	}

	public String getSendungsNr() {
		return sendungsNr;
	}

	public void setSendungsNr(String sendungsNr) {
		this.sendungsNr = sendungsNr;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getNoaPurchaseOrderNo() {
		return noaPurchaseOrderNo;
	}

	public void setNoaPurchaseOrderNo(String noaPurchaseOrderNo) {
		this.noaPurchaseOrderNo = noaPurchaseOrderNo;
	}

	public int getPackageCounter() {
		return packageCounter;
	}

	public void setPackageCounter(int packageCounter) {
		this.packageCounter = packageCounter;
	}

	public int getOriginalMeterwareKzInfo() {
		return originalMeterwareKzInfo;
	}

	public void setOriginalMeterwareKzInfo(int originalMeterwareKzInfo) {
		this.originalMeterwareKzInfo = originalMeterwareKzInfo;
	}

	public int getHermesSchwinge() {
		return hermesSchwinge;
	}

	public void setHermesSchwinge(int hermesSchwinge) {
		this.hermesSchwinge = hermesSchwinge;
	}

	public String getUkPrice() {
		return ukPrice;
	}

	public void setUkPrice(String ukPrice) {
		this.ukPrice = ukPrice;
	}

	public String getHandlingCost() {
		return handlingCost;
	}

	public void setHandlingCost(String handlingCost) {
		this.handlingCost = handlingCost;
	}

	public String getCrsItemNumber() {
		return crsItemNumber;
	}

	public void setCrsItemNumber(String crsItemNumber) {
		this.crsItemNumber = crsItemNumber;
	}

	public String getBoxType() {
		return boxType;
	}

	public void setBoxType(String boxType) {
		this.boxType = boxType;
	}

	public String getReturnsId() {
		return returnsId;
	}

	public void setReturnsId(String returnsId) {
		this.returnsId = returnsId;
	}

	public String getReturnsKeyCode() {
		return returnsKeyCode;
	}

	public void setReturnsKeyCode(String returnsKeyCode) {
		this.returnsKeyCode = returnsKeyCode;
	}

	public String getBillingKz() {
		return billingKz;
	}

	public void setBillingKz(String billingKz) {
		this.billingKz = billingKz;
	}

	public String getSecretCargoPostAl() {
		return secretCargoPostAl;
	}

	public void setSecretCargoPostAl(String secretCargoPostAl) {
		this.secretCargoPostAl = secretCargoPostAl;
	}

	public String getInvNumber() {
		return invNumber;
	}

	public void setInvNumber(String invNumber) {
		this.invNumber = invNumber;
	}

	public String getInvText() {
		return invText;
	}

	public void setInvText(String invText) {
		this.invText = invText;
	}
	
    public String getElsNo() {
      return elsNo;
    }
  
    public void setElsNo(String elsNo) {
      this.elsNo = elsNo;
    }
    
    public String getDeliveryDate() {
      return deliveryDate;
    }
  
    public void setDeliveryDate(String deliveryDate) {
      this.deliveryDate = deliveryDate;
    }
    
    public String getNewELSNo() {
      return newELSNo;
    }

    public void setNewELSNo(String newELSNo) {
      this.newELSNo = newELSNo;
    }
    
    public String getShipmentDate() {
      return shipmentDate;
    }

    public void setShipmentDate(String shipmentDate) {
      this.shipmentDate = shipmentDate;
    }

    public String getSpedition() {
      return spedition;
    }

    public void setSpedition(String spedition) {
      this.spedition = spedition;
    }

  @Override
	public boolean equals(Object obj) {
		if (obj instanceof OrderItemDetails && this.size != null) {
			if (((OrderItemDetails) obj).getSize() != null
					&& articleNo
							.equals(((OrderItemDetails) obj).getArticleNo())
					&& size.equals(((OrderItemDetails) obj).getSize())) {
				return true;
			}
		}
		return false;
	}

	
	/*public int hashCode() {
		HashCodeBuilder hashcodeBuilder = new HashCodeBuilder();
		hashcodeBuilder.append(this.articleNo);
		hashcodeBuilder.append(this.size);
		return hashcodeBuilder.toHashCode();
	}*/
	/*@Override
	public Object clone() {
		OrderItemDetails orderItem = null;
		try {
			orderItem = (OrderItemDetails) super.clone();
		} catch (CloneNotSupportedException e) {
			return orderItem;
		}
		orderItem.supplier = (Supplier) supplier.clone();
		orderItem.invoicedCustomer = (InvoicedCustomer) invoicedCustomer
				.clone();
		orderItem.recipient = (Recipient) recipient.clone();
		orderItem.stockHoldingCompany = (StockHoldingCompany) stockHoldingCompany
				.clone();
		orderItem.customerCompany = (CustomerCompany) customerCompany.clone();
		orderItem.priceInfo = (PriceInfo) priceInfo.clone();
		orderItem.packingUnitInfo = (PackingUnitInfo) packingUnitInfo.clone();
		orderItem.physicalAttributes = (PhysicalAttributes) physicalAttributes
				.clone();
		orderItem.additionalInfo = (AdditionalInfo) additionalInfo.clone();
		orderItem.transportInfo = (TransportInfo) transportInfo.clone();
		orderItem.printInfo = (PrintInfo) printInfo.clone();
		orderItem.deliveryInfo = (DeliveryInfo) deliveryInfo.clone();
		return orderItem;
	}*/

	public Integer getIncidentStatus() {
		return incidentStatus;
	}

	public void setIncidentStatus(Integer incidentStatus) {
		this.incidentStatus = incidentStatus;
	}

}

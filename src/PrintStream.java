
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.pdflib.PDFlibException;
import com.pdflib.pdflib;
import com.vaadin.server.StreamResource.StreamSource;

//import de.software_partner_obermain.tools.pdf_writer.basics.StaticBaseEncapsulation;

public class PrintStream implements StreamSource {

	private static final double VALUE_CORRECTION_POSITION_X = 10;
	private static final int COL_CORRECTION_POSITION_X = 20;

	private static final int MAX_FORM_ROWS = 2;
	private static final float LINE_WIDTH = 0.4f;

	private static final String LEFT_ALIGNEMNT = "left";
	private static final String CENTER_ALIGNEMNT = "center";
	private static final double HEADER_FONT_SIZE_LARGER = 14;
	public static final String ZEROVAR1 = "0.0";
	public static final String ZEROVAR2 = "0";
	public static final String ZEROVAR3 = "00";

	private static final double DAILY_ORDER_TITLE1_POSITION_X = 140.2857;
	private static final double DAILY_ORDER_TITLE1_POSITION_Y = -23;
	private static final double DAILY_ORDER_TITLE1_BREADTH = 187.7143f;
	private static final double DAILY_ORDER_TITLE1_HEIGHT = 14;
	private static final double DAILY_ORDER_TITLE2_POSITION_X = 140.2857;
	private static final double DAILY_ORDER_TITLE2_POSITION_Y = -45;
	private static final double INDUSTRIETAG_BREADTH = 188;
	private static final double INDUSTRIETAG_HEIGHT = 14;
	private static final double WAREHOUSE_BREADTH = 166;
	private static final double WAREHOUSE_HEIGHT = 6;

	private static final double GRAPHIC_OUTPUT_INITIAL_X = 0;
	private static final double GRAPHIC_OUTPUT_INITIAL_Y = 0;
	private static final double HEADER_RECT_POSITION_X = 0;
	private static final double HEADER_RECT_WIDTH = 450;
	private static final double HEADER_RECT_POSITION_Y_N19 = -19;
	private static final double HEADER_RECT_HEIGHT_19 = 19;

	private static final double COLUMN_HEADER_Y_N19 = -19;
	private static final double COLUMN_DATA_Y_N18 = -18;

	private static final double COLUMN_DATA_Y_0 = 0;
	private static final double COL_HEADER_CUST_COMP_NO_POSITION_X = 0;
	private static final double COL_HEADER_CUST_COMP_NO_BREADTH = 19;
	private static final double COL_HEADER_CUST_COMP_NO_HEIGHT = 6;
	private static final double COL_HEADER_ENTRY_NO_POSITION_X = 130;
	private static final double COL_HEADER_POS_BREADTH = 19;
	private static final double COL_HEADER_POS_HEIGHT = 6;
	private static final double COL_HEADER_CUST_NO_BREADTH = 73;
	private static final double COL_HEADER_CUST_NO_HEIGHT = 6;
	private static final double COL_HEADER_ENTRY_NO_BREADTH = 53;
	private static final double COL_HEADER_ENTRY_NO_HEIGHT = 6;
	private static final double COL_HEADER_ARTICLE_NO_POSITION_X = 184 + (double) 10;
	private static final double COL_HEADER_ARTICLE_NO_BREADTH = 45;
	private static final double COL_HEADER_ARTICLE_NO_HEIGHT = 6;
	private static final double COL_HEADER_UNIT_BREADTH = 31.2857f;
	private static final double COL_HEADER_UNIT_HEIGHT = 6;
	private static final double COL_HEADER_LENGTH_BREADTH = 31.2857f;
	private static final double COL_HEADER_LENGTH_HEIGHT = 6;
	private static final double COL_HEADER_BREADTH_BREADTH = 31.2857f;
	private static final double COL_HEADER_BREADTH_HEIGHT = 6;
	private static final double COL_HEADER_HEIGHT_BREADTH = 31.2857f;
	private static final double COL_HEADER_HEIGHT_HEIGHT = 6;
	private static final double COL_HEADER_MENGEQMLFDMETER_BREADTH = 31;
	private static final double COL_HEADER_MENGEQMLFDMETER_HEIGHT = 6;
	private static final double COLUMN_HEADER_X_19 = 19;
	private static final double COLUMN_HEADER_X_634 = 634;
	private static final double COLUMN_HEADER_X_800 = 800;

	private static final double COLUMN_FONT_SIZE_SMALL = 6;
	private static final double COLUMN_FONT_SIZE_SMALL_PLUS = 7;
	private static final double COLUMN_FONT_SIZE_MEDIUM = 8;
	private static final double COLUMN_FONT_SIZE_LARGE = 10;

	private static final double TABLE_HEADER_FONT_SIZE = 6;
	private static final double TABLE_HEADER_POSISTION_Y = -164;
	private static final double TABLE_HEADER_POSISTION_Y_N9 = -162;
	private static final double TABLE_HEADER_POSISTION_Y_N15 = -169;
	private static final int TABLE_COLUMN_POSITION_Y = -14;
	private static final double TABLE_COLUMN_HEIGHT = 10;
	private static final float TABLE_FONT_SIZE_MEDIUM = 8;

	private static final double COL_CUST_COMP_ID_POSITION_X = 0;
	private static final double COL_CUST_COMP_ID_BREADTH = 14;
	private static final double COL_POS_POSITION_X = 19;
	private static final double COL_POS_BREADTH = 14;
	private static final double COL_CUST_NO_POSITION_X = 38;
	private static final double COL_CUST_NO_BREADTH = 51;
	private static final double COL_CUST_SUB_NO_POSITION_X = 94;
	private static final double COL_CUST_SUB_NO_BREADTH = 17;
	private static final double COL_NONWHCOMMKEY_POSITION_X = 111;
	private static final double COL_NONWHCOMMKEY_BREADTH = 53;
	private static final double COL_ARTICLE_NO_POSITION_X = 164 + VALUE_CORRECTION_POSITION_X;
	private static final double COL_ARTICLE_NO_BREADTH = 45;
	private static final double COL_MENGE_POSITION_X = 209 + VALUE_CORRECTION_POSITION_X;
	private static final double COL_MENGE_BREADTH = 28;
	private static final double COL_LENGTH_POSITION_X = 240.2857f + VALUE_CORRECTION_POSITION_X;
	private static final double COL_LENGTH_BREADTH = 28;
	private static final double COL_BREADTH_POSITION_X = 271.5714f + VALUE_CORRECTION_POSITION_X;
	private static final double COL_BREADTH_BREADTH = 28;
	private static final double COL_HEIGHT_POSITION_X = 302.8571f + VALUE_CORRECTION_POSITION_X;
	private static final double COL_HEIGHT_BREADTH = 28;
	private static final double COL_MENGEQMLFDMETER_POSITION_X = 334.1428f + VALUE_CORRECTION_POSITION_X;
	private static final double COL_MENGEQMLFDMETER_BREADTH = 28;
	private static final double COL_PACKINGUNITS_POSITION_X = 365.4285f + VALUE_CORRECTION_POSITION_X;
	private static final double COL_PACKINGUNITS_BREADTH = 28;
	private static final double COL_GROESSE_POSITION_X = 396.7142f + VALUE_CORRECTION_POSITION_X;
	private static final double COL_GROESSE_BREADTH = 28;
	private static final double COL_RECIPIENT_NAME_POSITION_X = 433 + VALUE_CORRECTION_POSITION_X
			+ VALUE_CORRECTION_POSITION_X;
	private static final double COL_RECIPIENT_NAME_BREADTH = 135;
	private static final double COL_LOCATION_CODE_POSITION_X = 568;
	private static final double COL_LOCATION_CODE_BREADTH = 25;
	private static final double COL_DELIVERYWEEK_POSITION_X = 598;
	private static final double COL_DELIVERYWEEK_BREADTH = 13;
	private static final double COL_PAYMENT_METHOD_POSITION_X = 616;
	private static final double COL_PAYMENT_METHOD_BREADTH = 18;
	private static final double COL_ORDER_NO_POSITION_X = 111;
	private static final double COL_ORDER_NO_BREADTH = 53;
	private static final double COL_T4GRO_POSITION_X = 396.7142f;
	private static final double COL_T4GRO_BREADTH60 = 60;
	private static final double COL_T4GRO_BREADTH30 = 30;
	private static final int COL_T4GRO_MAX_LENGTH = 5;
	private static final double COL_T4BEZ_POSITION_X = 242;
	private static final double COL_T4BEZ_BREADTH = 155;
	private static final double COL_T4ART_POSITION_X = 164;
	private static final double COL_T4ART_BREADTH = 45;
	private static final double COL_T4ART_BREADTH80 = 80;

	private static final double FOOTER_LABEL_TOTAL_AMOUNT_POSITION_X = 5;
	private static final double FOOTER_LABEL_TOTAL_AMOUNT_POSITION_Y = -10;
	private static final double FOOTER_FONT_SMALL = 6;
	private static final double FOOTER_FONT_SMALL_PLUS = 7;
	private static final double FOOTER_FONT_MEDIUM = 8;
	private static final double FOOTER_FONT_LARGE = 10;
	private static final double FOOTER_LABEL_BILLING_POSITION_X = 5;
	private static final double FOOTER_LABEL_BILLING_POSITION_Y = -52;
	private static final double FOOTER_LABEL_SUPPLIER_POSITION_X = 214;
	private static final double FOOTER_LABEL_SUPPLIER_POSITION_Y = -14;
	private static final double FOOTER_LABEL_SHIPPER_POSITION_X = 378.25f + COL_CORRECTION_POSITION_X;
	private static final double FOOTER_LABEL_SHIPPER_POSITION_Y = -14;
	private static final double FOOTER_LABEL_FILE_POSITION_X = 603;
	private static final double FOOTER_LABEL_FILE_POSITION_Y = -14;
	private static final double FOOTER_LABEL_DELIVERY_PLACE_POSITION_X = 490.625f + COL_CORRECTION_POSITION_X;
	private static final double FOOTER_LABEL_DELIVERY_PLACE_POSITION_X_2 = 695.0f;
	private static final double FOOTER_LABEL_DELIVERY_PLACE_POSITION_Y = -14;
	private static final double FOOTER_LABEL_STAMP_POSITION_X = 209 + VALUE_CORRECTION_POSITION_X;
	private static final int FOOTER_LABEL_STAMP_POSITION_Y = -75;
	private static final double FOOTER_LABEL_STAMP_BREADTH = 164.25f;
	private static final double FOOTER_LABEL_STAMP_HEIGHT = 6;
	private static final double FOOTER_LABEL_DATE_POSITION_X = 378.25f + COL_CORRECTION_POSITION_X;
	private static final double FOOTER_LABEL_DATE_POSITION_Y = -75;
	private static final double FOOTER_LABEL_SIGNATURE_POSITION_X1 = 368.25f;
	private static final double FOOTER_LABEL_SIGNATURE_POSITION_X2 = 480.625f;
	private static final int FOOTER_LABEL_SIGNATURE_POSITION_Y = -75;
	private static final double FOOTER_LABEL_SIGNATURE_BREADTH = 113;
	private static final double FOOTER_LABEL_SIGNATURE_HEIGHT = 6;
	private static final double FOOTER_LABEL_ACQUIRED_GOODS_POSITION_X1 = 378 + (double) COL_CORRECTION_POSITION_X;
	private static final double FOOTER_LABEL_ACQUIRED_GOODS_POSITION_Y = -33;
	private static final double FOOTER_LABEL_ACQUIRED_GOODS_POSITION_X2 = 490.625f + COL_CORRECTION_POSITION_X;

	private static final double FOOTER_FONT_LARGER = 11;
	private static final int FOOTER_TOTAL_AMOUNT_POSITION_X = 209 + COL_CORRECTION_POSITION_X;
	private static final int FOOTER_POSITION_Y = -354;
	private static final double FOOTER_POSITION_BREADTH = 31.2857f;
	private static final double FOOTER_POSITION_HEIGHT = 8;
	private static final double FOOTER_TOTAL_LENGTH_POSITION_X = 240.2857f + COL_CORRECTION_POSITION_X;
	private static final double FOOTER_TOTAL_BREADTH_POSITION_X = 271.5714f + COL_CORRECTION_POSITION_X;
	private static final double FOOTER_TOTAL_BHEIGHT_POSITION_X = 302.8571f + COL_CORRECTION_POSITION_X;
	private static final double FOOTER_TOTAL_QM_POSITION_X = 334.1428f + COL_CORRECTION_POSITION_X;
	private static final double FOOTER_DATA_X_0 = 0;
	private static final double FOOTER_DATA_Y_0 = 0;
	private static final double FOOTER_DATA_X_800 = 800;
	private static final double FOOTER_DATA_X_209 = 209 + (double) COL_CORRECTION_POSITION_X;
	private static final double FOOTER_DATA_X_240F = 240.2857f + COL_CORRECTION_POSITION_X;
	private static final double FOOTER_DATA_X_271F = 271.5714f + COL_CORRECTION_POSITION_X;
	private static final double FOOTER_DATA_X_302F = 302.8571f + COL_CORRECTION_POSITION_X;
	private static final double FOOTER_DATA_X_334F = 334.1428f + COL_CORRECTION_POSITION_X;
	private static final double FOOTER_DATA_X_365F = 365.4285f + COL_CORRECTION_POSITION_X;

	private static final int LABEL_TYPE_1 = 1;
	private static final int LABEL_TYPE_2 = 2;
	private static final int LABEL_TYPE_3 = 3;
	private static final int LABEL_TYPE_4 = 4;
	private static final int LABEL_TYPE_5 = 5;
	private static final int LABEL_TYPE_6 = 6;
	private static final int LABEL_TYPE_7 = 7;

	private static final int MAX_FORM_DATA_ROWS = 12;
	private static final int MAX_FORM_DATA_ROWS_SEPARATING_LABEL = 17;

	private static final double COLUMN_HEADER_X_240 = 240.2857f + COL_CORRECTION_POSITION_X;
	private static final double COLUMN_HEADER_X_271 = 271.5714f + COL_CORRECTION_POSITION_X;
	private static final double COLUMN_HEADER_X_302 = 302.8571f + COL_CORRECTION_POSITION_X;
	private static final double COLUMN_HEADER_X_334 = 334.1428f + COL_CORRECTION_POSITION_X;
	private static final double COLUMN_HEADER_X_365 = 365.4285f + COL_CORRECTION_POSITION_X;
	private static final double COLUMN_HEADER_X_396 = 396.7142f + COL_CORRECTION_POSITION_X;
	private static final double COLUMN_HEADER_X_428 = 428 + (double) COL_CORRECTION_POSITION_X;
	private static final double GRAPHIC_OUTPUT_INITIAL_Y_N18 = -18;
	private static final double FOOTER_LABEL_DATUM_POSITION_X_490 = 490.625F;
	private static final double FOOTER_LABEL_DATUM_POSITION_Y_N75 = -75;
	private static final double COLUMN_HEADER_Y = 0;
	private static final double COLUMN_HEADER_Y_N79 = -79;
	private static final double COLUMN_HEADER_Y_N42 = -42;
	private static final double HEADER_RECT_POSITION_Y_N79 = -79;
	private static final double HEADER_RECT_HEIGHT_79 = 79;
	private static final double COLUMN_FOOTER_X = 0;
	private static final double COLUMN_FOOTER_X_209 = 209;
	private static final double COLUMN_FOOTER_X_373 = 373.25f + COL_CORRECTION_POSITION_X;
	private static final double COLUMN_FOOTER_X_485 = 485_625f + COL_CORRECTION_POSITION_X;
	private static final String DATE_FORMAT = "dd.MM.yyyy";
	private static final String DATE_FORMAT_V2 = "yy-MM-dd HH:mm:ss";
	private static final String DATE_FORMAT_V3 = "EE MMM dd HH:mm:ss z yyyy";
	private static final double COLUMN_FOOTER_X_598 = 598;
	private static final double COLUMN_FOOTER_X_690 = 690;

	private String currentGroup = "";
	private OrderItemDetails line = null;
	private String newGroup2 = "";
	private boolean pagebreak = false;
	private boolean isFinal = false;

	private int currentPage = 0;
	private int totalQuality = 0; // Final/Total Amount
	private int totalLength = 0;
	private int totalBreadth = 0;
	private int totalHeight = 0;
	private double totalQm = 0;
	private double qm = 0;
	private float endEKPreis = 0;
	private int sortNo;
	private int group;
	private String printSelection = "";
	private int lfdPage = 0;

	private int hermesSchwinge = -1;
	private boolean drawHermesSchwinge = false;
	private boolean nachTransportSystem = false;
	private boolean blankPageBetweenGroup = false;
	private int pageCount = 1;

	private List<OrderItemDetails> printDataList;
	private int index = -1;

	private static final String TAT_TKL = "TAT_TKL";

	private static final String TAT_TAL = "TAT_TAL";
	private int count = 0;
	private String lkwNr;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	List<OrderItemDetails> printOrderItemList;
	String warehouse;

	public PrintStream(List<OrderItemDetails> printOrderItemList, String warehouse, String lkwnr) {
		super();
		this.printOrderItemList = printOrderItemList;
		this.warehouse = warehouse;
		this.lkwNr = lkwnr;
	}

	public PrintStream() {
		// TODO Auto-generated constructor stub
	}

	static byte[] buffer = null;

	@Override
	public InputStream getStream() {
		 byte[] buffer = null;
		currentPage = 0;
		try {
			pdflib pdf = new pdflib();
			StaticBaseEncapsulation.init(pdf, "", "PDFlibServlet.java", "JÃ¶rg Schuberth, Gerrit Ludwig",
					"TagesauftrÃ¤ge");

			line = getNextLine();

			if (line != null) {

				boolean nachTransportSystem = false;
				Object druVar = false;
				/*
				 * if ( line.getPrintInfo().getPrintTANo().equals(druVar )) { if
				 * (nachTransportSystem ) { currentGroup = new StringBuilder()
				 * .append(line.getStockHoldingCompany() .getStockHoldingCompanyId())
				 * .append(line.getInvoiceDate()) .append((
				 * line.getSupplier()).getSupplierNumber()) .append((line.getSupplier())
				 * .getSupplierSubNumbers()) .append(line.getAdditionalInfo()
				 * .getVersandArtDecode()).toString() .trim(); } else {
				 * 
				 * currentGroup = new StringBuilder() .append(line.getStockHoldingCompany()
				 * .getStockHoldingCompanyId()) .append(line.getInvoiceDate()) .append("10920")
				 * .append("190").toString() .trim(); } }
				 */

				/* Generation of the pages */
				do {
					if (nachTransportSystem) {
						if ("1".equals(line.getAdditionalInfo().getVersandArtDecode())) {
							// drawHermesSchwinge = true;
						} else {
							// drawHermesSchwinge = false;
						}
					}
					pdf = printPage(pdf);
				} while (line != null);

				if (nachTransportSystem) {
					// logos.closeLogos();
				}
				StaticBaseEncapsulation.closeDocument(pdf);
				 buffer = pdf.get_buffer();
			}

		} catch (PDFlibException | IOException e) {
			e.printStackTrace();
		}

		if (buffer != null) {
			return new ByteArrayInputStream(buffer);
		} 
		else
		return null;
	}

	public OrderItemDetails getNextLine() {
		index = index + 1;
		if (this.index < printOrderItemList.size()) {
			line = printOrderItemList.get(index);
			return line;
		}
		return null;
	}

	private pdflib printPage(pdflib pdf) throws IOException, PDFlibException {
		NumberFormat nf = NumberFormat.getInstance();

		nf.setMinimumFractionDigits(2);
		nf.setMaximumFractionDigits(2);

		DecimalFormat decimalFormat = new DecimalFormat("#####0.00");

		pagebreak = false;

		final float pagewidth = 500; // Querformat A4
		final float pageheight = 595;
		final float originx = 30;
		final float originy = 565;

		// Definition of fonts
		int fontHelv = StaticBaseEncapsulation.loadFont(pdf, "Helvetica");
		int fontHelvBold = StaticBaseEncapsulation.loadFont(pdf, "Helvetica-Bold");

		StaticBaseEncapsulation.beginPage(pdf, pagewidth, pageheight);
		pdf.setlinewidth(LINE_WIDTH);
		pdf.translate(originx, originy);

		/***************************************************************************
		 * Header area of PDF.
		 **************************************************************************/
		lfdPage++;
		pdf.setfont(fontHelvBold, 8);
		///////////////////////////////////////////////////////////////
		StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 10, -97, WAREHOUSE_BREADTH, WAREHOUSE_HEIGHT, "LKZ:",
				LEFT_ALIGNEMNT);

		StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 40, -97, WAREHOUSE_BREADTH, WAREHOUSE_HEIGHT,
				"10920", LEFT_ALIGNEMNT);

		StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 10, -120, WAREHOUSE_BREADTH, WAREHOUSE_HEIGHT,
				"Lieferant:", LEFT_ALIGNEMNT);

		StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 60, -120, WAREHOUSE_BREADTH, WAREHOUSE_HEIGHT,
				"nayan", LEFT_ALIGNEMNT);

		StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 10, -143, WAREHOUSE_BREADTH, WAREHOUSE_HEIGHT,
				"Spedition:", LEFT_ALIGNEMNT);

		StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 60, -143, WAREHOUSE_BREADTH, WAREHOUSE_HEIGHT,
				line.getSpedition(), LEFT_ALIGNEMNT);

		/////////////////////////////////////////////////////////
		StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 160, -97, WAREHOUSE_BREADTH, WAREHOUSE_HEIGHT,
				"Lieferschein-Nr.:", LEFT_ALIGNEMNT);

		StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 230, -97, WAREHOUSE_BREADTH, WAREHOUSE_HEIGHT,
				line.getElsNo(), LEFT_ALIGNEMNT);

		// LadehilfsmittelCode in header
		/*
		 * StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 160, -143,
		 * WAREHOUSE_BREADTH, WAREHOUSE_HEIGHT, "Ladehilfsmittel:", LEFT_ALIGNEMNT);
		 */

		StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 230, -143, WAREHOUSE_BREADTH, WAREHOUSE_HEIGHT, "",
				LEFT_ALIGNEMNT);
		///////////////////////////////////////////////////////

		////////////////////////////////////////////////////////
		StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 330, -97, WAREHOUSE_BREADTH, WAREHOUSE_HEIGHT,
				"Erstelldatum:", LEFT_ALIGNEMNT);
		SimpleDateFormat dbDateInputFormat = new SimpleDateFormat(DATE_FORMAT_V2);
		SimpleDateFormat dbDateOutputFormat = new SimpleDateFormat(DATE_FORMAT);
		SimpleDateFormat dbDateInputFormat2 = new SimpleDateFormat(DATE_FORMAT_V3);

		Date currentDate = new Date();
		String formatedcurrentDate;
		try {
			formatedcurrentDate = dbDateOutputFormat.format(dbDateInputFormat2.parse(currentDate.toString()));
		} catch (ParseException e1) {
			formatedcurrentDate = "";
		}
		StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 382, -97, WAREHOUSE_BREADTH, WAREHOUSE_HEIGHT,
				formatedcurrentDate, LEFT_ALIGNEMNT);

		StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 330, -120, WAREHOUSE_BREADTH, WAREHOUSE_HEIGHT,
				"Lieferdatum:", LEFT_ALIGNEMNT);

		String deliveryDate = null;
		try {
			deliveryDate = dbDateOutputFormat.format(dbDateInputFormat2.parse(line.getDeliveryDate()));
		} catch (ParseException e) {
			deliveryDate = "";
		}

		StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 382, -120, WAREHOUSE_BREADTH, WAREHOUSE_HEIGHT,
				deliveryDate, LEFT_ALIGNEMNT);

		StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 330, -143, WAREHOUSE_BREADTH, WAREHOUSE_HEIGHT,
				"LKW-KZ:", LEFT_ALIGNEMNT);

		StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 380, -143, WAREHOUSE_BREADTH, WAREHOUSE_HEIGHT,
				this.lkwNr, LEFT_ALIGNEMNT);
		////////////////////////////////////////////////////////

		if ("Ohrdruf".equals(this.warehouse)) {
			pdf.setfont(fontHelvBold, HEADER_FONT_SIZE_LARGER);
			StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, DAILY_ORDER_TITLE1_POSITION_X,
					DAILY_ORDER_TITLE1_POSITION_Y, DAILY_ORDER_TITLE1_BREADTH, DAILY_ORDER_TITLE1_HEIGHT,
					("Lieferschein für Otto Durchlaufware"), CENTER_ALIGNEMNT);
			StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, DAILY_ORDER_TITLE2_POSITION_X,
					DAILY_ORDER_TITLE2_POSITION_Y, DAILY_ORDER_TITLE1_BREADTH, DAILY_ORDER_TITLE1_HEIGHT,
					"Hermes Fulfilment GmbH", CENTER_ALIGNEMNT);
			// -Industrietag-
			StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, DAILY_ORDER_TITLE1_POSITION_X, -68,
					INDUSTRIETAG_BREADTH, INDUSTRIETAG_HEIGHT, "Hamburgerstr. 1 in 99885 Ohrdruf", CENTER_ALIGNEMNT);

			pdf.moveto(GRAPHIC_OUTPUT_INITIAL_X, GRAPHIC_OUTPUT_INITIAL_Y);

		} else {
			pdf.setfont(fontHelvBold, HEADER_FONT_SIZE_LARGER);
			StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, DAILY_ORDER_TITLE1_POSITION_X,
					DAILY_ORDER_TITLE1_POSITION_Y, DAILY_ORDER_TITLE1_BREADTH, DAILY_ORDER_TITLE1_HEIGHT,
					("Lieferschein für Durchlaufware"), CENTER_ALIGNEMNT);
			StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, DAILY_ORDER_TITLE2_POSITION_X,
					DAILY_ORDER_TITLE2_POSITION_Y, DAILY_ORDER_TITLE1_BREADTH, DAILY_ORDER_TITLE1_HEIGHT,
					"Hermes Fulfilment GmbH", CENTER_ALIGNEMNT);
			// -Industrietag-
			StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, DAILY_ORDER_TITLE1_POSITION_X, -68,
					INDUSTRIETAG_BREADTH, INDUSTRIETAG_HEIGHT, ("Dieselstr.10  in 32584 Löhne"), CENTER_ALIGNEMNT);

			pdf.moveto(GRAPHIC_OUTPUT_INITIAL_X, GRAPHIC_OUTPUT_INITIAL_Y);
		}
		/*
		 * Draw a rectangle at position (x, y) with a width of 800 and a height 60
		 */
		pdf.rect(HEADER_RECT_POSITION_X, -85, HEADER_RECT_WIDTH, 85);

		pdf.rect(HEADER_RECT_POSITION_X, -155, HEADER_RECT_WIDTH, 70);

		pdf.stroke();

		pdf.setfont(fontHelv, 8);

		StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, COL_HEADER_CUST_COMP_NO_POSITION_X,
				TABLE_HEADER_POSISTION_Y, COL_HEADER_CUST_COMP_NO_BREADTH, COL_HEADER_CUST_COMP_NO_HEIGHT, "Lfd.",
				CENTER_ALIGNEMNT);
		StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 31, TABLE_HEADER_POSISTION_Y, COL_HEADER_POS_BREADTH,
				COL_HEADER_POS_HEIGHT, "TA-Datum", CENTER_ALIGNEMNT);
		StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 53, TABLE_HEADER_POSISTION_Y,
				COL_HEADER_CUST_NO_BREADTH, COL_HEADER_CUST_NO_HEIGHT, "Eingabe-Nr.", CENTER_ALIGNEMNT);
		StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, COL_HEADER_ENTRY_NO_POSITION_X - 15,
				TABLE_HEADER_POSISTION_Y, COL_HEADER_ENTRY_NO_BREADTH, COL_HEADER_ENTRY_NO_HEIGHT, "Auftrags-Nr.",
				CENTER_ALIGNEMNT);
		StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, COL_HEADER_ENTRY_NO_POSITION_X - 3,
				TABLE_HEADER_POSISTION_Y_N15 - 3, COL_HEADER_MENGEQMLFDMETER_BREADTH, COL_HEADER_MENGEQMLFDMETER_HEIGHT,
				"Konzern", CENTER_ALIGNEMNT);
		StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, COL_HEADER_ARTICLE_NO_POSITION_X - 20,
				TABLE_HEADER_POSISTION_Y, COL_HEADER_ARTICLE_NO_BREADTH, COL_HEADER_ARTICLE_NO_HEIGHT, "Artikel-Nr.",
				CENTER_ALIGNEMNT);
		StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, COL_HEADER_ARTICLE_NO_POSITION_X - 20,
				TABLE_HEADER_POSISTION_Y_N15 - 3, COL_HEADER_ARTICLE_NO_BREADTH, COL_HEADER_ARTICLE_NO_HEIGHT,
				"Konzern", CENTER_ALIGNEMNT);
		/*StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 225 + (double) COL_CORRECTION_POSITION_X,
				TABLE_HEADER_POSISTION_Y, COL_HEADER_UNIT_BREADTH, COL_HEADER_UNIT_HEIGHT, "Kunden-Nr.",
				CENTER_ALIGNEMNT);*/
		StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 268.2857f + COL_CORRECTION_POSITION_X,
				TABLE_HEADER_POSISTION_Y, COL_HEADER_LENGTH_BREADTH, COL_HEADER_LENGTH_HEIGHT, "Colli",
				CENTER_ALIGNEMNT);
		StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 315.5714f + COL_CORRECTION_POSITION_X,
				TABLE_HEADER_POSISTION_Y, COL_HEADER_BREADTH_BREADTH, COL_HEADER_BREADTH_HEIGHT, "Artikel-Nr.",
				CENTER_ALIGNEMNT);
		StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 315.5714f + COL_CORRECTION_POSITION_X,
				TABLE_HEADER_POSISTION_Y_N15 - 3, COL_HEADER_MENGEQMLFDMETER_BREADTH, COL_HEADER_MENGEQMLFDMETER_HEIGHT,
				"Lieferant", CENTER_ALIGNEMNT);
		StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 377.8571f + COL_CORRECTION_POSITION_X,
				TABLE_HEADER_POSISTION_Y, COL_HEADER_HEIGHT_BREADTH, COL_HEADER_HEIGHT_HEIGHT, "Bezeichnung",
				CENTER_ALIGNEMNT);

		pdf.moveto(GRAPHIC_OUTPUT_INITIAL_X, GRAPHIC_OUTPUT_INITIAL_Y - 155);
		pdf.rect(HEADER_RECT_POSITION_X, HEADER_RECT_POSITION_Y_N19 - 155, HEADER_RECT_WIDTH, HEADER_RECT_HEIGHT_19);
		pdf.moveto(COLUMN_HEADER_X_19, GRAPHIC_OUTPUT_INITIAL_Y - 155);
		pdf.lineto(COLUMN_HEADER_X_19, COLUMN_HEADER_Y_N19 - 155);
		pdf.moveto(65, GRAPHIC_OUTPUT_INITIAL_Y - 155);
		pdf.lineto(65, COLUMN_HEADER_Y_N19 - 155);
		pdf.moveto(115, GRAPHIC_OUTPUT_INITIAL_Y - 155);
		pdf.lineto(115, COLUMN_HEADER_Y_N19 - 155);
		pdf.moveto(150 + (double) COL_CORRECTION_POSITION_X, GRAPHIC_OUTPUT_INITIAL_Y - 155);
		pdf.lineto(150 + (double) COL_CORRECTION_POSITION_X, COLUMN_HEADER_Y_N19 - 155);
		pdf.moveto(230, GRAPHIC_OUTPUT_INITIAL_Y - 155);
		pdf.lineto(230, COLUMN_HEADER_Y_N19 - 155);
		pdf.moveto(290, GRAPHIC_OUTPUT_INITIAL_Y - 155);
		pdf.lineto(290, COLUMN_HEADER_Y_N19 - 155);
		pdf.moveto(320, GRAPHIC_OUTPUT_INITIAL_Y - 155);
		pdf.lineto(320, COLUMN_HEADER_Y_N19 - 155);
		pdf.moveto(373, GRAPHIC_OUTPUT_INITIAL_Y - 155);
		pdf.lineto(373, COLUMN_HEADER_Y_N19 - 155);

		pdf.stroke();

		int oneRowDown = 0;
		OrderItemDetails newLine = null;
		do {
			++count;
			if (count != 1) {
				newLine = getNextLine();
				line = newLine;
			}
			oneRowDown += MAX_FORM_DATA_ROWS;
			if (line != null) {

				pdf.setfont(fontHelv, COLUMN_FONT_SIZE_MEDIUM);
				StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, COL_HEADER_CUST_COMP_NO_POSITION_X,
						-170 - oneRowDown, COL_HEADER_CUST_COMP_NO_BREADTH, 5, String.valueOf(count), CENTER_ALIGNEMNT);

				String orderDate;
				try {
					orderDate = dbDateOutputFormat.format(dbDateInputFormat.parse(line.getOrderDate()));
				} catch (ParseException e) {
					orderDate = "";
				}

				StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 31, -170 - oneRowDown,
						COL_HEADER_POS_BREADTH, 5, orderDate, CENTER_ALIGNEMNT);
				StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 53, -170 - oneRowDown,
						COL_HEADER_CUST_NO_BREADTH, 5, String.valueOf(line.getEntryNo()), CENTER_ALIGNEMNT);
				StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, COL_HEADER_ENTRY_NO_POSITION_X - 15,
						-170 - oneRowDown, COL_HEADER_ENTRY_NO_BREADTH, 5, line.getOrderNo(), CENTER_ALIGNEMNT);

				StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, COL_HEADER_ARTICLE_NO_POSITION_X - 20,
						-170 - oneRowDown, COL_HEADER_ARTICLE_NO_BREADTH, 5, line.getArticleNo(), CENTER_ALIGNEMNT);

				StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 225 + (double) COL_CORRECTION_POSITION_X,
						-170 - oneRowDown, COL_HEADER_UNIT_BREADTH, 5, line.getInvoicedCustomer().getCustomerNr(),
						CENTER_ALIGNEMNT);
				StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 270.2857f + COL_CORRECTION_POSITION_X,
						-170 - oneRowDown, COL_HEADER_LENGTH_BREADTH, 5, line.getColliNr(), CENTER_ALIGNEMNT);
				StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 317.5714f + COL_CORRECTION_POSITION_X,
						-170 - oneRowDown, COL_HEADER_BREADTH_BREADTH, 5, line.getArticleNo(), CENTER_ALIGNEMNT);

				String editedArticleDesc = line.getArticlePrintDescription();
				String desc1 = null;
				String desc2 = null;
				int length = 0;
				if (editedArticleDesc != null) {
					length = editedArticleDesc.length() % 2 == 0 ? editedArticleDesc.length()
							: editedArticleDesc.length() + 1;
					if (length > 20) {
						for (int i = 0; i < 3; i++) {
							desc1 = editedArticleDesc.substring(0, length / 2);
							desc2 = editedArticleDesc.substring(length / 2, editedArticleDesc.length());
						}
					}
				}
				if (length > 20) {
					StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 375.8571f + COL_CORRECTION_POSITION_X,
							-170 - oneRowDown, COL_HEADER_HEIGHT_BREADTH, 5, desc1 + "-", CENTER_ALIGNEMNT);
					StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 375.8571f + COL_CORRECTION_POSITION_X,
							-177 - oneRowDown, COL_HEADER_HEIGHT_BREADTH, 5, "-" + desc2, CENTER_ALIGNEMNT);

				} else {
					StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 375.8571f + COL_CORRECTION_POSITION_X,
							-170 - oneRowDown, COL_HEADER_HEIGHT_BREADTH, 5, line.getArticlePrintDescription(),
							CENTER_ALIGNEMNT);
				}
				oneRowDown += MAX_FORM_DATA_ROWS;
			} else {
				line = null;
			}
		} while (count % (14) > 0 && line != null);

		if (line != null) {

			pdf.setfont(fontHelv, FOOTER_FONT_MEDIUM);
			StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 5, -535, 204, 8, "Zwischensumme Colli",
					LEFT_ALIGNEMNT);
			StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 270.2857f + COL_CORRECTION_POSITION_X, -535,
					COL_HEADER_LENGTH_BREADTH, 5, String.valueOf(count - 1), CENTER_ALIGNEMNT);

			StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 370.2857f + COL_CORRECTION_POSITION_X, -535,
					COL_HEADER_LENGTH_BREADTH, 5, "Seite " + pageCount, CENTER_ALIGNEMNT);

			pdf.rect(HEADER_RECT_POSITION_X, -540, HEADER_RECT_WIDTH, HEADER_RECT_HEIGHT_19);

			/*
			 * pdf.moveto(FOOTER_DATA_X_0, FOOTER_DATA_Y_0-520); pdf.lineto(FOOTER_DATA_X_0,
			 * COLUMN_DATA_Y_N18-520); pdf.moveto(FOOTER_DATA_X_0, FOOTER_DATA_Y_0-520);
			 * pdf.lineto(FOOTER_DATA_X_800, FOOTER_DATA_Y_0-520);
			 * pdf.moveto(FOOTER_DATA_X_800, FOOTER_DATA_Y_0-520);
			 * pdf.lineto(FOOTER_DATA_X_800, COLUMN_DATA_Y_N18-520);
			 */
			pageCount++;
			pdf.stroke();

		}

		if (line == null) {
			pdf.setfont(fontHelv, FOOTER_FONT_MEDIUM);
			StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 5, -535, 204, 8, ("Anzahl Packstücke:"),
					LEFT_ALIGNEMNT);
			StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 270.2857f + COL_CORRECTION_POSITION_X, -535,
					COL_HEADER_LENGTH_BREADTH, 5, String.valueOf(count - 1), CENTER_ALIGNEMNT);

			StaticBaseEncapsulation.drawBoxedTextWithPreviewsFont(pdf, 370.2857f + COL_CORRECTION_POSITION_X, -535,
					COL_HEADER_LENGTH_BREADTH, 5, "Seite " + pageCount, CENTER_ALIGNEMNT);

			pdf.rect(HEADER_RECT_POSITION_X, -540, HEADER_RECT_WIDTH, HEADER_RECT_HEIGHT_19);
			// StaticBaseEncapsulation.drawTextWithPreviewsFont(pdf, 30, 550,
			// "Ladehilfsmittel:");
			// StaticBaseEncapsulation.drawText(pdf,fontHelvBold,8, 30, 575,
			// "Ladehilfsmittel:");
			// pdf.moveto(575, 30);

			/*
			 * pdf.moveto(FOOTER_DATA_X_0, FOOTER_DATA_Y_0-520); pdf.lineto(FOOTER_DATA_X_0,
			 * COLUMN_DATA_Y_N18-520); pdf.moveto(FOOTER_DATA_X_0, FOOTER_DATA_Y_0-520);
			 * pdf.lineto(FOOTER_DATA_X_800, FOOTER_DATA_Y_0-520);
			 * pdf.moveto(FOOTER_DATA_X_800, FOOTER_DATA_Y_0-520);
			 * pdf.lineto(FOOTER_DATA_X_800, COLUMN_DATA_Y_N18-520);
			 */

			pdf.stroke();

		}

		pdf.translate(GRAPHIC_OUTPUT_INITIAL_X, COLUMN_HEADER_Y_N19 - 155);
		for (int i = 0; i < MAX_FORM_ROWS; i++) {
			pdf.moveto(GRAPHIC_OUTPUT_INITIAL_X, GRAPHIC_OUTPUT_INITIAL_Y);
			pdf.lineto(0, COLUMN_DATA_Y_N18 - 155);
			pdf.moveto(COLUMN_HEADER_X_19, COLUMN_DATA_Y_0);
			pdf.lineto(COLUMN_HEADER_X_19, COLUMN_DATA_Y_N18 - 155);
			pdf.moveto(65, COLUMN_DATA_Y_0);
			pdf.lineto(65, COLUMN_DATA_Y_N18 - 155);
			pdf.moveto(115, COLUMN_DATA_Y_0);
			pdf.lineto(115, COLUMN_DATA_Y_N18 - 155);
			pdf.moveto(150 + (double) COL_CORRECTION_POSITION_X, COLUMN_DATA_Y_0);
			pdf.lineto(150 + (double) COL_CORRECTION_POSITION_X, COLUMN_DATA_Y_N18 - 155);
			pdf.moveto(230, COLUMN_DATA_Y_0);
			pdf.lineto(230, COLUMN_DATA_Y_N18 - 155);
			pdf.moveto(290, COLUMN_DATA_Y_0);
			pdf.lineto(290, COLUMN_DATA_Y_N18 - 155);
			pdf.moveto(320, COLUMN_DATA_Y_0);
			pdf.lineto(320, COLUMN_DATA_Y_N18 - 155);
			pdf.moveto(373, COLUMN_DATA_Y_0);
			pdf.lineto(373, COLUMN_DATA_Y_N18 - 155);
			pdf.moveto(450, COLUMN_DATA_Y_0);
			pdf.lineto(450, COLUMN_DATA_Y_N18 - 155);
			pdf.stroke();
			pdf.translate(0, COLUMN_DATA_Y_N18 - 155);

		}
		StaticBaseEncapsulation.drawTextWithPreviewsFont(pdf, 5, -535, "Ladehilfsmittel:");
		pdf.moveto(5, -535);
		pdf.stroke();
		// pdf.translate(5, -535);

		StaticBaseEncapsulation.endPage(pdf);
		return pdf;
	}

	private static String handlerLeadingZeroValue(String rein) {
		String value = rein;
		while (value.charAt(0) == '0') {
			int length = value.length();
			value = value.substring(1, length);
		}
		return value;
	}

	public static void main(String[] args) {
		PrintStream printStream = new PrintStream();
		// PrintStream printStreamList=new PrintStream(printOrderItemList, warehouse,
		// lkwnr)

		AdditionalInfo adinfo = new AdditionalInfo();
		adinfo.setAnzahlRaten("aa");
		adinfo.setBAHNLcNo("bahnlcNo");
		adinfo.setBillingSystem("billsysytem");
		adinfo.setGreenDotNo("greenDotNo");
		adinfo.setIsERWPackliste("isERWPackliste");
		adinfo.setLoginDate("17-6-20");
		adinfo.setMengeLfdMeter("22");
		adinfo.setOEBBDepot("oEBBDepot");
		adinfo.setOEBBNveSsccColi("oEBBNveSsccColi");
		adinfo.setOEBBtotalNoOfPackingUnits("oEBBtotalNoOfPackingUnits");
		adinfo.setPrintCancellationDate("17-6-20");
		adinfo.setPrintEllDate("17-6-20");
		adinfo.setPrintUebDate("17-6-20");
		adinfo.setPrintVaDate("17-6-20");
		adinfo.setSorterFaheigKz("1");
		adinfo.setValutaKz("2");
		adinfo.setVersandArtDecode("50");

		CustomerCompany customerCompany = new CustomerCompany();
		customerCompany.setAddress("Bhiwandi");
		customerCompany.setAdressLine1("rahanal");
		customerCompany.setAdressLine2("hiranagr");
		customerCompany.setAdressLine3("abc");
		customerCompany.setCity("Thane");
		customerCompany.setCodBLZ("cod");
		customerCompany.setCodCustomerNo("112233");
		customerCompany.setCompanyCode(333);
		customerCompany.setCountryCode("91");
		customerCompany.setCustomerCompanyList("customerCompanyList");
		customerCompany.setLogoPath("d/images");
		customerCompany.setName("Nayana");
		customerCompany.setReturnText("returnText");
		customerCompany.setZipCode("421302");

		DeliveryInfo deliveryInfo = new DeliveryInfo();
		deliveryInfo.setDeLiveryLocation("dubai");
		deliveryInfo.setDeLiveryLocationList("china");

		InvoicedCustomer invoicedCustomer = new InvoicedCustomer();
		invoicedCustomer.setAccountHolderName("pratap");
		invoicedCustomer.setCustomeNrWithSubNr("1439");
		invoicedCustomer.setCustomerNr("3333");
		invoicedCustomer.setCustomerSubNr(150);

		PackingUnitModel packagingUnitModel = new PackingUnitModel();
		packagingUnitModel.setCarrierProductCode(1);
		packagingUnitModel.setCarrierProductPrintText("carrierproduct");
		packagingUnitModel.setColliKey(456654);
		packagingUnitModel.setColliNumber("123456");
		packagingUnitModel.setHeight(20);
		packagingUnitModel.setLength(20);
		packagingUnitModel.setWeight(30);
		packagingUnitModel.setWidth(30);
		// List<PackingUnitModel>packagingUnitModelList=

		PackingUnitInfo packingUnitInfo = new PackingUnitInfo();
		packingUnitInfo.setPacketIdentificationNo("123456789");
		packingUnitInfo.setPackingUnitDetail(packagingUnitModel);

		PhysicalAttributes physicalAttributes = new PhysicalAttributes();
		physicalAttributes.setCubicMeter(11);
		physicalAttributes.setEngravingText("nk");
		physicalAttributes.setHeight(11);
		physicalAttributes.setLength(22);
		physicalAttributes.setWidth(20);

		PriceInfo priceInfo = new PriceInfo();
		priceInfo.setEkPrice("20");
		priceInfo.setVkPrice("20");

		Recipient recipient = new Recipient();
		recipient.setAdditionalInfo("adinfo");
		recipient.setCountryCode("91");
		recipient.setCustomerAdditionalName("kale");
		recipient.setCustomerAddressId(333);
		recipient.setCustomerAdressDirection("direction");
		recipient.setCustomerAdressNo("21");
		recipient.setCustomerCompanyCode("786");
		recipient.setCustomerEmailAddress("nkale@direction");
		recipient.setCustomerName("nk");
		recipient.setCustomerPlace("dubai");
		recipient.setCustomerStreet("customerStreet");
		recipient.setCustomerTelephone("3333tel");
		recipient.setCustomerZipCode("421302");
		recipient.setDepot("depot");
		recipient.setDpaNo("dpaNo");
		recipient.setPostalKeyCode("postalKeyCode");
		recipient.setSalutationList("salutationList");
		recipient.setStarDepot("depot");
		recipient.setTourCell("tourCell");

		StockHoldingCompany stockHoldingCompany = new StockHoldingCompany();
		stockHoldingCompany.setName("stock");
		stockHoldingCompany.setName2("stock2");
		stockHoldingCompany.setPlace("dubai");
		stockHoldingCompany.setStockHoldingCompanyId(33);
		stockHoldingCompany.setStockHoldingCompanyList("stoCompanyList");
		stockHoldingCompany.setStreet("stree");
		stockHoldingCompany.setStreet1("street1");
		stockHoldingCompany.setTelephoneAreaCode("92");
		stockHoldingCompany.setTelephoneNo("telno");
		stockHoldingCompany.setZipCode("411011");

		TransportInfo transportInfo = new TransportInfo();
		transportInfo.setFreightDepoNo("4545");
		transportInfo.setTransportKz("3019");

		OrderItemDetails printOrderItemList = new OrderItemDetails();

		ArrayList<OrderItemDetails> printOrderItemList2 = new ArrayList<>();

		printOrderItemList.setAdditionalInfo(adinfo);
		printOrderItemList.setArticleNo("1234");
		printOrderItemList.setArticlePositionTA("center");
		printOrderItemList.setArticlePrintDescription("description");
		printOrderItemList.setAufkleberNo("1");
		printOrderItemList.setAutoKey(1233L);
		printOrderItemList.setBillingKz("bill kz");
		printOrderItemList.setBoxType("box");
		printOrderItemList.setCancellationDate("17-6-20");
		printOrderItemList.setCashOnDelivery("cash");
		printOrderItemList.setCashOnDeliveryAmt("500");
		printOrderItemList.setColliNr("123321");
		printOrderItemList.setCrsItemNumber("321321");
		printOrderItemList.setCustomerCompany(customerCompany);
		printOrderItemList.setDayOfWeek("dayOfWeek");
		printOrderItemList.setDeliveryDate("17-6-20");
		printOrderItemList.setDeliveryInfo(deliveryInfo);
		printOrderItemList.setDeliveryZipCode("421302");
		printOrderItemList.setDescription("good");
		printOrderItemList.setElsNo("ElS333");
		printOrderItemList.setEntryNo(123456);
		printOrderItemList.setGreuenerPunktKz("greunerkz");
		printOrderItemList.setHandlingCost("costzero");
		printOrderItemList.setHermesSchwinge(1);
		printOrderItemList.setIncidentStatus(0);
		printOrderItemList.setIndustryDay("indusrt");
		printOrderItemList.setInternalArticleNo("786786");
		printOrderItemList.setInternalDescription("internalDescription");
		printOrderItemList.setInternalSize("20");
		printOrderItemList.setInvNumber("2");
		printOrderItemList.setInvoiceDate("17-6");
		printOrderItemList.setInvoicedCustomer(invoicedCustomer);
		printOrderItemList.setInvText("sk");
		printOrderItemList.setMaxDate("maxDate");
		printOrderItemList.setMeterwareKzInfo("meterwareKzInfo");
		printOrderItemList.setNewELSNo("ELS789789");
		printOrderItemList.setNoaPurchaseOrderNo("123");
		printOrderItemList.setOrderDate("17-6-20");
		printOrderItemList.setOrderNo("123321");
		printOrderItemList.setOrderStatus(1);
		printOrderItemList.setOrderType("daily");
		printOrderItemList.setOriginalInvoiceDate("17-6-20");
		printOrderItemList.setOriginalMeterwareKzInfo(11);
		printOrderItemList.setPackageCounter(11);
		printOrderItemList.setPacketWeight("20");
		printOrderItemList.setPackingUnitInfo(packingUnitInfo);
		// orderitem.setPackingunits( packagingUnitModel);
		printOrderItemList.setPaketNr("22222");
		printOrderItemList.setPaketPackingNr("2121");
		printOrderItemList.setParcelBunchingCode("12");
		printOrderItemList.setPhysicalAttributes(physicalAttributes);
		printOrderItemList.setPositionTA("1");
		printOrderItemList.setPositionVA("2");
		printOrderItemList.setPostId("1");
		printOrderItemList.setPostleitCode("2");
		printOrderItemList.setPriceInfo(priceInfo);
		printOrderItemList.setProdId("11");
		printOrderItemList.setQuantity(1);
		printOrderItemList.setRechnungNr("11");
		printOrderItemList.setRecipient(recipient);
		printOrderItemList.setRetSchlusselBST("retSchlusselBST");
		printOrderItemList.setReturnKeyCounter("returnKeyCounter");
		printOrderItemList.setReturnsId("returnsId");
		printOrderItemList.setReturnsKeyCode("returnsKeyCode");
		printOrderItemList.setRunningDay("runningDay");
		printOrderItemList.setSecretCargoPostAl("secretCargoPostAl");
		printOrderItemList.setSendungsNr("01619762617518");
		printOrderItemList.setShipmentDate("31-31-31");
		printOrderItemList.setShipmentId(786);
		printOrderItemList.setShipmentType("val");
		printOrderItemList.setShippingKey("shippingKey");
		printOrderItemList.setSize("ize");
		printOrderItemList.setSpedition("spedition");
		printOrderItemList.setStatusKz(61);
		printOrderItemList.setStockHoldingCompany(stockHoldingCompany);
		printOrderItemList.setSupplier("10920");
		printOrderItemList.setTotalNoOfPackingUnits(12);
		printOrderItemList.setTransportInfo(transportInfo);
		printOrderItemList.setUkPrice("ukPrice");
		printOrderItemList.setUpsId("upsId");

		printOrderItemList2.add(printOrderItemList);

		String warehouse = "lohne";
		String lkwnr = "lkwnr";

		PrintStream printStreamList = new PrintStream(printOrderItemList2, warehouse, lkwnr);
		InputStream istream = printStreamList.getStream();
		
		
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();

		int nRead;
		byte[] data = new byte[16384];

		try {
			while ((nRead = istream.read(data, 0, data.length)) != -1) {
			  buffer.write(data, 0, nRead);
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
byte[]f=new byte[16384];
		f=buffer.toByteArray();
		

		int len;
		try {
			FileOutputStream fos = new FileOutputStream(new File("D://elsPdf/els.pdf"));
			fos.write(f);
			System.out.println("pdf printed......");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

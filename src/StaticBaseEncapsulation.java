//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//



import java.io.IOException;

import com.pdflib.PDFlibException;
import com.pdflib.pdflib;

public final class StaticBaseEncapsulation {
  private static final boolean DEBUG = false;

  public StaticBaseEncapsulation() {
  }

  public static void drawRectangle(pdflib p, int x1, int y1, int x2, int y2) throws IOException, PDFlibException {
    drawLine(p, x1, y1, x2, y1);
    drawLine(p, x2, y1, x2, y2);
    drawLine(p, x1, y1, x1, y2);
    drawLine(p, x1, y2, x2, y2);
  }

  public static void drawLine(pdflib p, int x1, int y1, int x2, int y2) throws IOException, PDFlibException {
    p.moveto((double)x1, (double)y1);
    p.lineto((double)x2, (double)y2);
    p.stroke();
  }

  public static void drawText(pdflib p, int font, float fontsize, int x, int y, String text) throws IOException, PDFlibException {
    p.setfont(font, (double)fontsize);
    p.show_xy(text, (double)x, (double)y);
  }

  public static void drawTextWithPreviewsFont(pdflib p, int x, int y, String text) throws IOException, PDFlibException {
    p.show_xy(text, (double)x, (double)y);
  }

  public static void setFont(pdflib p, int font, float fontsize) throws IOException, PDFlibException {
    p.setfont(font, (double)fontsize);
  }

  public static void drawBoxedText(pdflib p, int font, float fontsize, double x, double y, double b, double h, String text, String richtung) throws IOException, PDFlibException {
    p.setfont(font, (double)fontsize);
    drawBoxedTextWithPreviewsFont(p, x, y, b, h, text, richtung);
  }

  public static double drawOldBoxedTextWithPreviewsFont(pdflib p, int font, float fontsize, double x, double y, double b, double h, String text, String richtung) throws IOException, PDFlibException {
    double stringWidth = p.stringwidth(text, font, (double)fontsize);
    if (b >= stringWidth) {
      drawBoxedTextWithPreviewsFont(p, x, y, b, h, text, richtung);
      return 0.0D;
    } else {
      return 1.0D;
    }
  }

  public static void drawBoxedTextWithPreviewsFont(pdflib p, double x, double y, double b, double h, String text, String richtung) throws IOException, PDFlibException {
    p.fit_textline(text, x, y, "boxsize {" + b + " " + h + "} position={" + richtung + " center}");
  }

  public static void getBrokenDash(pdflib p) throws IOException, PDFlibException {
    p.setlinewidth(0.30000001192092896D);
    p.setdash(2.0D, 4.0D);
  }

  public static void getDash(pdflib p) throws IOException, PDFlibException {
    p.setlinewidth(0.4000000059604645D);
    p.setdash(0.0D, 0.0D);
  }

  public static int loadFont(pdflib p, String fontName) throws IOException, PDFlibException {
    return p.load_font(fontName, "auto", "");
  }

  public static int loadBuildInFont(pdflib p, String fontName) throws IOException, PDFlibException {
    return p.load_font(fontName, "auto", "embedding=true kerning=true");
  }

  public static int loadPicture(pdflib p, String picName, String picType) throws IOException, PDFlibException {
    return p.load_image(picType, picName, "");
  }

  public static void endPage(pdflib p) throws IOException, PDFlibException {
    p.end_page_ext("");
  }

  public static void beginPage(pdflib p, int width, int height) throws IOException, PDFlibException {
    p.begin_page_ext((double)width, (double)height, "");
  }

  public static void beginPage(pdflib p, double width, double height) throws IOException, PDFlibException {
    p.begin_page_ext(width, height, "");
  }

  public static void closeDocument(pdflib p) throws IOException, PDFlibException {
    p.end_document("");
  }

  public static byte[] getPdfByteArray(pdflib p) throws IOException, PDFlibException {
    return p.get_buffer();
  }

  public static int getPdfByteArrayLength(pdflib p) throws IOException, PDFlibException {
    return getPdfByteArray(p).length;
  }

  public static void preparePage(pdflib p, float lineWidth, float x, float y) throws IOException, PDFlibException {
    p.setlinewidth((double)lineWidth);
    p.translate((double)x, (double)y);
  }

  public static void translate(pdflib p, float x, float y) throws IOException, PDFlibException {
    p.translate((double)x, (double)y);
  }

  public static void init(pdflib p, String fileName, String creator, String author, String title) throws IOException, PDFlibException {
    if (fileName == null) {
      fileName = "";
    }

    p.begin_document(fileName, "");
    p.set_info("Creator", creator);
    p.set_info("Author", author);
    p.set_info("Title", title);
    String resourceFile = (String)System.getenv().get("PDFLIBRESOURCE");
    p.set_parameter("resourcefile", resourceFile);
  }

  public static void drawImage(pdflib p, int image, double x, double y, double scale) throws PDFlibException {
    p.fit_image(image, x, y, "scale=" + scale);
  }
}

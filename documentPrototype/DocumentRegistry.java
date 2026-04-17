public class DocumentRegistry {

    private PdfDocument pdfPrototype;
    private TextDocument textPrototype;
    private SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        pdfPrototype = new PdfDocument();
        textPrototype = new TextDocument();
        spreadsheetPrototype = new SpreadsheetDocument();
        System.out.println();
    }

    public PdfDocument createPdf(String file, String author, int pages) {
        PdfDocument doc = (PdfDocument) pdfPrototype.clone();
        doc.setDetails(file, author, pages);
        return doc;
    }

    public TextDocument createText(String path, String encoding, int words) {
        TextDocument doc = (TextDocument) textPrototype.clone();
        doc.setDetails(path, encoding, words);
        return doc;
    }

    public SpreadsheetDocument createSpreadsheet(String name, int rows, int cols) {
        SpreadsheetDocument doc = (SpreadsheetDocument) spreadsheetPrototype.clone();
        doc.setDetails(name, rows, cols);
        return doc;
    }
}

public class FactoryMethodPatternTest {

    public static void main(String[] args) {

        
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        System.out.println("--- Word Document ---");
        wordDoc.open();
        wordDoc.save();
        wordDoc.close();

        System.out.println();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        System.out.println("--- PDF Document ---");
        pdfDoc.open();
        pdfDoc.save();
        pdfDoc.close();

        System.out.println();

        
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        System.out.println("--- Excel Document ---");
        excelDoc.open();
        excelDoc.save();
        excelDoc.close();
    }
}

public class Main {
    
    public static void main(String[] args) {
        Document obj=DocumentFactory.getDocument("PdfDocument");
        obj.printDocument();
         obj=DocumentFactory.getDocument("WordDocument");
        obj.printDocument();
        obj=DocumentFactory.getDocument("ExcelDocument");
        obj.printDocument();
    }
}

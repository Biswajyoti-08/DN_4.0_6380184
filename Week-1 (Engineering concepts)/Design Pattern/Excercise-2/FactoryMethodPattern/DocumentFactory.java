
public class DocumentFactory {
    public static Document getDocument(String doctype){
        Document obj;
        if(doctype.equals("PdfDocument")){
             obj=new PdfDocument();
             return obj;
        }
        else if(doctype.equals("WordDocument")){
             obj=new WordDocument();
             return obj;
        }
        else  if(doctype.equals("ExcelDocument")){
             obj=new ExcelDocument();
             return obj;
        }
        return  null;
    }
}

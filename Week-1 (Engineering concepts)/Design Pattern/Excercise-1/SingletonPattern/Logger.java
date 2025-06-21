public class Logger{

    private static Logger obj;
    private Logger(){

    }
    public static Logger getObj() {
        if(obj==null){
            obj=new Logger();
        }
        return obj;
    }
}
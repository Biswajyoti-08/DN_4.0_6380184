public class Main {
    public static void main(String[] args) {
        Logger log;
        log=Logger.getObj();
        System.out.println("Hash Code:"+log.hashCode());
        Logger log2;
        log2=Logger.getObj();
        System.out.println("Hash Code:"+log2.hashCode());
        System.out.println(log2.hashCode()==log.hashCode());
    }
}

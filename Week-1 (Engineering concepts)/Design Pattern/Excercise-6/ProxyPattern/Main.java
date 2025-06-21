public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("server/image1.jpg");

        image1.display();  
        image1.display(); 

        Image image2 = new ProxyImage("server/image2.png");
        image2.display();  
    }
}

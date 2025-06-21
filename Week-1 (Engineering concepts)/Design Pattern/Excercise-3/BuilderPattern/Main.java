
public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .setCPU("OCTACORE Intel")
                .setRAM("8GB")
                .setStorage("1TB HDD")
                .build();

        System.out.println("Computer Configuration:");
        System.out.println("CPU: " + computer.getCPU());
        System.out.println("RAM: " + computer.getRAM());
        System.out.println("Storage: " + computer.getStorage());
    }
}

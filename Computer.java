public class Computer {
    String CPU;
    String RAM;
    String Storage;
    String GPU;
    String OS;

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", Storage='" + Storage + '\'' +
                ", GPU='" + GPU + '\'' +
                ", OS='" + OS + '\'' +
                '}';
    }
}

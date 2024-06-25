public class MegaBytesConverter {

    private static final int KILOBYTES_TO_MEGABYTES_CONVERSION_FACTOR = 1024;

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");

        } else {
            int megaBytes = kiloBytes / KILOBYTES_TO_MEGABYTES_CONVERSION_FACTOR;
            int remainder = kiloBytes % KILOBYTES_TO_MEGABYTES_CONVERSION_FACTOR;

            System.out.println(kiloBytes + " KB = "+ megaBytes +" MB and "+ remainder +" KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(-1024);
    }
}

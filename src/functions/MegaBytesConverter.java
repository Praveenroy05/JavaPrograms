package functions;

public class MegaBytesConverter {


    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int kiloBytes2 = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytes2 + " KB");

        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2345678);
    }

}


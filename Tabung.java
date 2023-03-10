public class Tabung {
    public static void main(String[] args) {
        double d, t,volTabung, r;
        final double phi = 3.14;
        t = 10;
        d = 5;
        r = d * 0.5;
        
        System.out.println("VOLUME TABUNG");
        System.out.print("Jari-jari alas: ");
        System.out.print("Tinggi tabung: ");
        volTabung = (phi * r* r) * t;
    
        System.out.println("Volume Tabung = " + volTabung);
    }
}


public class Main {
    public static void main(String[] args) {
        Ekspedisi ekspedisi1 = new EkspedisiDarat();
        Transportasi transportasi1 = new TransportasiDarat();
        ekspedisi1.transportasi = transportasi1;
        transportasi1.kirimBarang();
        ekspedisi1.mulaiPengiriman();
    }
}

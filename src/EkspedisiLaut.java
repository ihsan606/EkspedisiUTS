public class EkspedisiLaut extends Ekspedisi{

    @Override
    public Transportasi createTransportasi(Transportasi transportasiLaut) {
        this.transportasi = transportasiLaut;
        return this.transportasi;
    }
}

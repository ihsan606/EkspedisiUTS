public class EkspedisiDarat extends Ekspedisi{

    @Override
    public Transportasi createTransportasi(Transportasi transportasiDarat) {
        this.transportasi = transportasiDarat;
        return this.transportasi;
    }
}

public abstract class Ekspedisi {
    Transportasi transportasi;

    public abstract Transportasi createTransportasi(Transportasi transportasi);

    public void mulaiPengiriman(){
        System.out.println("pengiriman dimulai");
    }


}

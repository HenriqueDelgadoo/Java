public class Humano extends SerVivo {
    public Humano(){
        super(42);
    }
    @Override
    public void respirar() {
        System.out.println("inalando e expirando o ar ...");
    }
}

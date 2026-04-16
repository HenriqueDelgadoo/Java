public class Sandero extends carro {
    @Override
    public void acelerar() {
        System.out.println("Acelerando");
    }

    @Override
    public void freiar() {
        System.out.println("Freiando");
    }

    @Override
    public void parar() {
        System.out.println("Carro parado!");
    }
}

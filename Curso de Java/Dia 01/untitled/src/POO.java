// package - define a pasta que as classes conseguem enxergar as outras ou os metodos
public class POO {
    public static void main(String[] args){
        carro meucarro1 = new Sandero();
        carro meucarro2 = new Mobi();
        carro meucarro3 = new hb20();

        meucarro1.acelerar();
        meucarro2.acelerar();
        meucarro3.acelerar();
    }
}
/*
class carro{
    String modelo;
    public carro (String modelo){
        this.modelo = modelo;
        System.out.println("Carro criado");
    }
    public void acelerar(){
        System.out.println("Acelerendo o carro " + this.modelo);
    }
}


/* Modificadores de acessos:
    =>  controlam a visibilidade dos metodos e classes criados;
    - public, publico para todos que quiserem acessar independente do package
    - private, privado acessos somente para a mesma classe
    - protected, consegue usar no mesmo package, em outro não
    -  default, quando não colocar nada

    Interfaces

 */

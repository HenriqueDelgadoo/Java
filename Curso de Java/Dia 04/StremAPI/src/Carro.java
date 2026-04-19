public record Carro (String marca, String modelo, int ano , String placa) {
    //Record nada mais é que uma classe imutavel, os dados do objeto não podem ser alterados depois de criados,
    // e tem um construtor, getters, equals, hashCode e toString gerados automaticamente.
    // DTO's => data tranfer objects
    // dados que vem de outro lugar, como um banco de dados, uma API, etc. e não podem ser alterados depois de criados.
    //POJO's => Plain Old Java Objects
    // objetos simples, sem lógica de negócio, apenas com dados e métodos getters e setters.

}

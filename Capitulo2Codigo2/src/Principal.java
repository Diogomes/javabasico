public class Principal {
    public static void main(String[] args)
        Carro car = new Carro();
        car.potencia = 10;
        car.nome = "Classic";
        car.velocidade = 0;
        
        car.acelerar();
        car.imprimir();
}

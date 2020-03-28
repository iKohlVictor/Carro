package carro;
public class Principal 
{
    public static void main(String[] args) 
    {
        Carro c1, c2, c3;
        System.out.print("\n Número de Carros:" +
                Carro.mostrarTotalDeCarros());
        c1 = new Carro(111, "Onix", "Chevrolet");
        System.out.print("\n Número de carros: " +
                Carro.mostrarTotalDeCarros());
        c2 = new Carro(222, "Hb20", "Hyundai");
        System.out.print("\n Número de carros: " +
                Carro.mostrarTotalDeCarros());
        c3 = new Carro(333, "KA", "Ford");
        System.out.print("\n Número de carros: " +
                Carro.mostrarTotalDeCarros());
        System.out.print("\n FIM \n");
    }
    
}

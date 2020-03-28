package carro;
public class Carro 
{
    private int id;
    private String modelo;
    private String fabricante;
    private static int totalDeCarros;//Este atributo é comum a todos os carros que eu criar.
    //Construtor padrão.
    public Carro(int id, String modelo, String fabricante)
    {
        this.id = id;
        this.modelo = modelo;
        this.fabricante = fabricante;
        Carro.totalDeCarros = Carro.totalDeCarros + 1;
    }
    
    public static int mostrarTotalDeCarros()
    {
        return(Carro.totalDeCarros);
    }
    //SETTER E GETTER
    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getModelo() 
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public String getFabricante()
    {
        return fabricante;
    }

    public void setFabricante(String fabricante) 
    {
        this.fabricante = fabricante;
    }

    public static int getTotalDeCarros() 
    {
        return totalDeCarros;
    }

    public static void setTotalDeCarros(int totalDeCarros)
    {
        Carro.totalDeCarros = totalDeCarros;
    }
    //toString

    @Override
    public String toString() {
        return  "id = " + id + ", modelo = " + modelo
                + ", fabricante = " + fabricante + '}';
    }
    
}

public class Autos {

    //atributos
    String color;
    String dueno;
    String modelo;
    int ano;

    //Constructor
    Autos(String dueno){
        this.dueno=dueno;
    }

    //Metodos
    public String getColor(){
        return color;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    //------------------------------------------------
    //
    public void setDueno(String dueno) {
        this.dueno = dueno;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
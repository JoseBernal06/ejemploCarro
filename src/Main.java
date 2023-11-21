public class Main {
    public static void main(String []args){
        System.out.println("\tBIENVENIDO");

        Autos auto_uno;
        auto_uno = new Autos("Mateo");

        auto_uno.setColor("Azul");
        auto_uno.setModelo("Ferrari");
        auto_uno.setAno(5);

        System.out.println(auto_uno.getModelo());
        System.out.println(auto_uno.getColor());
        System.out.println(auto_uno.getAno());

    }
}
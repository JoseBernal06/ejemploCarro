public class Main {
    public static void main(String []args){
        System.out.println("\tBIENVENIDO");

        Autos auto_uno,auto_dos;
        auto_uno = new Autos("Mateo");
        auto_dos = new Autos("Emilio");

        auto_dos.setColor("Negro");
        auto_dos.setModelo("Nissan");
        auto_dos.setAno(2);

        System.out.println();
    }
}
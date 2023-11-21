import java.util.Scanner;

public class Main {
    public static void main(String []args){

        Scanner entrada =new Scanner(System.in);

        System.out.println("\tBIENVENIDO");

        Autos auto_uno,auto_dos;
        auto_uno = new Autos("Mateo");
        auto_dos = new Autos("Emilio");

        System.out.print("Ingresa el color de tu auto: "); auto_uno.setColor(entrada.next());
        System.out.print("Ingresa el modelo de tu auto: "); auto_uno.setModelo(entrada.next());
        System.out.print("Ingresa el ano de compra de tu auto: "); auto_uno.setAno(entrada.nextInt());

        System.out.println(auto_uno.getColor());
        System.out.println(auto_uno.getAno());
        System.out.println(auto_uno.getModelo());

        /*auto_uno.setColor("Azul");
        auto_uno.setModelo("Ferrari");
        auto_uno.setAno(5);

        auto_dos.setColor("Negro");
        auto_dos.setModelo("Nissan");
        auto_dos.setAno(2);

        System.out.println("\nAuto de mateo");
        System.out.println(auto_uno.getModelo());
        System.out.println(auto_uno.getAno());*/

    }
}
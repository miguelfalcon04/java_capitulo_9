import java.util.Scanner;
public class PruebaVehiculo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion=0;
        int km;

        Bicleta vizi = new Bicleta(9);
        Coche brumbrum = new Coche(1900);

        while (opcion != 8) {
            System.out.println("\n1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.println("Elige una opción (1-8): ");
            
            opcion = Integer.parseInt(System.console().readLine());
            
            switch (opcion) {
            case 1:
                System.out.print("¿Cuántos kilómetros quiere recorrer? ");
                km = sc.nextInt();
                vizi.recorre(km);
                break;
            case 2:
                vizi.hazCaballito();
                break;
            case 3:
                System.out.print("¿Cuántos kilómetros quiere recorrer? ");
                km =sc.nextInt();
                brumbrum.recorre(km);
                break;
            case 4:
                brumbrum.quemaRueda();
                break;
            case 5:
                System.out.print("La bicicleta lleva recorridos ");
                System.out.println(vizi.getKilometrosRecorridos() + " Km");
                break;
            case 6:
                System.out.print("El coche lleva recorridos ");
                System.out.println(brumbrum.getKilometrosRecorridos() + " Km");
                break;
            case 7:
                System.out.print("Los vehículos llevan recorridos ");
                System.out.println(Vehiculo.getKilometrosTotales() + " Km");
            default:
            } 
        } 

        sc.close();
    }
}

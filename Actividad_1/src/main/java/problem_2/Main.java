package problem_2;

public class Main {
        public static void main(String[] args) {
            // Agrega código necesario para poder ejecutar los siguiente:
            IdentifyMyParts a = new IdentifyMyParts();
            IdentifyMyParts b = new IdentifyMyParts();
            a.y = 5;
            b.y = 6;
            IdentifyMyParts.x = 1;
            IdentifyMyParts.x = 2;
            //las variables estaticas como la x en esta caso no pueden ser accedidas desde la instancia sino desde la clase original justo como en el ultimo ejemplo.
            System.out.println("a.y = " + a.y);
            System.out.println("b.y = " + b.y);
            System.out.println("a.x = " + IdentifyMyParts.x);// en el caso de estos valores todos deberian tomar el ultmo cambio (en este caso el 2) y mostrarlo en
            System.out.println("b.x = " + IdentifyMyParts.x);//todas las instancias que accedan a "x".
            System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x);
        }
}

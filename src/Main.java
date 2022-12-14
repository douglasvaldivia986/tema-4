
public class Main {
    public static void main(String[] args) {
        int numeroIf = -20;

        if (numeroIf>0){
            System.out.println("numeroIF es positivo ");
        } else if (numeroIf<0){
            System.out.println("numeroIF es negativo");
        } else if (numeroIf==0){
            System.out.println("numeroIF es igual a 0");
        } else {
            System.out.println("no se ingreso un dato ejecutable ");
        }
        System.out.println("---");

        int numeroWhile=0;

        while (numeroWhile <3) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;}

            System.out.println("---");
        int numerodoWhile = 1;
            do {
                System.out.println(numerodoWhile);
                numerodoWhile = numerodoWhile + 1;

            } while (numerodoWhile < 2);
        System.out.println("---");



        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1) {
            System.out.println(numeroFor);
            System.out.println("---");
        }
        var estaciones = ("verano");
        switch (estaciones) {
            case "verano":
                System.out.println("es verano");
                break;
            case "invierno":
                System.out.println("es verano");
                break;
            case "otoño":
                System.out.println("es verano");
                break;
            case "primevera":
                System.out.println("es verano");
                break;
            default:
                System.out.println("la variable no sea una estación.");

        }



    }
}
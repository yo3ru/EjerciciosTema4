public class ET4 {

    public static void main(String[] args) {
        
        var numeroif = 8;

        if ( numeroif > 0 ) {
            System.out.println("Es positivo");
        } else if (numeroif < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es 0");
        }

        var numeroWhile = -2;

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);

        for (var numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        var estacion = "Coche";

        switch(estacion){
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("No es una estacion");
        }
    }


}
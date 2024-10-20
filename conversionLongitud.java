import java.util.Scanner;

/* RESUMEN DEL PROGRAMA

El programa de conversión de unidades de longitud permite a los usuarios convertir unidades como: milímetros, centímetros, decímetros, metros, decámetros, hectómetros, kilómetros, pies y yardas. 
El usuario selecciona la unidad de origen y destino y un valor para convertir. Hay verificaciones para asegurar que las entradas sean válidas, evitando errores y permitiendo al usuario repetir el proceso o salir del programa.*/

public class conversionLongitud {

    // Metodos de conversion
    public static double metrosAKilometros(double metros) {
        return metros / 1000;
    }

    public static double kilometrosAMetros(double kilometros) {
        return kilometros * 1000;
    }

    public static double metrosAPies(double metros) {
        return metros * 3.28084;
    }

    public static double piesAMetros(double pies) {
        return pies / 3.28084;
    }

    public static double metrosACentimetros(double metros) {
        return metros * 100;
    }

    public static double centimetrosAMetros(double centimetros) {
        return centimetros / 100;
    }

    public static double metrosAMilimetros(double metros) {
        return metros * 1000;
    }

    public static double milimetrosAMetros(double milimetros) {
        return milimetros / 1000;
    }

    public static double metrosADecimetros(double metros) {
        return metros * 10;
    }

    public static double decimetrosAMetros(double decimetros) {
        return decimetros / 10;
    }

    public static double metrosADecametros(double metros) {
        return metros / 10;
    }

    public static double decametrosAMetros(double decametros) {
        return decametros * 10;
    }

    public static double metrosAhectometros(double metros) {
        return metros / 100;
    }

    public static double hectometrosAMetros(double hectometros) {
        return hectometros * 100;
    }

    public static double metrosAYardas(double metros) {
        return metros * 1.09361;
    }

    public static double yardasAMetros(double yardas) {
        return yardas / 1.09361;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        System.out.println("Bienvenido al convertidor de unidades de longitud!!");
        
        while (true) {

            // Menu de opciones
            System.out.println("Aqui tienes una lista de las unidades disponibles:");
            System.out.println("1 --> Milimetros--(mm)");
            System.out.println("2 --> Centimetros--(cm)");
            System.out.println("3 --> Decimetros--(dm)");
            System.out.println("4 --> Metros--(m)");
            System.out.println("5 --> Decametros--(dam)");
            System.out.println("6 --> Hectometros--(hm)");
            System.out.println("7 --> Kilometros--(km)");
            System.out.println("8 --> Pies--(ft)");
            System.out.println("9 --> Yardas--(yd)");
            System.out.println("10 --> Salir");

            int unidadOrigen = 0;
            int unidadDestino = 0;
            double valor = 0;

            // Validar unidad de origen
            while (true) {

                System.out.print("Seleccione la unidad de origen (1-9) o (10) para salir: ");
                try {
                    unidadOrigen = Integer.parseInt(scanner.nextLine());
                    if (unidadOrigen >= 1 && unidadOrigen <= 10) {
                        break;
                    } else {
                        System.out.println("Opcion no valida");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Caracter invalida, elija un numero correcto");
                }
            }

            if (unidadOrigen == 10) {
                System.out.println("Saliendo del programa.");
                return;
            }

            // Para validar unidad de destino
            while (true) {

                System.out.print("Seleccione la unidad de destino (1-9): ");
                try {
                    unidadDestino = Integer.parseInt(scanner.nextLine());
                    if (unidadDestino >= 1 && unidadDestino <= 9) {
                        break;
                    } else {
                        System.out.println("Opcion no valida. Intente de nuevo.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada no valida. Debe ser un numero.");
                }
            }

            // Validar valor a convertir
            while (true) {

                System.out.print("Ingrese el valor a convertir: ");
                try {
                    valor = Double.parseDouble(scanner.nextLine());
                    break; // Salir del bucle si la entrada es válida
                } catch (NumberFormatException e) {
                    System.out.println("Entrada no valida. Debe ser un numero.");
                }
            }

            double resultado = 0;
            String unidadOrigenTexto = obtenerNombreUnidad(unidadOrigen);
            String unidadDestinoTexto = obtenerNombreUnidad(unidadDestino);

            // Milimetros
            if (unidadOrigen == 1) {

                if (unidadDestino == 2) resultado = milimetrosAMetros(valor) * 100;
                else if (unidadDestino == 3) resultado = milimetrosAMetros(valor) * 10;
                else if (unidadDestino == 4) resultado = milimetrosAMetros(valor);
                else if (unidadDestino == 5) resultado = milimetrosAMetros(valor) / 100;
                else if (unidadDestino == 6) resultado = milimetrosAMetros(valor) / 1000;
                else if (unidadDestino == 7) resultado = milimetrosAMetros(valor) / 1000;
                else if (unidadDestino == 8) resultado = milimetrosAMetros(valor) * 3.28084;
                else if (unidadDestino == 9) resultado = milimetrosAMetros(valor) * 0.00109361;
            }

            // Centimetros
            else if (unidadOrigen == 2) {

                if (unidadDestino == 1) resultado = centimetrosAMetros(valor) * 1000;
                else if (unidadDestino == 3) resultado = centimetrosAMetros(valor) * 10;
                else if (unidadDestino == 4) resultado = centimetrosAMetros(valor);
                else if (unidadDestino == 5) resultado = centimetrosAMetros(valor) / 100;
                else if (unidadDestino == 6) resultado = centimetrosAMetros(valor) / 1000;
                else if (unidadDestino == 7) resultado = centimetrosAMetros(valor) / 1000;
                else if (unidadDestino == 8) resultado = centimetrosAMetros(valor) * 3.28084;
                else if (unidadDestino == 9) resultado = centimetrosAMetros(valor) * 0.0109361;
            }

            // Decimetros
            else if (unidadOrigen == 3) {

                if (unidadDestino == 1) resultado = decimetrosAMetros(valor) * 1000;
                else if (unidadDestino == 2) resultado = decimetrosAMetros(valor) * 100;
                else if (unidadDestino == 4) resultado = decimetrosAMetros(valor);
                else if (unidadDestino == 5) resultado = decimetrosAMetros(valor) / 10;
                else if (unidadDestino == 6) resultado = decimetrosAMetros(valor) / 100;
                else if (unidadDestino == 7) resultado = decimetrosAMetros(valor) / 10;
                else if (unidadDestino == 8) resultado = decimetrosAMetros(valor) * 3.28084;
                else if (unidadDestino == 9) resultado = decimetrosAMetros(valor) * 0.109361;
            }

            // Metros
            else if (unidadOrigen == 4) {

                if (unidadDestino == 1) resultado = metrosAMilimetros(valor);
                else if (unidadDestino == 2) resultado = metrosACentimetros(valor);
                else if (unidadDestino == 3) resultado = metrosADecimetros(valor);
                else if (unidadDestino == 5) resultado = metrosADecametros(valor);
                else if (unidadDestino == 6) resultado = metrosAhectometros(valor);
                else if (unidadDestino == 7) resultado = metrosAKilometros(valor);
                else if (unidadDestino == 8) resultado = metrosAPies(valor);
                else if (unidadDestino == 9) resultado = metrosAYardas(valor);
            }

            // Decametros
            else if (unidadOrigen == 5) {

                if (unidadDestino == 1) resultado = decametrosAMetros(valor) * 1000;
                else if (unidadDestino == 2) resultado = decametrosAMetros(valor) * 100;
                else if (unidadDestino == 3) resultado = decametrosAMetros(valor) * 10;
                else if (unidadDestino == 4) resultado = decametrosAMetros(valor);
                else if (unidadDestino == 6) resultado = decametrosAMetros(valor) * 10;
                else if (unidadDestino == 7) resultado = decametrosAMetros(valor) * 100;
                else if (unidadDestino == 8) resultado = decametrosAMetros(valor) * 32.8084;
                else if (unidadDestino == 9) resultado = decametrosAMetros(valor) * 10.9361;
            }

            // Hectometros
            else if (unidadOrigen == 6) {

                if (unidadDestino == 1) resultado = hectometrosAMetros(valor) * 1000;
                else if (unidadDestino == 2) resultado = hectometrosAMetros(valor) * 100;
                else if (unidadDestino == 3) resultado = hectometrosAMetros(valor) * 10;
                else if (unidadDestino == 4) resultado = hectometrosAMetros(valor);
                else if (unidadDestino == 5) resultado = hectometrosAMetros(valor) * 10;
                else if (unidadDestino == 7) resultado = hectometrosAMetros(valor) * 100;
                else if (unidadDestino == 8) resultado = hectometrosAMetros(valor) * 328.084;
                else if (unidadDestino == 9) resultado = hectometrosAMetros(valor) * 109.361;
            }

            // Kilometros
            else if (unidadOrigen == 7) {

                if (unidadDestino == 1) resultado = kilometrosAMetros(valor) * 1000;
                else if (unidadDestino == 2) resultado = kilometrosAMetros(valor) * 100;
                else if (unidadDestino == 3) resultado = kilometrosAMetros(valor) * 10;
                else if (unidadDestino == 4) resultado = kilometrosAMetros(valor);
                else if (unidadDestino == 5) resultado = kilometrosAMetros(valor) * 10;
                else if (unidadDestino == 6) resultado = kilometrosAMetros(valor) * 100;
                else if (unidadDestino == 8) resultado = kilometrosAMetros(valor) * 3280.84;
                else if (unidadDestino == 9) resultado = kilometrosAMetros(valor) * 1093.61;
            }

            // Pies
            else if (unidadOrigen == 8) {

                if (unidadDestino == 1) resultado = piesAMetros(valor) * 1000;
                else if (unidadDestino == 2) resultado = piesAMetros(valor) * 100;
                else if (unidadDestino == 3) resultado = piesAMetros(valor) * 10;
                else if (unidadDestino == 4) resultado = piesAMetros(valor);
                else if (unidadDestino == 5) resultado = piesAMetros(valor) / 10;
                else if (unidadDestino == 6) resultado = piesAMetros(valor) / 100;
                else if (unidadDestino == 7) resultado = piesAMetros(valor) / 1000;
                else if (unidadDestino == 9) resultado = piesAMetros(valor) / 1.09361;
            }

            // Yardas
            else if (unidadOrigen == 9) {

                if (unidadDestino == 1) resultado = yardasAMetros(valor) * 1000;
                else if (unidadDestino == 2) resultado = yardasAMetros(valor) * 100;
                else if (unidadDestino == 3) resultado = yardasAMetros(valor) * 10;
                else if (unidadDestino == 4) resultado = yardasAMetros(valor);
                else if (unidadDestino == 5) resultado = yardasAMetros(valor) / 10;
                else if (unidadDestino == 6) resultado = yardasAMetros(valor) / 100;
                else if (unidadDestino == 7) resultado = yardasAMetros(valor) / 1000;
                else if (unidadDestino == 8) resultado = yardasAMetros(valor) * 3;
            }

            // Mostrar resultado con las unidades específicas
            System.out.println(valor + " " + unidadOrigenTexto + " son " + resultado + " " + unidadDestinoTexto);

            // Preguntar si desea repetir
            String respuesta;

            while (true) {
                System.out.print("Desea repetir la conversion? (si/no): ");
                respuesta = scanner.nextLine();
                if (respuesta.equalsIgnoreCase("no")) {
                    System.out.println("Gracias por la visita, saliendo del programa...");
                    return; 
                } else if (respuesta.equalsIgnoreCase("si")) {
                    break; 
                } else {
                    System.out.println("Caracter invalido");
                }
            }
        }
    }

    // Metodo para obtener el nombre de la unidad según el número seleccionado
    public static String obtenerNombreUnidad(int unidad) {
        switch (unidad) {
            case 1:
                return "milimetros";
            case 2:
                return "centimetros";
            case 3:
                return "decimetros";
            case 4:
                return "metros";
            case 5:
                return "decametros";
            case 6:
                return "hectometros";
            case 7:
                return "kilometros";
            case 8:
                return "pies";
            case 9:
                return "yardas";
            default:
                return "unidad no encontrada"; 
        }
    }
}

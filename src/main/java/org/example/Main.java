package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer idDeudor;
        String tipoDocumento;
        String documento;
        String nombres;
        String apellidos;
        String telefonoMovil;
        String telefonoFijo;
        String direccion;
        String nombreFiador;
        String docuemntoFiador;
        Integer idFiador;
        double valorBruto;
        double valorTotal;

        boolean tieneLicenciaElConductor;
        String tipooCompra;

        Scanner leer = new Scanner(System.in);

        //proceso

        System.out.println("***************");
        System.out.println("MUNDO YAMAHA");
        System.out.println("****************");

        System.out.printf("Apreciado cliente, usted cuenta con licencia?:");
        tieneLicenciaElConductor=leer.nextBoolean();

        //PRIMERA PREGUNTA O DECISION

        if (tieneLicenciaElConductor==true){
            //SI TIENE LICENCIA
            System.out.println("Nombres del Cliente: ");
            nombres=leer.nextLine();

            System.out.println("Apellidos del cliente ");
            apellidos=leer.nextLine();

            System.out.println("tipo de documento");
            tipoDocumento=leer.nextLine();

            System.out.println("numero de documento");
            documento=leer.nextLine();

            System.out.println("telefono celular");
            telefonoMovil=leer.nextLine();

            System.out.println("telefono fijo");
            telefonoFijo=leer.nextLine();

            System.out.println("dirección");
            direccion=leer.nextLine();

            System.out.println("Documento fiador: ");
            docuemntoFiador=leer.nextLine();

            System.out.println("nombre fiador: ");
            nombreFiador=leer.nextLine();

            System.out.println("Nuestras motocicletas: ");
            System.out.println("1. Yamaha SZR-125---$9000000");
            System.out.println("2. Yamaha crypton FI---$8000000");
            System.out.println("3. Yamaha XTZ125---10500000");
            System.out.println("4. Yamaha MT10---72000000");
            System.out.println("5. Yamaha NMAX300---$34000000");

            Integer motoSeleccionada;
            System.out.println("Digale la motocicleta deseada: ");
            motoSeleccionada=leer.nextInt();
            double valorMoto=0.0;

            if (motoSeleccionada==1){
                valorMoto=9000000.0;
            }else if(motoSeleccionada==2){
                valorMoto=8000000.0;
            }else if(motoSeleccionada==3){
                valorMoto=10500000.0;
            }else if (motoSeleccionada==4){
                valorMoto=72000000.0;
            }else if (motoSeleccionada==5){
                valorMoto=34000000.0;
            }else {
                System.out.println("moto invalida");
            }


            //2. pregunta: lo quiere a credito

            System.out.print("usuario digite/credito o /contado para continuar su compra: ");
            leer.nextLine();
            tipooCompra=leer.nextLine().toLowerCase();
            if (tipooCompra.equals("credito")) {
                //preguntar por % a financiar
                double porcemtajeCredito;
                System.out.println("ingresa el porcentaje a financiar");
                porcemtajeCredito = leer.nextDouble();
                if (porcemtajeCredito == 1.0) {
                    double valorIntereses=0.25;
                    valorMoto=valorMoto+(valorMoto*valorIntereses);
                } else if (porcemtajeCredito == 0.7) {
                    double valorIntereses=0.15;
                    valorMoto=valorMoto+(valorMoto*valorIntereses);
                } else if (porcemtajeCredito == 0.5) {
                    double valorIntereses=0.07;
                    valorMoto=valorMoto+(valorMoto*valorIntereses);
                } else {
                    System.out.println("opcion invalida");

                }


            }else {
                System.out.println("excelente te daremos un credito del 10%");
            }

        }else {
            // NO TIENE LICENCIA
            System.out.print("apreciado usuario,no podemos continuar con la transaccion");
            System.out.print("lo invitamos a tramitar su licencia, vuelve pronto...");
        }



    }
}
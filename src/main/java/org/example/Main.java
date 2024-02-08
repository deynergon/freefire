package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //datos del jugador

        String nickname;
        String nicknamebd="dey2004";
        String contraseña;
        String contraseñabd="dgr0402";
        Integer nivelvida = 70;
        Integer contadorskills = 0;
        Integer contadordisparos = 0;
        Integer precioskillvida = 100000;
        Integer danodisparo=-5;
        boolean estamuerto=false;

        String juego1="free fire";
        String juego2="fifa 24";
        String juegoseleccionado;

        Scanner lea =new Scanner(System.in);

        //proceso:
        System.out.println("***ingresando***");
        System.out.println("***bienvenido***");
        System.out.println("--------------");
        System.out.println("digita tu nickname");
        nickname=lea.nextLine();

        System.out.println("digita tu contraseña");
        contraseña= lea.nextLine();

      // rutina para verificar el perfil:

        if (nickname.equals(nicknamebd)&& contraseña.equals(contraseñabd)){
            System.out.println("bienvenido a psplus"+nickname);
            //rutina para iniciar el juego
            System.out.println("seleccione un juego");
            juegoseleccionado=lea.nextLine();
            if (juegoseleccionado.equals(juego1)){
                //entramos a free fire

                do {
                    //RANDOM (disparar o no)
                    Random random=new Random();
                    int disparo=random.nextInt(2);


                    if (disparo==1){
                        System.out.println("le dispararon");
                        contadordisparos=random.nextInt(2);
                        nivelvida=nivelvida-5;
                        System.out.println("te dispararon, y tu vida quedo en:"+nivelvida);
                        if (nivelvida==0){
                            estamuerto=true;
                        }
                    }else {
                        System.out.println("no le dispararon");
                        System.out.println("esquivo la bala..");
                        contadordisparos=0;
                    }

                }while (estamuerto==false);

                System.out.println("estas muerto!!");


            }else {
                System.out.println("servidores no disponibles..");
            }
        }else{
            System.out.println("usuario no encontrado..");
        }







    }
}
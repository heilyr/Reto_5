package utp.misiontic2022.c2.p23.reto4.vista;

import java.util.ArrayList;
import utp.misiontic2022.c2.p23.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p23.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p23.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p23.reto4.modelo.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static ArrayList<Requerimiento_1> requerimiento1() {
        ArrayList<Requerimiento_1>lista = new ArrayList<Requerimiento_1>();
            try{
                lista = controlador.consultarRequerimiento1();
            }catch (Exception e){
                System.err.println(e);
            }
        return lista;
    }
    public static ArrayList<Requerimiento_2> requerimiento2() {
        ArrayList<Requerimiento_2>lista = new ArrayList<Requerimiento_2>();
            try{
                lista = controlador.consultarRequerimiento2();
            }catch (Exception e){
                System.err.println(e);
            }
        return lista;


    }
    public static ArrayList<Requerimiento_3> requerimiento3() {
        ArrayList<Requerimiento_3>lista = new ArrayList<Requerimiento_3>();
            try{
                lista = controlador.consultarRequerimiento3();
            }catch (Exception e){
                System.err.println(e);
            }
        return lista;


    }

     /*   System.out.println("----------Conocer el id y la constructora de los proyectos de tipo 1 y acabados en ‘Si’----------");
        //Encabezado del resultado
        System.out.println("ID_Compra Constructora");
        try {
            ArrayList<Requerimiento_1> resultado_requerimiento1 = controlador.consultarRequerimiento1();
            resultado_requerimiento1.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Se ha producido el siguiente error:" + e.getMessage());
            e.printStackTrace();
        }
           

    public static void requerimiento2() {
        System.out.println("----------Conocer el id y la constructora de los proyectos que tengan en su tipo el estrato 2----------");
         //Encabezado del resultado
         System.out.println("ID_Compra Constructora");
        try {
            ArrayList<Requerimiento_2> resultado_requerimiento2 = controlador.consultarRequerimiento2();
            resultado_requerimiento2.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Se ha producido el siguiente error:" + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void requerimiento3() {
        System.out.println("----------Obtener el id y la fecha de los proyectos cuyo banco empiecen por la letra ‘B’ y la constructora empiece por la letra ‘H’----------");
         //Encabezado del resultado
         System.out.println("Id_Proyecto fecha");
        try {
            ArrayList<Requerimiento_3> resultado_requerimiento3 = controlador.consultarRequerimiento3();
            resultado_requerimiento3.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Se ha producido el siguiente error:" + e.getMessage());
            e.printStackTrace();
        }
    }
*/
}

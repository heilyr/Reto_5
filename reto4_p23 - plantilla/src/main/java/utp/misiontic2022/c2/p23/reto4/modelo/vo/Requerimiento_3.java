package utp.misiontic2022.c2.p23.reto4.modelo.vo;

public class Requerimiento_3 {
    // Su código
    private Integer ID_Proyecto;
    private String Fecha_Inicio;

    public void Requerimiento_3Vo() {
    }
    public Integer getID_Proyecto() {
        return ID_Proyecto;
    }
    public void setID_Proyecto(Integer iD_Proyecto) {
        ID_Proyecto = iD_Proyecto;
    }
    public String getFecha_Inicio() {
        return Fecha_Inicio;
    }
    public void setFecha_Inicio(String fecha_Inicio) {
        Fecha_Inicio = fecha_Inicio;
    }
    @Override
    public String toString() {
        return ID_Proyecto + " " + Fecha_Inicio;
    }
}

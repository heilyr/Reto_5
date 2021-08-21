package utp.misiontic2022.c2.p23.reto4.modelo.vo;

public class Proyectos {
    private int ID_Proyecto;
    private String Constructora;

    public Proyectos(int ID_Proyecto, String Constructora){
        this.ID_Proyecto = ID_Proyecto;
        this.Constructora = Constructora;
    }

    public String getConstructora() {
        return Constructora;
    }
    public void setConstructora(String constructora) {
        Constructora = constructora;
    }
    public int getID_Proyecto() {
        return ID_Proyecto;
    }
    public void setID_Proyecto(int iD_Proyecto) {
        ID_Proyecto = iD_Proyecto;
    }

}

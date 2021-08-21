package utp.misiontic2022.c2.p23.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p23.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p23.reto4.util.JDBCUtilities;

public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
       
        // Su código
        ArrayList<Requerimiento_1> respuesta = new ArrayList<Requerimiento_1>();
        Connection connection = JDBCUtilities.getConnection();

        String sql = "SELECT p.ID_Proyecto, p.Constructora FROM Proyecto p WHERE p.ID_Tipo = '1' AND p.Acabados = 'Si'";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Requerimiento_1 requerimiento1 = new Requerimiento_1();
                requerimiento1.setID_Proyecto(rs.getInt("ID_Proyecto"));
                requerimiento1.setConstructora(rs.getString("constructora"));
                respuesta.add(requerimiento1);
            }
        }

       
        // Retornar la colección de vo's
        return respuesta;

    }
}


package utp.misiontic2022.c2.p23.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p23.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.p23.reto4.util.JDBCUtilities;

public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        
        ArrayList<Requerimiento_3> respuesta = new ArrayList<Requerimiento_3>();
        Connection connection = JDBCUtilities.getConnection();
                String sql = "SELECT p.ID_Proyecto, p.Fecha_Inicio FROM Proyecto p WHERE p.Banco_Vinculado like 'B%' AND p.Constructora like 'H%'";
           try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Requerimiento_3 requerimiento3 = new Requerimiento_3();
                requerimiento3.setID_Proyecto(rs.getInt("ID_Proyecto"));
                requerimiento3.setFecha_Inicio(rs.getString("Fecha_Inicio"));
                respuesta.add(requerimiento3);

        }
    }

        // Retornar la colección de vo's
        return respuesta;

    }
}
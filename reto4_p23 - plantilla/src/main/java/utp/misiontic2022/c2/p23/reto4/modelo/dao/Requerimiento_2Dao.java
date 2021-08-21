package utp.misiontic2022.c2.p23.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p23.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p23.reto4.util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
          
            // Su código
            ArrayList<Requerimiento_2> respuesta = new ArrayList<Requerimiento_2>();
            Connection connection = JDBCUtilities.getConnection();

        String sql = "SELECT p.ID_Proyecto, p.Constructora FROM Proyecto p WHERE p.ID_Tipo = '3'";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Requerimiento_2 requerimiento2 = new Requerimiento_2();
                requerimiento2.setID_Proyecto(rs.getInt("ID_Proyecto"));
                requerimiento2.setConstructora(rs.getString("constructora"));
                respuesta.add(requerimiento2);

        }
    }

        // Retornar la colección de vo's
           
        return respuesta;

    }
}
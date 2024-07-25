package org.example.application;

import org.example.db.DB;

import java.sql.Connection;

public class Program {
    public static void main(String[] args) {

        Connection conn = DB.getConnection();
        if (conn != null) {
            System.out.println("Conexão estabelecida com sucesso.");
        } else {
            System.out.println("Falha ao estabelecer a conexão.");
        }
        DB.closeConnection();
    }
}

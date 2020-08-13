package progetto_monopoly;

import java.sql.*;
import oracle.jdbc.pool.OracleDataSource;

public class Database {

   /**
    * Indirizzo del server Oracle.
    */
   static public String host = "127.0.0.1";
   /**
    * Nome del servizio.
    */
   static public String servizio = "XE";
   /**
    * Porta utilizzata per la connessione.
    */
   static public int porta = 1521;
   /**
    * Nome utente per la connessione.
    */
   static public String user = "DB_MONO";
   /**
    * Password corrispondente all'utente specificato.
    */
   static public String password = "";
   /**
    * Nome dello schema contenente le tabelle/viste/procedure cui si vuole
    * accedere; coincide di solito con il nome utente.
    */
   static public String schema = "DB_MONO";
   /**
    * Oggetto DataSource utilizzato nella connessione al DB
    */
   static private OracleDataSource ods;
   /**
    * Variabile che contiene la connessione attiva, se esiste
    */
   static private Connection defaultConnection;

   /**
    * Creates a new instance of Database
    */
   public Database() {
   }

   static public Connection getDefaultConnection() throws SQLException {
      if (defaultConnection == null || defaultConnection.isClosed()) {
         defaultConnection = nuovaConnessione();
      }

      return defaultConnection;
   }

   static public void setDefaultConnection(Connection c) {
      defaultConnection = c;
   }

   static public Connection nuovaConnessione() throws SQLException {
      ods = new OracleDataSource();
      ods.setDriverType("thin");
      ods.setServerName(host);
      ods.setPortNumber(porta);
      ods.setUser(user);
      ods.setPassword(password);
      ods.setDatabaseName(servizio);
      return ods.getConnection();
   }
}
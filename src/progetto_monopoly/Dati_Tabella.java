
package progetto_monopoly;
import java.math.BigDecimal;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Dati_Tabella {
    //ID delle classi
    
        static Number ID_Carta; 
        static Number ID_Mossa; 
        static Number ID_Partita; 
        static Number ID_Giocatore; 
        static Number ID_Casella;
        static Number ID_Contratto; 
        static Number ID_Possedimento; 
    //Partita
        static BigDecimal numero_giocatori;
    //giocatore
        static String nome_giocatore;
    //carta
        static String Tipo_carta;
        static String Testo_carta;
        static BigDecimal Importo;
    //casella    
        static String Tipo_casella;
        static String nome_casella;
        static BigDecimal posizione;
        static BigDecimal prezzo;
        static String Tipo_non_edificabile;
        static String colore;
        static String testo_casella;
    //possedimento
        static BigDecimal Num_casa;
        static String Tipo_possedimento;
        static String Nome_possedimento;
    //Mossa
       static BigDecimal turno;
       static BigDecimal Ordine;
       static String Tipo_Mossa;
       static BigDecimal Dado1; 
       static BigDecimal Dado2;
       static String Tipo_Pagamento; 
       static BigDecimal Pagamento_dato ;
       static BigDecimal Pagamento_ricevuto;
    //Contratto
       static String Nome_contratto; 
       static String Tipo_Contratto; 
       static BigDecimal ValIpotecario;
       static String Colore; 
       static BigDecimal RenditaSemplice; 
       static BigDecimal Rendita1Casa; 
       static BigDecimal Rendita2Case; 
       static BigDecimal Rendita3Case; 
       static BigDecimal Rendita4Case;
       static BigDecimal RenditaAlbergo;
       static BigDecimal PrezzoAcquistoEd; 
       static String  Tipo_NonEd;
       static BigDecimal Rendita2Stazioni; 
       static BigDecimal Rendita3Stazioni; 
       static BigDecimal Rendita4Stazioni; 
       static BigDecimal Rendita2Società; 
       static BigDecimal Prezzo;
       static String Testo1Società;
       static String Testo2Società;
     
        
        
       
        public static  void clearTable(JTable t) {
        DefaultTableModel m = (DefaultTableModel) t.getModel();
        int x=m.getRowCount();
        for (int i = x-1; i >= 0; i--) {
            m.removeRow(i);
        }
    }
}

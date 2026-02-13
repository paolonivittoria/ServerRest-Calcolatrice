/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

import java.sql.Timestamp;
import java.util.UUID;

/**
 *
 * @author delfo
 */

public class OperazioneResponseV2 {
    private double operando1;
    private double operando2;
    private String operatore;
    private double risultato;
    private String operazione;
    private Timestamp timeStamp;
    private String requestID;
    
    // Costruttore vuoto necessario per GSON
    public OperazioneResponseV2() {
    }
    
    // Costruttore con parametri
    public OperazioneResponseV2(double operando1, double operando2, 
                             String operatore, double risultato, Timestamp timeStamp) {
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.operatore = operatore;
        this.risultato = risultato;
        this.timeStamp = timeStamp;
        this.requestID = UUID.randomUUID().toString();
        this.operazione = String.format("%.2f %s %.2f = %.2f", 
            operando1, operatore, operando2, risultato);
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }
    
    // Getter
    public double getOperando1() {
        return operando1;
    }
    
    public double getOperando2() {
        return operando2;
    }
    
    public String getOperatore() {
        return operatore;
    }
    
    public double getRisultato() {
        return risultato;
    }
    
    public String getOperazione() {
        return operazione;
    }
    
    // Setter
    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }
    
    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }
    
    public void setOperatore(String operatore) {
        this.operatore = operatore;
    }
    
    public void setRisultato(double risultato) {
        this.risultato = risultato;
    }
    
    public void setOperazione(String operazione) {
        this.operazione = operazione;
    }
}
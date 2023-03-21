/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.posttest2;

/**
 *
 * @author ASUS
 */
public class manis extends Martabak{
    private String toping;
    private String rasa;

    public void setToping(String toping) {
        this.toping = toping;
    }

    public void setRasa(String Rasa) {
        this.rasa = Rasa;
    }

    public String getToping() {
        return toping;
    }

    public String getRasa() {
        return rasa;
    }

    public manis(String toping, String jenis, String rasa, int harga) {
        super(jenis, harga);
        this.toping = toping;
        this.rasa = rasa;
    }

    
    
}

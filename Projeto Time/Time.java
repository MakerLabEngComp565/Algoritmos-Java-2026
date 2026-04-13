
package com.mycompany.testatime;

public class Time {
    int hora;
    int minuto;
    int segundo;
    boolean horaCerta = true;
    
    
    // consultor default
    public Time(){
    }

    // construtor sobrecarregado com entrada de hor, minuto e segundo
    public Time(int paramHora, int paramMinuto, int paramSegundo){
        if (paramHora >= 0 & paramHora <= 23){
            this.hora = paramHora;
        } else {
            this.horaCerta = false;
            System.out.println("Hora fora do intervalo permitido: 0 a 23h");
        } 
        if (paramMinuto >= 0 & paramMinuto <= 59){
            this.minuto = paramMinuto;
        } else {
            this.horaCerta = false;
            System.out.println("Minutos fora do intervalo permitido: 0 a 59m");
        }         
        if (paramSegundo >= 0 & paramSegundo <= 59){
            this.segundo = paramSegundo;
        } else {
            this.horaCerta = false;
            System.out.println("Segundos fora do intervalo permitido: 0 a 59s");
        }         
                
    }
    
    public void mostraFormatoUniversal(){
        if(this.horaCerta == true){
           System.out.printf("%02d:%02d:%02d horas\n", this.hora, this.minuto, this.segundo);
        } else {
            System.out.println("Hora entrada errada!");
                
        }
    }
    
    public void mostraFormatoAmPm(){
        int horaAmPm;
        String aMpM;
        
        if (this.hora >= 12) {
            horaAmPm = this.hora - 12;
            aMpM = "PM";
        } else {
            horaAmPm = this.hora;
            aMpM = "AM";
        }
        if (this.horaCerta == true) {
            System.out.printf("%02d:%02d:%02d %s\n", horaAmPm, this.minuto, this.segundo, aMpM);
        } else {
            System.out.println("Hora entrada errada!");
        }
    }
}

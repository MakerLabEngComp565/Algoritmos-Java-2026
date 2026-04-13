
package com.mycompany.testatime;

public class TestaTime {

    public static void main(String[] args) {
     Time hora1 = new Time(23,50,12);
     System.out.print("Hora no formato universal: ");
     hora1.mostraFormatoUniversal();
     System.out.println("Hora no formato AM/PM: ");
     hora1.mostraFormatoAmPm();
     System.out.println(""); // pula linha
     
     
    }
}

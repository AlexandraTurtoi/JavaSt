/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiect;

/**
 *
 * @author Alexandra
 */
public class Angajat extends Persoana {
    private float salariu;
    private String locDeMunca;
    private int perioadaContractuala;

 Angajat() {
    super();
    salariu=0 ;                              
    locDeMunca="Necunoscut";
    perioadaContractuala=0;
}
 public Angajat (String num, Date d, boolean g, int s, String ldm,int pc) {
    super(num,d,g);
    this.salariu=s;                              
    this.locDeMunca=ldm;
    this.perioadaContractuala=pc;  
}

 Angajat (Angajat  NewAngajat) {
    super(NewAngajat);
    this.salariu= NewAngajat.salariu;                         
    this.locDeMunca= NewAngajat.locDeMunca;
    this.perioadaContractuala= NewAngajat.perioadaContractuala; 
}
@Override
public String toString() {
      return super.toString()+"\nsalariu:" +salariu+
             "\nlocDeMunca:"+locDeMunca+
              "\nPerioada contractuala:"+perioadaContractuala;
}


public float getsalariu()
 { return salariu;} 

public String getlocDeMunca()
 {return locDeMunca;} 

public int getPerioadaContractuala()
 {return perioadaContractuala; } 

public void setsalariu(int s) 
{this.salariu=s;} 

public void setlocDeMunca(String ldm)
 { this.locDeMunca=ldm;} 

public void setperioadaContractuala(int pc)
 {this.perioadaContractuala=pc;} 
    
}

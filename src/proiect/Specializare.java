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
public class Specializare{
private String numeSpecializare;
private int nrTotalDeAni;
Materie[] materiiSpecializare;

Specializare(){
   
    numeSpecializare="Necunoscut";
    nrTotalDeAni=0;
    materiiSpecializare=null;
    materiiSpecializare=new Materie[1];
    materiiSpecializare[0]=new Materie();
}

Specializare(String nn,int crd,Materie[] materie){
    
   numeSpecializare=nn;                              
   nrTotalDeAni=crd; 
   this.materiiSpecializare=new Materie[materie.length];// rezerva memorie
        for (int i=0;i <materie.length;i++){
            this.materiiSpecializare[i]=materie[i];
            materiiSpecializare=materie;
        }
}
public Specializare(Specializare NewSpecializare){
    
    this.numeSpecializare=NewSpecializare.numeSpecializare;
    this.nrTotalDeAni=NewSpecializare.nrTotalDeAni;
    this.materiiSpecializare= NewSpecializare.materiiSpecializare; 
    this.materiiSpecializare=new Materie[NewSpecializare.materiiSpecializare.length];// rezerva memorie
    for (int i=0;i <materiiSpecializare.length;i++)
            this.materiiSpecializare[i]=NewSpecializare.materiiSpecializare[i];

}
Specializare(String nn){
   numeSpecializare=nn;
}



@Override
public String toString() {
    StringBuffer sir=new StringBuffer("");
    for(int i=0;i<this.materiiSpecializare.length;i++)
        sir.append(materiiSpecializare[i].toString());
      return  "\nNume:"+numeSpecializare+
              "\nNumar total de ani de studiu:"+nrTotalDeAni+
              "\nMaterii:"+materiiSpecializare;
              
            }


public String getNumeSpecializare()
 { return numeSpecializare;} 
public int getNrTotalDeAni()
 {return nrTotalDeAni;} 
public String getMaterii(int index )
    {return materiiSpecializare[index].getDenumire(); } 

public void setNumeSpecializare(String n) 
{this.numeSpecializare=n;} 

public void setNrTotalDeAni(int c)
 {this.nrTotalDeAni=c;}
public void setMaterii(Materie m, int index)
     {this.materiiSpecializare[index]=m;}
}
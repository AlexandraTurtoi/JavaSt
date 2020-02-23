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
public class Profesor extends Persoana{
        
        private int vechime;
        private String locDeMunca;
        private Materie[] materii;

 
 public Profesor() {
        super();
        vechime=0;                              
        locDeMunca ="Necunoscut";
        materii=null;
        materii=new Materie[1];
        materii[0]=new Materie();
    }
 public Profesor ( String nume, Date d, boolean g,int v, String ldm,Materie[] m)
   {
        super(nume,d,g);
        this.vechime=v;                              
        this.locDeMunca=ldm;
        this.materii=new Materie[m.length];// rezerva memorie
        for (int i=0;i <m.length;i++){
            this.materii[i]=m[i];
        }
   }

 public Profesor (Profesor  NewProfesor) {
        super(NewProfesor);
        this.vechime= NewProfesor.vechime;                         
        this.locDeMunca= NewProfesor.locDeMunca;
        this.materii= NewProfesor.materii; 
        this.materii=new Materie[NewProfesor.materii.length];// rezerva memorie
        for (int i=0;i <materii.length;i++)
            this.materii[i]=NewProfesor.materii[i];
    }
@Override
public String toString() {
    StringBuffer sir=new StringBuffer("");
    for(int i=0;i<this.materii.length;i++)
        sir.append(materii[i].toString());
      
     return  super.toString()+
             "\nlocDeMunca:"+locDeMunca+
             "\nvechime:" +vechime+
             "\nInformatii materie: "+sir.toString();
                     
}


     public int getvechime()
     { return vechime;} 

     public String getlocDeMunca()
     {return locDeMunca;} 

     public String getMaterii(int index )
    {return materii[index].getDenumire(); } 

     public void setvechime(int v) 
     {this.vechime=v;} 
     
     public void setlocDeMunca(String ldm)
     { this.locDeMunca=ldm;} 
     public void setMaterii(Materie m, int index)
     {this.materii[index]=m;} 
    
}
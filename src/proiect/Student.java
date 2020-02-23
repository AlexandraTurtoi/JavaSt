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
public class Student extends Persoana {
	private int anStudii;
        private int grupa;
	private String specializare;
         private Materie materii[];
     
	Student()
	{
	super();
	anStudii=0;
        grupa=0;
	specializare=null;
        materii=null;
        materii=new Materie[1];
        materii[0]=new Materie();
        
		
	}
	 Student(String num, Date n, boolean g, int an, String spec, int gr,Materie m[])
	 {
	 super(num,n,g);
	 anStudii=an;
         grupa=gr;
	 specializare=spec;
         this.materii=new Materie[m.length];// rezerva memorie
        for (int i=0;i <m.length;i++){
            this.materii[i]=m[i];
	 }
         }
	 public Student( Student  NewStudent)
	{   
	  super.toString();
          this.grupa=NewStudent.grupa;
	  this.anStudii=NewStudent.anStudii;                      
	  this.specializare=NewStudent.specializare;
          this.materii= NewStudent.materii; 
        this.materii=new Materie[NewStudent.materii.length];// rezerva memorie
        for (int i=0;i <materii.length;i++)
            this.materii[i]=NewStudent.materii[i];
	}
         
         @Override
	 public String toString()
	{ 
             StringBuffer sir=new StringBuffer("");
    for(int i=0;i<this.materii.length;i++)
        sir.append(materii[i].toString());
      
	return super.toString()+
                "\nAn studii:"+anStudii+
		"\nSpecializare:"+specializare+
                "\nGrupa: "+grupa+
                "\nMaterii studiate: "+sir.toString();
                
                
	}
         
         
         
	 public String getSpecializare()
         { return specializare;}
	 
         public int getAnStudiu() 
         {return anStudii;}
         
         public int getGrupa()
         {return grupa;}
         
        
	 public void setSpecializare(String spec)
	 {this.specializare=spec;}
	    
	 public void setAnStudiu(int an)
         { this.anStudii=an;}
         
         public void setGrupa(int grupa)
         {this.grupa=grupa;}

         public String getMaterii(int index )
    {return materii[index].getDenumire();}
         public int getNrMaterii()
         {   return materii.length;
         }
    
         
                  public Materie getMaterie(int index )
                  {return materii[index];}

        public void setMaterii(Materie m, int index)
     {this.materii[index]=m;} 

}
    
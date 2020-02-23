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
public class Materie {
	private String denumire;
	private int nrCredite;
	private String tipEvaluare;
        private String nota;
	
	public Materie()
	{
	denumire="Necunoscuta";
	nrCredite=0;
	tipEvaluare="Necunoscuta";
	}
	
        
        public Materie(String den, int n, String tip)
	{
	denumire=den;
	nrCredite=n;
	tipEvaluare=tip;
        
	}
	public Materie(String den, int n, String tip,String not)
	{
	denumire=den;
	nrCredite=n;
	tipEvaluare=tip;
        nota=not;
	}
	
	public Materie( Materie  NewMaterie)
	{ this.denumire=NewMaterie.denumire;                      
	  this.nrCredite=NewMaterie.nrCredite;
	  this.tipEvaluare=NewMaterie.tipEvaluare;
          this.nota=NewMaterie.nota;
	}
 
        @Override
	public String toString()
	{
	return "\nDenumire: "+denumire+
		"\nNumar credite:"+nrCredite+
	        "\nTip evaluare:"+tipEvaluare;
                
	}
        public String getDenumire() 
        { return denumire;}
   
        public int getnrCredite()
       {return nrCredite;}
    
        public String getEvaluare() 
       {return tipEvaluare;}
        
        public String getNota()
        {return nota;}
     
        public void setDenumire(String num)
        {this.denumire=num;}
    public void setNota(String not)
    {this.nota=not;}
        
        public void setnrCredite(int n)
        { this.nrCredite=n;}
    
        public void setEvaluare(String ev)
        {this.tipEvaluare=ev;}
    
     
    
}
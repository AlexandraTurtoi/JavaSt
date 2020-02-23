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

    public class Persoana  {
	private String nume;
	private Date dataNasterii;
	private boolean sex;
	
	public Persoana()
	{
	nume="Necunoscut";
	dataNasterii=null;
	sex=false;
	}
	public Persoana(String num,Date d,boolean g)
	{
		nume=num;
		dataNasterii=d;
		sex=g;
	}
	
	public Persoana( Persoana  NewPerson)
	{ this.nume=NewPerson.nume;                      
	   this.dataNasterii=NewPerson.dataNasterii;
	   this.sex=NewPerson.sex;
	}
   @Override
	public String toString()
	{//dataNasterii.toString();
	return  "\nNume: "+nume+
                "\nSex:"+gen()+
                "\nData nasterii: "+dataNasterii;
		
	}
        public String getNume()
        { return nume;}
    
        public String getdataNasterii() 
        { //return dataNasterii.getDay()+dataNasterii.getMonth()+dataNasterii.getYear();}
        return dataNasterii.toString();}
        
        public boolean getgenFeminin() 
       {return sex; }
     
        public void setNume(String nume)
        {this.nume=nume;}
    
        public void setdataNasterii(Date d)
       { this.dataNasterii=d;}
    
        public void setGenFeminin(boolean g)
        {this.sex=g;}
    
        public int varsta(int an,Date d)
        {return an-d.getYear();}
  
        public String gen()
        { boolean a=true;
          if(sex==a)
            return "feminin";
          return "masculin";
        }
}


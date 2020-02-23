
package proiect;





//Proiect realizat de Turtoi Alexandra, Nitu Loredana Elena, Rosu Mihaela, Balanescu Madalina Nicoleta




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Proiect {
/**
 *
 * @author Alexandra
 */
   
     public static void main(String[] args) {
          
        Materie B1,B2,B3,B4,BB1,BB2,b1,b2,b3;
       Materie Mat[]= new Materie[4];
       Materie Matt[]=new Materie[2];
       Materie Mattt[]=new Materie[3];
       Persoana p1,p2,p3;
       Date d1,d2,d3;
       d1=new Date();
       d2=new Date(12,3,1998);
       d3=new Date(4,11,2000);
       p1=new Persoana();
       p2=new Persoana("Alexandra",d2,true);
       p3=new Persoana("Mihai",d3,false);
       System.out.println("Clasa Persoana ");
       System.out.println("P1"+p1+"\nVarsta: "+p1.varsta(0, d1));
       System.out.println(" ");
       System.out.println("P2 "+p2+"\nVarsta: "+p2.varsta(2019,d2));
       System.out.println(" ");
       System.out.println("P3"+p3+"\nVarsta: "+p3.varsta(2019,d3));
       System.out.println(" ");
                
       Profesor P1,P2,P3;
       P1 = new Profesor();
       Date dd= new Date();
       Materie m=new Materie();
       System.out.println("Clasa Profesor");
       System.out.println("P1 "+ P1); 
       System.out.println(" ");
        
       Date d=new Date(4,1,1970);
       Materie[] materie=new Materie[]{new Materie("algebra",12,"Examen"), new Materie("info apl", 12,"Examen"),new Materie("Matlab",2,"Verificare")};
       P2= new Profesor("Dimitrie Vasile",d,false,10,"liceu",materie);
       System.out.println("P2"+P2+"\nVarsta: "+P2.varsta(2019,d));
       System.out.println(" ");
        
       P3=new Profesor(P2);
       System.out.println("P3: "+P3);
       System.out.println(" ");
       
                       
       Materie m1,m2,m3;
       m1=new Materie();
       m2=new Materie("Analiza matematica",6,"Examen","8");
       m3=new Materie(m2);
       System.out.println("Clasa Materie");
       System.out.println("M1: "+m1);
       System.out.println(" ");
       System.out.println("M2: "+m2);
       System.out.println(" ");
       System.out.println("M3: "+m3);
       System.out.println(" ");
        
       Student st,s1,s2;
       Date data= new Date(2,3,1995);
       System.out.println("Clasa Student");
       st= new Student("Angelica",data,true,2,"CTI",2,Mat);
       System.out.println("St "+st+"\nVarsta: "+st.varsta(2019, d));
       System.out.println(" ");

       s1=new Student();
       Date ad= new Date();
       System.out.println("St: "+s1+"\nVarsta: "+s1.varsta(0,ad));
       System.out.println(" ");

       Date da= new Date(2,3,1997);
       s2=new Student("Maria",d,true,1,"Automatica",1,Matt);
       System.out.println("St: "+s2+"\nVarsta: "+s2.varsta(2019,da));
       System.out.println(" ");
       
       
       Angajat a1,a2,a3;
       Date t1,t2;
       t1= new Date();
       t2= new Date(2,5,1978);
       a1=new Angajat();
       a2=new Angajat("Marius",t2,false,30000,"Facultate",10);
       a3= new Angajat(a2);
       System.out.println("Clasa Angajat");
       System.out.println("a1: "+a1+"\nVarsta: "+a1.varsta(0, t1));
       System.out.println(" ");
       System.out.println("a2: "+a2+"\nVarsta: "+a1.varsta(2019, t2));
       System.out.println(" ");
       System.out.println("a3: "+a3);
       System.out.println(" ");
       
       Persoana A1,A2,A3,A4;
       Date T1,T2,T3,T4;
       T1= new Date(2,5,1978);
       T2= new Date(2,3,1997);
       T3=new Date(4,1,1999);
       T4= new Date(13,4,1998);

       Persoana vector[]=new Persoana[4];
       A1=  new Persoana("George",T1,false);
       A2= new Persoana("Iuliana",T2,true);
       A3= new Persoana("Daniel",T3,false);
       A4=new Persoana("Ioana",T4,true);
       vector[0]=A1;
       vector[1]=A2;
       vector[2]=A3;
       vector[3]=A4;
       System.out.println("Vectorul de persoane ");
       for(int i=0;i<vector.length;i++)
                  System.out.println(vector[i]);
       
       Angajat vector1[]=new Angajat[3]; // vectorul de angajati
       a1=  new Angajat("Sabin",t2,false,3200,"Universitate",5);
       a2= new Angajat("Iulia",t2,true,3120,"Facultate",9);
       a3= new Angajat("Dana",t2,false,3210,"Facultate",8);
       vector1[0]=a1;
       vector1[1]=a2;
       vector1[2]=a3;
       System.out.println("Vectorul de angajati");
       for(int p=0;p<vector1.length;p++)
                  System.out.println(vector1[p]);
       
       B1= new Materie("Java",6,"Examen","9"); //vectorul de materii
       B2= new Materie("Electronica digitala",2,"Examen","6");
       B3= new Materie("Calculatoare numerice",4,"Examen","5");
       B4= new Materie("Sport",1,"Verificare","10");
       Mat[0]=B1;
       Mat[1]=B2;
       Mat[2]=B3;
       Mat[3]=B4;
       System.out.println("Vectorul de materii ");
       for(int i=0;i<Mat.length;i++)
           System.out.println(Mat[i]);
        
       BB1= new Materie("Engleza",1,"Verificare","10");
       BB2= new Materie("Franceza",1,"Verificare","8");
       Matt[0]=BB1;
       Matt[1]=BB2;
       System.out.println("Vectorul de materii ");
       for(int i=0;i<Matt.length;i++)
           System.out.println(Matt[i]);
       
       b1= new Materie("Drept civil",4,"Examen","6");
       b2= new Materie("Criminalistica",6,"Examen","8");
       b3= new Materie("Cod penal",6,"Examen","7");
       Mattt[0]=b1;
       Mattt[1]=b2;
       Mattt[2]=b3;
       System.out.println("Vectorul de materii ");
       for(int i=0;i<Mattt.length;i++)
           System.out.println(Mattt[i]);
       
       System.out.println(" ");
       Student Student[]=new Student[4];
       Student S1,S2,S3,S4;
       S1= new Student("Andrei",T1,false,4,"Cti",3,Mat);
       S2= new Student("Miruna",T2,true,2,"Automatica",2,Matt);
       S3= new Student("Eusebiu",T3,false,1,"Inginerie electrica",1,Mattt);
       S4= new Student("Betrice",T4,true,4,"Electronica",1,Matt );
       
       Student[0]=S1;   
       Student[1]=S2;
       Student[2]=S3;
       Student[3]=S4;
       System.out.println("Vector de studenti ");
       for(int k=0;k<Student.length;k++)
           System.out.println(Student[k]);
       
       System.out.println(" ");
       Materie bb1,bb2,bb3,bb4;
       Materie Mt[]= new Materie[4];
       bb1= new Materie("Java",6,"Examen");
       bb2= new Materie("Electronica digitala",2,"Examen");
       bb3= new Materie("Calculatoare numerice",4,"Examen");
       bb4= new Materie("Sport",1,"Verificare");
       Mt[0]=B1;
       Mt[1]=B2;
       Mt[2]=B3;
       Mt[3]=B4;
       System.out.println("Vectorul de materii ");
       for(int i=0;i<Mt.length;i++)
           System.out.println(Mt[i]);

       System.out.println(" ");
       System.out.println("Vectorul de persoane cu genul feminin este");// cerinta S7
       for(int i=0;i<vector.length;i++){
         if(vector[i].gen()=="feminin")
           System.out.println(vector[i]);}
       
       System.out.println(" ");
       System.out.println("Vector de studenti de la Cti ");
       for(int k=0;k<Student.length;k++){ 
        if(Student[k].getSpecializare()=="Cti")
              System.out.println(Student[k]);
        }
       
       System.out.println(" ");
       System.out.println("Materii cu peste 3 credite");
       for(int i=0;i<Mat.length;i++){
        if(Mat[i].getnrCredite()>3)
           System.out.println(Mat[i]);
       }
        Specializare Sp1,Sp2,Sp3;
        Materie[] matt= new Materie[]{new Materie("algebra",12,"Examen"), new Materie("info apl", 12,"Examen"),new Materie("Matlab",2,"Verificare")};
        Specializare Sp[]= new Specializare[3];
        Sp1= new Specializare();
        Materie mat=new Materie();
        System.out.println("Clasa Specializare");
        System.out.println("C" +Sp1);
        System.out.println(" ");


        Sp2= new Specializare("Cti",4,matt);
        System.out.println("A"+ Sp2);
        System.out.println(" ");

        Sp3=new Specializare(Sp2);
        System.out.println("IE"+ Sp3);
        System.out.println(" ");

    
        Profesor profesor[]=new Profesor[4];
       Profesor Pr1,Pr2,Pr3,Pr4;
       Date w1,w2,w3,w4;
       w1= new Date(3,4,1968);
       w2= new Date(2,3,1954);
       w3=new Date(4,1,1981);
       w4= new Date(13,4,1960);
       Pr1=  new Profesor ("Barnea Maria",w1,true,15,"Universitatea Dunarea de Jos", Mat); 
       Pr2= new Profesor("Neculae Eduard",w2,false,8,"Universitatea Danubius",Mat);
       Pr3= new Profesor("Chirila Andrei",w3,false,5,"Universitatea Alexandru Ioan Cuza",Mat);
       Pr4=new Profesor("Enache Andreea",w4,true,12,"Universitatea Dunarea de Jos",Mat);
       profesor[0]=Pr1;
       profesor[1]=Pr2;
       profesor[2]=Pr3;
       profesor[3]=Pr4;
       System.out.println("Vectorul de profesori ");
       for(int i=0;i<profesor.length;i++)
           System.out.println((profesor[i]));
   
 
    
       System.out.println(" "); //cerinta 7 LORI
       System.out.println("Vectorul de angajati cu salariul mai mic de 32000 este");
       for(int p=0;p<vector1.length;p++){
         if(vector1[p].getsalariu()<3200)
           System.out.println(vector[p]);}
       
       System.out.println(" "); 
       System.out.println("Vectorul locului de munca");
       for(int ok=0;ok<profesor.length;ok++){
         if(profesor[ok]. getlocDeMunca()=="Universitatea Dunarea de Jos");
           System.out.println(profesor[ok]);}
       
       
       Interfata interfata=new Interfata();
       interfata.setVisible(true);
       
    }}
       
       
       
    
    


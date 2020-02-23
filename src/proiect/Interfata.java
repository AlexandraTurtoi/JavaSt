/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//Proiect realizat de Turtoi Alexandra, Nitu Loredana Elena, Rosu Mihaela, Balanescu Madalina Nicoleta


package proiect;
import java.awt.Choice;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import javax.swing.DefaultComboBoxModel;


/**
 *
 * @author Alexandra
 */
public class Interfata extends javax.swing.JFrame {
     
       Persoana p1,p2,p3; //initializare
       Date d1,d2,d3;
       Persoana vector[]=new Persoana[3];
       Angajat a1,a2,a3;
       Angajat angajati[]=new Angajat[3];
       Date t1,t2,t3;
       Student S1,S2,S3;
       Student studenti[]=new Student[3];
       Date T1,T2,T3;
       Profesor Pr1,Pr2,Pr3;
       Profesor profesori[]=new Profesor[3];
       Date w1,w2,w3,w4;
       Materie B1,B2,B3,B4,BB1,BB2,b1,b2,b3,r1,r2,r3,r4,f1,f2,g1,g2,g3;
       Materie Mat[]= new Materie[4];
       Materie Matt[]=new Materie[2];
       Materie Mattt[]=new Materie[3];
       Materie M[]= new Materie[4];
       Materie MM[]=new Materie[2];
       Materie MMM[]=new Materie[3];
       Specializare Sp1,Sp2,Sp3;
       Specializare specializari[]=new Specializare[2];
        

    /**
     * Creates new form Interfata
     */
    public Interfata() { //declarari
       initComponents();
       d1=new Date(3,10,1978);
       d2=new Date(12,3,1998);
       d3=new Date(4,11,2000);
       p1=new Persoana("Geanina",d1,true);
       p2=new Persoana("Alexandra",d2,true);
       p3=new Persoana("Mihai",d3,false);
       vector[0]=p1;
       vector[1]=p2;
       vector[2]=p3;
       for(int i=0;i<vector.length;i++)
           System.out.println(vector[i]);
       
       t1= new Date(14,3,1967);
       t2= new Date(2,5,1978);
       t3= new Date(24,10,1969);
       a1=new Angajat("Luiza Antohe",t1,true,32000,"Facultate",8);
       a2=new Angajat("Trandafir Marius",t2,false,30000,"Facultate",10);
       a3= new Angajat("Codreanu Mariana", t3,true,2000,"Liceu",12);
       angajati[0]=a1;
       angajati[1]=a2;
       angajati[2]=a3;
       
       B1= new Materie("Java",6,"Examen","10");
       B2= new Materie("Electronica digitala",2,"Examen","6");
       B3= new Materie("Calculatoare numerice",4,"Examen","3");
       B4= new Materie("Sport",1,"Verificare","10");
       Mat[0]=B1;
       Mat[1]=B2;
       Mat[2]=B3;
       Mat[3]=B4;
       
        
       BB1= new Materie("Engleza",1,"Verificare","9");
       BB2= new Materie("Franceza",1,"Verificare","8");
       Matt[0]=BB1;
       Matt[1]=BB2;
     
       
       b1= new Materie("Drept civil",4,"Examen","7");
       b2= new Materie("Criminalistica",6,"Examen","5");
       b3= new Materie("Cod penal",6,"Examen","8");
       Mattt[0]=b1;
       Mattt[1]=b2;
       Mattt[2]=b3;
      
       
       T1= new Date(31,12,1996);
       T2=new Date(12,3,1999);
       T3=new Date(7,10,1998);
       S1= new Student("Andrei",T1,false,4,"Cti",3,Mat);
       S2= new Student("Miruna",T2,true,2,"Automatica",2,Matt);
       S3= new Student("Eusebiu",T3,false,1,"Inginerie electrica",1,Mattt);
       studenti[0]=S1;
       studenti[1]=S2;
       studenti[2]=S3;
       
       r1= new Materie("Java",6,"Examen");
       r2= new Materie("Electronica digitala",2,"Examen");
       r3= new Materie("Calculatoare numerice",4,"Examen");
       r4= new Materie("Sport",1,"Verificare");
       M[0]=B1;
       M[1]=B2;
       M[2]=B3;
       M[3]=B4;
       System.out.println("Vectorul de materii ");
       for(int i=0;i<Mat.length;i++)
           System.out.println(Mat[i]);
        
       f1= new Materie("Engleza",1,"Verificare");
       f2= new Materie("Franceza",1,"Verificare");
       MM[0]=BB1;
       MM[1]=BB2;
       System.out.println("Vectorul de materii ");
       for(int i=0;i<Matt.length;i++)
           System.out.println(Matt[i]);
       
       g1= new Materie("Drept civil",4,"Examen");
       g2= new Materie("Criminalistica",6,"Examen");
       g3= new Materie("Cod penal",6,"Examen");
       MMM[0]=b1;
       MMM[1]=b2;
       MMM[2]=b3;
       System.out.println("Vectorul de materii ");
       for(int i=0;i<Mattt.length;i++)
           System.out.println(Mattt[i]);
       
       w1= new Date(3,4,1977);
       w2= new Date(2,3,1967);
       w3= new Date(4,1,1960);
       Pr1= new Profesor ("Barnea Maria",w1,true,15,"Universitatea Dunarea de Jos", M); 
       Pr2= new Profesor("Neculae Eduard",w2,false,8,"Universitatea Danubius",MM);
       Pr3= new Profesor("Chirila Andrei",w3,false,5,"Universitatea Alexandru Ioan Cuza",MMM);
       profesori[0]=Pr1;
       profesori[1]=Pr2;
       profesori[2]=Pr3;

       
       
       Sp1= new Specializare("AIA",4,Mat);
       Sp2= new Specializare("Cti",4,Matt);
       Sp3=new Specializare("IE",4,Mattt);
       Specializare specializari[]=new Specializare[3];
       specializari[0]=Sp1;
       specializari[1]=Sp2;
       specializari[2]=Sp3;		
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Box1 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Box2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        Box3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Box4 = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        Box5 = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        Box6 = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Box7 = new javax.swing.JComboBox();
        jButton6 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setText("Persoane");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(153, 204, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        Box1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Geanina", "Alexandra", "Mihai" }));
        Box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box1ActionPerformed(evt);
            }
        });

        jButton2.setText("Show");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Profesori");

        Box2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Barnea Maria", "Neculae Eduard", "Chirila Andrei" }));

        jButton1.setText("Show");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(153, 204, 255));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel3.setText("Search by name");

        Box3.setBackground(new java.awt.Color(0, 204, 255));
        Box3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Box3FocusGained(evt);
            }
        });
        Box3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box3ActionPerformed(evt);
            }
        });
        Box3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Box3KeyTyped(evt);
            }
        });

        jButton3.setText("Go!");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Angajati");

        Box4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Luiza Antohe", "Trandafir Marius", "Codreanu Mariana" }));
        Box4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box4ActionPerformed(evt);
            }
        });

        jButton4.setText("Show");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(153, 204, 255));
        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        Box5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Andrei", "Miruna", "Eusebiu" }));
        Box5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box5ActionPerformed(evt);
            }
        });

        jButton5.setText("Show");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextArea5.setEditable(false);
        jTextArea5.setBackground(new java.awt.Color(153, 204, 255));
        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        jLabel5.setText("Studentii");

        Box6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select student", "Andrei", "Miruna", "Eusebiu" }));
        Box6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box6ActionPerformed(evt);
            }
        });

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(153, 153, 153));
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jLabel6.setText("Student");

        jLabel7.setText("Materie");

        jLabel10.setText("Nota");

        Box7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box7ActionPerformed(evt);
            }
        });

        jButton6.setText("Ok");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(102, 102, 102));
        jScrollPane6.setViewportView(jTextPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Box6, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(Box7, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Box5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Box1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2))
                                    .addComponent(jScrollPane5)
                                    .addComponent(jScrollPane1))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Box4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(Box2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(jButton1))
                                    .addComponent(jScrollPane4)
                                    .addComponent(jScrollPane2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jLabel5)
                                .addGap(252, 252, 252)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Box3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jButton3))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel6)
                .addGap(211, 211, 211)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(156, 156, 156))
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(245, 245, 245)
                .addComponent(jLabel4)
                .addGap(196, 196, 196)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Box4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4)
                                .addComponent(Box3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Box1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel2))
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton5)
                                            .addComponent(Box2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(Box5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2)))
                            .addComponent(jScrollPane3))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6)))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Box6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Box7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    if(Box1.getSelectedItem().equals("Geanina")){
            jTextArea1.setText(p1.toString());
        }else if (Box1.getSelectedItem().equals("Alexandra")){
                    
                    jTextArea1.setText("P2 "+p2+"\nVarsta: "+p2.varsta(2019,d2));

        }else if (Box1.getSelectedItem().equals("Mihai")){
                    jTextArea1.setText(p3.toString());  }      // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if (Box2.getSelectedItem().equals("Barnea Maria")){
        jTextArea2.setText(Pr1.toString());
        }
        else if (Box2.getSelectedItem().equals("Neculae Eduard")){
        jTextArea2.setText(Pr2.toString());}
        
        else if (Box2.getSelectedItem().equals("Chirila Andrei")){
        jTextArea2.setText(Pr3.toString());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Box3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box3ActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_Box3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
             
        
        for(int i=0;i<vector.length;i++) //nume inexistent
        { if (Box3.getText().compareTo(vector[i].getNume())==0)
         jTextArea3.setText(vector[i].toString());
        else jTextArea3.setText("Nu exista");

        }    
        
         for(int i=0;i<studenti.length;i++)
        { if (Box3.getText().compareTo(studenti[i].getNume())==0)
         jTextArea3.setText(studenti[i].toString());
        
            
        }    
         
          for(int i=0;i<angajati.length;i++)
        { if (Box3.getText().compareTo(angajati[i].getNume())==0)
         jTextArea3.setText(angajati[i].toString());
        
            
        }   
       
          for(int i=0;i<profesori.length;i++)
        { if (Box3.getText().compareTo(profesori[i].getNume())==0)
         jTextArea3.setText(profesori[i].toString());
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Box3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Box3FocusGained
       if(Box3.getText().equals(" ")){
       Box3.setText("Numele");
       }
       
       
    }//GEN-LAST:event_Box3FocusGained

    private void Box3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Box3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Box3KeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        // TODO add your handling code here:
         if (Box4.getSelectedItem().equals("Luiza Antohe")){
        jTextArea4.setText(a1.toString());
        }
        else if (Box4.getSelectedItem().equals("Trandafir Marius")){
        jTextArea4.setText(a2.toString());}
        
        else if (Box4.getSelectedItem().equals("Codreanu Mariana")){
        jTextArea4.setText(a3.toString());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (Box5.getSelectedItem().equals("Andrei")){
        jTextArea5.setText(S1.toString());
        }
        else if (Box5.getSelectedItem().equals("Miruna")){
        jTextArea5.setText(S2.toString());}
        
        else if (Box5.getSelectedItem().equals("Eusebiu")){
        jTextArea5.setText(S3.toString());}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void Box6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box6ActionPerformed
        // TODO add your handling code here:
        String var= (Box6.getSelectedItem()).toString();
        int itemCount= Box7.getItemCount();
        
        for (int i=0;i<itemCount;i++)
        {Box7.removeItemAt(0);}
         for(int i=0;i<studenti.length;i++)
        { if (var.compareTo(studenti[i].getNume())==0){
            for(int j=0;j<studenti[i].getNrMaterii();j++){
                
              Box7.addItem(studenti[i].getMaterii(j));
            }
        }
            }
    }//GEN-LAST:event_Box6ActionPerformed

    private void Box7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box7ActionPerformed
       
       
        
    }//GEN-LAST:event_Box7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       String var= (Box6.getSelectedItem()).toString();
       String tp=(Box7.getSelectedItem()).toString();
   String xd;
     String aa;
        int itemCount= Box7.getItemCount();
        
        
         for(int i=0;i<studenti.length;i++)
        { if (var.compareTo(studenti[i].getNume())==0){
            for(int j=0;j<studenti[i].getNrMaterii();j++){
                if((studenti[i].getMaterii(j)).compareTo(tp)==0)
                {  xd=(studenti[i].getMaterie(j).getNota());
                jTextPane1.setText(xd.toString());
            }
        }
        }}
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void Box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Box1ActionPerformed

    private void Box5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Box5ActionPerformed

    private void Box4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Box4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Box1;
    private javax.swing.JComboBox Box2;
    private javax.swing.JTextField Box3;
    private javax.swing.JComboBox Box4;
    private javax.swing.JComboBox Box5;
    private javax.swing.JComboBox Box6;
    private javax.swing.JComboBox Box7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}

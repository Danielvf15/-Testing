package jeugotresenraya;

import java.awt.Color;

public class ventana extends javax.swing.JFrame {

    public ventana() {
        initComponents();
        llenar();
        jo.setBackground(Color.white);
        jx.setBackground(Color.yellow);
        // ocultar las lineas
        diagonal1.setVisible(false);
        diagonal2.setVisible(false);
        izqver.setVisible(false);
        derver.setVisible(false);
        mediover.setVisible(false);
        mediohor.setVisible(false);
        arriba.setVisible(false);
        abajo.setVisible(false);
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    int matriz[][] = new int[3][3];
    public void llenar ()
    {
        for(int i=0;i < 3; i++)
        {
            for(int j=0;j < 3; j++)
            {
                matriz[i][j] =(j+10)*(i+10);
            }
        }
    }
    juegoLogica l = new juegoLogica(0,0,0);
    
    //cambiar color turno
    public void turnoar()
    {
        if(l.getTurno()==1)
        {
            jPanel3.setBackground(Color.yellow);
            jPanel4.setBackground(Color.white);
        }
        if(l.getTurno()==0)
        {
            jPanel3.setBackground(Color.white);
            jPanel4.setBackground(Color.yellow);
        }
        if(jx.getText()== puntaje.getText() || jo.getText()== puntaje.getText() )
        {
            Mensaje mn = new Mensaje();
            mn.setVisible(true);            
        }
    }
    //reiniciar el juego
    public void reiniciar()
    {
        llenar();
        b00.setText("");
        b00.setEnabled(true);
        b01.setText("");
        b01.setEnabled(true);
        b02.setText("");
        b02.setEnabled(true);
        b10.setText("");
        b10.setEnabled(true);
        b11.setText("");
        b11.setEnabled(true);
        b12.setText("");
        b12.setEnabled(true);
        b20.setText("");
        b20.setEnabled(true);
        b21.setText("");
        b21.setEnabled(true);
        b22.setText("");
        b22.setEnabled(true);
        diagonal1.setVisible(false);
        diagonal2.setVisible(false);
        izqver.setVisible(false);
        derver.setVisible(false);
        mediover.setVisible(false);
        mediohor.setVisible(false);
        arriba.setVisible(false);
        abajo.setVisible(false);

    }
    public void BorrarTodo()
    {
        llenar();
        b00.setText("");
        b00.setEnabled(true);
        b01.setText("");
        b01.setEnabled(true);
        b02.setText("");
        b02.setEnabled(true);
        b10.setText("");
        b10.setEnabled(true);
        b11.setText("");
        b11.setEnabled(true);
        b12.setText("");
        b12.setEnabled(true);
        b20.setText("");
        b20.setEnabled(true);
        b21.setText("");
        b21.setEnabled(true);
        b22.setText("");
        b22.setEnabled(true);
        jx.setText("0");
        jx.setEnabled(true);
        jo.setText("0");
        jo.setEnabled(true);
        diagonal1.setVisible(false);
        diagonal2.setVisible(false);
        izqver.setVisible(false);
        derver.setVisible(false);
        mediover.setVisible(false);
        mediohor.setVisible(false);
        arriba.setVisible(false);
        abajo.setVisible(false);
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        diagonal1 = new javax.swing.JLabel();
        diagonal2 = new javax.swing.JLabel();
        arriba = new javax.swing.JPanel();
        mediohor = new javax.swing.JPanel();
        abajo = new javax.swing.JPanel();
        izqver = new javax.swing.JPanel();
        mediover = new javax.swing.JPanel();
        derver = new javax.swing.JPanel();
        b00 = new javax.swing.JButton();
        b01 = new javax.swing.JButton();
        b02 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b20 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        borrar1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jx = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        puntaje = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        diagonal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/dia1.png"))); // NOI18N
        jPanel1.add(diagonal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 390, -1));

        diagonal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/dia2.png"))); // NOI18N
        jPanel1.add(diagonal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -10, 430, -1));

        arriba.setBackground(new java.awt.Color(255, 0, 0));
        arriba.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout arribaLayout = new javax.swing.GroupLayout(arriba);
        arriba.setLayout(arribaLayout);
        arribaLayout.setHorizontalGroup(
            arribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        arribaLayout.setVerticalGroup(
            arribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(arriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 310, 10));

        mediohor.setBackground(new java.awt.Color(255, 0, 0));
        mediohor.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout mediohorLayout = new javax.swing.GroupLayout(mediohor);
        mediohor.setLayout(mediohorLayout);
        mediohorLayout.setHorizontalGroup(
            mediohorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        mediohorLayout.setVerticalGroup(
            mediohorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(mediohor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 310, 10));

        abajo.setBackground(new java.awt.Color(255, 0, 0));
        abajo.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout abajoLayout = new javax.swing.GroupLayout(abajo);
        abajo.setLayout(abajoLayout);
        abajoLayout.setHorizontalGroup(
            abajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        abajoLayout.setVerticalGroup(
            abajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(abajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 310, 10));

        izqver.setBackground(new java.awt.Color(255, 0, 0));
        izqver.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout izqverLayout = new javax.swing.GroupLayout(izqver);
        izqver.setLayout(izqverLayout);
        izqverLayout.setHorizontalGroup(
            izqverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        izqverLayout.setVerticalGroup(
            izqverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        jPanel1.add(izqver, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 260));

        mediover.setBackground(new java.awt.Color(255, 0, 0));
        mediover.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout medioverLayout = new javax.swing.GroupLayout(mediover);
        mediover.setLayout(medioverLayout);
        medioverLayout.setHorizontalGroup(
            medioverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        medioverLayout.setVerticalGroup(
            medioverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        jPanel1.add(mediover, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, 260));

        derver.setBackground(new java.awt.Color(255, 0, 0));
        derver.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout derverLayout = new javax.swing.GroupLayout(derver);
        derver.setLayout(derverLayout);
        derverLayout.setHorizontalGroup(
            derverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        derverLayout.setVerticalGroup(
            derverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        jPanel1.add(derver, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, 260));

        b00.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b00.setForeground(new java.awt.Color(255, 0, 0));
        b00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b00ActionPerformed(evt);
            }
        });
        jPanel1.add(b00, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 111, 91));

        b01.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b01ActionPerformed(evt);
            }
        });
        jPanel1.add(b01, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 11, 111, 91));

        b02.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b02ActionPerformed(evt);
            }
        });
        jPanel1.add(b02, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 11, 111, 91));

        b10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        jPanel1.add(b10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 113, 111, 91));

        b11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        jPanel1.add(b11, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 113, 111, 91));

        b12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });
        jPanel1.add(b12, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 113, 111, 91));

        b20.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b20ActionPerformed(evt);
            }
        });
        jPanel1.add(b20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 215, 111, 91));

        b21.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });
        jPanel1.add(b21, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 215, 111, 91));

        b22.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });
        jPanel1.add(b22, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 215, 111, 91));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 320));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Jugar de Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 170, -1));

        borrar1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        borrar1.setText("Salir del Juego");
        borrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(borrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Seleccionar nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("JUGADOR X");

        jx.setBackground(new java.awt.Color(255, 0, 0));
        jx.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jx.setForeground(new java.awt.Color(255, 0, 51));
        jx.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jx, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jx, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setBackground(new java.awt.Color(0, 0, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("JUGADOR O");

        jo.setBackground(new java.awt.Color(0, 0, 204));
        jo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jo.setForeground(new java.awt.Color(0, 0, 204));
        jo.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Puntaje Ganador");

        puntaje.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(puntaje, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(puntaje, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 170, 220));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/earth-from-space_206799488.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, -5, 670, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b01ActionPerformed
        turnoar();
        l.rayar(matriz, arriba, 1, 0,1);
        l.rayar(matriz, mediover, 5, 0,1);
        if(l.ejecutar(b01, 0, 1, matriz, jx, jo)==1)
        {
           reiniciar(); 
        }
    }//GEN-LAST:event_b01ActionPerformed

    private void b02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b02ActionPerformed
        turnoar();
        // la posibilidad numero 1, en que posicion de la matriz 0,2
        l.rayar(matriz, arriba, 1, 0, 2);
        l.rayar(matriz, derver, 6, 0, 2);
        l.rayar(matriz, diagonal2, 8, 0, 2);
        if(l.ejecutar(b02, 0, 2, matriz, jx, jo)==1)
        {
            reiniciar();
        }
    }//GEN-LAST:event_b02ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        turnoar();
        // la posibilidad numero 4, en que posicion de la matriz 1,0
        l.rayar(matriz, izqver, 4, 1,0);
        l.rayar(matriz, mediohor, 2, 1, 0);
        if(l.ejecutar(b10, 1, 0, matriz, jx, jo)==1)
        {
            reiniciar();
        }
    }//GEN-LAST:event_b10ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        turnoar();
        // la posibilidad numero 7, en que posicion de la matriz 1,1
        l.rayar(matriz, diagonal1, 7, 1,1);
        l.rayar(matriz, diagonal2, 8, 1, 1);
        l.rayar(matriz, mediover, 5, 1,1);
        l.rayar(matriz, mediohor, 2, 1, 1);
        
        if(l.ejecutar(b11, 1, 1, matriz, jx, jo)==1)
        {
            reiniciar();
        }
    }//GEN-LAST:event_b11ActionPerformed

    private void b00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b00ActionPerformed
        turnoar();
        // la posibilidad numero 7, en que posicion de la matriz 0,0
        l.rayar(matriz, diagonal1, 7, 0,0);
        l.rayar(matriz, arriba, 1, 0,0);
        l.rayar(matriz, izqver, 4, 0,0);
        if(l.ejecutar(b00, 0, 0, matriz, jx, jo)==1)
        {
            reiniciar();
        }   
    }//GEN-LAST:event_b00ActionPerformed

    private void b20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b20ActionPerformed
        turnoar();
        // la posibilidad numero 4, en que posicion de la matriz 2,0
        l.rayar(matriz, izqver, 4, 2,0);
        l.rayar(matriz, abajo, 3, 2, 0);
        l.rayar(matriz, diagonal2, 8, 2, 0);
        if(l.ejecutar(b20, 2, 0, matriz, jx, jo)==1)
        {
            reiniciar();
        }
    }//GEN-LAST:event_b20ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        turnoar();
        // la posibilidad numero 6, en que posicion de la matriz 1,2
        l.rayar(matriz, derver, 6, 1, 2);
        l.rayar(matriz, mediohor, 2, 1, 2);
        if(l.ejecutar(b12, 1, 2, matriz, jx, jo)==1)
        {
            reiniciar();
        }
    }//GEN-LAST:event_b12ActionPerformed

    private void b21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b21ActionPerformed
        turnoar();
        // la posibilidad numero 5, en que posicion de la matriz 12,1
        l.rayar(matriz, mediover, 5, 2,1);
        l.rayar(matriz, abajo, 3, 2, 1);
        if(l.ejecutar(b21, 2, 1, matriz, jx, jo)==1)
        {
            reiniciar();
        }
    }//GEN-LAST:event_b21ActionPerformed

    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b22ActionPerformed
        turnoar();
        // la posibilidad numero 7, en que posicion de la matriz 2,2
        l.rayar(matriz, diagonal1, 7, 2,2);
        l.rayar(matriz, derver, 6, 2, 2);
        l.rayar(matriz, abajo, 3, 2, 2);
        if(l.ejecutar(b22, 2, 2, matriz, jx, jo)==1)
        {
            reiniciar();
        }
    }//GEN-LAST:event_b22ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        reiniciar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void borrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrar1ActionPerformed
        dispose();
    }//GEN-LAST:event_borrar1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        RegistroPrincipal a = new RegistroPrincipal();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abajo;
    private javax.swing.JPanel arriba;
    private javax.swing.JButton b00;
    private javax.swing.JButton b01;
    private javax.swing.JButton b02;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b20;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JButton borrar1;
    private javax.swing.JPanel derver;
    private javax.swing.JLabel diagonal1;
    private javax.swing.JLabel diagonal2;
    private javax.swing.JPanel izqver;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JLabel jo;
    public static javax.swing.JLabel jx;
    private javax.swing.JPanel mediohor;
    private javax.swing.JPanel mediover;
    public static javax.swing.JLabel puntaje;
    // End of variables declaration//GEN-END:variables
}

package Calculadora;

import java.awt.Color;
import java.awt.Frame;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.swing.ImageIcon;

public class Calculadora extends javax.swing.JFrame {

    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");

    float numero1;
    float numero2;
    String operador;

    public Calculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pantalla = new javax.swing.JLabel();
        botonBorrar = new javax.swing.JButton();
        botonResta = new javax.swing.JButton();
        botonSuma = new javax.swing.JButton();
        botonMulti = new javax.swing.JButton();
        botonDividir = new javax.swing.JButton();
        botonUno = new javax.swing.JButton();
        botonResto = new javax.swing.JButton();
        botonNueve = new javax.swing.JButton();
        botonSeis = new javax.swing.JButton();
        botonOcho = new javax.swing.JButton();
        botonSiete = new javax.swing.JButton();
        botonBorrarTodo = new javax.swing.JButton();
        botonCuatro = new javax.swing.JButton();
        botonCinco = new javax.swing.JButton();
        botonTres = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();
        botonDos = new javax.swing.JButton();
        botonCero = new javax.swing.JButton();
        botonPunto = new javax.swing.JButton();
        modoOscuro = new javax.swing.JButton();
        minimizar = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(241, 241, 243));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pantalla.setFont(new java.awt.Font("Roboto Light", 0, 50)); // NOI18N
        pantalla.setForeground(new java.awt.Color(254, 158, 20));
        pantalla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 280, 80));

        botonBorrar.setBackground(new java.awt.Color(241, 241, 243));
        botonBorrar.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        botonBorrar.setForeground(new java.awt.Color(255, 232, 200));
        botonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_a.png"))); // NOI18N
        botonBorrar.setText("c");
        botonBorrar.setFocusPainted(false);
        botonBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonBorrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_a.png"))); // NOI18N
        botonBorrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_a_presionada.png"))); // NOI18N
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(botonBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 50, 50));

        botonResta.setBackground(new java.awt.Color(241, 241, 243));
        botonResta.setFont(new java.awt.Font("Roboto", 0, 48)); // NOI18N
        botonResta.setForeground(new java.awt.Color(255, 232, 200));
        botonResta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_a.png"))); // NOI18N
        botonResta.setText("-");
        botonResta.setFocusPainted(false);
        botonResta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonResta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_a.png"))); // NOI18N
        botonResta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_a_presionada.png"))); // NOI18N
        botonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestaActionPerformed(evt);
            }
        });
        jPanel1.add(botonResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 50, 50));

        botonSuma.setBackground(new java.awt.Color(241, 241, 243));
        botonSuma.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        botonSuma.setForeground(new java.awt.Color(255, 232, 200));
        botonSuma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_a.png"))); // NOI18N
        botonSuma.setText("+");
        botonSuma.setFocusPainted(false);
        botonSuma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonSuma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_a.png"))); // NOI18N
        botonSuma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_a_presionada.png"))); // NOI18N
        botonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSumaActionPerformed(evt);
            }
        });
        jPanel1.add(botonSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 50, 50));

        botonMulti.setBackground(new java.awt.Color(241, 241, 243));
        botonMulti.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        botonMulti.setForeground(new java.awt.Color(255, 232, 200));
        botonMulti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_a.png"))); // NOI18N
        botonMulti.setText("x");
        botonMulti.setFocusPainted(false);
        botonMulti.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonMulti.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_a.png"))); // NOI18N
        botonMulti.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_a_presionada.png"))); // NOI18N
        botonMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMultiActionPerformed(evt);
            }
        });
        jPanel1.add(botonMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 50, 50));

        botonDividir.setBackground(new java.awt.Color(241, 241, 243));
        botonDividir.setFont(new java.awt.Font("Roboto", 0, 27)); // NOI18N
        botonDividir.setForeground(new java.awt.Color(255, 232, 200));
        botonDividir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_a.png"))); // NOI18N
        botonDividir.setText("/");
        botonDividir.setFocusPainted(false);
        botonDividir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonDividir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_a.png"))); // NOI18N
        botonDividir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_a_presionada.png"))); // NOI18N
        botonDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDividirActionPerformed(evt);
            }
        });
        jPanel1.add(botonDividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 50, 50));

        botonUno.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        botonUno.setForeground(new java.awt.Color(165, 164, 167));
        botonUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b.png"))); // NOI18N
        botonUno.setText("1");
        botonUno.setFocusPainted(false);
        botonUno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonUno.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.png"))); // NOI18N
        botonUno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b_presionada.png"))); // NOI18N
        botonUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUnoActionPerformed(evt);
            }
        });
        jPanel1.add(botonUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 50, 50));

        botonResto.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        botonResto.setForeground(new java.awt.Color(165, 164, 167));
        botonResto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b.png"))); // NOI18N
        botonResto.setText("%");
        botonResto.setFocusPainted(false);
        botonResto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonResto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b.png"))); // NOI18N
        botonResto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b_presionada.png"))); // NOI18N
        jPanel1.add(botonResto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 50, 50));

        botonNueve.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        botonNueve.setForeground(new java.awt.Color(165, 164, 167));
        botonNueve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b.png"))); // NOI18N
        botonNueve.setText("9");
        botonNueve.setFocusPainted(false);
        botonNueve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonNueve.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b.png"))); // NOI18N
        botonNueve.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b_presionada.png"))); // NOI18N
        botonNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNueveActionPerformed(evt);
            }
        });
        jPanel1.add(botonNueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 50, 50));

        botonSeis.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        botonSeis.setForeground(new java.awt.Color(165, 164, 167));
        botonSeis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b.png"))); // NOI18N
        botonSeis.setText("6");
        botonSeis.setFocusPainted(false);
        botonSeis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonSeis.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b.png"))); // NOI18N
        botonSeis.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b_presionada.png"))); // NOI18N
        botonSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeisActionPerformed(evt);
            }
        });
        jPanel1.add(botonSeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 50, 50));

        botonOcho.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        botonOcho.setForeground(new java.awt.Color(165, 164, 167));
        botonOcho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b.png"))); // NOI18N
        botonOcho.setText("8");
        botonOcho.setFocusPainted(false);
        botonOcho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonOcho.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b.png"))); // NOI18N
        botonOcho.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b_presionada.png"))); // NOI18N
        botonOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOchoActionPerformed(evt);
            }
        });
        jPanel1.add(botonOcho, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 50, 50));

        botonSiete.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        botonSiete.setForeground(new java.awt.Color(165, 164, 167));
        botonSiete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b.png"))); // NOI18N
        botonSiete.setText("7");
        botonSiete.setFocusPainted(false);
        botonSiete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonSiete.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b.png"))); // NOI18N
        botonSiete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b_presionada.png"))); // NOI18N
        botonSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSieteActionPerformed(evt);
            }
        });
        jPanel1.add(botonSiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 50, 50));

        botonBorrarTodo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        botonBorrarTodo.setForeground(new java.awt.Color(165, 164, 167));
        botonBorrarTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b.png"))); // NOI18N
        botonBorrarTodo.setText("AC");
        botonBorrarTodo.setFocusPainted(false);
        botonBorrarTodo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonBorrarTodo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b.png"))); // NOI18N
        botonBorrarTodo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b_presionada.png"))); // NOI18N
        botonBorrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarTodoActionPerformed(evt);
            }
        });
        jPanel1.add(botonBorrarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 50, 50));

        botonCuatro.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        botonCuatro.setForeground(new java.awt.Color(165, 164, 167));
        botonCuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b.png"))); // NOI18N
        botonCuatro.setText("4");
        botonCuatro.setFocusPainted(false);
        botonCuatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCuatro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b.png"))); // NOI18N
        botonCuatro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b_presionada.png"))); // NOI18N
        botonCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCuatroActionPerformed(evt);
            }
        });
        jPanel1.add(botonCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 50, 50));

        botonCinco.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        botonCinco.setForeground(new java.awt.Color(165, 164, 167));
        botonCinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b.png"))); // NOI18N
        botonCinco.setText("5");
        botonCinco.setFocusPainted(false);
        botonCinco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCinco.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b.png"))); // NOI18N
        botonCinco.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b_presionada.png"))); // NOI18N
        botonCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCincoActionPerformed(evt);
            }
        });
        jPanel1.add(botonCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 50, 50));

        botonTres.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        botonTres.setForeground(new java.awt.Color(165, 164, 167));
        botonTres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b.png"))); // NOI18N
        botonTres.setText("3");
        botonTres.setFocusPainted(false);
        botonTres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonTres.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b.png"))); // NOI18N
        botonTres.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b_presionada.png"))); // NOI18N
        botonTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTresActionPerformed(evt);
            }
        });
        jPanel1.add(botonTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 50, 50));

        botonIgual.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        botonIgual.setForeground(new java.awt.Color(165, 164, 167));
        botonIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b.png"))); // NOI18N
        botonIgual.setText("=");
        botonIgual.setFocusPainted(false);
        botonIgual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonIgual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b.png"))); // NOI18N
        botonIgual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b_presionada.png"))); // NOI18N
        botonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIgualActionPerformed(evt);
            }
        });
        jPanel1.add(botonIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 50, 50));

        botonDos.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        botonDos.setForeground(new java.awt.Color(165, 164, 167));
        botonDos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b.png"))); // NOI18N
        botonDos.setText("2");
        botonDos.setFocusPainted(false);
        botonDos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonDos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b.png"))); // NOI18N
        botonDos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b_presionada.png"))); // NOI18N
        botonDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDosActionPerformed(evt);
            }
        });
        jPanel1.add(botonDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 50, 50));

        botonCero.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        botonCero.setForeground(new java.awt.Color(165, 164, 167));
        botonCero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b.png"))); // NOI18N
        botonCero.setText("0");
        botonCero.setFocusPainted(false);
        botonCero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCero.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b.png"))); // NOI18N
        botonCero.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b_presionada.png"))); // NOI18N
        botonCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCeroActionPerformed(evt);
            }
        });
        jPanel1.add(botonCero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 50, 50));

        botonPunto.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        botonPunto.setForeground(new java.awt.Color(165, 164, 167));
        botonPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b.png"))); // NOI18N
        botonPunto.setText(".");
        botonPunto.setFocusPainted(false);
        botonPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonPunto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b.png"))); // NOI18N
        botonPunto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_tipo_b_presionada.png"))); // NOI18N
        botonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoActionPerformed(evt);
            }
        });
        jPanel1.add(botonPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 50, 50));

        modoOscuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_noche_a.png"))); // NOI18N
        modoOscuro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_noche_a.png"))); // NOI18N
        modoOscuro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_noche_a_presionado.png"))); // NOI18N
        modoOscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modoOscuroActionPerformed(evt);
            }
        });
        jPanel1.add(modoOscuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 50, 50));

        minimizar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        minimizar.setForeground(new java.awt.Color(255, 255, 0));
        minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizar.setText("●");
        minimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });
        jPanel1.add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 20, 20));

        cerrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cerrar.setForeground(new java.awt.Color(255, 0, 51));
        cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar.setText("●");
        cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        jPanel1.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCeroActionPerformed
        pantalla.setText(pantalla.getText() + "0");
    }//GEN-LAST:event_botonCeroActionPerformed

    private void botonUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUnoActionPerformed
        pantalla.setText(pantalla.getText() + "1");
    }//GEN-LAST:event_botonUnoActionPerformed

    private void botonDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDosActionPerformed
        pantalla.setText(pantalla.getText() + "2");
    }//GEN-LAST:event_botonDosActionPerformed

    private void botonTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTresActionPerformed
        pantalla.setText(pantalla.getText() + "3");
    }//GEN-LAST:event_botonTresActionPerformed

    private void botonBorrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarTodoActionPerformed
        pantalla.setText("");
    }//GEN-LAST:event_botonBorrarTodoActionPerformed

    private void botonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIgualActionPerformed
        /*try {
            String resultado = se.eval(pantalla.getText()).toString();
            pantalla.setText(resultado);
        } catch (Exception e) {
        }*/
        numero2 = Float.parseFloat(pantalla.getText());
        switch (operador) {
            case "+":
                pantalla.setText(Float.toString(numero1 + numero2));
                break;
            case "-":
                pantalla.setText(Float.toString(numero1 - numero2));
                break;
            case "*":
                pantalla.setText(Float.toString(numero1 * numero2));
                break;
            case "/":
                pantalla.setText(Float.toString(numero1 / numero2));
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_botonIgualActionPerformed

    private void botonCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCuatroActionPerformed
        pantalla.setText(pantalla.getText() + "4");
    }//GEN-LAST:event_botonCuatroActionPerformed

    private void botonCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCincoActionPerformed
        pantalla.setText(pantalla.getText() + "5");
    }//GEN-LAST:event_botonCincoActionPerformed

    private void botonSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeisActionPerformed
        pantalla.setText(pantalla.getText() + "6");
    }//GEN-LAST:event_botonSeisActionPerformed

    private void botonSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSieteActionPerformed
        pantalla.setText(pantalla.getText() + "7");
    }//GEN-LAST:event_botonSieteActionPerformed

    private void botonOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOchoActionPerformed
        pantalla.setText(pantalla.getText() + "8");
    }//GEN-LAST:event_botonOchoActionPerformed

    private void botonNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNueveActionPerformed
        pantalla.setText(pantalla.getText() + "9");
    }//GEN-LAST:event_botonNueveActionPerformed

    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoActionPerformed
        pantalla.setText(pantalla.getText() + ".");
    }//GEN-LAST:event_botonPuntoActionPerformed

    private void botonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSumaActionPerformed
        //pantalla.setText(pantalla.getText() + "+");
        numero1 = Float.parseFloat(pantalla.getText());
        operador = "+";
        pantalla.setText("");
    }//GEN-LAST:event_botonSumaActionPerformed

    private void botonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestaActionPerformed
        //pantalla.setText(pantalla.getText() + "-");
        numero1 = Float.parseFloat(pantalla.getText());
        operador = "-";
        pantalla.setText("");
    }//GEN-LAST:event_botonRestaActionPerformed

    private void botonMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMultiActionPerformed
        //pantalla.setText(pantalla.getText() + "*");
        numero1 = Float.parseFloat(pantalla.getText());
        operador = "*";
        pantalla.setText("");
    }//GEN-LAST:event_botonMultiActionPerformed

    private void botonDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDividirActionPerformed
        //pantalla.setText(pantalla.getText() + "/");
        numero1 = Float.parseFloat(pantalla.getText());
        operador = "/";
        pantalla.setText("");
    }//GEN-LAST:event_botonDividirActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        String texto = pantalla.getText().substring(0, pantalla.getText().length() - 1);
        pantalla.setText(texto);
    }//GEN-LAST:event_botonBorrarActionPerformed

    boolean modoNoche = false;
    
    private void modoOscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modoOscuroActionPerformed
        jPanel1.setBackground(Color.decode("#222531"));
        
        botonUno.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c.png")));
        botonUno.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c.png")));
        botonUno.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c_presionada.png")));
        
        botonDos.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c.png")));
        botonDos.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c.png")));
        botonDos.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c_presionada.png")));
        
        botonTres.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c.png")));
        botonTres.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c.png")));
        botonTres.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c_presionada.png")));
        
        botonCuatro.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c.png")));
        botonCuatro.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c.png")));
        botonCuatro.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c_presionada.png")));
        
        botonCinco.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c.png")));
        botonCinco.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c.png")));
        botonCinco.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c_presionada.png")));
        
        botonSeis.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c.png")));
        botonSeis.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c.png")));
        botonSeis.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c_presionada.png")));
        
        botonSiete.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c.png")));
        botonSiete.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c.png")));
        botonSiete.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c_presionada.png")));
        
        
        botonOcho.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c.png")));
        botonOcho.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c.png")));
        botonOcho.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c_presionada.png")));
        
        botonNueve.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c.png")));
        botonNueve.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c.png")));
        botonNueve.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c_presionada.png")));
        
        botonCero.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c.png")));
        botonCero.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c.png")));
        botonCero.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c_presionada.png")));
        
        botonPunto.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c.png")));
        botonPunto.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c.png")));
        botonPunto.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c_presionada.png")));
        
        botonIgual.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c.png")));
        botonIgual.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c.png")));
        botonIgual.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c_presionada.png")));
        
        botonBorrarTodo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c.png")));
        botonBorrarTodo.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c.png")));
        botonBorrarTodo.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c_presionada.png")));
        
        botonResto.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c.png")));
        botonResto.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c.png")));
        botonResto.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_c_presionada.png")));
        
        botonSuma.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_d.png")));
        botonSuma.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_d.png")));
        botonSuma.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_d_presionada.png")));
        
        botonResta.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_d.png")));
        botonResta.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_d.png")));
        botonResta.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_d_presionada.png")));
        
        botonMulti.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_d.png")));
        botonMulti.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_d.png")));
        botonMulti.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_d_presionada.png")));
        
        botonDividir.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_d.png")));
        botonDividir.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_d.png")));
        botonDividir.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_d_presionada.png")));
        
        botonBorrar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_d.png")));
        botonBorrar.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_d.png")));
        botonBorrar.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_tipo_d_presionada.png")));
        
        modoOscuro.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_noche_b.png")));
        modoOscuro.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_noche_b.png")));
        modoOscuro.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_noche_b_presionado.png")));
    }//GEN-LAST:event_modoOscuroActionPerformed

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_cerrarMouseClicked

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimizarMouseClicked

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonBorrarTodo;
    private javax.swing.JButton botonCero;
    private javax.swing.JButton botonCinco;
    private javax.swing.JButton botonCuatro;
    private javax.swing.JButton botonDividir;
    private javax.swing.JButton botonDos;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonMulti;
    private javax.swing.JButton botonNueve;
    private javax.swing.JButton botonOcho;
    private javax.swing.JButton botonPunto;
    private javax.swing.JButton botonResta;
    private javax.swing.JButton botonResto;
    private javax.swing.JButton botonSeis;
    private javax.swing.JButton botonSiete;
    private javax.swing.JButton botonSuma;
    private javax.swing.JButton botonTres;
    private javax.swing.JButton botonUno;
    private javax.swing.JLabel cerrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel minimizar;
    private javax.swing.JButton modoOscuro;
    private javax.swing.JLabel pantalla;
    // End of variables declaration//GEN-END:variables
}

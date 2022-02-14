/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar;

import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author USER
 */
public class InputOutput extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("---Program Cetak KHS---");
      
        String nama;
        String nim;
        int usia;
        double rata_rata_nilai; 
         
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Masukkan nama lengkap anda: ");
        nama = sc.nextLine();
        System.out.println("Masukkan NIM anda: ");
        nim = sc.nextLine();
        System.out.print("Masukkan usia anda saat ini: ");
        usia = sc.nextInt();
        System.out.print("Masukkan rata-rata nilai anda: ");
        rata_rata_nilai = sc.nextDouble();
        System.out.println("---Kartu Hasil Studi---");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Usia: " + usia);
        System.out.println("Rata-rata nilai: " + rata_rata_nilai);
    }
}

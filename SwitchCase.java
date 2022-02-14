/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package belajar;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
    
    String warna;
    Scanner sc = new Scanner(System.in); 
    
        System.out.println("Masukkan warna lampu:");
        warna = sc.nextLine();
        
        switch (warna) {
            case "merah":
                System.out.println("Anda haru berhenti");
                break;
            case "kuning":
                System.out.println("Bersiap-siap");
                break;
            case "hijau":
                System.out.println("Silakan jalan");
                break;
            default:
                System.out.println("Warna salah");    
        }
    }
}

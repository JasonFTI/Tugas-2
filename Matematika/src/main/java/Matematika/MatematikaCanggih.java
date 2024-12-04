/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author Lenovo
 */
public class MatematikaCanggih extends Matematika {
    double hasilPenjumlahan, hasilPengurangan, hasilPerkalian, hasilPembagian;
    
    void setPenjumlahan(int a, int b){
        hasilPenjumlahan = a + b;
        System.out.println("Hasil dari "+a+" + "+b+" = "+getPenjumlahan());
    }
    
    void setPenjumlahan(int a, int b, int c){
        hasilPenjumlahan = a + b + c;
        System.out.println("Hasil dari "+a+" + "+b+" + "+c+" = "+getPenjumlahan());
    }
    
    void setPenjumlahan(double a, double b){
        hasilPenjumlahan = a + b;
        System.out.println("Hasil dari "+a+" + "+b+" = "+getPenjumlahan());
    }
    
    void setPenjumlahan(double a, double b, double c){
        hasilPenjumlahan = a + b + c;
        System.out.println("Hasil dari "+a+" + "+b+" + "+c+" ="+getPenjumlahan());
    }
    
    void setPengurangan(int a, int b){
        hasilPengurangan = a - b;
        System.out.println("Hasil dari "+a+" - "+b+" = "+getPengurangan());
    }
    
    void setPengurangan(int a, int b, int c){
        hasilPengurangan = a - b - c;
        System.out.println("Hasil dari "+a+" - "+b+" - "+c+" = "+getPengurangan());
    }
    
    void setPengurangan(double a, double b){
        hasilPengurangan = a - b;
        System.out.println("Hasil dari "+a+" - "+b+" = "+getPengurangan());
    }
    
    void setPengurangan(double a, double b, double c){
        hasilPengurangan = a - b - c;
        System.out.println("Hasil dari "+a+" - "+b+" - "+c+" = "+getPengurangan());
    }
    
    void setPerkalian(int a, int b){
        hasilPerkalian = a * b;
        System.out.println("Hasil dari "+a+" * "+b+" = "+getPerkalian());
    }
    
    void setPerkalian(int a, int b, int c){
        hasilPerkalian = a * b * c;
        System.out.println("Hasil dari "+a+" * "+b+" * "+c+" = "+getPerkalian());
    }
    
    void setPerkalian(double a, double b){
        hasilPerkalian = a * b;
        System.out.println("Hasil dari "+a+" * "+b+" = "+getPerkalian());
    }
    
    void setPerkalian(double a, double b, double c){
        hasilPerkalian = a * b * c;
        System.out.println("Hasil dari "+a+" * "+b+" * "+c+" = "+getPerkalian());
    }
    
    void setPembagian(int a, int b){
        hasilPembagian = a / b;
        System.out.println("Hasil dari "+a+" / "+b+" = "+getPembagian());
    }
    
    void setPembagian(int a, int b, int c){
        hasilPembagian = a / b / c;
        System.out.println("Hasil dari "+a+" / "+b+" / "+c+" = "+getPembagian());
    }
    
    void setPembagian(double a, double b){
        hasilPembagian = a / b;
        System.out.println("Hasil dari "+a+" / "+b+" = "+getPembagian());
    }
    
    void setPembagian(double a, double b, double c){
        hasilPembagian = a / b / c;
        System.out.println("Hasil dari "+a+" / "+b+" = "+getPembagian());
    }
    
    void setModulus(int a, int b){
        hasilMod = a % b;
        System.out.println("Hasil dari " + a + " / " + b + " = "+getModulus());
    }
    
    double getPenjumlahan(){
        return hasilPenjumlahan;
    }
    
    double getPengurangan(){
        return hasilPengurangan;
    }
    
    double getPerkalian(){
        return hasilPerkalian;
    }
    
    double getPembagian(){
        return hasilPembagian;    
    }
}

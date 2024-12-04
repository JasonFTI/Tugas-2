/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author Lenovo
 */
public class Matematika {
    double hasilMod;
    
    void setModulus(int a, int b){
        hasilMod = a % b;
        System.out.println("Hasil dari " + a + " / " + b + " = "+getModulus());
    }
    
    void setModulus(double a, double b){
        hasilMod = a % b;
        System.out.println("Hasil dari "+a+" / "+b+" = "+getModulus());
    }
    
    double getModulus(){
        return hasilMod;
    }
}

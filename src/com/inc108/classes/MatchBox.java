/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inc108.classes;

/**
 *
 * @author IvanAranda
 */
public class MatchBox extends Box{
    double weight;
    
    // This is an empty constructor
   public MatchBox() {
          ;
   }
 
   public MatchBox(double w, double h, double d) {
          super.width = w;
          super.height = h;
          super.depth = d;
   }
 
    @Override
   public void getVolume() {
        System.out.println("Width is : " + width + "in\nHeight is : " + height + "in\nDepth is : " + depth + "in\nWeight is : " + String.format("%.2f",calculateWeight())+"lb");
        System.out.println("\nVolume is : " + width * height * depth + "cu in");
   }
   
   double calculateWeight(){
       return (super.width*super.height*super.depth)*0.03611;
   }
}

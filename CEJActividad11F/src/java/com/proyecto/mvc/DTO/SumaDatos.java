/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.mvc.DTO;

/**
 *
 * @author jc_ca
 */
public class SumaDatos {
 private int num1;
 private int num2;
 private int suma;

     public SumaDatos(String n1, String n2){
        this.setNum1(Integer.parseInt(n1));
        this.setNum2(Integer.parseInt(n2));
    }
    

  
  public void Sumar(){
       int s = (this.getNum1()+this.getNum2());
        this.setSuma(s);
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

   
  public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }
    

}

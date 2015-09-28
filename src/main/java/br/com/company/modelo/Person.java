/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.company.modelo;

/**
 *
 * @author juliano
 */
public class Person {
    private String firstName;
    private String lastName;
    private char gender;
    private double height;
    private double weight;

    public Person(String firstName, String lastName, char gender, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }
    
    
    
    public double calculteIMC(){
        return weight/(height*height);
    }
    
}

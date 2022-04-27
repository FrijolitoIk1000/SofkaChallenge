/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sofkachallenge;

/**
 *
 * @author Santiago
 */
public class Questions {
    private String text;
    private String answers;

    public Questions(String text,String answers) {
        this.text = text;
        this.answers = answers;
    }  

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }
   
}
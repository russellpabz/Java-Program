/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stiwnu.javadictionary;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Definitions {

    String definition;
    


    public String getDefinition() {
        return definition;
    }

    public void setDefinitions(String definition) {
        this.definition = definition;
    }
    

    @Override
    public String toString() {
        return definition ;
    }
}
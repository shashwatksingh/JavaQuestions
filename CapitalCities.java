/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaquestions;

/**
 *
 * @author HP
 */

import java.util.*;
public class CapitalCities {
    public static void main(String[] args){
        HashMap<String, String> capitalCities = new HashMap<>();
        //put is used to place the key-value pairs in the hashmap
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Delhi");
        capitalCities.put("Australia", "Sydney");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        //get is used to find a value using its key
        System.out.println("get Function" + capitalCities.get("India"));
    }
   
}

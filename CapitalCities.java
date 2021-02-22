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
        capitalCities.put("Pakistan", "Islamabad");
        capitalCities.put("Nepal", "Kathmandu");
        capitalCities.put("Germany", "Munich");
        System.out.println(capitalCities);
        //get is used to find a value using its key. Returns null when nothing is found associated to the key
        System.out.println("get Function  " + capitalCities.get("India"));
        System.out.println("get Function  " + capitalCities.get("Myanmar"));
        //Remove an Item - use a .remove() function. It return the value that has been deleted corresponding to the keys.
        System.out.println(".remove function  "+capitalCities.remove("Pakistan"));
        System.out.println(capitalCities);
        
        //Iterating through the hashmap using for loop
        //keyset() return an array of Hashmap. .values() gives an array of all the values. .entryset() return the array of key value pairs.
        System.out.println(".keySet() " +capitalCities.keySet() + " .values() "+capitalCities.values() + ".entrySet() " + capitalCities.entrySet());
        capitalCities.keySet().forEach((item) -> {
            System.out.print(item+" ");
        });
        capitalCities.entrySet().forEach((items) -> {System.out.println(items);});
        System.out.println();
        System.out.println("getOrDefault() "+capitalCities.getOrDefault("China", "NotFound"));
        
        //using replace for the updating the hashmap keys
        capitalCities.replace("Germany", "Berlin");
        System.out.println(capitalCities);
        //replaceAll wants a Bi-function as a input
        capitalCities.replaceAll((key, value) -> value.toUpperCase());
        System.out.println(capitalCities);
        
        //cloning the hashmap
        HashMap <String, String> cloneHashMap = new HashMap<>();
        cloneHashMap = (HashMap<String, String>) capitalCities.clone();
        System.out.println("cloneHashMap "+cloneHashMap);
        
        //contains function containsKey(), containsValue(), isEmpty()
        System.out.println("containsKey() "+ capitalCities.containsKey("India") + " containsValue() "+capitalCities.containsValue("Delhi")+ " isEmpty() "+capitalCities.isEmpty());
        
        //merge function  o -> stands for older value of hashmap, n -> stands for new value
        //Better use of merge function is :-
        /* prices2.forEach((key, value) -> prices1.merge(key, value, (oldValue, newValue) -> {
      
        // return the smaller value
        if (oldValue < newValue) {
          return oldValue;
        }
        else {
          return newValue;
        }
      }));*/
        capitalCities.merge("India", "New Delhi", (o, n) ->{
            if(o.equalsIgnoreCase(n)){
                return o;
            }
            return  n;
        });
        System.out.println(capitalCities);
        
        //compute and computeIfAbsent and ComputeIfPresent functions. Return type is must in these functions.
        
        capitalCities.compute("India", ( key, value ) -> { 
            //return null if the key doesn't have any value
            return key.toLowerCase();
        });
        capitalCities.computeIfAbsent("Myanmar", (key) -> "Bangkok");
        System.out.println(capitalCities);
    }
        
        
    }

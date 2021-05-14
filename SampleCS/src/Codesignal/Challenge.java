package Codesignal;

import java.util.Scanner;
class Challenge {
    // Complete this function to return either
    // "Hello, [name]!" or "Hello there!"
    // based on the input
    public static void main(String[] args){
     
    	
    	 //if(args[0]!=null){
    	
    	if(args.length!=0){
     
      System.out.println(sayHello(args[0]));
    }
    	 else if(args.length==0){
       System.out.println("Hello there!");
  }
  
    }
    public static String sayHello(String name) {
      
        
        // but you need to return the correct value in order to pass the challenge
        return "Hello, "+name.toUpperCase()+"!"; // TODO: return the correct value
    }
}

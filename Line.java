/*
	Program: Program 1; Customer Queue
	Edward Johnson
	Date: 06 Oct 14
   File: Line Class (Holds the datastructure for the Queue list)
	
*/

import java.util.Random;

public class Line{
   
   private Customer first, last;
   private int length;
   private int service;
   private int max;

   public Line(){
      first = null;
      last = null;
      length = 0;
      service =0;
      max = 0;
   }
   
   public void add (Customer newCust){//Adds a customer to the queue
      if(isEmpty()){
         first = newCust;       
      }else{
         last.setNext(newCust);
      }  
      last = newCust;
      length++;
   }
   
   public void remove(){ //removes a customer from the queue
      if(!isEmpty()){
         first = first.getNext();
      }
      length--;
      service++;
   }
   
   public boolean isEmpty(){//checks to see if the queue is empty
      return first == null;
   }
   
   public Customer getCust(){//returns the first customer in the queue
      
      return first;
   }
   
   public int lineSize(){ //Returns the size of the line of customers
      if(isEmpty()){
         length = 0;       
      }
      return length;       
   }
   
   public int serviced(){ //tracks the number of customers removed from the list, so we know how many are serviced
    return service;      
   }
   
   public boolean randomNew(){
   
      int lineCheck = new Random().nextInt(4) + 1;
          
      return lineCheck == 2;  //Create the if statement to check if new customer is added

   }
   
    public int maxLength(){ //This will store the max length of the queue
   
      if(length > max)
         max=length;
         
         return max;
   }


}
   

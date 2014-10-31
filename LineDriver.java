/*
	Program: Program 1; Customer Queue
	Edward Johnson
	Date: 06 Oct 14
   File: Driver class to run the Customer and Line Classes
	
*/

import java.util.Random;		


public class LineDriver{
   public static void main(String[] args){

      Line list = new Line();//Create line list to hold the customers
      Customer firstCust = new Customer();
  
      for(int i=1; i < 60; i++){ //create for loop to make the 60 minute line simulation
                  
          if(list.randomNew() == true){ //Create the if statement to check if new customer is added
            
            list.add(firstCust);
            
            Customer newCust = new Customer(); //Switch the first and new Customer values
            Customer temp = firstCust;
            firstCust= newCust;
            newCust= temp;
           
            //totalSize++;  //increase the total size and the current size
          
            System.out.println("New customer added!  Queue length is now " + list.lineSize());
            
            list.getCust().decServiceTime(); //get the first customer in the queue and decrease the service time
          
            }else if( list.lineSize() >= 1){ //decrease the service time if no new customers are added and there are people in line
            
              list.getCust().decServiceTime(); //get the first customer in the queue and decrease the service time
            
            }
            
          list.maxLength(); //Call the maxLength method to store the max length of the line
            
          if(list.lineSize()>=1){ //Check that there are people in line
              if(list.getCust().getServiceTime()==0){ //check the remaining time for the person to be in line and remove them if they are a 0
                  list.remove();
              
               System.out.println("Customer serviced and removed from the queue. Queue length is now " + list.lineSize());
               }   
            } 
                        
           System.out.println("-------------------------------------------------------------------");       
         } 
         
         
         System.out.println("Total number of Customers serviced: " + list.serviced());
                  
         System.out.println("Maximum line length: " + list.maxLength());
         
        
   }

}

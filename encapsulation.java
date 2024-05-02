//Java program that shows the use of Encapsulation

import java.io.*;

class Dog {
   private int SerialNo;
   private String Breed;
   private int Age;
   
   public void setSerialNo(int number){
       this.SerialNo = number;
   }
    
   public void setBreed(String breed){
       this.Breed = breed;
   }
   
   public void getBreed(){
       System.out.print(Breed);
   }
   
   public void getSerialNo(){
       System.out.print(SerialNo);
   }
	
}

class Main{
   
    public static void main (String[] args) {
         Dog D1 = new Dog();
         D1.setSerialNo(34);
         D1.setBreed("Golden Retriever");
    
		 D1.getSerialNo();
	   	 D1.getBreed();
	}
}
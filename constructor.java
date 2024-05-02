//Java program that shows the use of Constructors

import java.io.*;

class Dog {
    int SerialNo;
    String Breed;
    int Age;
    
    //Constructor declaration
    public Dog(int SerialNo, String Breed, int Age){
        this.SerialNo = SerialNo;
        this.Breed = Breed;
        this.Age = Age;
    }
    
    void display(){
        System.out.println("Hello I'm Dog no." + SerialNo + ". I'm of " + Breed + " Breed. I'm " + Age + " years old.");
    }
	
}

class Main{
    public static void main (String[] args) {
		Dog D1 = new Dog(33,"Labrador",4);
		D1.display();
	}
}
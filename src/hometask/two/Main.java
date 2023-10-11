package hometask.two;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 

import hometask.two.Car.Color;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create Objects
		Car car1 = new Car(1, "VW","Amarok",2021, Color.BLACK, 20000, 1111);
		Car car2 = new Car(2, "VW","Amarok",2022, Color.WHITE, 23000, 2222);
		Car car3 = new Car(3, "VW","Arteon",2021, Color.BLACK, 34000, 3333);
		Car car4 = new Car(4, "VW","Caddy",2021, Color.WHITE, 40000, 4444);
		Car car5 = new Car(5, "Mercedes","EQA",2022, Color.RED, 45000, 5555);
		Car car6 = new Car(6, "Mercedes","EQA",2022, Color.RED, 60000, 6666);
		Car car7 = new Car(7, "Mercedes","EQE SUV",2020, Color.GREEN, 30000, 7777);
		Car car8 = new Car(8, "Audi","A1",2019, Color.BLUE, 44000, 8888);
		Car car9 = new Car(9, "Audi","A1",2019, Color.YELLOW, 22000, 9999);
		Car car10 = new Car(10, "Audi","A3",2019, Color.GRAY, 32000, 1010);
		Car car11 = new Car(11, "Audi","A3",2018, Color.GRAY, 55000, 1234);
		Car car12 = new Car(12, "Audi","A4",2017, Color.BROWN, 50000, 4321);
		Car car13 = new Car(13, "Audi","A1",2020, Color.YELLOW, 24000, 9990);
		
		//Adding all in a ArrayList
		List<Car> arrayCar = new ArrayList<Car>();
		arrayCar.add(car1);
		arrayCar.add(car2);
		arrayCar.add(car3);
		arrayCar.add(car4);
		arrayCar.add(car5);
		arrayCar.add(car6);
		arrayCar.add(car7);
		arrayCar.add(car8);
		arrayCar.add(car9);
		arrayCar.add(car10);
		arrayCar.add(car11);
		arrayCar.add(car12);
		arrayCar.add(car13);
				
		//Create different ArrayList for different usage
		List<Car> arrayBrand = new ArrayList<Car>();
		List<Car> arrayModelYear = new ArrayList<Car>();
		List<Car> arrayYearPrice = new ArrayList<Car>();
		
		//Input Filter for car brand 			
		Scanner brandCar = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter the brand you want to list: ");	   
	    String brandName = brandCar.nextLine();  // Read user input
	    System.out.println("Listing brand is: " + brandName);
	   
	    
	    //Sorting brand to ArrayList
	    for (Car i : arrayCar) {
	    	if (i.getMake().equals(brandName) ) {
	    		arrayBrand.add(i);
	    	}
	    }
	    for (Car i : arrayBrand) {
	    	System.out.println(i.getRegistrationNumber());
	    	
	    }
	    try{
	        FileOutputStream writeData = new FileOutputStream("brand.tmp");
	        ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
	        writeStream.writeObject(arrayBrand);
	        writeStream.flush();
	        writeStream.close();
	    }catch (IOException e) {
	        e.printStackTrace();
	    }
	    
	    try {
			FileInputStream readData = new FileInputStream("brand.tmp");
			ObjectInputStream readStream = new ObjectInputStream(readData);
			
			System.out.println(readStream.readObject());
			readStream.close();
			readData.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	    
	  //Input Filter for car model and year 	
	    	    
	  	Scanner modelCar = new Scanner(System.in);  // Create a Scanner object
	  	System.out.println("Enter the model you want to list: ");
	  	String modelName = modelCar.nextLine();  // Read user input
	  	System.out.println("Listing brand is: " + modelName);	  	
	  	
	  	
	  	Scanner numberInUse = new Scanner(System.in);  // Create a Scanner object
	  	System.out.println("How many years in use: ");
	  	
	  	int yearUse = 0;
	  	if(numberInUse.hasNextInt() ) {
	  		yearUse = numberInUse.nextInt(); // if there is another number  
	  	}
	  	int yearNeed = 2023 - yearUse;
	  	System.out.println("The year you need is: "+ yearNeed);
	  	
	  	
	  //Sorting brand to ArrayList
	    for (Car i : arrayCar) {
	    	if ((i.getModel().equals(modelName)) && (i.getYearManufacture() == yearNeed)  ) {
	    		arrayModelYear.add(i);
	    	}
	    }
	    
	    for (Car i : arrayModelYear) {
	    	System.out.println(i.getRegistrationNumber());
	    	
	    }
	  	    
	    try{
	        FileOutputStream writeData = new FileOutputStream("modelyear.tmp");
	        ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
	        writeStream.writeObject(arrayModelYear);
	        writeStream.flush();
	        writeStream.close();
	    }catch (IOException e) {
	        e.printStackTrace();
	    }
	    
	    try {
			FileInputStream readData = new FileInputStream("modelyear.tmp");
			ObjectInputStream readStream = new ObjectInputStream(readData);
			
			System.out.println(readStream.readObject());
			readStream.close();
			readData.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	    
		  //Input Filter for car year and preis 	
	    
	  	Scanner yearCar = new Scanner(System.in);  // Create a Scanner object
	  	System.out.println("Enter the year you want to list: ");
	  	int yearNumber = 0;
	  	if(yearCar.hasNextInt() ) {
	  		yearNumber = yearCar.nextInt(); // if there is another number  
	  	}
	  	System.out.println("Listing year is: " + modelName);	  	
	  	
	  	
	  	Scanner preisCar = new Scanner(System.in);  // Create a Scanner object
	  	System.out.println("From how much can you afford:  ");	
	  	int preisNumber = 0;
	  	if(preisCar.hasNextInt() ) {
	  		preisNumber = preisCar.nextInt(); // if there is another number  
	  	}
	  	System.out.println("The preis you list is: "+ yearNeed);
	  	
	  	
	  //Sorting brand to ArrayList
	    for (Car i : arrayCar) {
	    	if ((i.getYearManufacture() == yearNumber) && (i.getPrice() > preisNumber)  ) {
	    		arrayYearPrice.add(i);
	    	}
	    }
	    
	    for (Car i : arrayYearPrice) {
	    	System.out.println(i.getRegistrationNumber());
	    	
	    }
	  	    
	    try{
	        FileOutputStream writeData = new FileOutputStream("yearprice.tmp");
	        ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
	        writeStream.writeObject(arrayYearPrice);
	        writeStream.flush();
	        writeStream.close();
	    }catch (IOException e) {
	        e.printStackTrace();
	    }
	    
	    try {
			FileInputStream readData = new FileInputStream("yearprice.tmp");
			ObjectInputStream readStream = new ObjectInputStream(readData);
			
			System.out.println(readStream.readObject());
			readStream.close();
			readData.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	    
	    brandCar.close();
	    modelCar.close();
	    numberInUse.close();
	    yearCar.close();
	    preisCar.close();
	}

}

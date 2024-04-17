package ua.khpi.oop.darius.task09;

public class BothUtils {
	public static void cheapest(PaperclipSale[] clips, CarSale[] cars) {
		
		double minClip = clips[0].getEarnings();
		double minCar = cars[0].getCost();

		for (int i = 1; i < clips.length; i++) {
			if (clips[i].getEarnings() < minClip) {
				minClip = clips[i].getEarnings();
			} else if (clips[i] == null)
				System.out.println("null");
		}
		for (int i = 1; i < cars.length; i++) {
			if (cars[i].getCost() < minCar) {
				minCar = cars[i].getCost();
			} else if (cars[i] == null)
				System.out.println("null");
		}
		if (minClip < minCar) {
			System.out.println("The cheapest item is a paperclip: " + minClip);
		} else {
			System.out.println("The cheapest item is a car: " + minCar);
		}
	}
	public static void totalCost(PaperclipSale[] clips, CarSale[] cars) {
		double sumClip = 0;
		double sumCar = 0;
		for (int i = 0; i < clips.length; i++) {
            sumClip += clips[i].getEarnings();
		}
		for (int i = 0; i < cars.length; i++) {
            sumCar += cars[i].getCost();
        }
		System.out.println("Total cost of everythig: " + (sumClip + sumCar));
		} 
	//6) Implement the SortAndPrint method to arrange ALL sellable objects array by the price in descending order.
	
	public static void SortAndPrint(PaperclipSale[] clips, CarSale[] cars) {
		PaperclipSale tempClip;
		CarSale tempCar;
		for (int i = 0; i < clips.length; i++) {
            for (int j = i + 1; j < clips.length; j++) {
                if (clips[i].getEarnings() < clips[j].getEarnings()) {
                    tempClip = clips[i];
                    clips[i] = clips[j];
                    clips[j] = tempClip;
                }
            }
		  }
		for (int i = 0; i < cars.length; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getCost() < cars[j].getCost()) {
                    tempCar = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tempCar;
                }
            }
          }
		System.out.println("Sorted paperclips:");
		for (int i = 0; i < clips.length; i++) {
            System.out.println(clips[i]);
        }
		
		System.out.println("Sorted cars:");
		for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
		
}
	}

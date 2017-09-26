package homework;

import java.util.Scanner;

public class Ske {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println("--------- Welcome to SKE Restaurant ---------");
			System.out.printf("1.) Pizza\t %5d Baht.%n", 250);
			System.out.printf("2.) Chickens\t %5d Baht.%n", 120);
			System.out.printf("3.) Coke\t %5d Baht.%n", 45);
			System.out.println("4.)Total");
			System.out.println("5.)Exit");
			System.out.println("");
			int pricePizza = 0, priceChickens = 0, priceCoke = 0, pizzaQuantity = 0, ChickensQuantity = 0, CokeQuantity = 0;
			int pizza = 0, Chickens = 0, Coke = 0;
			while (true) {
				Scanner name = new Scanner(System.in);
				System.out.print("Enter your Choice: ");
				int Choice = name.nextInt();
				if (Choice == 5) {
					break;
				} else if (Choice == 4) {
					System.out.println("+------ Menu ------+-- Qty --+-- Price --+");
					if (pizza > 0)
						System.out.printf("| Pizza            |    %3d  |    %3d    |%n", pizzaQuantity, pricePizza);
					if (Chickens > 0)
						System.out.printf("| Chickens         |    %3d  |    %3d    |%n", ChickensQuantity, priceChickens);
					if (Coke > 0)
						System.out.printf("| Coke             |    %3d  |    %3d    |%n", CokeQuantity, priceCoke);
					System.out.printf("+----------------------------+-----------+%n");
					System.out.printf("| Total                      |    %3d    |%n",
							pricePizza + priceChickens + priceCoke);
					System.out.printf("+----------------------------+-----------+%n%n");
				} else {
					System.out.print("Enter Quantity: ");
					int Quantity = name.nextInt();
					System.out.println("");

					if (Choice == 1) {
						pricePizza = Quantity * 250;
						pizzaQuantity = Quantity;
						pizza++;
					}
					if (Choice == 2) {
						priceChickens = Quantity * 120;
						ChickensQuantity = Quantity;
						Chickens++;
					}
					if (Choice == 3) {
						priceCoke = Quantity * 125;
						CokeQuantity = Quantity;
						Coke++;
						
					}
				}
			}
				System.out.print("===== Thank you =====");
				
			

		}

	}

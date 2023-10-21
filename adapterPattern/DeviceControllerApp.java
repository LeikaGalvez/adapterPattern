package adapterPattern;

import java.util.Scanner;

public class DeviceControllerApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet spRc = new SmartphoneAdapter(smartphoneCharger);
        PowerOutlet laptopRc = new LaptopAdapter(laptop);
        PowerOutlet refRc = new RefrigeratorAdapter(refrigerator);

        int device=0;
        System.out.println();

        while(device!=4){
            System.out.println("Welcome! What would you like to use?" +
                    "\n1.) Smartphone Charger\n2.) Refrigerator\n3.) Laptop\n4.) Exit");
            System.out.print("Choose: ");
            device = sc.nextInt();

            if (device==1){
                System.out.println();
                System.out.println(spRc.plugIn()+"\n");
            } else if (device==2){
                System.out.println();
                System.out.println(refRc.plugIn()+"\n");
            } else if (device==3) {
                System.out.println();
                System.out.println(laptopRc.plugIn()+"\n");
            } else if (device==4) {
                System.out.println("Exiting app...");
                break;
            } else {
                System.out.println("\nPlease choose a valid option.\n");
            }
        }
        System.out.println("Thank you!");
    }
}

package OverviewMenu;

import FastestDeliverymanModuleA.*;
import FastestDeliverymanModuleB.*;
import FastestDeliverymanModuleC.Employee.*;
import FastestDeliverymanModuleC.UserApplication.*;
import FastestDeliverymanModuleD.*;

import java.util.Scanner;

public class TeamMoronOverviewMenu {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddMenu addmenu = new AddMenu();
        AddStaff addstaff = new AddStaff();
        
        System.out.println("Select an item below to start: ");
        System.out.println("1. Module A");
        System.out.println("2. Module B");
        System.out.println("3. Module C");
        System.out.println("4. Module D");
        
        int response = scanner.nextInt();
        if (response == 1){
            addmenu.mainMenu();
        }
        else if (response == 2){
            addstaff.Menu();
        }
        else if (response == 3){
            System.out.println("For customer/client side, please access servlet files manually");
            CustomerInfoRetrieval retrieve = new CustomerInfoRetrieval();
        }
        else if (response == 4){
            
        }
        
    }
}

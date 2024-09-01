import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Collections;




class menu_item{          //menu item class
    public static ArrayList<String> name = new ArrayList<String>();
    public static ArrayList<Double> price = new ArrayList<Double>();
}





class menu{                 //menu manipulation class
    static Scanner scan =new Scanner(System.in);




    public static void add_to_menu(){
        System.out.print("Enter name of item :- ");
        menu_item.name.add(scan.nextLine());
        System.out.print("Enter price of it :- ");
        menu_item.price.add(scan.nextDouble());
        System.out.println("Item added");
    }




    public static void remove_from_menu(){
        int index;
        System.out.println("Enter what you need to remove :-");
        String name = scan.nextLine();
        if (menu_item.name.contains(name)) {
            index = menu_item.name.indexOf(name);
            menu_item.name.remove(index);
            menu_item.price.remove(index);
        }
        else
            System.out.println("Item not found");
    }






    public static void print_menu(){
        for (int i=0;i<menu_item.name.size();i++) {
            System.out.println(menu_item.name.get(i)+"\t\t\t"+menu_item.price.get(i));
        }
    }
}





class generate_bill{                //bill generate class
    static Scanner scan =new Scanner(System.in);
    private Double total=0.0;
    ArrayList<String> bill = new ArrayList<String>();
    public generate_bill(){
        while (true){
            for (int i=0;i<menu_item.name.size();i++) {
                System.out.println((i+1)+"\t\t\t"+menu_item.name.get(i)+"\t\t\t"+menu_item.price.get(i));
            }
            System.out.print("Enter serial number of the item or press 0 to print bill:- ");
            int number = scan.nextInt();
            if (number!=0){
            if (number<=menu_item.name.size())
                bill.add(menu_item.name.get(number-1));
            else
                System.out.println("Enter correct number");}
            else {
                if (bill.size()==0)
                    System.out.println("Total = "+ total);
                else{
                    HashSet<String> seenElements = new HashSet<>();
                    System.out.println("********BILL**********");
                for (Object element : bill) {
                    int index = menu_item.name.indexOf(element);
                    if (!seenElements.contains((String) element)) {
                        seenElements.add((String) element);
                        System.out.println(element + "\t"+Collections.frequency(bill,element)+"\t"+Collections.frequency(bill,element)*(Double) menu_item.price.get(index));
                        total=total+Collections.frequency(bill,element)*menu_item.price.get(index);
                    }
                }
                    System.out.println("----- "+total+"-----");
            }
                break;
        }
    }
}}



public class customer_billing_system {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);      //scanner class;
        while (true) {                      //loop for menu item name
            System.out.print("Enter the names of menu items or just press enter to continue :- ");
            String input = scan.nextLine();
            if (input.isEmpty()) {
                break;
            }
            menu_item.name.add(input);
        }
        for (int i = 0; i < menu_item.name.size(); i++) {                  //loop for menu item price
            System.out.print("Enter the price of " + menu_item.name.get(i) + " = ");
            menu_item.price.add(scan.nextDouble());
        }
        int number;             //variable for swich statement
        do {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");

            System.out.println("1) Generate a bill");
            System.out.println("2) Add item to menu");
            System.out.println("3) Remove item from menu");
            System.out.println("4) Print menu items");
            System.out.println("5) Exit");
            System.out.print("Enter your choice :- ");
            number = scan.nextInt();
            switch (number) {
                case 1:
                    generate_bill bill = new generate_bill();
                    break;
                case 2:
                    menu.add_to_menu();
                    break;
                case 3:
                    menu.remove_from_menu();
                    break;
                case 4:
                    menu.print_menu();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (number != 5);
    }

    }



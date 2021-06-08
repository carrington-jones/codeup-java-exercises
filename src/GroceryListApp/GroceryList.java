package GroceryListApp;

import java.util.ArrayList;
import java.util.Scanner;
import util.Input;

public class GroceryList {
    public static Input input = new Input();
    Scanner scanner = new Scanner(System.in);
    public static ArrayList<String> BigGroceryList = new ArrayList<>();
    public static ArrayList<String> GroceryListProduce = new ArrayList<>();
    public static ArrayList<String> GroceryListBakery = new ArrayList<>();
    public static ArrayList<String> GroceryListDessert = new ArrayList<>();
    public static ArrayList<String> GroceryListDrinks = new ArrayList<>();


    public static void begin() {
        Scanner scanner = new Scanner(System.in);

        boolean createList = input.yesNo("Would you like to start creating your grocery list?");
        if (createList) {
            addItem();
        }
    }

    public static void addItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Great! Please enter what category your item is in\n1.)Produce\n2.)Bakery\n3.)Dessert\n4.)Drinks\n");
        int CategorySelect = scanner.nextInt();
        if (CategorySelect == 1) {
            addItemProduce();
        }
        if (CategorySelect == 2) {
            addItemBakery();
        }
        if (CategorySelect == 3) {
            addItemDessert();
        }
        if (CategorySelect == 4) {
            addItemDrinks();
        }
    }

    public static void addItemProduce() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What item would you like to add to the list?");
        String addGroceryItem = scanner.nextLine();
        System.out.println("How many " + addGroceryItem + " would you like to add?");
        int addProduceNumber = scanner.nextInt();
        for (int i = 0; i < addProduceNumber; i++) {
            GroceryListProduce.add(addGroceryItem);
            BigGroceryList.add(addGroceryItem);
        }
        System.out.println("Here is your produce list " + GroceryListProduce);
        boolean addProduceItem = input.yesNo("Would you like to add another item?");
        if (addProduceItem) {
            addItem();
        } else {
            System.out.println("Okay here is your final grocery list!");
            System.out.println(BigGroceryList);
        }
    }


    public static void addItemBakery() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What item would you like to add to the list?");
        String addGroceryItem = scanner.nextLine();
        System.out.println("How many " + addGroceryItem + " would you like to add?");
        int addBakeryNumber = scanner.nextInt();
        for (int i = 0; i < addBakeryNumber; i++) {
            GroceryListBakery.add(addGroceryItem);
            BigGroceryList.add(addGroceryItem);
        }
        System.out.println("Here is your bakery list " + GroceryListBakery);
        boolean addBakeryItem = input.yesNo("Would you like to add another item?");
        if (addBakeryItem) {
            addItem();
        } else {
            System.out.println("Okay here is your final grocery list!");
            BigGroceryList.add(addGroceryItem);
        }
    }

    public static void addItemDessert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What item would you like to add to the list?");
        String addGroceryItem = scanner.nextLine();
        System.out.println("How many " + addGroceryItem + " would you like to add?");
        int addDessertNumber = scanner.nextInt();
        for (int i = 0; i < addDessertNumber; i++) {
            GroceryListDessert.add(addGroceryItem);
            BigGroceryList.add(addGroceryItem);
        }
        System.out.println("Here is your dessert list " + GroceryListDessert);
        boolean addDessertItem = input.yesNo("Would you like to add another item?");
        if (addDessertItem) {
            addItem();
        } else {
            System.out.println("Okay here is your final grocery list!");
            BigGroceryList.add(addGroceryItem);
        }
    }

    public static void addItemDrinks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What item would you like to add to the list?");
        String addGroceryItem = scanner.nextLine();
        System.out.println("How many " + addGroceryItem + " would you like to add?");
        int addDrinksNumber = scanner.nextInt();
        for (int i = 0; i < addDrinksNumber; i++) {
            GroceryListDrinks.add(addGroceryItem);
            BigGroceryList.add(addGroceryItem);
        }
        System.out.println("Here is your drinks list " + GroceryListDrinks);
        boolean addDrinksItem = input.yesNo("Would you like to add another item?");
        if (addDrinksItem) {
            addItem();
        } else {
            System.out.println("Okay here is your final grocery list!");
            System.out.println(BigGroceryList);
        }
    }


    public static void main(String[] args) {
        begin();
    }
}

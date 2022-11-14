package org.example;


import java.util.Scanner;

import static org.example.Continue.next;

class ItemsList extends ProductModel{
    Scanner x = new Scanner(System.in);
    void addItem() {

        System.out.println("Please enter the given data:\n");
        for (; ; ) {
            System.out.print("Item ID:");
            var item_ID = x.nextInt();
            setItem_ID(item_ID);
            if (item_ID <= 0) System.out.println("Item ID must not be <= 0\n");
            else break;
        }

        System.out.print("Item Price:");
        setItem_Price(x.nextInt());

        System.out.print("Item Quantity:");
        setItem_Quantity(x.nextInt());

        x.nextLine();
        System.out.print("Description:");
        setItem_Description(x.nextLine());
        System.out.print("Manufacturing Date:");
        setItem_Manufacturing_date( x.nextLine());
    }

    void displayItem(int id) {
        if (id == 0) {
        } else {
            System.out.println("*************************************");
            System.out.println("Item ID:\t\t" + getItem_ID());
            System.out.println("Item Price:\t\t" + getItem_Price());
            System.out.println("Item Quantity:\t\t" + getItem_Quantity());
            System.out.println("Description:\t\t" + getItem_Description());
            System.out.println("Manufacturing Date:\t" + getItem_Manufacturing_date());
            System.out.println("*************************************");
        }
    }

    void sellItem(int itemSold, int itemId) {
        setItem_Quantity(getItem_Quantity() - itemSold);
        System.out.println("Updated info of Item " + itemId);
        displayItem(itemId);
        next();
    }

    void deleteItem() {
        setItem_Quantity(0);
        setItem_Price(0);
        setItem_Description(null);
        setItem_ID(0);
        setItem_Manufacturing_date(null);
    }




}

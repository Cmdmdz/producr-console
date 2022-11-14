package org.example;

import java.util.Scanner;

import static org.example.Continue.next;

public class Main {

    public static void main(String[] args) {

        var x = new Scanner(System.in);
        var total = 0;
        var itemsAll = new ItemsList[10];
        for (int i = 0; i < itemsAll.length; i++) {
            itemsAll[i] = new ItemsList();
        }
        for (; ; ) {
            System.out.print("""
                    Choose an option:
                    [1]. Add new product
                    [2]. Display all records product
                    [3]. find item and update by itemId
                    [4]. Analysis of record level
                    [5]. Sales update Report
                    [6]. Delete all those records having quantity less than 10
                    [7]. Exit
                    \t>>\s""");
            int opt = x.nextInt();
            if (opt == 1 || opt == 2 || opt == 3 || opt == 4 || opt == 5 || opt == 6 || opt == 7) {

                if (opt == 7) {
                    System.out.println("Program Exiting......");
                    break;
                } else {
                    if (opt == 1) {
                        System.out.println("***********************************\n" +
                                "\t\tItem # " + (total + 1) +
                                "\n***********************************\n");
                        itemsAll[total].addItem();
                        total++;
                        next();
                    } else if (opt == 2) {
                        for (int i = 0; i < total; i++) {
                            itemsAll[i].displayItem(itemsAll[0].getItem_ID());
                        }
                        next();
                    } else if (opt == 3) {
                        var i = 0;
                        var idFound = false;

                        System.out.println("Enter itemId to display it");
                        var itemId = x.nextInt();
                        for (; i < total; i++) {
                            if (itemsAll[i].getItem_ID() == itemId) {
                                itemsAll[i].displayItem(itemsAll[i].getItem_ID());
                                idFound = true;
                                break;
                            }
                        }
                        if (idFound) {
                            System.out.println("Enter modified info for the chosen item");
                            itemsAll[i].addItem();
                            next();
                        } else {
                            System.out.println("Entered ID doesn't exist...");

                        }
                        next();
                    } else if (opt == 4) {
                        var i = 0;
                        for (; i < total; i++) {
                            if (itemsAll[i].getItem_Quantity() <= 50) {
                                itemsAll[i].displayItem(itemsAll[i].getItem_ID());
                            }
                        }
                        next();
                    } else if (opt == 5) {
                        var itemFoundCondition = false;
                        System.out.print("Enter Item ID to be sold:");
                        var id = x.nextInt();
                        for (var i = 0; i < total; i++) {
                            if (id == itemsAll[i].getItem_ID()) {
                                itemFoundCondition = true;
                                System.out.println("""
                                        Item Found!!!
                                        Please Enter amount to be sold""");
                                var itemSold = x.nextInt();
                                if (itemSold > itemsAll[i].getItem_Quantity() || itemSold < 0) {
                                    System.out.println("***ERROR***\nEntered amount is invalid!!");
                                    next();
                                    break;
                                } else if (itemSold > 0 && itemSold < itemsAll[i].getItem_Quantity()) {
                                    itemsAll[i].sellItem(itemSold, id);

                                }
                            }

                        }
                        if (!itemFoundCondition) {
                            System.out.println("""
                                    Item not Found!!!
                                    Please try again""");
                            next();
                        }
                    } else {
                        System.out.println("This will delete all Items of quantity less than 10");
                        for (var i = 0; i < total; i++) {
                            if (itemsAll[i].getItem_Quantity() <= 10) {
                                itemsAll[i].deleteItem();
                                total--;
                                for (int j = i; j < total; j++) {
                                    itemsAll[j] = itemsAll[j + 1];
                                }
                            }
                        }
                    }
                }

            } else {
                System.out.println("Option out of range...");
            }
        }

    }


}


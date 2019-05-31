/*
 * Copyright (C) 2019 WipCamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package exercise;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author WipCamp11
 */
public class NewClass {

    public static void main(String[] args) {
        int item = 0;
        int limit = 15;
        int menu = 0;
        boolean check = true;

        while (check) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Menu : item : " + item + " , limit : " + limit);
            System.out.println("1, Add item");
            System.out.println("2, Remove item");
            System.out.println("3, Check item");
            System.out.println("4. stop");
            System.out.print("Please enter waht do you want : ");
            menu = sc.nextInt();
            if (menu == 1) {
                if (item < limit) {
                    System.out.println("----------");
                    System.out.println("----------");
                    System.out.println("Menu 1 : Add item");
                    if (item < limit) {
                        System.out.println("Plesae enter number of item to add : ");
                        int amount = sc.nextInt();
                        if (item + amount > limit) {
                            System.out.println("item is over limit");
                        } else {
                            item = item + amount;
                            System.out.println("item ;" + item + " ,limit; " + limit);
                        }
                    }

                } else {
                    System.out.println("item is full");

                }
            } else if (menu == 2) {
                if (item > 0) {
                    System.out.println("---------");
                    System.out.println("---------");
                    System.out.println("menu2");
                    System.out.println("please enter number of item to remove : ");
                    int amount = sc.nextInt();
                    if (item - amount < 0) {
                        System.out.println("ไอเทมมีไม่พอให้ลบ");

                    } else {
                        item = item - amount;
                        System.out.println("item" + item + "limit; " + limit);
                    }
                } else {
                    System.out.println("ไม่มีไอเทมในโกดัง");

                }
            } else if (menu == 3) {
                System.out.println("item: " + item + "limit: " + limit);
            } else if (menu == 4) {
                check = false;
            } else {
                System.out.println("เมนูไม่ถูกต้อง");
            }

        }
    }
}

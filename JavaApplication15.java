package javaapplication15.car_Java;

import java.util.*;

public class JavaApplication15 {

    static ArrayList passenger_list = new ArrayList();
    static int valet_inventory = 0;

    public static class Option {

        private static String name;
        private static String color;
        private static int ID;
        private static int Max_oil;
        private static int passenger;

        public static void start() {
            Scanner input = new Scanner(System.in);
            System.out.println("enter your choice between (1, 5) : ");
            System.out.println("enter 1 for name" + "\n"
                    + "enter 2 for ID " + "\n" + "enter 3 for color" + "\n"
                    + "enter 4 Max_oil" + "\n" + "enter 5 for edit car option"
                    + "\n" + " enter 6 for show information"
                    + "\n " + "enter 7 for exit from  start menue  ");
            int user_choice = input.nextInt();
            boolean isRun = true;
            while (isRun) {

                switch (user_choice) {
                    case 1:
                        name();
                        guid();
                        break;
                    case 2:
                        ID();
                        guid();
                        break;
                    case 3:
                        color();
                        guid();
                        break;
                    case 4:
                        Max_oil();
                        guid();
                        break;
                    case 5:
                        edit_information();
                        guid();
                        break;
                    case 6:
                        show_information();
                        guid();
                        break;

                    case 7:
                        isRun = false;
                }
            }
        }

        public static void edit_information() {
            Scanner input = new Scanner(System.in);

            System.out.println("enter 1 for edit name information" + "\n"
                    + "enter 2 for edit color information" + "\n"
                    + " enter 3 for edit cer ID information" + "\n"
                    + "enter 4 for edit  oil information");
            int user_choice = input.nextInt();

            switch (user_choice) {
                case 1:
                    name();
                    break;
                case 2:
                    color();
                case 3:
                    ID();
                    break;
                case 4:
                    Max_oil();
                    break;
            }
        }

        public static void show_information() {
            Scanner input = new Scanner(System.in);
            System.out.println("enter 1 for show name information" + "\n"
                    + "enter 2 for show color information" + "\n"
                    + "enter 3 for show ID information" + "\n"
                    + "enter 4 for show oil information" + "\n"
                    + "etner 5 for show all infomation");
            System.out.println("enter your choice : ");
            int user_choice = input.nextInt();
            switch (user_choice) {
                case 1:
                    System.out.println("car name : " + name);
                    break;
                case 2:
                    System.out.println("car color information" + color);
                    break;
                case 3:
                    System.out.println("car ID : " + ID);
                    break;
                case 4:
                    System.out.println("Max oil inventory : " + Max_oil);
                    break;
                case 5:
                    System.out.println("name : " + name);
                    System.out.println("color : " + color);
                    System.out.println("CAR id : " + ID);
                    System.out.println("Oil inventory : " + Max_oil);

            }
            System.out.println("Do you want to edit information?"
                    + "enter 1 for edit information" + "\n");
            int q = input.nextInt();
            if (q == 1) {
                edit_information();
            }

        }

        public static void setname(String car_name) {
            name = car_name;

        }

        public static String getname() {
            return name;
        }

        public static void name() {
            Scanner input = new Scanner(System.in);
            System.out.println("enter your car name : ");
            String NAME = input.nextLine();
            name = NAME;

        }

        public static void setcolor(String car_color) {
            color = car_color;
        }

        public static String getcolor() {
            return color;
        }

        public static void color() {
            Scanner input = new Scanner(System.in);
            System.out.println("enter your car color : ");
            String COLOR = input.nextLine();
            color = COLOR;
        }

        public static void setID(int car_ID) {
            ID = car_ID;

        }

        public static int getID() {
            return ID;

        }

        public static void ID() {
            Scanner input = new Scanner(System.in);
            System.out.println("enter your car ID : ");
            int id = input.nextInt();
            ID = id;
        }

        public static void setMax_oil(int car_max_oil) {
            Max_oil = car_max_oil;
        }

        public static int getMax_oil() {
            return Max_oil;
        }

        public static void Max_oil() {
            Scanner input = new Scanner(System.in);
            System.out.println("enter your Max oli count : ");
            int max_oil = input.nextInt();
            Max_oil = max_oil;

        }

        public static void setpassenger(int car_passenger) {
            passenger = car_passenger;

        }

        public static int getpassenger() {
            return passenger;
        }

        public static void compelet() {

        }

    }

    public static class Gear {

        static int gear;

        public static void setgear(int new_gear) {
            gear = new_gear;

        }

        public static int getgear() {
            return gear;

        }

        public void gear_guid() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter 1 for add gear" + "\n"
                    + "Enter 2 for mines gear");

            System.out.println("enter your chice between(1, 2)");
            int User_choice = input.nextInt();
            switch (User_choice) {
                case 1:
                    add_grear();

                    break;
                case 2:
                    mines_gear();
                    break;

            }

        }

        public void add_grear() {
            Gear G = new Gear();
            Scanner input = new Scanner(System.in);
            System.out.println("enter your gear : ");
            int g = input.nextInt();
            G.gear = g;
            if (g == 5) {
                System.out.println("gear is max");

            } else if (g >= 1 && g < 6) {
                g += 1;
            } else {
                System.out.println("your gear is out of rang");

            }
            System.out.println(" your final gear : " + g);
        }

        public void mines_gear() {
            Gear G = new Gear();
            Scanner input = new Scanner(System.in);
            System.out.println("enter your gear : ");
            int g = input.nextInt();
            G.gear = g;
            if (g == 1) {
                System.out.println("gear is min");

            } else if (g > 1 && g <= 5) {
                g -= 1;
            } else {
                System.out.println("your gear is out of rang");
            }
            System.out.println(" your final gear : " + g);

        }

    }

    public static class Oil extends Option {

        static int oil;

        public static void setoil(int new_oil) {
            oil = new_oil;

        }

        public static int getoil() {
            return oil;

        }

        public void oil_inventry() {
            Scanner input = new Scanner(System.in);
            Option o = new Option();
            int c = super.Max_oil;
            if (c == 0) {
                super.Max_oil();
                c = super.Max_oil;
            }
            if (valet_inventory == 0) {
                System.out.println("your valet is empty !");
            } else {

                System.out.println("enter your entery oil count : ");
                int entry_oil = input.nextInt();
                c = c - entry_oil;
                System.out.println("your remaider of  capacity  : " + c);

                valet_inventory = valet_inventory - (entry_oil * 3);
                System.out.println("your valet inventory : " + valet_inventory);
            }

        }

    }

    public static class Passenger extends Option {

        public void passenger_project() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter 1 for add passenger " + "\n"
                    + "enter 2 for remove passenger");
            System.out.println("Enter your chice between (1, 2)");
            int user_choice = input.nextInt();
            switch (user_choice) {
                case 1:
                    add_passenger();
                    break;
                case 2:
                    remove_passenger();
                    break;

            }
        }

        public void add_passenger() {
            Scanner input = new Scanner(System.in);
            System.out.println("passenger list : " + passenger_list);
            System.out.println("your passenger count : "
                    + passenger_list.size());

            System.out.println("enter your  passeger count : ");
            int passsenger_count = input.nextInt();

            for (int i = 0; i < passsenger_count; i++) {
                if (i == 0) {
                    input.nextLine();
                }
                System.out.println("enter your passenger name : ");
                String passemger_name = input.nextLine();

                passenger_list.add(passemger_name);

            }
            System.out.println("your passenger count after add "
                    + passenger_list.size());
            System.out.println(passenger_list);

        }

        public void remove_passenger() {
            Scanner input = new Scanner(System.in);
            System.out.println("passenger list : " + passenger_list);
            System.out.println("your passenger count : "
                    + passenger_list.size());
            if (passenger_list.isEmpty() == true) {
                System.out.println("your car is empty ");
                System.out.println("Do you want to go add passenger ?() " + "\n"
                        + " enter 1 for yes and 0 for no : ");
                int w = input.nextInt();
                if (w == 1) {
                    add_passenger();
                }

            }
            if (passenger_list.isEmpty() == false) {
                System.out.println("How many do you want too remove? ");
                int remove_count = input.nextInt();
                if (remove_count > passenger_list.size() && remove_count < 0) {
                    System.out.println("it's out of range");
                } else {
                    for (int i = 1; i <= remove_count; i++) {
                        passenger_list.remove(0);
                        valet_inventory = valet_inventory + 2;

                    }
                }

            }
            System.out.println("your valet inventory : "
                    + valet_inventory);
            System.out.println(passenger_list);

        }

    }

    public static void main(String[] args) {
        guid();

    }

    public static void guid() {
        Scanner input = new Scanner(System.in);
        System.out.println("valet inventry : " + valet_inventory);

        Option o = new Option();
        Oil oil = new Oil();
        Gear G = new Gear();
        Passenger P = new Passenger();
        System.out.println("enter 1 for car Option " + "\n"
                + "enter 2 for oil informstion" + "\n"
                + "enter 3 for grear process" + "\n"
                + "enter 4 for passenger work" + "\n" + "enter 5 for finish "
                + " process");
        System.out.println("enter your choice between (1, 5) : ");
        int user_choice = input.nextInt();
        boolean isRun = true;
        while (isRun) {

            switch (user_choice) {
                case 1:
                    o.start();
                    guid();
                    break;
                case 2:
                    oil.oil_inventry();
                    guid();
                    break;
                case 3:
                    G.gear_guid();
                    guid();
                    break;
                case 4:
                    P.passenger_project();
                    guid();
                    break;
                case 5:
                    System.out.println("finish process");
                    isRun = false;
                    break;
            }
        }
    }

}

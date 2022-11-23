import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Eliza", "Ashyrbaeva Eliza", "eliza@gmail.com", "+996225171735", (byte) 18);
        Person person2 = new Person(1, "Eliza", "Ashyrbaeva Eliza", "eliza@gmail.com", "+996225171735", (byte) 18);
        Person person3 = new Person(1, "Eliza", "Ashyrbaeva Eliza", "eliza@gmail.com", "+996225171735", (byte) 18);
        Person person4 = new Person(1, "Eliza", "Ashyrbaeva Eliza", "eliza@gmail.com", "+996225171735", (byte) 18);
        Person[] people = {person1, person2, person3, person4};
        Address address1 = new Address(1, "KG", "City", "Vostok-5");
        Address address2 = new Address(1, "KG", "City", "Vostok-5");
        Address []addresses = {address1,address2};
        Home house1 = new House(1, 4567, 23, "Emakom", "Bishkek", people);
        Home house2 = new House(1, 4567, 23, "Emakom", "Bishkek", people);
        Home [] houses={house1,house2};
        Home apartment1 = new Apartment(2, 5678, 30, "Ihlas", "Bishkek", people);
        Home apartment2 = new Apartment(2, 6543, 30, "Ihlas", "Bishkek", people);
        Home [] apartment={apartment1,apartment2};
        getPeople(people);
        getAddress(addresses);
        sortHomeByPrice(apartment);


    }

    public static void getPeople(Person[] people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
    public static void getAddress(Address [] addresses){
        for (Address address:addresses) {
            System.out.println(address);
        }
    }
    public static Home[] sortHomeByPrice(Home[] houses){
        Arrays.sort(houses,new Comparator<Home>() {
            @Override
            public int compare(Home h1, Home h2) {
                if(h1.getPrice() != h2.getPrice())
                    return h1.getPrice() - h2.getPrice();
                return h1.getTitle().compareTo(h2.getTitle());
            }
        });
        return houses;
    }


    /*
import java8.Addresses.Address;
import java8.Home.Apartment;
import java8.Home.Home;
import java8.Home.House;
import java8.Person.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Home house1 = new House(1,"House 1",new Address(1,"KG","City 1","Address 1"),10,20,getPeople());
        Home house2 = new House(2,"House 2",new Address(2,"KG","City 2","dddress 2dasdasd"),20,30,getPeople1());
        Home house3 = new House(3,"House 3",new Address(3,"KG","City 3","Address 3"),30,40,getPeople2());

        Apartment a1 = new Apartment(1,"Apartment 1",new Address(4,"KG","City 4","Address 4"),10,10,new Person[] {
                new Person(31,"Alibek","Altynbek uulu",21,"706649559+996","alibekaltynbekuulu@gmail.com"),
                new Person(42,"Alibek","Altynbek uulu",11,"+996706649559","alibekaltynbekuulu@gmail.com"),
                new Person(53,"Alibek","Altynbek uulu",32,"+996706649559","alibekaltynbekuulu@gmail.com"),
                new Person(64,"Alibek","Altynbek uulu",43,"+996706649559","alibekaltynbekuulu@gmail.com"),
                new Person(75,"Alibek","Altynbek uulu",54,"+996706649559","alibekaltynbekuulu@gmail.com"),
        });
        Apartment a2 = new Apartment(2,"Apartment 1",new Address(5,"KG","City 5","Address 5"),20,10,new Person[] {
                new Person(14,"Alibek","Altynbek uulu",21,"+996706649559","alibekaltynbekuulu@gmail.com"),
                new Person(22,"Alibek","Altynbek uulu",11,"+996706649559","alibekaltynbekuulu@gmail.com"),
                new Person(533,"Alibek","Altynbek uulu",32,"+996706649559","alibekaltynbekuulu@gmail.com"),
                new Person(634,"Alibek","Altynbek uulu",43,"+996706649559","alibekaltynbekuulu@gmail.com"),
                new Person(745,"Alibek","Altynbek uulu",54,"+996706649559","alibekaltynbekuulu@gmail.com"),
        });

        while(true){
            System.out.println("1. Sort Home by Price. 2. Sort home by city. 3.Get Apartment by City. 4.Get People in the House.");
            int number = new Scanner(System.in).nextInt();
            if(number == 0) break;
            else if(number == 1) System.out.println(Arrays.toString(sortHomeByPrice(new Home[]{house1, house2, house3})));
            else if(number == 2) System.out.println(Arrays.toString(sortHouseByCity(new Home[]{house1, house2, house3})));
            else if(number == 3) {
                System.out.print("Enter a city : ");
                String city = new Scanner(System.in).nextLine();
                System.out.println(getApartmentByCity(city, new Apartment[]{a1, a2}));
            }
            else if(number == 4){
                System.out.print("Enter a house title :");
                String title = new Scanner(System.in).nextLine();
                System.out.println(Arrays.toString(getPeopleInTheHouse(title, new Home[]{house1, house2, house3})));
            }else System.out.println("Invalid input");
        }
    }

    public static  Person[] getPeople(){
        return new Person[] {
                new Person(1,"Alibek","Altynbek uulu",20,"+996706649559","alibekaltynbekuulu@gmail.com"),
                new Person(2,"Alibek","Altynbek uulu",21,"+996706649559","alibekaltynbekuulu@gmail.com"),
                new Person(3,"Alibek","Altynbek uulu",22,"+996706649559","alibekaltynbekuulu@gmail.com"),
                new Person(4,"Alibek","Altynbek uulu",23,"+996706649559","alibekaltynbekuulu@gmail.com"),
                new Person(5,"Alibek","Altynbek uulu",24,"+996706649559","alibekaltynbekuulu@gmail.com"),

> Алибек Байке:
};
    }
    public static Person[] getPeople1(){
        return new Person[]{
                new Person(12,"Alibek","Altynbek uulu",31,"+996706649559","alibekaltynbekuulu@gmail.com"),
                new Person(13,"Alibek","Altynbek uulu",32,"+996706649559","alibekaltynbekuulu@gmail.com"),
                new Person(14,"Alibek","Altynbek uulu",33,"+996706649559","alibekaltynbekuulu@gmail.com"),
                new Person(15,"Alibek","Altynbek uulu",34,"+996706649559","alibekaltynbekuulu@gmail.com"),
                new Person(16,"Alibek","Altynbek uulu",35,"+996706649559","alibekaltynbekuulu@gmail.com"),
                new Person(17,"Alibek","Altynbek uulu",36,"+996706649559","alibekaltynbekuulu@gmail.com"),
        };
    }

    public static Person[] getPeople2(){
        return new Person[]{
                new Person(6,"Alibek","Altynbek uulu",25,"+996706649559","alibekaltynbekuulu@gmail.com"),
                new Person(7,"Alibek","Altynbek uulu",26,"+996706649559","alibekaltynbekuulu@gmail.com"),
                new Person(8,"Alibek","Altynbek uulu",27,"+996706649559","alibekaltynbekuulu@gmail.com"),
                new Person(9,"Alibek","Altynbek uulu",28,"+996706649559","alibekaltynbekuulu@gmail.com"),
                new Person(10,"Alibek","Altynbek uulu",29,"+996706649559","alibekaltynbekuulu@gmail.com"),
                new Person(11,"Alibek","Altynbek uulu",30,"+996706649559","alibekaltynbekuulu@gmail.com"),
        };
    }



    public static  Address[] getAddresses() {
        return new Address[]{
            new Address(1,"Kyrgyzstan","Bishkek 1","Address 1"),
            new Address(2,"Kyrgyzstan","Bishkek 2","Address 2"),
            new Address(3,"Kyrgyzstan","Bishkek 3","Address 3"),
            new Address(4,"Kyrgyzstan","Bishkek 4","Address 4"),
            new Address(5,"Kyrgyzstan","Bishkek 5","Address 5"),
        };
    }

    public static Home[] sortHomeByPrice(Home[] houses){
        Arrays.sort(houses,new Comparator<Home>() {
            @Override
            public int compare(Home h1, Home h2) {
                if(h1.getPrice() != h2.getPrice())
                    return h1.getPrice() - h2.getPrice();
                return h1.getTitle().compareTo(h2.getTitle());
            }
        });
        return houses;
    }



 /*   public static Home[] sortHouseByCity(Home[] houses){
        Arrays.sort(houses,new Comparator<Home>() {
            @Override
            public int compare(Home h1, Home h2) {
                if(h1.getAddress().getCity().length() != h2.getAddress().getCity().length())
                    return h1.getAddress().getCity().length() - h2.getAddress().getCity().length();
                return h1.getTitle().compareTo(h2.getTitle());*/
            }
    /*    });
        return houses;
    }

    public static Apartment getApartmentByCity(String address,Apartment[] apartments){
        for (Apartment apartment : apartments) {
            if(apartment.getAddress().getCity().equals(address))
                return apartment;
        }
        return null;
    }

    public static Person[] getPeopleInTheHouse(String homeTitle,Home[] homes){
        for (Home home : homes) {
            if(home.getTitle().equals(homeTitle))
                return home.getPeople();
        }
        return null;*/


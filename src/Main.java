import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// Класс, представляющий квартиру
class Apartment {
    private int rooms;
    private int floor;
    private double area;
    private String address;

    public Apartment(int rooms, int floor, double area, String address) {
        this.rooms = rooms;
        this.floor = floor;
        this.area = area;
        this.address = address;
    }

    // Проверка, соответствует ли квартира заданным требованиям
    public boolean matches(int rooms, int floor, double area) {
        if (this.rooms == rooms && this.floor == floor && 0.9 * area <= this.area && this.area <= 1.1 * area) {
            return true;
        } else {
            return false;
        }
    }

    // Метод для вывода информации о квартире
    public void printInfo() {
        System.out.println("Rooms: " + this.rooms + ", Floor: " + this.floor + ", Area: " + this.area + ", Address: " + this.address);
    }
}

// Класс, представляющий картотеку
class CardFile {
    private ArrayList<apartment> apartments;

    public CardFile() {
        this.apartments = new ArrayList<apartment>();
    }

    // Добавление квартиры в картотеку
    public void addApartment(int rooms, int floor, double area, String address) {
        this.apartments.add(new apartment(rooms, floor, area, address));
    }

    // Поиск подходящей квартиры в картотеке и ее удаление
    public void searchAndRemove(int rooms, int floor, double area) {
        Iterator<apartment> iter = this.apartments.iterator();
        while (iter.hasNext()) {
            apartment apartment = iter.next();
            if (apartment.matches(rooms, floor, area)) {
                apartment.printInfo();
                iter.remove();
            }
        }
    }

    // Вывод всей картотеки
    public void printCardFile() {
        for (apartment apartment : this.apartments) {
            apartment.printInfo();
        }
    }
}


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        String Zadal= "odin" ;
        String Zadal2 = "dva" ;

        if (scan == Zadal){
            CardFile cardFile = new CardFile();

        } else if (scan == Zadal2 ) {

        }


        cardFile cardFile = new cardFile();

        // Начальное формирование картотеки
        cardFile.addApartment(1, 1, 30.0, "Address 1");
        cardFile.addApartment(2, 2, 50.0, "Address 2");
        cardFile.addApartment(3, 3, 70.0, "Address 3");

        // Ввод заявки на обмен и поиск подходящей квартиры
        cardFile.searchAndRemove(2, 2, 55.0);


        // Вывод всей картотеки
        cardFile.printCardFile();
    }
}
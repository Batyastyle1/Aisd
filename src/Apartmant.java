import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// Класс, представляющий квартиру
class apartment {
    private int rooms;
    private int floor;
    private double area;
    private String address;

    public apartment(int rooms, int floor, double area, String address) {
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
class cardFile {
    private ArrayList<apartment> apartments;

    public cardFile() {
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

// Тестирование
public class Apartmant {
    public static void main(String[] args) {
        cardFile cardFile = new cardFile();
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Начальное формирование картотеки");
        System.out.print("Введите количество комнат: ");
        int rooms = scanner.nextInt();
        System.out.print("Введите этаж: ");
        int floor = scanner.nextInt();
        System.out.print("Введите площадь: ");
        double area = scanner.nextDouble();
        scanner.nextLine(); // Чтение символа новой строки после ввода числа
        System.out.print("Введите адрес: ");
        String address = scanner.nextLine();
        cardFile.addApartment(rooms, floor, area, address);

        System.out.println("\n2. Ввод заявки на обмен");
        System.out.print("Введите количество комнат: ");
        rooms = scanner.nextInt();
        System.out.print("Введите этаж: ");
        floor = scanner.nextInt();
        System.out.print("Введите площад");
    }}
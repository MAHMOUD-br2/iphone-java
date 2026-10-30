
package javaapplication6;


public class JavaApplication6 {
 static class Device<T> {

    private T name;

    private T price;

    private T storage;

    private T color;

    public Device(T name, T price, T storage, T color) {

        this.name = name;

        this.price = price;

        this.storage = storage;

        this.color = color;

    }

    public void displayInfo() {

        System.out.println("Device Name: " + name);

        System.out.println("Price: " + price);

        System.out.println("Storage: " + storage);

        System.out.println("Color: " + color);

        System.out.println("———————");

    }

 }

    
    public static void main(String[] args) {
        Device<String> phone = new Device<>(

            "iPhone 17 Pro",

            "4500 LYD",

            "256 GB",

            "Black"

        );

        Device<String> ipad = new Device<>(

            "iPad Pro",

            "5200 LYD",

            "512 GB",

            "Silver"

        );

        System.out.println("SMART DEVICES INFORMATION");

        System.out.println("=========================");

        phone.displayInfo();

        ipad.displayInfo();
                
    
}}

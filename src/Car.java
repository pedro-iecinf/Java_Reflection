public class Car {

    private String carType;
    private int doors;
    private int wheels;
    private int year;
    private String brand;
    private String serie;

    public Car(String carType, int doors, int wheels, int year, String brand, String serie) {
        this.carType = carType;
        this.doors = doors;
        this.wheels = wheels;
        this.year = year;
        this.brand = brand;
        this.serie = serie;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}

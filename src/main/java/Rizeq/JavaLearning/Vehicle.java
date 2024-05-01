package Rizeq.JavaLearning;

import java.util.Objects;

public class Vehicle {
    private String company;
    private String model;
    private String color;
    private double price;
    private int id;

    public Vehicle(String company, String model, String color,double price, int id) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.price = price;
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void printVehicle() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Double.compare(price, vehicle.price) == 0 && id == vehicle.id && Objects.equals(company, vehicle.company) && Objects.equals(model, vehicle.model) && Objects.equals(color, vehicle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, model, color, price, id);
    }
}

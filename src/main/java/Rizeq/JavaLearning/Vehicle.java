package Rizeq.JavaLearning;

import java.util.Objects;

public class Vehicle {
    private String company;
    private String model;
    private double price;
    private int id;

    public Vehicle(String company, String model, double price, int id) {
        this.company = company;
        this.model = model;
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

    @Override
    public String toString() {
        return "Vehicle {" +
                "company= '" + company + '\'' +
                ", model= '" + model + '\'' +
                ", price= " + price +
                ", id= " + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Double.compare(price, vehicle.price) == 0 && id == vehicle.id && Objects.equals(company, vehicle.company) && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, model, price, id);
    }
}

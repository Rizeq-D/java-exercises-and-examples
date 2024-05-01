package Rizeq.JavaLearning;


/*
so instead of using the printVehiclePricesRange and the printVehicleByColor we can implement
one condition class to use it for both.
 */
@FunctionalInterface
public interface VehicleCondition {
    public boolean test(Vehicle vehicle);
}

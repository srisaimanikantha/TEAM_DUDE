package com.oops.basics;

class ElectricCar extends Vehicle {

    ElectricCar(String registrationNumber, String ownerName, int parkingDuration) {
        super(registrationNumber, ownerName, parkingDuration);
    }

    @Override
    void getParkingSlot() {
        System.out.println("Parking Slot: Electric Car Charging Slot");
    }

    @Override
    double calculateFee() {
        return parkingDuration * 30;
    }
}

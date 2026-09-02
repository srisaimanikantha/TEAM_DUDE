package com.oops.basics;

class Bike extends Vehicle {

    Bike(String registrationNumber, String ownerName, int parkingDuration) {
        super(registrationNumber, ownerName, parkingDuration);
    }

    @Override
    void getParkingSlot() {
        System.out.println("Parking Slot: Bike Slot");
    }

    @Override
    double calculateFee() {
        return parkingDuration * 20;
    }
}

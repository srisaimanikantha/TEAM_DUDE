package com.oops.basics;

class Car extends Vehicle {

    Car(String registrationNumber, String ownerName, int parkingDuration) {
        super(registrationNumber, ownerName, parkingDuration);
    }

    @Override
    void getParkingSlot() {
        System.out.println("Parking Slot: Car Slot");
    }

    @Override
    double calculateFee() {
        return parkingDuration * 50;
    }
}

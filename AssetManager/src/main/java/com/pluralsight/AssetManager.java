package com.pluralsight;

import java.util.ArrayList;

public class AssetManager {
    public static void main(String[] args) {
        ArrayList<Asset> myAssets = new ArrayList<>();
        //houses
        myAssets.add(new House("My Main House", "2020-06-01", 250000,
                "123 Main St", 1, 2000, 5000));
        myAssets.add(new House("Vacation Home", "2018-07-15", 180000,
                "99 Beach Rd", 2, 1500, 4000));
        //vehicles
        myAssets.add(new Vehicle("Tom's Truck", "2019-03-21", 30000,
                "Ford F-150", 2019, 105000));
        myAssets.add(new Vehicle("My Car", "2021-10-10", 28000,
                "Toyota Corolla", 2021, 95000));
        //assetss
        for (Asset asset : myAssets) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.printf("Original Cost: $%.2f\n", asset.getOriginalCost());
            System.out.printf("Current Value: $%.2f\n", asset.getValue());
            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("House at: " + house.getAddress());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel());
            }

            System.out.println("-------------------");
        }
    }
}

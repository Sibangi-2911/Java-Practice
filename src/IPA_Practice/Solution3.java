package IPA_Practice;

import java.util.*;

class Driver {
    private int id;
    private String name;
    private String contact;
    private float experience;

    public Driver(int id, String name, String contact, float experience) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public float getExperience() {
        return experience;
    }
}

class Truck {
    private int id;
    private String name;
    private float totalMilesTraveled;
    private Driver driver;

    public Truck(int id, String name, float totalMilesTraveled, Driver driver) {
        this.id = id;
        this.name = name;
        this.totalMilesTraveled = totalMilesTraveled;
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getTotalMilesTraveled() {
        return totalMilesTraveled;
    }

    public Driver getDriver() {
        return driver;
    }
}

class Solution {

    public static Truck[] getAllTruckWithDistance(Truck[] trucks, float distance) {

        ArrayList<Truck> result = new ArrayList<>();

        // Filter trucks
        for (Truck truck : trucks) {
            if (truck.getTotalMilesTraveled() >= distance) {
                result.add(truck);
            }
        }

        if (result.isEmpty()) {
            return null;
        }

        // Sort by driver experience (Descending)
        result.sort(new Comparator<Truck>() {
            @Override
            public int compare(Truck t1, Truck t2) {
                return Float.compare(
                        t2.getDriver().getExperience(),
                        t1.getDriver().getExperience());
            }
        });

        return result.toArray(new Truck[result.size()]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Truck[] trucks = new Truck[n];

        for (int i = 0; i < n; i++) {

            int truckId = sc.nextInt();
            sc.nextLine();

            String truckName = sc.nextLine();

            float miles = sc.nextFloat();

            int driverId = sc.nextInt();
            sc.nextLine();

            String driverName = sc.nextLine();

            String contact = sc.nextLine();

            float experience = sc.nextFloat();

            Driver driver = new Driver(driverId,
                    driverName,
                    contact,
                    experience);

            trucks[i] = new Truck(
                    truckId,
                    truckName,
                    miles,
                    driver);
        }

        float distance = sc.nextFloat();

        Truck[] output = getAllTruckWithDistance(trucks, distance);

        if (output == null) {
            System.out.println("No Truck Found");
        } else {

            for (Truck truck : output) {

                System.out.println(truck.getId());
                System.out.println(truck.getName());
                System.out.println(truck.getTotalMilesTraveled());

                System.out.println(truck.getDriver().getId());
                System.out.println(truck.getDriver().getName());
            }
        }

        sc.close();
    }
}
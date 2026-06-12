package VehicleInsuranceManagementSystem;

    public abstract class Vehicle {

        protected String vehicleNumber;
        protected String ownerName;
        protected double price;
        protected int manufacturingYear;

        public Vehicle(String vehicleNumber, String ownerName,
                       double price, int manufacturingYear) {
            this.vehicleNumber = vehicleNumber;
            this.ownerName = ownerName;
            this.price = price;
            this.manufacturingYear = manufacturingYear;
        }

        public abstract double calculateInsurancePremium();
        public abstract double calculateRoadTax();
        public abstract String getVehicleType();

        public void displayReport() {
            double insurance = calculateInsurancePremium();
            double roadTax = calculateRoadTax();

            System.out.println("\nInsurance Report");
            System.out.println("\nVehicle Type: " + getVehicleType());
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Price: " + price);
            System.out.println("\nInsurance Premium: " + insurance);
            System.out.println("Road Tax: " + roadTax);
            System.out.println("Total Charges: " + (insurance + roadTax));
        }
    }


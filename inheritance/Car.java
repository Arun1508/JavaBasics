class Car extends Vehicle{
    private String modelName ="EON";
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println("My car brand is "+ myCar.brand + " and car is "+ myCar.modelName);
    }
}
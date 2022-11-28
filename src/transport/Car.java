package Tansport;

import java.time.LocalDate;



public class Car {

//    Поля

    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private String carTires;

    private Key key;
    private Insurance insurance;


//     Конструкторы

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String productionCountry,
               String transmission,
               String bodyType,
               String registrationNumber,
               int numberOfSeats,
               String carTires,
               Key key,
               Insurance insurance) {
        if (brand == null || brand == "") {
            this.brand = "default";
        }else{
            this.brand = brand;
        }
        if (color == null || color == "") {
            this.color = "белый";
        }else{
            this.color = color;
        }
        if (model == null || model == "") {
            this.model = "default";
        }else{
            this.model = model;
        }
        if (productionCountry == null || productionCountry == "") {
            this.productionCountry = "default";
        }else{
            this.productionCountry = productionCountry;
        }
        if (key == null) {
            this.key = new Key();
        }else{
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        }else{
            this.insurance = insurance;
        }
        this.engineVolume = engineVolume;
        this.transmission = "механика";
        this.bodyType = "седан";
        this.numberOfSeats = 5;
        this.registrationNumber = "х000хх000";
        this.carTires = "летняя";

        if (year <= 0) {
            this.year = 2000;
        }else{
            this.year = year;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
    }
    public Car (String brand,
                String model,
                double engineVolume,
                String color,
                int year,
                String productionCountry){
        this (brand,
                model,
                engineVolume,
                color,
                year,
                productionCountry,
                "механика",
                "седан",
                "х000хх000",
                5,
                "летняя",
                new Key(),
                new Insurance());

    }

//    Сеттеры и геттеры


    public String getBrand() {
        if (brand == null || brand == "") {
            return "default";
        } else {
            return brand;
        }
    }
    public String getModel() {
        if (model == null || model == "") {
            return "default";
        } else {
            return model;
        }
    }
    public int getYear() {
        if (year <= 0) {
            return 2000;
        } else {
            return year;
        }
    }
    public String getProductionCountry() {
        if (productionCountry == null || productionCountry == "") {
            return "default";
        }else{
            return productionCountry;
        }
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }else{
            this.engineVolume = engineVolume;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color == "") {
            this.color = "белый";
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null){
            this.transmission = "механика";
        }else{
            this.transmission = transmission;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null){
            this.registrationNumber = "х000хх000";
        }else{
            this.registrationNumber = registrationNumber;
        }
    }

    public String getCarTires() {
        return carTires;
    }

    public void setCarTires(String carTires) {
        if (carTires == null){
            this.carTires = "летняя";
        }else{
            this.carTires = carTires;
        }
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return brand +
                " " + model +
                ", " + year +
                " год выпуска, страна сборки - " + productionCountry +
                ", цвет кузова — " + color +
                ", объем двигателя — " + engineVolume + "л." +
                ", коробка передач - " + transmission +
                ", тип кузова - " + bodyType +
                ", регистрационный номер - " + registrationNumber +
                ", количество мест - " + numberOfSeats +
                ", резина - " + carTires + "." +
                ", " + (key.isKeylessEntry()? "Безключевой доступ": "Ключевой доступ") +
                ", " + (key.isRemoteEngineStart()? "Удаленный запуск": "Обычный запуск") +
                ". Номер страховки - " + insurance.getNumber() +
                ". Стоимость страховки: " + insurance.getCost() +
                ". Срок действия страховки" + insurance.getValidity();





    }

//      Методы

    public boolean isRegistrationNumberCorrect (){
        //х000хх000
        if (registrationNumber.length() != 9){
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || ! Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])){
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2])
                && Character.isDigit(chars[3]) && Character.isDigit(chars[6])
                && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }
    public static class Key {

//    Поля

        private final boolean remoteEngineStart;
        private final boolean keylessEntry;

//     Конструкторы

        public Key(boolean remoteEngineStart, boolean keylessEntry) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessEntry = keylessEntry;
        }
        public Key() {
            this (false, false);
        }

//    Сеттеры и геттеры

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }
        public boolean isKeylessEntry() {
            return keylessEntry;
        }
    }


    public static class Insurance {

//    Поля

        private final LocalDate validity;
        private final double cost;
        private final String number;

//     Конструкторы

        public Insurance(LocalDate validity, double cost, String number) {
            if (validity == null) {
                this.validity = LocalDate.now().plusDays(365);
            }else{
                this.validity = validity;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "000000000";
            }else{
                this.number = number;
            }
        }

        public Insurance() {
            this(null, 10_000d, null);
        }

        //    Сеттеры и геттеры

        public LocalDate getValidity() {
            return validity;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

//      Методы

        public void checkValidity (){
            if (validity.isBefore(LocalDate.now()) || validity.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать и оформлять новую страховку!!");
            }
        }
        public void checkNumber () {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }
    }
}
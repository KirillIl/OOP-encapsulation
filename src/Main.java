import Tansport.Car;

import java.time.LocalDate;

public class Main {

    public static void changeTiresToSeasonal () {
        if (LocalDate.now().getMonthValue() <= 11 || LocalDate.now().getMonthValue() <=3) {
            System.out.println("Сменить шины на зимние");
        }else {
            System.out.println("Сменить шины на летние");
        }
    }


    public static void printCostOfBouquet (Flower... flowers) {
        double totalCost = 0;
        int minLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < minLifeSpan) {
                minLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();
            System.out.println(flower);
        }
        totalCost = totalCost * 1.1;
        System.out.printf("Стоимость букета: %.2f", totalCost);
        System.out.println();
        System.out.println("Срок стояния букета: " + minLifeSpan);
    }

    public static void main(String[] args) {

        Human maxim = new Human(1988,  0, "Максим", "Минск", "бренд-менеджер");
        System.out.println(maxim);
        Human ania = new Human(1993, 0, "Аня", "Москва", "методист образовательных программ");
        System.out.println(ania);
        Human katia = new Human(1992, 0, "Катя", "Калининград", "продакт-менеджер");
        System.out.println(katia);
        Human artem = new Human(1995, 0, "Артем", "Москва", "директор по развитию бизнеса");
        System.out.println(artem);
        System.out.println();
        Human vladimir = new Human(0, 21, "Владимир", "Казань", "");
        System.out.println(vladimir);
        System.out.println();



        Flower roza = new Flower("Роза обыкновенная", null, "Голландия", 35.59, null);
        System.out.println(roza);
        Flower hrizantema = new Flower("Хризантема", "", "", 15.);
        System.out.println(hrizantema);
        Flower pion = new Flower("Пион", "","Англия", 69.9, 1);
        System.out.println(pion);
        Flower hipsophila = new Flower("Гипсофила", "","Турция", 19.5, 10);
        System.out.println(hipsophila);

        System.out.println();
        changeTiresToSeasonal();

        System.out.println();
        printCostOfBouquet (
                roza, roza, roza,
                hrizantema, hrizantema, hrizantema, hrizantema, hrizantema,
                hipsophila);
        System.out.println();

        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        System.out.println(lada);
        lada.isRegistrationNumberCorrect();
        System.out.println();
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        audi.setInsurance(new Car.Insurance(LocalDate.now(), 40_000, "12345678"));
        System.out.println(audi);
        audi.getInsurance().checkNumber();
        audi.getInsurance().checkValidity();
        System.out.println();
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        bmw.setKey(new Car.Key(true, true));
        System.out.println(bmw);
        System.out.println();
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        kia.setCarTires("зимняя");
        System.out.println(kia);
        System.out.println();
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        hyundai.setRegistrationNumber("а665ен");
        System.out.println(hyundai);
        System.out.println(hyundai.isRegistrationNumberCorrect());


    }
}
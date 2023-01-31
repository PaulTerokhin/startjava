public class WolfTest {
    
    public static void main(String[] args) {
        Wolf luk = new Wolf();
        luk.name = "Luk";
        luk.weightInKg = 40;
        luk.age = 5;
        luk.color = "серый";
        luk.gender = "мужской";
        System.out.println("Кличка " + luk.name + "\nПол " + luk.gender + "\nВес " +
                luk.weightInKg + "\nВозраст " + luk.age + "\nОкрас " + luk.color); 
        luk.move();
        luk.sit();
        luk.run();
        luk.howl();
        luk.hunt();
    }
}







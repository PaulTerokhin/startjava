public class JaegerTest {

    public static void main(String[] args) {
        Jaeger gipsy = new Jaeger();
        gipsy.setModelName("Gipsy Danger");
        gipsy.setOrigin("USA");
        gipsy.setHeight(79.25f);
        gipsy.setWeight(1.980f);
        gipsy.setSpeed(7);
        gipsy.setArmor(6);

        System.out.println("Model Name: " + gipsy.getModelName() + "\nOrigin: " + 
                gipsy.getOrigin() + "\nHeight: " + gipsy.getHeight() + "\nSpeed: " + 
                gipsy.getSpeed() + "\nArmor: " + gipsy.getArmor());

        gipsy.drift();
        gipsy.move();
        gipsy.useVortexCannon();
        gipsy.startShooting();

        Jaeger coyote = new Jaeger("Coyote Tango", "USA", 85.34f, 2.312f, 5, 4);
        System.out.println("\nModel Name: " + coyote.getModelName() + "\nOrigin: " + 
                coyote.getOrigin() + "\nHeight: " + coyote.getHeight() + "\nSpeed: " + 
                coyote.getSpeed() + "\nArmor: " + coyote.getArmor());
        
        coyote.drift();
        coyote.move();
        coyote.useVortexCannon();
        coyote.startShooting();
    }
}
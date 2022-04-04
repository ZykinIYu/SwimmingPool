public class Main {
    public static void main(String[] args) {
        int volume = 1200;
        int fillingSpeed = 30;
        int devastationSpeed = 10;
        int actualSpeed = fillingSpeed - devastationSpeed;
        int count = 0;
        int fullPool = 0;

        while (true) {
            if (fullPool < volume){
                fullPool += actualSpeed;
                count++;
            } else {
                break;
            }
        }
        System.out.println("Бассейн наполнится за " + count + " минут");
    }
}

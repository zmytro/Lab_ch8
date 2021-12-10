package lab_ch8_darvis;

public class Ex8_10_TrafficLightTest {
    public static void main(String[] args){

        for(Ex8_10_TrafficLight trafficLight : Ex8_10_TrafficLight.values())
            System.out.printf("Цвет- %s -> Сек- %d\n", trafficLight, trafficLight.getDuration());
    }
}

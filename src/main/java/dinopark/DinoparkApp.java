package dinopark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DinoparkApp {
    public static void main(String[] args) {
        try {
            SpringApplication.run(DinoparkApp.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

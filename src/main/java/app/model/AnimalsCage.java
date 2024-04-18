package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class AnimalsCage {

    @Qualifier("dog")
    @Autowired
    private Animal animal;

    // The functionality was added by me
    @Qualifier("timer")
    @Autowired
    private Timer timer;

    // The functionality was added by me
    public Timer getTimer() {
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
//        System.out.println(new Timer().getTime()); // incorrect line of the task source code
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
}

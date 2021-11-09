package seriazibleAnd3;

import java.util.ArrayList;
import java.util.List;

public class HumanBand {
    private List<Human> humans = new ArrayList<>();

    public HumanBand() {
    }

    public HumanBand(List<Human> humans) {
        this.humans = humans;
    }

    public List<Human> getHumans() {
        return humans;
    }

    public void setHumans(List<Human> humans) {
        this.humans = humans;
    }

    public void setHumanNotList(Human human) {
        this.humans = humans;
    }

    @Override
    public String toString() {
        return "HumanBand{" +
                "humans=" + humans +
                '}';
    }
}

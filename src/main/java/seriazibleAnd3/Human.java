package seriazibleAnd3;

import java.util.List;

public class Human {
    private String name;
    private Integer age;
    private String pol;
    private Double wes;
    private Double rost;
    private List<Pet> any;

    public Human() {
    }

    public Human(String name, Integer age, String pol, Double wes, Double rost, List<Pet> any) {
        this.name = name;
        this.age = age;
        this.pol = pol;
        this.wes = wes;
        this.rost = rost;
        this.any = any;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public Double getWes() {
        return wes;
    }

    public void setWes(Double wes) {
        this.wes = wes;
    }

    public Double getRost() {
        return rost;
    }

    public void setRost(Double rost) {
        this.rost = rost;
    }

    public List<Pet> getAny() {
        return any;
    }

    public void setAny(List<Pet> any) {
        this.any = any;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pol='" + pol + '\'' +
                ", wes=" + wes +
                ", rost=" + rost +
                ", any=" + any +
                '}';
    }
}

package seriazibleAnd1;

public class Pet {
    private String petName;
    private String petWid;
    private Integer age;

    public Pet() {
    }

    public Pet(String petName, String petWid, Integer age) {
        this.petName = petName;
        this.petWid = petWid;
        this.age = age;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetWid() {
        return petWid;
    }

    public void setPetWid(String petWid) {
        this.petWid = petWid;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

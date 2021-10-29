package seriazibleAnd2;

import com.google.gson.annotations.SerializedName;

public class Pet {
    @SerializedName("petName")
    private String name;
    @SerializedName("petWid")
    private String wid;
    @SerializedName("petAge")
    private Integer age;

    public Pet() {
    }

    public Pet(String petName, String petWid, Integer age) {
        this.name = petName;
        this.wid = petWid;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String petName) {
        this.name = petName;
    }

    public String getWid() {
        return wid;
    }

    public void setWid(String petWid) {
        this.wid = petWid;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

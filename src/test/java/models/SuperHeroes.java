package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuperHeroes {


    private int id;

    private String name;
    private String superName;
    private String profession;
    private long age;
    private Boolean canFly;
    public SuperHeroes(){}
    public SuperHeroes(String name, String superName, String profession, long age, Boolean canFly) {
        this.name = name;
        this.superName = superName;
        this.age = age;
        this.profession = profession;
        this.canFly = canFly;
    }


}

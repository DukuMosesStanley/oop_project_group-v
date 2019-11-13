
package oop_project_group.model;

/*
        Group members
        =============
        
        Name                                 Registration Number
        ====                                 ===================
        CHANCE LUWONG                        18/847/BIT-S
        abdiaziz farah ali                   18/1190/bsse-s
        RICHARD KAMULAK JUSTIN LOKOSANG      18/1176/BIT-S
        PHILIP JURUGO                         18/1068/BIT-S

        */

public class Courses {
    
     String name;
     String code;
     String description;
    
    public Courses(){}
    
    public Courses(String name, String code, String description){
        this.name = name;
        this.code = code;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}

        

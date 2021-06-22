package models;

public class Company {

    private String name;
    private Developer devJava;
    private Developer projectManager;

    public Company(String name, Developer devJava, Developer projectManager ) {
        this.name = name;
        this.devJava=devJava;
        this.projectManager=projectManager;
    }


    public Company(String s) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Developer getDevJava() {
        return devJava;
    }

    public void setDevJava(Developer devJava) {
        this.devJava = devJava;
    }

    public Developer getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(Developer projectManager) {
        this.projectManager = projectManager;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", projectManager=" + projectManager +
                ", devJava=" + devJava +
                '}';
    }

}

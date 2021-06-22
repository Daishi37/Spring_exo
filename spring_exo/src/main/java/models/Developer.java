package models;

public class Developer {

    private String name;
    private int nbSkillYear;

    public Developer(String name, int nbSkillYear) {
        this.name = name;
        this.nbSkillYear = nbSkillYear;
    }

    public Developer(String s) {
    }

    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getnbSkillYear() {
            return nbSkillYear;
        }

        public void setnbSkillYear(int nbSkillYear) {
            this.nbSkillYear = nbSkillYear;
        }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", nbSkillYear=" + nbSkillYear +
                '}';
    }


}

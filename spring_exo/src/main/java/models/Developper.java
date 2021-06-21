package models;

public class Developper {

    private String name;
    private int xpYear;

    public void Developper(String name, int xpYear) {
        this.name = name;
        this.xpYear = xpYear;
    }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getXpYear() {
            return xpYear;
        }

        public void setXpYear(int xpYear) {
            this.xpYear = xpYear;
        }
}

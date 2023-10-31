public class Hogwarts {
    private String name;
    private int witchcraft;
    private int transgression;

    public Hogwarts(String name, int witchcraft, int transgression) {
        this.name = name;
        this.witchcraft = witchcraft;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public int sumSkills() {
        return witchcraft + transgression;
    }

    public void compareTo(Hogwarts student) {
        int sumSkills1 = this.sumSkills();
        int sumskills2 = student.sumSkills();
        if (sumSkills1 > sumskills2) {
            System.out.println(name + " лучший ученик по общим характеристикам, чем " + student.name + " (" + sumSkills1 + ":" + sumskills2 + ")");
        } else if (sumSkills1 < sumskills2) {
            System.out.println(student.name + " лучший ученик по общим характеристикам, чем " + name + " (" + sumskills2 + ":" + sumSkills1 + ")");
        } else {
            System.out.println("Победила дружба");
        }
    }

    @Override
    public String toString() {
        return "ученик " + name + ", колдовство " + witchcraft + ", трансгрессия " + transgression;
    }

    public void print() {
        System.out.println(this);
    }
}

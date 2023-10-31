public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;


    public Gryffindor(String name, int witchcraft, int transgression, int nobility, int honor, int bravery) {
        super(name, witchcraft, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int sumSkillsGrif() {
        return nobility + honor + bravery;
    }

    public void compareTo(Gryffindor student) {
        int sumSkills1 = this.sumSkillsGrif();
        int sumskills2 = student.sumSkillsGrif();
        if (sumSkills1 > sumskills2) {
            System.out.println(getName() + " лучший гриффиндорец, чем " + student.getName());
        } else if (sumSkills1 < sumskills2) {
            System.out.println(student.getName() + " лучший гриффиндорец, чем " + getName());
        } else {
            System.out.println("Победила дружба");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", благородство " + nobility + ", честь " + honor + ", храбрость " + bravery;
    }
}

public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int witchcraft, int transgression, int intelligence, int wisdom, int wit, int creativity) {
        super(name, witchcraft, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public int sumSkillsRaven() {
        return intelligence + wisdom + wit + creativity;
    }

    public void compareTo(Ravenclaw student) {
        int sumSkills1 = this.sumSkillsRaven();
        int sumskills2 = student.sumSkillsRaven();
        if (sumSkills1 > sumskills2) {
            System.out.println(getName() + " лучший когтевранец, чем " + student.getName());
        } else if (sumSkills1 < sumskills2) {
            System.out.println(student.getName() + " лучший когтевранец, чем " + getName());
        } else {
            System.out.println("Победила дружба");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", ум " + intelligence + ", мудрость " + wisdom + ", остроумие " + wit + ", творчество " + creativity;
    }
}

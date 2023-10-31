public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, int witchcraft, int transgression, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, witchcraft, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public int sumSkillsSlith() {
        return cunning + determination + ambition + resourcefulness + thirstForPower;
    }

    public void compareTo(Slytherin student) {
        int sumSkills1 = this.sumSkillsSlith();
        int sumskills2 = student.sumSkillsSlith();
        if (sumSkills1 > sumskills2) {
            System.out.println(getName() + " лучший слизеринец, чем " + student.getName());
        } else if (sumSkills1 < sumskills2) {
            System.out.println(student.getName() + " лучший слизеринец, чем " + getName());
        } else {
            System.out.println("Победила дружба");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", хитрость " + cunning + ", решительность " + determination + ", амбициозность " + ambition + ", находчивость " + resourcefulness + ", жажда власти " + thirstForPower;
    }
}

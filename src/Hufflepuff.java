public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int witchcraft, int transgression, int diligence, int loyalty, int honesty) {
        super(name, witchcraft, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int sumSkillsHuff() {
        return diligence + loyalty + honesty;
    }

    public void compareTo(Hufflepuff student) {
        int sumSkills1 = this.sumSkillsHuff();
        int sumskills2 = student.sumSkillsHuff();
        if (sumSkills1 > sumskills2) {
            System.out.println(getName() + " лучший пуффендуец, чем " + student.getName());
        } else if (sumSkills1 < sumskills2) {
            System.out.println(student.getName() + " лучший пуффендуец, чем " + getName());
        } else {
            System.out.println("Победила дружба");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", трудолюбие " + diligence + ", верность " + loyalty + ", честность " + honesty;
    }
}

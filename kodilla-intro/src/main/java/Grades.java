public class Grades {
    private int[] grades;
    private int size = 1;

    public Grades() {
        this.grades = new int[10];
    }
    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
}

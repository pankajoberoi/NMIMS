package Day5;

public class Employee implements Comparable<Employee> {

    public int score;

    @Override
    public int compareTo(Employee e) {
        return this.score - e.score;
    }

    public String toString() {
        return "Score is : " + score;
    }

}

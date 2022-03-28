import java.util.HashSet;
import java.util.TreeSet;

class Question {
    Integer number;
    Question(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number.toString();
    }
}
public class DefaultOrdering {
    public static void main(String[] args) {
        TreeSet questions = new TreeSet<>();

        Question q1 = new Question(1);
        Question q2 = new Question(2);
        Question q3 = new Question(3);

        questions.add(q1);
        questions.add(q2);
        questions.add(q3);


        questions.forEach(System.out::println);
    }
}

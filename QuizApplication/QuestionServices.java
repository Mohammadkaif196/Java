
import java.util.*;

public class QuestionServices {

    static Question[] questions = new Question[10];
    static String[] answers = new String[10];

    public QuestionServices() {
        questions[0] = new Question(1, "Which keyword is used to define a class in Java?", "define", "class", "struct",
                "interface", "class");
        questions[1] = new Question(2, "Which symbol is used to terminate a statement in Java?", ".", ":", ",", ";",
                ";");
        questions[2] = new Question(3, "Which of these is a valid variable name in Java?", "2value", "value$", "class",
                "void", "value$");
        questions[3] = new Question(4, "Which operator is used for comparison in Java?", "=", "==", "!=", "&&", "==");
        questions[4] = new Question(5, "Which of the following is not a loop in Java?", "for", "while", "repeat",
                "do-while", "repeat");
        questions[5] = new Question(6, "Which keyword is used to inherit a class in Java?", "implements", "extends",
                "inherits", "instanceof", "extends");
        questions[6] = new Question(7, "Which method is the entry point in a Java application?", "start()", "main()",
                "run()", "init()", "main()");
        questions[7] = new Question(8, "Which of these is not a primitive data type?", "int", "float", "String", "char",
                "String");
        questions[8] = new Question(9,
                "Which of these access modifiers makes members visible only within the same class?", "private",
                "protected", "public", "default", "private");
        questions[9] = new Question(10, "What is the size of a float in Java?", "2", "4", "8", "6", "4");

    }

    public void playQuiz() {

        int size = 0;
        for (Question q : questions) {
            System.out.println("Question " + q.getId() + "." + q.getQuestion());
            System.out.println();
            System.out.print("A) " + q.getA() + "     ");
            System.out.print("B) " + q.getB());
            System.out.println();
            System.out.print("C) " + q.getC() + "     ");
            System.out.print("D) " + q.getD());
            System.out.println();
            Scanner sc = new Scanner(System.in);
            answers[size++] = sc.nextLine();
            System.out.println();
        }
    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question qu = questions[i];
            String correctAnswer = qu.getAnswer();
            if (correctAnswer.equalsIgnoreCase(answers[i])) {
                score++;
            }
        }
         if(score > questions.length){
            System.out.println("You got "+score + "  🥳🥳🥳🥳");
         }else{
            System.out.print("You got "+score +"   ");
            System.out.print(" Be practice more..😇😇😇😇");
         }
    }
}



public class Question {
    private int id;
    private String question;
    private String A;
    private String B;
    private String C;
    private String D;
    private String answer;

    public Question(int id, String question, String opt1, String opt2, String opt3, String opt4, String answer) {
        this.id = id;
        this.question = question;
        this.A = opt1;
        this.B = opt2;
        this.C = opt3;
        this.D = opt4;
        this.answer = answer;
    }

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getA() {
        return A;
    }
    public void setA(String A) {
        this.A = A;
    }
    public String getB() {
        return B;
    }
    public void setB(String B) {
        this.B = B;
    }
    public String getC() {
        return C;
    }
    public void setC(String C) {
        this.C = C;
    }
    public String getD() {
        return D;
    }
    public void setD(String D) {
        this.D = D;
    }
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    @Override
    public String toString() {
        return "Question [id=" + id + ", question=" + question + ", A=" + A + ", B=" + B
                + ", C=" + C + ", D=" + D + ", answer=" + answer + ", getId()=" + getId()
                + ", getQuestion()=" + getQuestion() + ", getA()=" + getA() + ", getB()="
                + getB() + ", getC()=" + getC() + ", getD()=" + getD() + ", getAnswer()="
                + getAnswer() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }
    
   
    
}

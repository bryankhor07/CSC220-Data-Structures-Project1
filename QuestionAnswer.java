/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: QuestionAnswer.java
 * Author: Duc Ta
 * Author: Bryan Khor
 * **********************************************
 */

package CSC220ASMT2;

public final class QuestionAnswer {

    //
    // Instance Data Fields
    //
    private String question;
    private String answer;

    //
    // Constructors
    //
    public QuestionAnswer() {
        this.question = null;
        this.answer = null;
    }
    public QuestionAnswer(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    //
    // Instance Method
    //
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getQuestion() {
        return question;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public String getAnswer() {
        return answer;
    }
    public String toString() {
        return "Question: " + getQuestion() + "\n" + "Answer: " + getAnswer();
    }
}

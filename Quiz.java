/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Quiz.java
 * Author: Duc Ta
 * Author: Bryan Khor
 * **********************************************
 */

package CSC220ASMT2;

public final class Quiz {

    //
    // Instance Data Fields
    //
    private QuestionAnswer questionAnswer;

    //
    // Constructors
    //
    public Quiz() {
    }

    public Quiz(QuestionAnswer questionAnswer) {
        this.questionAnswer = new QuestionAnswer(questionAnswer.getQuestion(), questionAnswer.getAnswer());
    }

    //
    // Instance Methods
    //
    public void setQuestionAnswer(QuestionAnswer questionAnswer) {
        this.questionAnswer = new QuestionAnswer(questionAnswer.getQuestion(), questionAnswer.getAnswer());
    }

    public QuestionAnswer getQuestionAnswer() {
        return new QuestionAnswer(this.questionAnswer.getQuestion(), this.questionAnswer.getAnswer());
    }
}

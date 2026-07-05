package elearningManagement.model;

/**
 * SOLID Principle: Single Responsibility Principle (SRP)
 * Responsible only for logical validation of assessment questions.
 */
public class Quiz {
    private String question;
    private String correctAnswer;

    public Quiz(String question, String correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() { return question; }
    
    public boolean verifyAnswer(String answer) {
        return this.correctAnswer.equalsIgnoreCase(answer.trim());
    }
}
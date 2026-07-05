package elearningManagement.model;

/**
 * SOLID Principle: Single Responsibility Principle (SRP)
 * Tracks execution milestone metric states for a single enrollment.
 */
public class Progress {
    private int completionPercentage;
    private boolean quizPassed;

    public Progress() {
        this.completionPercentage = 0;
        this.quizPassed = false;
    }

    public int getCompletionPercentage() { return completionPercentage; }
    public boolean isQuizPassed() { return quizPassed; }

    public void updateProgress(int percentage) {
        this.completionPercentage = Math.min(percentage, 100);
    }

    public void completeQuiz() {
        this.quizPassed = true;
        this.completionPercentage = 100;
    }
}
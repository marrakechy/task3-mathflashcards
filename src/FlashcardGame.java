import java.util.Random;
class Flashcard {
    private int operand1;
    private int operand2;
    private char operator;
    private int answer; // answer to the math fact

    // Constructor to initialize the operands and operator
    public Flashcard(int operand1, int operand2, char operator) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;

        // c++ switch instead of if/else for executing one condition from multiple conditions.
        // calculate the answer based on the operator

        switch (operator) {
            case '+':
                this.answer = operand1 + operand2;
                break;
            case '-':
                this.answer = operand1 - operand2;
                break;
            case '*':
                this.answer = operand1 * operand2;
                break;
            case '/':
                this.answer = operand1 / operand2;
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }

    public int getOperand1() {
        return operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public char getOperator() {
        return operator;
    }

    public int getAnswer() {
        return answer;
    }
}

public class FlashcardGame {
    private static final int NUM_FLASHCARDS = 10;
    private static final int MIN_OPERAND = 0;  // minimum value for operands
    private static final int MAX_OPERAND = 100; // maximum value for operands
    private static final char[] OPERATORS = {'+', '-', '*', '/'};  // possible operators

    public static void main(String[] args) {
        Random random = new Random();

        Flashcard[] flashcards = new Flashcard[NUM_FLASHCARDS];

        // Generate NUM_FLASHCARDS flashcards with random operands and operator

        for (int i = 0; i < NUM_FLASHCARDS; i++) {

            int operand1 = MIN_OPERAND + random.nextInt(MAX_OPERAND - MIN_OPERAND + 1);

            int operand2 = MIN_OPERAND + random.nextInt(MAX_OPERAND - MIN_OPERAND + 1);

            char operator = OPERATORS[random.nextInt(OPERATORS.length)];

            flashcards[i] = new Flashcard(operand1, operand2, operator);
        }

        for (Flashcard flashcard : flashcards)
        {
            System.out.println(flashcard.getOperand1() + " " + flashcard.getOperator() + " " + flashcard.getOperand2() + " = " + flashcard.getAnswer());
        }
    }
}

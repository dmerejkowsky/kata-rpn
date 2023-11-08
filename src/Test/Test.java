package src.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.Main.Answer;

import java.util.ArrayList;

class AnswerTest {

    @Test
    void calcTest() {
        Answer answerTest = new Answer();

        ArrayList<Double> expression = new ArrayList<>();
        expression.add(1.);
        expression.add(8.);

        double value = answerTest.calc(expression, "+");
        Assertions.assertEquals(9., value);
    }
}
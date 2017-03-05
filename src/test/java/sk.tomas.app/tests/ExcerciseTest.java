package sk.tomas.app.tests;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import sk.tomas.app.controller.ExcerciseController;
import sk.tomas.app.exception.InputValidationException;
import sk.tomas.app.exception.OutputValidationException;
import sk.tomas.app.iam.model.input.ExcerciseInput;

import javax.annotation.PostConstruct;

/**
 * Created by tomas on 5.3.2017.
 */
public class ExcerciseTest extends AbstractTest {

    @Autowired
    private ExcerciseController excerciseController;

    @PostConstruct
    @SuppressWarnings("unchecked")
    public void setUp() {
        setUp(excerciseController, new ExcerciseInput());
    }

    @Test
    public void createExcerciseTest() throws OutputValidationException, InputValidationException {
        super.createTest();
    }

    @Test
    public void updateExcerciseTest() throws OutputValidationException, InputValidationException {
        super.updateTest();
    }

    @Test
    public void deleteExcerciseTest() throws OutputValidationException, InputValidationException {
        super.deleteTest();
    }

}

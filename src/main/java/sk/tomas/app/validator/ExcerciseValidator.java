package sk.tomas.app.validator;

import sk.tomas.app.exception.OutputValidationException;
import sk.tomas.app.iam.model.input.ExcerciseInput;
import sk.tomas.app.iam.model.output.ExcerciseOutput;

import java.util.List;

/**
 * Created by tomas on 5.3.2017.
 */

//TODO dorobit validacie
public class ExcerciseValidator {

    public static void validateInput(ExcerciseInput excerciseInput) {

    }

    public static void validateOutput(ExcerciseOutput excerciseOutput) throws OutputValidationException {
        if(excerciseOutput == null){
            throw new OutputValidationException("ExcerciseOutput is null!");
        }
    }

    public static void validateOutput(List<ExcerciseOutput> list) throws OutputValidationException {
        for (ExcerciseOutput item : list) {
            validateOutput(item);
        }
    }

}

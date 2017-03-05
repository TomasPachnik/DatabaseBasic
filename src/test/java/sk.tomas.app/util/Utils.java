package sk.tomas.app.util;

import sk.tomas.app.iam.model.input.ExcerciseInput;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

/**
 * Created by tomas on 5.3.2017.
 */
public class Utils {

    private static PodamFactory factory;

    static {
        factory = new PodamFactoryImpl();
    }

    public static ExcerciseInput randomExcercise() {
        ExcerciseInput excerciseInput = factory.manufacturePojo(ExcerciseInput.class);
        excerciseInput.setName("ZHYBY");
        return excerciseInput;
    }

}

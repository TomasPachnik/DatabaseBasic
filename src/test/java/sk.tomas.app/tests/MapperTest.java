package sk.tomas.app.tests;

import ma.glasnost.orika.MapperFacade;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import sk.tomas.app.iam.model.input.ExcerciseInput;
import sk.tomas.app.iam.model.output.ExcerciseOutput;
import sk.tomas.app.model.Excercise;
import sk.tomas.app.orm.ExcerciseNode;

import java.util.UUID;

import static sk.tomas.app.util.Utils.*;

/**
 * Created by tomas on 06.01.2017.
 */
public class MapperTest extends BaseTest {

    @Autowired
    private MapperFacade mapper;

    @Test
    public void excerciseMapperTest() {
        ExcerciseInput excerciseInput = randomExcercise();
        Excercise excercise = mapper.map(excerciseInput, Excercise.class);
        excercise.setUuid(UUID.randomUUID());
        ExcerciseNode excerciseNode = mapper.map(excercise, ExcerciseNode.class);
        Excercise mapped = mapper.map(excerciseNode, Excercise.class);
        ExcerciseOutput excerciseOutput = mapper.map(mapped, ExcerciseOutput.class);
        ExcerciseInput excerciseInput1 = mapper.map(excerciseOutput, ExcerciseInput.class);
        Assert.assertTrue(excerciseInput.equals(excerciseInput1));
    }

}

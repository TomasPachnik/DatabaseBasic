package sk.tomas.app.service;

import sk.tomas.app.iam.model.input.ExcerciseInput;
import sk.tomas.app.iam.model.output.ExcerciseOutput;
import sk.tomas.app.model.Excercise;

import java.util.UUID;

/**
 * Created by tomas on 5.3.2017.
 */
public interface ExcerciseService extends BaseService<Excercise> {

    UUID create(ExcerciseInput excerciseInput);
    ExcerciseOutput findExcerciseOutputByUuid(UUID uuid);

}

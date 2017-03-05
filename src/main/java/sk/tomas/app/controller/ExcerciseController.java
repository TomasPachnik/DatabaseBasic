package sk.tomas.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sk.tomas.app.exception.InputValidationException;
import sk.tomas.app.exception.OutputValidationException;
import sk.tomas.app.iam.model.input.ExcerciseInput;
import sk.tomas.app.iam.model.output.Count;
import sk.tomas.app.iam.model.output.ExcerciseOutput;
import sk.tomas.app.iam.model.output.ExcercisePaginationWithCount;
import sk.tomas.app.service.ExcerciseService;

import java.util.List;
import java.util.UUID;

import static sk.tomas.app.util.Constants.BASE_PATH;

/**
 * Created by tomas on 5.3.2017.
 */

@RestController
@RequestMapping(BASE_PATH + "/excercises")
public class ExcerciseController implements Controller<ExcerciseInput, ExcerciseOutput, ExcercisePaginationWithCount> {

    @Autowired
    private ExcerciseService excerciseService;

    @Override
    @RequestMapping(method = RequestMethod.POST, value = "/create")
    public UUID create(ExcerciseInput excerciseInput) throws InputValidationException {
        return excerciseService.create(excerciseInput);
    }

    @Override
    public void delete(UUID uuid) throws InputValidationException {

    }

    @Override
    @RequestMapping(method = RequestMethod.GET, value = "/{uuid}")
    public ExcerciseOutput getSingle(UUID uuid) throws InputValidationException, OutputValidationException {
        return excerciseService.findExcerciseOutputByUuid(uuid);
    }

    @Override
    public List<ExcerciseOutput> list() throws OutputValidationException {
        return null;
    }

    @Override
    public ExcercisePaginationWithCount listWithParam(int firstResult, int maxResult, String orderBy, boolean desc) throws InputValidationException, OutputValidationException {
        return null;
    }

    @Override
    public Count getCount() throws OutputValidationException {
        return null;
    }

    @Override
    public void update(UUID uuid, ExcerciseInput excerciseInput) throws InputValidationException {

    }

    @Override
    public Controller getController() {
        return this;
    }


}

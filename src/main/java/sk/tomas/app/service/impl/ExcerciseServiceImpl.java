package sk.tomas.app.service.impl;

import ma.glasnost.orika.MapperFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.tomas.app.dao.BaseDao;
import sk.tomas.app.dao.ExcerciseDao;
import sk.tomas.app.iam.model.input.ExcerciseInput;
import sk.tomas.app.iam.model.output.ExcerciseOutput;
import sk.tomas.app.model.Excercise;
import sk.tomas.app.service.ExcerciseService;

import java.util.UUID;

/**
 * Created by tomas on 5.3.2017.
 */

@Service
public class ExcerciseServiceImpl extends BaseServiceImpl<Excercise> implements ExcerciseService {

    private static Logger log = LoggerFactory.getLogger(ExcerciseServiceImpl.class);

    @Autowired
    private MapperFacade mapper;
    @Autowired
    private ExcerciseDao excerciseDao;

    @Override
    protected BaseDao getDao() {
        return excerciseDao;
    }

    @Override
    public UUID create(ExcerciseInput excerciseInput) {
        Excercise excercise = mapper.map(excerciseInput, Excercise.class);
        UUID uuid = excerciseDao.create(excercise);
        log.info("Zaznam cvicenia vytvoreny: {}", excercise);
        return uuid;
    }

    @Override
    public ExcerciseOutput findExcerciseOutputByUuid(UUID uuid) {
        Excercise excercise = findByUuid(uuid);
        return mapper.map(excercise, ExcerciseOutput.class);

    }
}

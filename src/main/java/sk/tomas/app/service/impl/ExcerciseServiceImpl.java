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

import java.util.List;
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
        excercise.setTimestamp(System.currentTimeMillis());
        UUID uuid = excerciseDao.create(excercise);
        log.info("Zaznam cvicenia vytvoreny: {}", excercise);
        return uuid;
    }

    @Override
    public ExcerciseOutput findExcerciseOutputByUuid(UUID uuid) {
        Excercise excercise = findByUuid(uuid);
        return mapper.map(excercise, ExcerciseOutput.class);

    }

    @Override
    public List<ExcerciseOutput> getList() {
        List<Excercise> list = list();
        return mapper.mapAsList(list, ExcerciseOutput.class);
    }

    @Override
    public void update(ExcerciseInput excerciseInput, UUID uuid) {
        Excercise old = findByUuid(uuid);
        Excercise excercise = mapper.map(excerciseInput, Excercise.class);
        excercise.setUuid(uuid);
        update(excercise);
        log.info("Cvicenie '{}' aktualizovane na '{}'", old, excerciseInput);
    }

    @Override
    public void delete(UUID uuid) {
        Excercise excercise = findByUuid(uuid);
        getDao().delete(uuid);
        log.info("Zmazane cvicenie '{}'.", excercise);
    }

}

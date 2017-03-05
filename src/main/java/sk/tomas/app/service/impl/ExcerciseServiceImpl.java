package sk.tomas.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.tomas.app.dao.BaseDao;
import sk.tomas.app.dao.ExcerciseDao;
import sk.tomas.app.model.Excercise;
import sk.tomas.app.service.ExcerciseService;

/**
 * Created by tomas on 5.3.2017.
 */

@Service
public class ExcerciseServiceImpl extends BaseServiceImpl<Excercise> implements ExcerciseService {

    @Autowired
    private ExcerciseDao excerciseDao;

    @Override
    protected BaseDao getDao() {
        return excerciseDao;
    }
}

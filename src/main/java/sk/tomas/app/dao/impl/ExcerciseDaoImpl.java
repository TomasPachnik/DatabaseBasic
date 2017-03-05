package sk.tomas.app.dao.impl;

import org.springframework.stereotype.Repository;
import sk.tomas.app.dao.ExcerciseDao;
import sk.tomas.app.model.Excercise;
import sk.tomas.app.orm.ExcerciseNode;

/**
 * Created by tomas on 5.3.2017.
 */


@Repository
public class ExcerciseDaoImpl extends BaseDaoImpl<Excercise, ExcerciseNode> implements ExcerciseDao {

    ExcerciseDaoImpl() {
        super(Excercise.class, ExcerciseNode.class);
    }
}
